package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileProject {
	WebDriver driver;
	public AgileProject(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	

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
	
	public void validateSignInMessage() {
		boolean message=driver.findElement(By.xpath("\"//marquee[.='Welcome To Customer's Page of Guru99 Bank']/marquee")).isDisplayed();
		System.out.println(message);
	}
	
	
	@FindBy(xpath="//input[@name='uid']")
	private static WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	private static WebElement passwordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private static WebElement loginButton;
	
	@FindBy(xpath="//input[@type='reset']")
	private static WebElement resetButton;
	
	@FindBy(xpath="//marquee[.='Welcome To Customer's Page of Guru99 Bank']/marquee")
	private static WebElement message;
	
	

}
