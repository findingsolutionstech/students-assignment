package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.InsuranceProjectPage;
import pages.InsuranceProjectRegisterPage;

public class InsurancePageRegisterStepDefinitions {
	WebDriver driver;
	HomePage homepage;
	InsuranceProjectPage insuranceProject;
	InsuranceProjectRegisterPage insuranceRegisterPage;
	
//	@Given("i can navigate to homepage")
//	public void i_can_navigate_to_homepage() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tscot\\CDriver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
//		 
//	   
//	   
//	}

	@Then("i click on insurance project page")
	public void i_click_on_insurance_project_page() {
	    homepage.insuranceLink();
	}

	@Then("i click on the register button")
	public void i_click_on_the_register_button() {
	  insuranceProject.registerButton();
	}

	@Then("i sign up as new user")
	public void i_sign_up_as_new_user() {
	   insuranceRegisterPage.firstName();
	   insuranceRegisterPage.addressStreet();
	   insuranceRegisterPage.city();
	   insuranceRegisterPage.email();
	   insuranceRegisterPage.surNameField();
	   insuranceRegisterPage.fullOrProvisional();
	   insuranceRegisterPage.password();
	   insuranceRegisterPage.phoneNumber();
	   insuranceRegisterPage.postalCode();
	   insuranceRegisterPage.county();
	}

	@Then("i click login")
	public void i_click_login() {
		insuranceRegisterPage.create();
	}

	@Then("i validate if my account was signed in")
	public void i_validate_if_my_account_was_signed_in() {
	   insuranceProject.validateLogin();
	}

	
	
	
	
	
	
	

}
