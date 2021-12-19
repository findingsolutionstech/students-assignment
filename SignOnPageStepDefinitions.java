package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.SignOnPage;

public class SignOnPageStepDefinitions {

	WebDriver driver;
	HomePage homepage;
	SignOnPage signOnPage;

//	@Given("user is on the homepage")
//	public void user_is_on_the_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tscot\\CDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
//		 
//		
//	}

	@Given("user clicks on sign on page")
	public void user_clicks_on_sign_on_page() {
		homepage.signOn();
	}

	@Given("user checks if sign on message is appears")
	public void user_checks_if_sign_on_message_is_appears() {
		boolean message = driver.findElement(By.xpath("//img[@src='images/mast_signon.gif']")).isDisplayed();
		System.out.println(message);
	}

	@Then("user enters username")
	public void user_enters_username() {
		signOnPage.userName();
	}

	@Then("user enter password")
	public void user_enter_password() {
		signOnPage.password();
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		signOnPage.submit();
	}

	@Then("user checks if they are on a new page")
	public void user_checks_if_they_are_on_a_new_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
