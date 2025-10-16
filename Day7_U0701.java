package com.omrbranch.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0701 {

	public void t0701() throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr/");	
	driver.manage().window().maximize();
	
	//to find locator of String to move java class area using draganddrop->m
	WebElement lnkStringSor = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement lnkStringDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	//to find locator of list to move java interface area using draganddrop->m
	WebElement lnkListSor = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement lnkListDes = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	//to find the locator of Actions to move Selenium Class
	WebElement lnkActionsSor = driver.findElement(By.xpath("(//a[contains(@class,'button button-orange')])[4]"));
	WebElement lnkActionsDes = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[3]"));
	//to find the locator of WebDriver to move Selenium Class
	WebElement lnkWebDriverSor = driver.findElement(By.xpath("(//a[contains(@class,'button button-orange')])[6]"));
	WebElement lnkWebDriverDes = driver.findElement(By.xpath("(//li[contains(@class,'placeholder')])[4]"));
		
	Actions actions = new Actions(driver);	
	actions.dragAndDrop(lnkStringSor, lnkStringDes).perform();
	actions.dragAndDrop(lnkListSor, lnkListDes).perform();
	actions.dragAndDrop(lnkActionsSor, lnkActionsDes).perform();
	actions.dragAndDrop(lnkWebDriverSor, lnkWebDriverDes).perform();
	
	//to make donwcast datatype child notequal to parent
	TakesScreenshot takeScreenShot = (TakesScreenshot)driver;
	File screenshotAs = takeScreenShot.getScreenshotAs(OutputType.FILE);	
	File screensDay7_U0701 = new File("E:\\Java selenium automation testing\\Green Technology\\GT-Selenium\\SeleniumDay7\\Day7_U0701.png");
	FileUtils.copyFile(screenshotAs,screensDay7_U0701);
	
	}
	
	public static void main(String[] args) throws IOException {
	Day7_U0701 day7_U0701 = new Day7_U0701();
	day7_U0701.t0701();
		
	}
}
