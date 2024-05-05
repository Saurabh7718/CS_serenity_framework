package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class DemoLoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailInput;

    @FindBy(id = "enterimg")
    private WebElementFacade loginButton;

    // No need for constructor since WebDriver is managed by Serenity

    public void enterEmail(String email) {
        emailInput.type(email);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
