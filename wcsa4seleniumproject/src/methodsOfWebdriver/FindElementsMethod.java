package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("upma");
		List<WebElement> suggestions=driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(WebElement suggestion:suggestions)
		{
			String opt = suggestion.getText();
			Thread.sleep(2000);
			System.out.println(opt);
			
		}
		
		
		
	}

}
