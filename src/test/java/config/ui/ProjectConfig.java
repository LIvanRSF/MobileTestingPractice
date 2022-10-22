package config.ui;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:config/ui.properties"
})
public interface ProjectConfig extends Config {

    String browserMobileView();

    String remoteDriverUrl();

    String videoStorage();

    String browser();

    String browserVersion();

    String browserSize();
}
