package actionsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	   
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//div[.='Settings']")).click();
	    driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
	    driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
	    WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    Actions act = new Actions(driver);
	    //to perform double click action
	    act.doubleClick(target).perform();
	    
	    //outout:org.openqa.selenium.ElementClickInterceptedException
	    
	    
		
	}

}
