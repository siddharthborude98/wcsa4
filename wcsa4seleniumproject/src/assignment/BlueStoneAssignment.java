package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneAssignment {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);

		driver.findElement(By.id("confirmBtn")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));

		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='Band']")).click();
		
		WebElement clickAndHold = driver.findElement(By.xpath("//div[.='Filter by']"));

		for (int i =0; i<=2;i++) {
			act.clickAndHold(clickAndHold).perform();
		}

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.id("search_query_top_elastic_search"));
		search.click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
