package stepdef;

import org.driver.BrowserType;
import org.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.utils.WebDriverActions;

public class TestManagerContext {
    private TestScenarioContext testScenarioContext;
    private WebDriverActions webDriverActions;
    private WebDriver driver;

    public TestManagerContext() {
        this.testScenarioContext = new TestScenarioContext();
        this.driver = DriverManager.getDriver(BrowserType.CHROME);
    }

    public TestScenarioContext getScenarioContext() {
        return testScenarioContext;
    }

    public WebDriverActions getWebDriverActions() {
        return webDriverActions;
    }
    public WebDriver getDriver() {
        return driver;
    }

    public void quitDriver() {
        DriverManager.quitDriver();
    }

}
