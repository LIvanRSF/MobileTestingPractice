package drivers.mobiledrivers;

import com.codeborne.selenide.WebDriverProvider;
import config.mobile.localdevice.RealMobileConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public class RealMobileDriver implements WebDriverProvider {
    static final RealMobileConfig config =
        ConfigFactory.create(RealMobileConfig.class, System.getProperties());

    public static URL getAppiumServerUrl() {
        try {
            return new URL(config.appiumUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        File app = getApp();

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(config.devicePlatformName());
        options.setDeviceName(config.realDeviceName());
        options.setPlatformVersion(config.realDevicePlatformVersion());
        options.setApp(app.getAbsolutePath());
        options.setAppPackage(config.appPackage());
        options.setAppActivity(config.appActivity());

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private File getApp() {
        String appUrl = config.appUrl();
        String appPath = config.appPath();

        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                FileUtils.copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download application", e);
            }
        }
        return app;
    }
}
