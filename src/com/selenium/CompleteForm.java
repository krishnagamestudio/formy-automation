package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteForm {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_91\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/form");
	System.out.println("Form Submission??");
	
	//method call
	submitForm(driver);
	waitForAlertBanner(driver);
	
 }
   public static void submitForm(WebDriver driver) throws InterruptedException
   {
	   WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Aishwarya");
		System.out.println("First Name..");

		
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Dherange");
		System.out.println("Last Name");
			
		WebElement job = driver.findElement(By.id("job-title"));
		job.sendKeys("Testing Engineer");
		System.out.println("Job..");
		
		WebElement radioButton = driver.findElement(By.cssSelector("input[value='radio-button-3']"));
		radioButton.click();
		System.out.println("School..");
		
		WebElement checkBox1 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
		checkBox1.click();
		System.out.println("Gender Box 2..");
		
		Thread.sleep(2000);
		WebElement checkBox2 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
		checkBox2.click();
		System.out.println("Gender Box 3..");
		
		WebElement exp = driver.findElement(By.id("select-menu"));
		exp.click();
		
		WebElement expChoice = driver.findElement(By.cssSelector("option[value='4']"));
		expChoice.click();expChoice.click();
		System.out.println("Experience..");
		
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("16/8/2021");
		date.sendKeys(Keys.RETURN);
		System.out.println("Date Clicked");
		
		Thread.sleep(2);
		WebElement submit = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
		submit.click();
		System.out.println("Form Submited..");
   }
   
    public static void waitForAlertBanner(WebDriver driver)
    {
    	WebDriverWait wait = new WebDriverWait(driver,10);
    	WebElement alert= wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));
    	
    	String alertText = alert.getText();
    	//assertEquals("The form was successfully submitted!",alertText);
    }
}
