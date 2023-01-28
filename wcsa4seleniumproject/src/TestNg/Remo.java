package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void remo() {
	  System.out.println("This is Remo Class");
	  Reporter.log("This is remo method");
  }
  @Test
  public void remo1() {
	  Reporter.log("This is remo1 method");
  }
  @Test
  public void remo2() {
	  Reporter.log("This is remo2 method");
  }
}
