package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utils.WebDriverActions;
import stepdef.TestManagerContext;

public class HomePage{
    TestManagerContext testManagerContext;
    WebDriverActions webDriverActions;
    WebDriver driver;
    By searchTextBox = By.xpath("//input[@id='twotabsearchtextbox']");
    By searchButton = By.xpath("//*[@id='nav-search-submit-button']");

    public HomePage(TestManagerContext testManagerContext, WebDriverActions webDriverActions ) {
        this.testManagerContext = testManagerContext;
        driver = testManagerContext.getDriver();
        this.webDriverActions = webDriverActions;
    }

    public void searchTextOnGoogle(String text){
        WebElement element = driver.findElement(searchTextBox);
        webDriverActions.sendKeys(element, text);
    }
    public void clickOnSubmitButton(){
        WebElement element = driver.findElement(searchButton);
        webDriverActions.clickElement(element);
    }

}
