package config.mobile;

import org.aeonbits.owner.ConfigFactory;

public class BrowserStack {
    public static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
}
