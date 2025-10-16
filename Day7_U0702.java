package com.omrbranch.day7;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day7_U0702 {

	public void t0702() throws IOException {
	WebDriver driver = new ChromeDriver();	
	driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr/");
	driver.manage().window().maximize();
	
	//to get mouse action over
	WebElement lnkCourses = driver.findElement(By.xpath("(//a[contains(@class,'dropdown-toggle')])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(lnkCourses).perform();
	
	WebElement lnkSelenium = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[1]"));	
	lnkSelenium.click();
	
	//to get screenshot this is down casting
	TakesScreenshot tScreenshot = (TakesScreenshot)driver;
	File screenshotAs = tScreenshot.getScreenshotAs(OutputType.FILE);
	File file = new File("\\E:\\Java selenium automation testing\\Green Technology\\GT-Selenium\\SeleniumDay7\\Day7_U0702_Screenshot.png");
	FileUtils.copyFile(screenshotAs, file);
	
					
	}
public static void main(String[] args) throws IOException {
	Day7_U0702 u0702 = new Day7_U0702();
	u0702.t0702();
}
	
}
