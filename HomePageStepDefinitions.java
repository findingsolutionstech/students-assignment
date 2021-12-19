package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageStepDefinitions {

	WebDriver driver;
	HomePage homepage;

	@Given("user has browser open")
	public void user_has_browser_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tscot\\CDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		 }
	
	
	@Then("user checks if aruba image is diplayed")
	public void user_checks_if_aruba_image_is_diplayed() {
		homepage.validateArubaImage();
	}


	@Then("user checks if mercury image is displayed")
	public void user_checks_if_mercury_image_is_displayed() {
	    homepage.validateMercuryToursImage();
	}


	@Then("user checks if register link is working")
	public void user_checks_if_register_link_is_working() {
		homepage.validateRegisterLink();
	}
	
	@Then("user clicks on register link")
	public void user_clicks_on_register_link() {
	    homepage.register();
	}

	@Then("user clicks on signon link")
	public void user_clicks_on_signon_link() {
	    homepage.signOn();
	}

	@Then("user checks if signon link is working")
	public void user_checks_if_signon_link_is_working() {
		homepage.validateSignOnLink();
	}

}
