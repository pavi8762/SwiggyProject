package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.Assert;

public class SignUpPage {
	
WebDriver driver;


ExtentReports extent;
ExtentTest logger;

@FindBy(className = "_1Tg1D")
WebElement title;

@FindBy(id = "mobile")
WebElement mobile_no;

@FindBy(id = "name")
WebElement usr_name;

@FindBy(id = "email")
WebElement email_add;

@FindBy(id = "password")
WebElement pwd;


@FindBy(xpath = "//a[@class='a-ayg']")
WebElement continuebtn;

@FindBy(xpath ="//div[contains(@class, '1Tg1D')]")
WebElement logo;



public SignUpPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

//By  txt_username = By.className("r2iyh");

public void title_check() {
	
	Assert.assertTrue(logo.isDisplayed());
	
}




public void enterMobileno(String mobile) {
	
	mobile_no.sendKeys(mobile);
}
	
public void enterUsername(String username) {
	
	usr_name.sendKeys(username);
}

public void enterEmail(String email) {
	
	email_add.sendKeys(email);
}

public void enterPassword(String password) {
	
	pwd.sendKeys(password);
}
	
	
public void clickContinue() {
	
	continuebtn.click();
}
	

			

	



}



	
	
