package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu4 {
	//how to close child window?
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://omayo.blogspot.com/");
			driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
			String parentHandle = driver.getWindowHandle();
			System.out.println(parentHandle);

			System.out.println("------------------------------------------------------");
			
			Set<String> allHandles= driver.getWindowHandles();
			for(String wh:allHandles)
			{
			    System.out.println(wh);
			    if(!parentHandle.equals(wh))
			    {
			    	driver.switchTo().window(wh).close();
			    }
			    else
			    {
			    	
			    }
			}
			
			
			
	}

}
