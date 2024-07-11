//package org.driver;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class WebDriverFactory {
//    public WebDriver createDriver(BrowserType browserType) {
//        switch (browserType) {
//            case CHROME:
//                return new ChromeDriver();
//            case FIREFOX:
//                return new FirefoxDriver();
//            default:
//                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
//        }
//    }
//}
