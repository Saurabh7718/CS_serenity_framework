package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoHomePage extends PageObject {

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElementFacade firstname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElementFacade lastname;

    public boolean checkHomePageUrl(String Url) {
        String exp = "https://demo.automationtesting.in/Register.html";
        return exp.equalsIgnoreCase(Url);
    }

    public void enterFirstnameAndLastname(String first, String last) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOf(firstname));
        firstname.sendKeys(first);
        lastname.sendKeys(last);
    }


    public boolean checkEnteredValues(String first, String last) {
        String actualFirst = firstname.getValue();
        String actualLast = lastname.getValue();
        return actualFirst.equalsIgnoreCase(first) && actualLast.equalsIgnoreCase(last);
    }
}
