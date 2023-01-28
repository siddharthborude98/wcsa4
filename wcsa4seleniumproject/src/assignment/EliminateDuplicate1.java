package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/siddh/OneDrive/Desktop/wcsa4workspace/MultipleSelect%20DropDown.html");
		WebElement drodownelement = driver.findElement(By.id("menu"));
		Select sel = new Select(drodownelement);
		//to get options of dropdown 
		List<WebElement> opt = sel.getOptions();
		
		
			HashSet<String> s = new HashSet<String>();
			for(int i=0;i<opt.size();i++)
			{
				WebElement options = opt.get(i);
				String values = options.getText();
				s.add(values);
			}
			
            for (String alloptions:s)
            {
            	System.out.println(alloptions);
            }

	}

}
