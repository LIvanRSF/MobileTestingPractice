package helpers;

import com.codeborne.selenide.Configuration;
import config.Project;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSettings {
    static void configure() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.remote = Project.config.remoteDriverUrl();
        Configuration.browserCapabilities = capabilities;
    }
}
