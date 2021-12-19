package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {
	
	WebDriver driver;
	
	public SignOnPage(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//*[@href='login.php']")
	private static WebElement SignOnLink;
	

	@FindBy(xpath = "//img[@src='images/mast_signon.gif']")
	private WebElement SignOnPageImage;
	
	@FindBy(xpath = "//*[@face='Arial, Helvetica, sans-serif']")
	private WebElement SignOnPageMessage;
	
	@FindBy(xpath="//*[@href='register.php']")
	private static WebElement RegistrationLink;
	
	@FindBy(xpath="//input[@name='userName']")
	private static WebElement userNameField;
	
	@FindBy(xpath="//input[@id='password']")
	private static WebElement passWordField;
	
	@FindBy(xpath="//input[@name='submit']")
	private static WebElement submitButton;
		 
	
	public void browser() {
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	public void userName() {
		userNameField.sendKeys("hello");
	}
	public void password() {
		passWordField.sendKeys("secret");
	}
	public void submit() {
		submitButton.click();
	}
	
	
	
	
	
	
	
	
	
		
	}


