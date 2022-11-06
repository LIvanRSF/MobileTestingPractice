package config.mobile.localdevice;

import org.aeonbits.owner.Config;

@Config.Sources({
    "classpath:config/mobile/realmobile.properties"
})
public interface RealMobileConfig extends Config {
    String devicePlatformName();

    String realDevicePlatformVersion();

    String realDeviceName();

    String appiumUrl();

    String appPackage();

    String appActivity();

    String appUrl();

    String appPath();
}
