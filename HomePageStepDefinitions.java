package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageStepDefinitions {

	WebDriver driver;
	HomePage homepage;

	@Given("User has browser open")
	public void user_has_browser_open() {
		homepage.SetUpEnvironment();
	}

	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
		homepage.browser();
	}

	@Then("user checks if aruba image is diplayed")
	public void user_checks_if_aruba_image_is_diplayed() {
		homepage.validateArubaImage();
	}

	@Then("user checks if mercury page image is displayed")
	public void user_checks_if_mercury_page_image_is_displayed() {
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
