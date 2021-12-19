package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankProject {

	WebDriver driver;
	public BankProject(WebDriver driver) {
	
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@name='uid']")
	private static WebElement userNameField;
	
	@FindBy(xpath="//input[@type='password']")
	private static WebElement passwordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private static WebElement loginButton;
	
	@FindBy(xpath="//input[@type='reset']")
	private static WebElement resetButton;
	

	public void browser() {
		driver.navigate().to("http://demo.guru99.com/test/newtours/index.php");
	}
	
	public void userName() {
		userNameField.sendKeys("1303");
	}
	
	public void password() {
		passwordField.sendKeys("Guru99");
	}
	
	public void login() {
		loginButton.click();
	}
	
	

}
