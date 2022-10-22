package config.mobile;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:config/mobile.properties"
})
public interface BrowserstackConfig extends Config {

    String login();

    String password();

    String app();

    String browserstackUrl();
}
