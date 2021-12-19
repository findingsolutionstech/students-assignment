package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceProjectPage {
	WebDriver driver;

	public InsuranceProjectPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	

	@FindBy(xpath="//input[@id='email']")
	private static WebElement emailField;
	
	@FindBy(xpath="//a[@href='register.php']")
	private static WebElement registerButton;
	
	@FindBy(xpath="//input[@id='password']")
	private static WebElement passwordField;
	
	@FindBy(xpath="//input[@name='submit']")
	private static WebElement loginButton;
	
	@FindBy(xpath="//*[.='tre@gmail.com']/h4")
	private static WebElement validateEmail;

	public void browser() {
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	}
	
	public void email() {
		emailField.sendKeys("tre@gmail.com");
	}
	
	public void passworldField() {
		passwordField.sendKeys("secret");
	}
	
	public void registerButton() {
		registerButton.click();
	}
	
	public void loginButton() {
		loginButton.click();
	}
	
	public void validateLogin() {
		boolean email=driver.findElement(By.xpath("//*[.='tre@gmail.com']/h4")).isDisplayed();
		System.out.println(email);
	}
	
	
	

}
