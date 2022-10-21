package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.Project;
import helpers.AllureAttachments;
import helpers.DriverUtils;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeAll
    static void setUp() {

    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void afterEach() {
        String sessionId = DriverUtils.getSessionId();
        if (Project.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }

        AllureAttachments.addScreenshotAs("Final screenshot");
        AllureAttachments.addPageSource();
        AllureAttachments.addBrowserConsoleLogs();
    }
}
