package week6.Day1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
 public ChromeDriver driver;
  @BeforeMethod
  public void preCondition() {
	// Setup Chrome Driver
			WebDriverManager.chromedriver().setup();
			// Open Browser
			 driver = new ChromeDriver();

			// Perform Launch and Login actions
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login"); 
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
  }

  @AfterMethod
  public void postCondition() {
	  
	  driver.close();
  }

}
