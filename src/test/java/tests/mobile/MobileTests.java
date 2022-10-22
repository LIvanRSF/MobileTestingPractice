package tests.mobile;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MobileTests extends TestBaseMobile {

    @DisplayName("Testing mobile app")
    @Tag("Mobile")
    @Test
    void mobileWikiAppSearchTest() {
        step("Type search", () -> {
            $(AppiumBy.accessibilityId("Search Wikipedia")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"))
                .sendKeys("BrowserStack");
        });

        step("Verify content found", () ->
            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0)));
    }

    @DisplayName("Testing mobile app searching")
    @Tag("Mobile")
    @Test
    void mobileWikiAppSearchJavaTest() {
        step("Type search", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Tinkoff bank");
        });
        step("Verify content found", () -> {
            $$(AppiumBy.id("org.wikipedia.alpha:id/search_results_list")).shouldHave(
                CollectionCondition.sizeGreaterThan(0));
        });

/*        step("Open article about Tinkoff ", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).click();
            $(AppiumBy.className("android.widget.TextView")).shouldHave(Condition.text("Tinkoff"));
        });*/
    }
}
