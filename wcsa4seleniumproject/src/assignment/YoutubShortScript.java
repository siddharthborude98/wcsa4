package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubShortScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[10]")).click();
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//a[@class='yt-simple-endpoint focus-on-expand style-scope ytd-rich-grid-slim-media']"));
		for(int i=0;i<suggestions.size();i++)
		{
		WebElement options = suggestions.get(i);
			String opt = options.getText();
			System.out.println(opt);
		
		}
	}
	

}
