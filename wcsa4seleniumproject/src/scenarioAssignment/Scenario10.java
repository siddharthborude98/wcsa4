package scenarioAssignment;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException, AWTException {
	
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.bluestone.com/");

	Thread.sleep(2000);
	
	driver.findElement(By.id("confirmBtn")).click();
	Thread.sleep(2000);
	//driver.switchTo().frame("fc_widget");
	WebElement frame = driver.findElement(By.id("fc_widget"));
	driver.switchTo().frame(frame);
	driver.findElement(By.id("chat-icon")).click();
	
	
	
	
	}
	

}
