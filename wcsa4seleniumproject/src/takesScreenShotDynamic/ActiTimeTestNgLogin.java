package takesScreenShotDynamic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomeListner.class)
public class ActiTimeTestNgLogin extends BaseTest {
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	@Test
	public void loginPage() throws InterruptedException {
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle, "siddharth");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
		
		
	}
	@Test(priority=1)
	public void homePage() throws InterruptedException
	{
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle, "siddharth");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
		
		Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		Assert.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Trac");
		driver.findElement(By.id("SubmitTTButton")).click();
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	


}
