package drivers.mobiledrivers;

import com.codeborne.selenide.WebDriverProvider;
import config.mobile.browserstack.BrowserStack;
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

        mutableCapabilities.setCapability("browserstack.user", BrowserStack.config.login());
        mutableCapabilities.setCapability("browserstack.key", BrowserStack.config.password());
        mutableCapabilities.setCapability("app", BrowserStack.config.app());
        mutableCapabilities.setCapability("device", BrowserStack.config.device());
        mutableCapabilities.setCapability("os_version", BrowserStack.config.osVersion());
        mutableCapabilities.setCapability("project", BrowserStack.config.project());
        mutableCapabilities.setCapability("build", BrowserStack.config.build());
        mutableCapabilities.setCapability("name", BrowserStack.config.name());

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
