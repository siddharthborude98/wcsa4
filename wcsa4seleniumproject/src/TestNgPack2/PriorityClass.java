package TestNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityClass {
  @Test
  public void a() {
	  Reporter.log("a",true);
  }
  @Test(priority = 2)
  public void p() {
	  Reporter.log("p",true);
  }
  @Test
  public void i() {
	  Reporter.log("i",true);
  }
  @Test(priority = 3)
  public void d() {
	  Reporter.log("d",true);
  }
  @Test(priority = 1)
  public void m() {
	  Reporter.log("m",true);
  }
  @Test
  public void k() {
	  Reporter.log("k",true);
  }
}
