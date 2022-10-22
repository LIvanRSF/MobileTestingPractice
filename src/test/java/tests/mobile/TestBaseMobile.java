package tests.mobile;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackMobileDriver;
import helpers.common.AllureAttachments;
import helpers.common.DriverUtils;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBaseMobile {

    @BeforeAll
    static void setUp() {
        Configuration.browser = BrowserstackMobileDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void beforeEach() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Selenide.open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Final screenshot");
        AllureAttachments.addPageSource();

        step("Close driver", Selenide::closeWebDriver);

        AllureAttachments.video(sessionId);
    }
}
