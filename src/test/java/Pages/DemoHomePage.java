package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.functions.ExpectedCondition;
import junit.framework.Assert;

public class DemoHomePage extends PageObject {

	Select s;
	
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElementFacade firstname;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElementFacade lastname;
    
    @FindBy(xpath="//input[@value='FeMale']")
    WebElementFacade radioBtnFemale;
    
    @FindBy(xpath="//input[@id='checkbox1']")
    WebElementFacade CheckBoxCricket;
    
    @FindBy(xpath="//select[@id='Skills']")
    WebElementFacade skills;
    
    @FindBy(xpath="//select[@id='yearbox']")
    WebElementFacade year;
    
    @FindBy(xpath="//select[@placeholder='Month']")
    WebElementFacade month;
    
    @FindBy(xpath="//select[@id='daybox']")
    WebElementFacade day;
    
    

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
    
    public void clickRadioBtn() {
    	radioBtnFemale.click();
    	
    }
    public void checkEnabled() {
    	boolean val=radioBtnFemale.isEnabled();
    	
    	 Assert.assertTrue(val);
    }
    
    public void clickOnCheckBox() {
    	CheckBoxCricket.click();
    }
    
    public void checkBoxSelected() {
    	boolean val=CheckBoxCricket.isSelected();
    	
    	 Assert.assertTrue(val);
    }
    
    public void drpSkillSelect() {
    	Select s=new Select(skills);
    	s.selectByVisibleText("C");
    	
    }
    
    public void checkDrpText() {
    	WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(skills));

        Select selectedOption = new Select(skills);
        String selectedSkill = selectedOption.getFirstSelectedOption().getText();
        
        System.out.println("Selected skill: " + selectedSkill);
        
        Assert.assertEquals("C", selectedSkill);
    }
    
    public void selectDateFromDropDown() {
    	Select y=new Select(year);
    	y.selectByVisibleText("2014");
    	
    	Select m=new Select(month);
    	m.selectByVisibleText("August");
    	
    	Select d=new Select(day);
    	d.selectByVisibleText("15");
    
    	
    }
    
    public void checkSelectedDate() {
    	 Select selectedOption1 = new Select(year);
         String year1 = selectedOption1.getFirstSelectedOption().getText();
    	
    	Assert.assertEquals("2014", year1);
         
         Select selectedOption2 = new Select(month);
         String month1 = selectedOption2.getFirstSelectedOption().getText();
     	Assert.assertEquals("August", month1);

    	
         Select selectedOption3 = new Select(day);
         String day1 = selectedOption3.getFirstSelectedOption().getText();
     	Assert.assertEquals("15", day1);
    	



    }
    	 
    	
    }
    

