package starter.stepdefinitions;

import Pages.DemoLoginPage;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class DemoLoginStepDefinitions {
	@Steps
    DemoLoginPage demoLoginPage;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        demoLoginPage.open();
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        demoLoginPage.enterEmail("example@example.com");
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        demoLoginPage.clickLoginButton();
    }

    @Then("User should be redirected to the home page")
    public void user_should_be_redirected_to_the_home_page() {
        // Add assertion for redirection
    }
}
