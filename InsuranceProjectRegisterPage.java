package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceProjectRegisterPage {
	WebDriver driver;
	
	public InsuranceProjectRegisterPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@id='user_firstname']")
	private static WebElement userNameField;
	
	@FindBy(xpath="//input[@id='user_surname']")
	private static WebElement surNameField;
	
	@FindBy(xpath="//input[@id='user_phone']")
	private static WebElement phoneNumberField;
	
	@FindBy(xpath="//input[@id='licencetype_t']")
	private static WebElement fullRadioButton;
	
	@FindBy(xpath="//input[@id='licencetype_f']")
	private static WebElement provisionalRadioButton;
	
	@FindBy(xpath="//input[@id='user_address_attributes_street']")
	private static WebElement addressField;
	
	@FindBy(xpath="//input[@id='user_address_attributes_city']")
	private static WebElement cityField;
	
	@FindBy(xpath="//input[@id='user_address_attributes_county']")
	private static WebElement countyField;
	
	@FindBy(xpath="//input[@id='user_address_attributes_postcode']")
	private static WebElement postalCodeField;
	
	@FindBy(xpath="//input[@id='user_user_detail_attributes_email']")
	private static WebElement emailField;
	
	@FindBy(xpath="//input[@id='user_user_detail_attributes_password']")
	private static WebElement passwordField;
	
	@FindBy(xpath="//input[@id='user_user_detail_attributes_password_confirmation']")
	private static WebElement confirmPasswordField;
	
	@FindBy(xpath="//input[@name='submit']")
	private static WebElement createButton;
	
	@FindBy(xpath="//input[@id='resetform']")
	private static WebElement resetButton;
	

	public void browser() {
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	}
	
	public void firstName() {
		userNameField.sendKeys("tre");
	}
	public void surNameField() {
		surNameField.sendKeys("");
	}
	
	public void phoneNumber() {
		phoneNumberField.sendKeys("701-111-9999");
	}
	
	public void fullOrProvisional() {
		provisionalRadioButton.click();
	}
	
	public void addressStreet() {
		addressField.sendKeys("106 and park");
	}
	
	public void city() {
		cityField.sendKeys("Arlington");
	}
	
	public void county() {
		countyField.sendKeys("Arlington");
	}
	
	public void postalCode() {
		postalCodeField.sendKeys("11111");
	}
	
	public void email() {
		emailField.sendKeys("tre@gmail.com");
	}
	
	public void password() {
		passwordField.sendKeys("secret");
		confirmPasswordField.sendKeys("secret");
	}
	
	
	public void create() {
		createButton.click();
	}
	
	
	
	

}
