package selectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/siddh/OneDrive/Desktop/wcsa4workspace/MultipleSelect%20DropDown.html");
		WebElement drodownelement = driver.findElement(By.id("menu"));
		Select sel = new Select(drodownelement);
		List<WebElement> opt = sel.getOptions();

		for (int i=0;i<opt.size();i++) {
			WebElement options = opt.get(i);
			
            String values = options.getText();
			System.out.println(values);
			Thread.sleep(4000);
		}

	}

}
