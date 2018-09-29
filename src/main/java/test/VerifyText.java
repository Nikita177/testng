package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyText {
	WebDriver dir;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"A:\\software\\selenium\\chromedriver_win32\\chromedriver.exe");
		 dir = new FirefoxDriver();
		 dir.get("https://www.infibeam.com/");
	}
  
	
	@Test
	public void verifyText(){
		String color=dir.findElement(By.id("loginlink")).getCssValue("color");
	System.out.println("Color is "+color);	
	}
	
	@AfterTest
	public void quit(){
		dir.quit();
	}
}
