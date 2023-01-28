package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("siddharth");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("button",Keys.ENTER);
		driver.switchTo().activeElement().sendKeys("button",Keys.ENTER);
	}

}