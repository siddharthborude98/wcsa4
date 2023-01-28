package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSynchronization {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Boolean check = wait.until(ExpectedConditions.titleContains("Login"));
		System.out.println(check);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Boolean check2 = wait.until(ExpectedConditions.titleContains("Chrome"));
		System.out.println(check2);
		

	}

}
