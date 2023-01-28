package scenarioAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000);

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		String colorBeforeDnd = target.getCssValue("color");
		act.moveToElement(src).clickAndHold().moveToElement(target).release().build().perform();
		String colorAfterDnd = target.getCssValue("color");
		System.out.println("color before drag and drop :" +colorBeforeDnd);
		System.out.println("color after drag and drop :"  +colorAfterDnd);

		
	

	}
	

	/*
	 * if(textTo.equals("Dropped!")) { System.out.println("pass:textchange");
	 * 
	 * } else { System.out.println("fail:notchange"); }
	 */

}
