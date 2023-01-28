package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeXpathLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/gifting");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcd123");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(4000);
	}

}
