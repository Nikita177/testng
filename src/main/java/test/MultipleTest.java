package test;

import org.testng.annotations.Test;

public class MultipleTest {
  @Test
  public void f() {
	  System.out.println("MultipleTet");
  }
  @Test
  public void setup() {
	  System.out.println("setup");
  }
  @Test
  public void logOut() {
	  System.out.println("Logout");
  }


}
