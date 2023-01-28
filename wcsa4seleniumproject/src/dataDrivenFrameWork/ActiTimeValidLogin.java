package dataDrivenFrameWork;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeValidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,0);
		String password = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,1);
		
		   driver.findElement(By.name("username")).sendKeys(username);
		   Thread.sleep(2000);
		   driver.findElement(By.name("pwd")).sendKeys(password);
		   driver.findElement(By.id("loginButton")).click();
 

	}
}