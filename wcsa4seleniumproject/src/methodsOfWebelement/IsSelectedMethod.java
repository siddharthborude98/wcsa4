package methodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");
		WebElement checkBox = driver.findElement(By.name("username"));
		boolean status = checkBox.isSelected();
		System.out.println(status);
		checkBox.click();
		Thread.sleep(4000);
		boolean status2 = checkBox.isSelected();
		System.out.println(status2);
	}

}
