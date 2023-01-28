package operationalMethod;

import java.time.Duration; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("file:///C:/Users/siddh/OneDrive/Desktop/wcsa4workspace/MultipleSelect%20DropDown.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropDownElement);
		for (int i = 1; i < 6; i++) {
			sel.selectByIndex(i);
			Thread.sleep(4000);
		}
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for (WebElement oops : allOptions) {
			String options = oops.getText();
			System.out.println(options);
		}
	}

}
