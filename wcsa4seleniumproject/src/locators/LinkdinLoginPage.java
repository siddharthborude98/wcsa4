package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.id("username")).sendKeys("abcd123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class*='btn__primary--large from__button--floating']")).click();
		
	}

}
