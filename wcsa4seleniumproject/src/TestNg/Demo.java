package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() {
	  
	  System.out.println("This is Demo class");
	  Reporter.log("This is demo method");
  }
  @Test
  public void demo1() {
	  int a=48;
	  int b=2;
	  @SuppressWarnings("unused")
	int res=a/b;
	  
	  
  }
  @Test 
  public void demo2() {
	  Reporter.log("This is demo2 method");
  }
}
