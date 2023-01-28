package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu1 {
	//How To close parent and Child window?
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		Thread.sleep(2000);
		Set<String> allHandles = driver.getWindowHandles();
		Thread.sleep(2000);
			for(String window:allHandles)
			{
				driver.switchTo().window(window).quit();
			}
		}

}
