package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@href='register.php']")
	private static WebElement registrationLink;
	
	@FindBy(xpath = "//img[@src='images/mast_register.gif']")
	private WebElement registerPageImage;
	
	@FindBy(xpath = "//*[@face='Arial, Helvetica, sans-serif']")
	private WebElement registerPageMessage;
	
	@FindBy(xpath="//input[@name='firstName']")
	private static WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='lastName']")
	private static WebElement lastNameField;
	
	@FindBy(xpath="//input[@name='phone']")
	private static WebElement phoneField;
	
	@FindBy(xpath="//input[@id='userName']")
	private static WebElement emailField;
	
	@FindBy(xpath="//input[@name='address1']")
	private static WebElement addressField;
	
	@FindBy(xpath="//input[@name='city']")
	private static WebElement cityField;
	
	@FindBy(xpath="//input[@name='state']")
	private static WebElement stateProvinceField;
	
	@FindBy(xpath="//input[@id='postalCode']")
	private static WebElement postalCodeField;
	
	@FindBy(xpath="//select[@name='country']")
	private static WebElement countryDropDown;
	
	@FindBy(xpath="//*[.='UNITED STATES']/option")
	private static WebElement unitedStatesSelection;
	
	@FindBy(xpath="//input[@id='email']")
	private static WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	private static WebElement passwordField;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	private static WebElement confirmPasswordField;
	
	@FindBy(xpath="//input[@name='submit']")
	private static WebElement submitButton;
	
	@FindBy(xpath="//*[.= 'Note: Your user name is a.']")
	private static WebElement userNameMessage;
	
		
	public void validateRegisterText() {
		WebElement registerText=driver.findElement(By.xpath("//*[.='images/mast_register.gif')"));
		boolean textDisplay=registerText.isDisplayed();
		System.out.println(textDisplay);
	}
	
	public void contactInfo() {
		firstNameField.sendKeys("Tre");
		lastNameField.sendKeys("Scott");
		phoneField.sendKeys("123-456-7890");
		emailField.sendKeys("tscottnpl@gmail.com");
	}
	public void mailingInfo() {
		addressField.sendKeys("106 and park");
		cityField.sendKeys("Arlington");
		stateProvinceField.sendKeys("Virginia");
		postalCodeField.sendKeys("20190");
		unitedStatesSelection.click();
	}
	
	public void userInfo() {
		userNameField.sendKeys("tre1234");
		passwordField.sendKeys("something");
		confirmPasswordField.sendKeys("something");
	}
	
	public void submitButton() {
		submitButton.click();
	}
	
	public void validateAccountWasMade() {
		WebElement validateUser=driver.findElement(By.xpath("//*[.= 'Note: Your user name is a.']"));
		boolean user=validateUser.isDisplayed();
		System.out.println(user);
	}
	
	
	
	
	
	
	

}
