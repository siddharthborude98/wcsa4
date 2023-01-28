package scenarioAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneMoveCursor {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.bluestone.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.id("confirmBtn")).click();
	WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
	Actions act = new Actions(driver);
	act.moveToElement(target).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Kadas']")).click();
	driver.findElement(By.xpath("//img[@alt='The Ishank Kada For Him']")).click();
	driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
	driver.findElement(By.xpath("//span[.='2-8(2 8/16\")']")).clear();
	driver.findElement(By.id("buy-now")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}


}
