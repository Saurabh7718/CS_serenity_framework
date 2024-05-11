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
    
    @Given("User should be on home page")
    public void user_should_be_on_home_page() {
    	 String url = getDriver().getCurrentUrl();
         boolean val = home.checkHomePageUrl(url);
         Assert.assertTrue(val);
    }

    @When("User clicks on radio button")
    public void user_clicks_on_radio_button() {
        home.clickRadioBtn();
    }

    @Then("radio button should be enabled")
    public void radio_button_should_be_enabled() {
        home.checkEnabled();
    }

    @When("User clicks on checkbox button")
    public void user_clicks_on_checkbox_button() {
        home.clickOnCheckBox();
    }

    @Then("checkbox  should be select")
    public void checkbox_should_be_select() {
        home.checkBoxSelected();
    }

    @When("User clicks on dropdown and select skill")
    public void user_clicks_on_dropdown_and_select_skill() {
         home.drpSkillSelect();
    }

    @Then("skill should be displayed")
    public void skill_should_be_displayed() {
       home.checkDrpText();
    }
    
    @When("user should select date {string} from dropdwon")
    public void user_should_select_date_from_dropdwon(String string) {
         home.selectDateFromDropDown();
    }

    @Then("user should be able to see date")
    public void user_should_be_able_to_see_date() {
       home.checkSelectedDate();
    }



}
