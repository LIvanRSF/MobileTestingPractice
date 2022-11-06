package config.mobile.browserstack;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:config/mobile/browserstack.properties"
})
public interface BrowserstackConfig extends Config {

    String login();

    String password();

    String app();

    String browserstackUrl();

    String device();

    String osVersion();

    String project();

    String build();

    String name();
}
