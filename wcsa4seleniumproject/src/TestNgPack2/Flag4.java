package TestNgPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void loginMethod() {
	  
	  Reporter.log("Log In is Done!!",true);
  }
  @Test(dependsOnMethods = "loginMethod")
  public void createUser() {
	  
	  Reporter.log("User Create!!",true);
  }
  
  @Test(dependsOnMethods = "createUser")
  public void logOut() {
	  
	  Reporter.log("LogOut In is Done!!",true);
  }
}
