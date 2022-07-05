package week6.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

////Week 2_Day 1 : Assignment 2
public class EditLead extends BaseClass {

	@Test
	public void edit_Lead() throws InterruptedException {

		// TODO Auto-generated method stub
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// passing the Text in the fields
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Durga");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balu");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Durgab");
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		driver.findElement(By.name("description")).sendKeys("Creat Leads in Test Leaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Durgabalu@gmail.com");

		// Select Drop down using Select class
		WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown = new Select(elementState);
		stateDropdown.selectByVisibleText("New York");
		
		//click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Click on Edit Link
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		
		//Clear and Pass the text 
		driver.findElement(By.id("updateLeadForm_description")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("importantNote")).sendKeys("Customer Request");
		
		//Click on Update 
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());

	}

}
