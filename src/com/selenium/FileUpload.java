package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_91\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://formy-project.herokuapp.com/fileupload");
	  System.out.println("File Upload??");

	  WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
	  fileUploadField.sendKeys("ganpati.jpg");
	  System.out.println("Drop Down Button Clicked!");

}
}
