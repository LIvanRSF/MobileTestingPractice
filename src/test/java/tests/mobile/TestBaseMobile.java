package tests.mobile;

import static io.qameta.allure.Allure.step;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.mobiledrivers.BrowserstackMobileDriver;
import drivers.mobiledrivers.LocalMobileDriver;
import drivers.mobiledrivers.RealMobileDriver;
import helpers.common.AllureAttachments;
import helpers.common.DriverUtils;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBaseMobile {

   // static String deviceHost = System.getProperty("deviceHost");

    @BeforeAll
    static void setUp() {
/*        switch (deviceHost) {
            case ("browserstack"):
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
            case ("emulator"):
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            case ("real"):
                Configuration.browser = RealMobileDriver.class.getName();
                break;
            default:
                throw new RuntimeException();
        }*/
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
/*        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Final screenshot");
        AllureAttachments.addPageSource();

        step("Close driver", Selenide::closeWebDriver);

        //if (deviceHost.equals("browserstack")) {
            AllureAttachments.video(sessionId);
        //}*/
    }
}
