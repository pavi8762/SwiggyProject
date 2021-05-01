package stepDefiniton;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpPage;


@Listeners(ListenerClass.class)
public class SwiggySignup {
	
	WebDriver driver= Setup.driver	;
	
	ExtentReports extent;
	ExtentTest logger;
	
	 @Given("^The user is on the Swiggy Home Page$")
	    public void the_user_isn_on_the_swiggy_home_page() throws Throwable {
		
		    	driver.get("https://www.swiggy.com/");
	    }

	 @When("^User Click on SignUp$")
	    public void user_click_on_signup() throws Throwable {
	    	
	    	HomePage SignUpbtn = new HomePage(driver);
	    	SignUpbtn.clickSignUp();
	    	
	    	Thread.sleep(1000);
	    	
	    	extent = new  ExtentReports (System.getProperty("usr.dir") + "/extent.html", false);
	    	
	    	logger = extent.startTest("Test 01");
	    	logger.log(LogStatus.PASS, "SignUp Button is clicked on");
	    	
	   
	    }

	  @Then("^User should be redirected to SignUp Page$")
	    public void user_should_be_redirected_to_signup_page() throws Throwable {
	      SignUpPage TitleCheck = new SignUpPage(driver);
	      TitleCheck.title_check();
	      logger.log(LogStatus.PASS, "Validate that signup is appearing");
	  	extent.endTest(logger);
	  	extent.flush();
	  	extent.close();
	     
		  System.out.println("User is in Signup Page");
	        
	    
	       
	    }
	    
	    @Given("^The user is already on the SignUp page$")
	    public void the_user_is_already_on_the_signup_page() throws Throwable {
	    	
	    	driver.get("https://www.swiggy.com");
	    	HomePage SignUpbtn = new HomePage(driver);
	    	SignUpbtn.clickSignUp();
	    	extent = new  ExtentReports (System.getProperty("usr.dir") + "/extent.html", false);
	    	
	    	logger = extent.startTest("Test 02");
	    	logger.log(LogStatus.PASS, "click on the SignUp button");
	    	
	    }

	    @When("^User enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	    public void user_enters_something_something_something_something(String mobile, String username, String email, String password ) throws Throwable {
	        SignUpPage details = new SignUpPage(driver);
	        details.enterMobileno(mobile);
	        details.enterUsername(username);
	        details.enterEmail(email);
	        details.enterPassword(password);
	       
	       
	        Thread.sleep(5000);
	        
	        logger.log(LogStatus.PASS, "Enter the user details");
	        
	      
	    }
	    
	    @And("^User Click Continue button$")
	    public void user_click_contiue_button() throws Throwable {
	    	SignUpPage details = new SignUpPage(driver);
	    	 details.clickContinue();
	    	 
	    	 Thread.sleep(1000);
	    	 logger.log(LogStatus.PASS, "User SignsUp");
	    	 
	    }

	    @Then("^User should be able to SignUp$")
	    public void user_should_be_able_to_signup() throws Throwable {
	    	
	    	logger.log(LogStatus.PASS, "Successfully Signed Up");
	    	 
	    }

	   
	    
	

}
