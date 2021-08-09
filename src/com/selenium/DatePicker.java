package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_91\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/datepicker");
	  System.out.println("Date Picker??");

	  WebElement dateSearch = driver.findElement(By.id("datepicker"));
	  dateSearch.click();
	  System.out.println("Open Date Picker..");
	  
	  dateSearch.sendKeys("03/03/2021");
	  dateSearch.sendKeys(Keys.RETURN);
	  
}
}
