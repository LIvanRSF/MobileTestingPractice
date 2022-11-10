package tests.mobile;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("android")
@DisplayName("Tests on Android platform")
public class MobileTests extends TestBaseMobile {

    @DisplayName("Testing mobile app searching")
    @Tag("android")
    @Test
    void mobileWikiAppSearchTest() {
        step("Type skip", () ->
            wiki.clickOnSkipButton());
        step("Type search", () -> {
            wiki.clickOnSearchField();
            wiki.setSearchText("Appium");
        });

        step("Verify content found", () ->
            wiki.listSearchedContent.shouldHave(sizeGreaterThan(0)));
    }

    @DisplayName("Testing mobile app searching exact article")
    @Test
    void mobileWikiAppSearchTinkoffBankArticleTest() {
        step("Type skip", () ->
            wiki.clickOnSkipButton());

        step("Type search", () -> {
            wiki.clickOnSearchField();
            wiki.setSearchText("Tinkoff bank");

            step("Article with description 'Russian bank' should be found", () ->
                wiki.listItemDescription.findBy(text("Russian bank")));
        });
    }

    @DisplayName("Testing mobile app searching and open the article")
    @Tag("android")
    @Test
    void mobileWikiAppOpenTinkoffArticleTest() {
        step("Type skip", () ->
            wiki.clickOnSkipButton());

        step("Type search", () -> {
            wiki.clickOnSearchField();
            wiki.setSearchText("Tinkoff");
        });

        step("Open article about Tinkoff bank", () ->
            wiki.listItemDescription.findBy(text("Russian bank")).click());

        step("The article should have text History", () ->
            wiki.historyHeaders.findBy(text("History")));
    }
}
