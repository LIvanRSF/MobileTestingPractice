package tests.mobile;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MobileTests extends TestBaseMobile {

    @DisplayName("Testing mobile app searching")
    @Tag("android")
    @Test
    void mobileWikiAppSearchTest() {
        step("Type skip", () ->
            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click());
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                .sendKeys("Appium");
        });

        step("Verify content found", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0)));
    }

    @DisplayName("Testing mobile app searching exact article")
    @Tag("android")
    @Test
    void mobileWikiAppSearchTinkoffBankArticleTest() {
        step("Type skip", () ->
            $(AppiumBy.id("fragment_onboarding_skip_button")).click());

        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Tinkoff bank");
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_description")).shouldHave(text("Russian bank"));
        });
    }

    @DisplayName("Testing mobile app searching and open the article")
    @Tag("android")
    @Test
    void mobileWikiAppOpenTinkoffArticleTest() {
        step("Type skip", () ->
            $(AppiumBy.id("fragment_onboarding_skip_button")).click());

        step("Type search Tinkoff", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Tinkoff");
        });

        step("Open article about Tinkoff bank", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_description"))
                .findBy(text("Russian bank")).click());

        step("The article shoud have text History", () ->
            $$(AppiumBy.id("History")).findBy(Condition.text("History")));
    }
}
