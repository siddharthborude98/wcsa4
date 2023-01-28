package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("siddharth");
		driver.findElement(By.name("password")).sendKeys("123456");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'_acan _aiit _acap _aijb _acas _aj1-')]"));
		boolean status = loginButton.isEnabled();
		System.out.println(status);
	}

}
