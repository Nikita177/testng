package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
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
		WebElement log =dir.findElement(By.id("loginlink"));
		String color=log.getCssValue("color");
	System.out.println("Color is  "+color);	
	String hexColor=Color.fromString(color).asHex();
	System.out.println(hexColor);
	if ("#4d90fe".equals(hexColor)){
		System.out.println("Its blue color");
	}
	
	int x=log.getLocation().getX();
	int y=log.getLocation().getY();
	System.out.println("The y and Z location for log is :"+x+" "+y);
	
	}
	
	@AfterTest
	public void quit(){
		dir.quit();
	}
}
