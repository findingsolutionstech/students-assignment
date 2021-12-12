package com.guru99demo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentGatewayProjectPage {

	public static void main(String[] args) {
	
		 //set path to location of downloaded browser
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevin\\Chrome driver");
		  
		  //create a reference to the driver and import the pack for that reference
	      WebDriver driver = new ChromeDriver();
	      
	      
	     //using .get opens/navigates the user to specified url
	      driver.get("http://demo.guru99.com/payment-gateway/index.php");
	      
	      
	      driver.findElement(By.name("quantity")).sendKeys("3");

	      driver.findElement(By.xpath("submit")).click();
	      
	      driver.findElement(By.id("card_nmuber")).sendKeys("4888079141479454");

	      driver.findElement(By.id("month")).sendKeys("1");
	      
	      driver.findElement(By.id("year")).sendKeys("2025");

	      driver.findElement(By.id("cvv_code")).sendKeys("574");
	      
	      driver.findElement(By.name("submit")).click();

	      driver.findElement(By.className("button special")).click();
	      
		
	}
	
}
