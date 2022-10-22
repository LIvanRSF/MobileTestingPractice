package tests.ui;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UiTests extends TestBaseUi {

    @Disabled
    @Test
    public void baseTest() {
        step("Open page", () ->
            Selenide.open("https://www.ya.ru"));
    }
}
