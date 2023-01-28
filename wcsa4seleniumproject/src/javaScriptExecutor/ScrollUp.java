package javaScriptExecutor;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
	
		
		// To perform Scrolling Operation
		JavascriptExecutor js=(JavascriptExecutor) driver;
		// ScrollDown OPeration
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,5000)");
		
		
		// To perform Scrolling Operation
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		// ScrollUp OPeration
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-3000)");
	}

}
