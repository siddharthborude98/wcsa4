package TestNg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.BaseTest;
//import pageObjectModel.Flib;
//import pageObjectModel.LoginPage;
import pageObjectModel.Flib;
import pageObjectModel.LoginPage;

public class ActitimeTestNGLogin extends BaseTest {
	
  @Test
  public void testLogin() throws InterruptedException, IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");

		
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		String usn = flib.readPropertyData(PROP_PATH, "Username");
		String pass = flib.readPropertyData(PROP_PATH, "Password");
		
		lp.ActiTimeInValidLoginPage(usn,pass);
		
	  SoftAssert sa = new SoftAssert();
	  String actualTitle = driver.getTitle();
	  sa.assertEquals(actualTitle, "actiTIME - Enter Time-Track");
	  sa.assertAll();
	  
	  
	  
	  
  }
}
