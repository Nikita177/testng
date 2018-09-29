package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	@Parameters({"browser"})
	@BeforeTest
	public void bClass(String browser){
		
		if(browser.equalsIgnoreCase("firefox"))
		{
		System.out.println("open firefor");
	}else if(browser.equalsIgnoreCase("IE")){
		System.out.println("Chrome");
	}
		
	}
	
  
  
  @Test 
  public void test(){
	   System.out.println("Test one");
   }
  
  
  @AfterTest
	public void aClass(){
		System.out.println("After class");
	}
  
}
