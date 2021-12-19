package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterPageStepDefinitions {
	WebDriver driver;
	HomePage homepage;
	RegisterPage registerPage;
	
//	@Given("I can navigate to homepage")
//	public void i_can_navigate_to_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tscot\\CDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
//	    
//	}

	@When("I click on register")
	public void i_click_on_register() {
	    homepage.register();
	}

	@When("User checks if register message appears")
	public void user_checks_if_register_message_appears() {
	   registerPage.validateRegisterText();
	}

	@Then("user enters contact information")
	public void user_enters_contact_information() {
	    registerPage.contactInfo();
	}

	@Then("user enters mailing information")
	public void user_enters_mailing_information() {
	   registerPage.mailingInfo();
	}

	@Then("user enters user information")
	public void user_enters_user_information() {
	    registerPage.userInfo();
	}

	@Then("user clicks submit")
	public void user_clicks_submit() {
	    registerPage.submitButton();
	}

	@Then("user checks if account was made")
	public void user_checks_if_account_was_made() {
	    registerPage.validateAccountWasMade();
	}
	

}
