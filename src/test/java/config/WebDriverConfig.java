package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebDriverConfig extends Config {

    @Key("browserName")
    @DefaultValue("CHROME")
    String getBrowserName();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("baseUrl")
    @DefaultValue("https://auto.ru/")
    String getBaseUrl();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean isRemote();

    @Key("remoteUrl")
    String getRemoteUrl();

    @Key("loadStrategy")
    @DefaultValue("eager")
    String getLoadStrategy();

}
