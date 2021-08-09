package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_91\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/radiobutton");
	  System.out.println("Check Radio Buttons?");

	  WebElement radioBtn1 = driver.findElement(By.id("radio-button-1"));
	  radioBtn1.click();
	  System.out.println("Btn 1 Clicked");
	  
	  WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
	  radioBtn2.click();
	  System.out.println("Btn 2 Clicked");
	  
	  WebElement radioBtn3 = driver.findElement(By.cssSelector("input[value='option3']"));
	  radioBtn3.click();
	  System.out.println("Btn 3 Clicked");
	  
}
}
