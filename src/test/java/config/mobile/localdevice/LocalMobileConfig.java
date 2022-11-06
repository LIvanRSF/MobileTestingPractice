package config.mobile.localdevice;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
    "classpath:config/mobile/localmobile.properties"
})
public interface LocalMobileConfig extends Config { //, AppConfig
    String devicePlatformName();

    String virtualDevicePlatformVersion();

    String virtualDeviceName();

    String appiumUrl();

    String appPackage();

    String appActivity();

    String appUrl();

    String appPath();
}
