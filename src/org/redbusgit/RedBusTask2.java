package org.redbusgit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class RedBusTask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipse-workspace\\SeleniumProgramming\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		WebElement txtFrom = driver.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		
        WebElement txtTo = driver.findElement(By.id("dest"));
        txtTo.sendKeys("Puducherry");
        
        
		
		
}}


// delete above codes and create maven project and run this codes