package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

public class WikiSearchPage {

    SelenideElement
        skipButton = $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
        searchField = $(AppiumBy.id("org.wikipedia.alpha:id/search_container")),
        clickedSearchField = $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"));

    public ElementsCollection
        listSearchedContent = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")),
        listItemDescription = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_description")),
        historyHeaders = $$(AppiumBy.id("History"));

    public void clickOnSkipButton() {
        skipButton.click();
    }

    public void clickOnSearchField() {
        searchField.click();
    }

    public void setSearchText(String searchText) {
        clickedSearchField.sendKeys(searchText);
    }
}
