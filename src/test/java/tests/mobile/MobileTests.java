package tests.mobile;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("Tests on Android platform")
public class MobileTests extends TestBaseMobile {

    @Test
    @Tag("android")
    @DisplayName("Testing mobile app searching")
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

    @Test
    @Tag("android")
    @DisplayName("Testing mobile app searching exact article")
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

    @Test
    @Tag("android")
    @DisplayName("Testing mobile app searching and open the article")
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
