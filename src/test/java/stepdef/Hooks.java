package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.driver.BrowserType;
import org.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.utils.WebDriverActions;

import java.io.IOException;
import java.util.Properties;

public class Hooks {
    private DriverManager driverManager;
    private TestManagerContext testManagerContext;
    private WebDriverActions webDriverActions;

    public Hooks(TestManagerContext testManagerContext, WebDriverActions webDriverActions) {
        this.testManagerContext = testManagerContext;
        this.webDriverActions = webDriverActions;
    }

    @Before
    public void setUp() throws IOException {
//        Properties prop = webDriverActions.loadProperties();
        webDriverActions.navigate(testManagerContext.getDriver(), "https://www.amazon.co.uk/");
    }


    @After
    public void tearDown() {
        driverManager.quitDriver();
//        testManagerContext.quitDriver();
    }
}
