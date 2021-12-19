package stepdefs;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AgileProject;
import pages.HomePage;

public class AgileProjectStepDefinitions {
	HomePage homepage;
	AgileProject agilePage;
	WebDriver driver;
	
	
//	@Given("user has homepage open")
//	public void user_has_homepage_open() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tscot\\CDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
//		 
//	   
//	}
	
	@Then("i click on agile project")
	public void i_click_on_agile_project() {
	   homepage.agileLink();
	}

	@Then("i sign in")
	public void i_sign_in() {
	    agilePage.userName();
	    agilePage.password();
	    agilePage.login();
	}

	@Then("user should see welcome message when signed in")
	public void user_should_see_welcome_message_when_signed_in() {
	    agilePage.validateSignInMessage();
	}

}
