package stepDefiniton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Setup {
	
	static WebDriver driver;
	@Before
	public void SetDriver() {
		
		System.out.println("inside before");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		
	}
	
	@After("Search")
	public void CloseDriver() {
		System.out.println("inside after");
		
	}

}
