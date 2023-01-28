package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/siddh/OneDrive/Desktop/wcsa4workspace/ConfirmationPopUp.html");
		WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
		button.click();
		
		// now switch your control to alert pop up
		Alert al = driver.switchTo().alert();
		
		//dismiss the alert pop up
		//al.dismiss();
		//accept the alert pop up
		Thread.sleep(2000);
		al.accept();
		al.getText();

	}
		

}
