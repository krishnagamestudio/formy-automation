package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_91\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/dropdown");
	  System.out.println("Drop Down Menu??");

	  WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
	  dropdown.click();
	  System.out.println("Drop Down Button Clicled!");
	  
	 // WebElement autocomplete = driver.findElement(By.id("autocomplete"));
	 // autocomplete.click();
	 // System.out.println("Auto Complete Menu Clicked!");
	  
	  WebElement dropDown = driver.findElement(By.cssSelector("body > div > div > div > a:nth-child(6)"));
	  dropDown.click();
	  System.out.println("Drop Down Menu Clicked!");
	  
}
}
