package starter.stepdefinitions;

import org.junit.Assert;

import Pages.DemoHomePage;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class DemoHomeSteps extends PageObject {
	@Steps
    DemoHomePage home = new DemoHomePage();

    @Given("user is on home page")
    public void user_is_on_home_page() {
        String url = getDriver().getCurrentUrl();
        boolean val = home.checkHomePageUrl(url);
        Assert.assertTrue(val);
    }

    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
         home.enterFirstnameAndLastname("sam", "curran");
    }



    @Then("user should be able to see text")
    public void user_should_be_able_to_see_text() {
        boolean val=home.checkEnteredValues("sam", "curran");
        Assert.assertTrue(val);
    }
}
