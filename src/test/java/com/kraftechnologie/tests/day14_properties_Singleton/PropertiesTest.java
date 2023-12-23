package com.kraftechnologie.tests.day14_properties_Singleton;

import com.kraftechnologie.utilities.ConfigurationReader;
import com.kraftechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void t1_callProperties() {
    String browser= ConfigurationReader.get("browser");
        System.out.println("browser = " + browser);
        String url=ConfigurationReader.get("url");
        System.out.println("url = " + url);
    }

    @Test
    public void t2_opernBrowserUsingConfigurationReader() {
        WebDriver driver=WebDriverFactory.getDriver (ConfigurationReader.get("browser"));
        driver.get(ConfigurationReader.get("url"));
    }

    @Test
    public void testName() {
        WebDriver driver=WebDriverFactory.getDriver("chorme");
        driver.get("");


    }
}
