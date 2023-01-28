package synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActitime {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");
		 
		 String actualLoginPageTitle = driver.getTitle();
		 if(actualLoginPageTitle.equals("actiTIME - Login"))
		 {
			System.out.println("Login Page Title is match : Test case is passed!! "); 
		 }
		 else
		 {
			 System.out.println("Login Page Title is not match : Test case is failed!! "); 
		 }
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.xpath("//a[.='Login']")).click();
	     Thread.sleep(8000);	 
	     String actualHomePageTitle = driver.getTitle();
	     if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
	     {
	    	 System.out.println("Home Page Title is match : Test case is passed!! "); 
	     }
	     else
	     {
	    	 System.out.println("Home Page Title is not match : Test case is failed!! ");  
	     }
	}

}
