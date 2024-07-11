package org.utils;

import org.openqa.selenium.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverActions {

    public WebDriverActions() {}

    public Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        try (FileReader reader = new FileReader("config/config.properties")) {
            prop.load(reader);
            return prop;
        }
    }
    public void navigate(WebDriver driver, String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    public void clickElement(WebElement element) {
        element.click();
    }
    public void sendKeys(WebElement element, String keys) {
        element.sendKeys(keys);
    }
}
