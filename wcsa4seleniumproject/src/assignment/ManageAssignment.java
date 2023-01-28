package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Dimension targetSize = new Dimension(450, 250);
		driver.manage().window().setSize(targetSize);
		Thread.sleep(2000);

		
		Point targetPosition = new Point(30, 50);
		driver.manage().window().setPosition(targetPosition);
		
		
	}

}
