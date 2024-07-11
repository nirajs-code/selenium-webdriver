package stepdef;

import io.cucumber.java8.En;
import pages.HomePage;

public class HomePageStepDef implements En {
    public HomePageStepDef(HomePage homePage) {

        Given("Search the {string} on home page", (string) -> {
            System.out.printf("Searched key is %s \n", string);
            homePage.searchTextOnGoogle((String) string);
            homePage.clickOnSubmitButton();
        });

        Then("I verify the search result", () -> {
            System.out.printf("I on Search result page");
        });
    }
}
