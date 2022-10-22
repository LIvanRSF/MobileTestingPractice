package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.mobile.BrowserStack;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserstackMobileDriver implements WebDriverProvider {

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();
        mutableCapabilities.merge(capabilities);

        String login = BrowserStack.config.login();
        String password = BrowserStack.config.password();
        String app = BrowserStack.config.app();

        mutableCapabilities.setCapability("browserstack.user", login);
        mutableCapabilities.setCapability("browserstack.key", password);
        mutableCapabilities.setCapability("app", app);
        mutableCapabilities.setCapability("device", "Google Pixel 3");
        mutableCapabilities.setCapability("os_version", "9.0");
        mutableCapabilities.setCapability("project", "MobileTestingPractice");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "MobileTestPractice");

        return new RemoteWebDriver(getBrowserstackUrl(), mutableCapabilities);
    }

    public static URL getBrowserstackUrl() {
        try {
            return new URL(BrowserStack.config.browserstackUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
