package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Function;

public class DriverManager {
    private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
//    private static WebDriverFactory webDriverFactory = new WebDriverFactory();
    private DriverManager() {}

    private static final Function<BrowserType, WebDriver> driverSupplier = (browserType) -> switch (browserType) {
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
            default -> throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        };


    public static WebDriver getDriver(BrowserType browserType) {
        if (driverThreadLocal.get() == null) {
            driverThreadLocal.set(driverSupplier.apply(browserType));
        }
        return driverThreadLocal.get();
    }

//    public static WebDriver getDriver12(BrowserType browserType) {
//        if (driverThreadLocal.get() == null) {
//            WebDriver driver = webDriverFactory.createDriver(browserType);
//            driverThreadLocal.set(driver);
//        }
//        return driverThreadLocal.get();
//    }

    public static void quitDriver() {
        WebDriver driver = driverThreadLocal.get();
        if (driver != null) {
            driver.quit();
            driverThreadLocal.remove();
        }
    }
}
