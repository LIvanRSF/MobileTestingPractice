package config;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath: config/local.properties"
})
public interface ProjectConfig extends Config {

    String browserMobileView();

    String remoteDriverUrl();

    String videoStorage();
}
