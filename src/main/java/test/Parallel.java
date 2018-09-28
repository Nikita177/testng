package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel {
	
	@BeforeClass
	public void bClass(){
		System.out.println("Before class");
	}
	
  @BeforeTest
  public void browser() {
	  
	  System.out.println("open browser");
  }
  
  @BeforeMethod
  public void btest(){
	  System.out.println("Before test");
	  
  }
  
  
  @Test 
  public void test(){
	   System.out.println("Test one");
   }
  
  @Test()
  public void test2(){
	  System.out.println("Test two");
  }
  
  @AfterMethod
  public void aTest(){
	  System.out.println("After test");
  }
  
  @AfterTest
  public void quit(){
	  System.out.println("Quit");
  }
  
  @AfterClass
	public void aClass(){
		System.out.println("After class");
	}
  
}
