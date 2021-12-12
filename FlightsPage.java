package com.guru99demo.page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlightsPage {

	public static void main(String[] args) {

		  //set path to location of downloaded browser
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\tevin\\Chrome driver");
		  
		  //create a reference to the driver and import the pack for that reference
	      WebDriver driver = new ChromeDriver();
	      
	      
	     //using .get opens/navigates the user to specified url
	      driver.get("http://demo.guru99.com/test/newtours/reservation.php");
	      
	      
	      
	      driver.findElement(By.xpath("roundtrip")).click();

	      driver.findElement(By.name("passCount")).sendKeys("3");
	      
	      driver.findElement(By.name("fromPort")).sendKeys("New York");

	      driver.findElement(By.name("fromMonth")).sendKeys("July");

	      driver.findElement(By.name("fromDay")).sendKeys("12");

	      driver.findElement(By.name("toPort")).sendKeys("Acapulco");

	      driver.findElement(By.name("toDay")).sendKeys("5");

	      driver.findElement(By.name("servClass")).sendKeys("First");
	      
	      driver.findElement(By.name("airline")).sendKeys("Blue Skies Airlines");
	      

	}

}
