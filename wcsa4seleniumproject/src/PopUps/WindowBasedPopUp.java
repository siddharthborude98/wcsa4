package PopUps;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowBasedPopUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=1cykt6karjg8r");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	   
	    driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	    Thread.sleep(2000);
	    //driver.findElement(By.xpath("//div[.='Settings']")).click();
	    driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
	    driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
	    WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    
	    Actions act = new Actions(driver);
	    //to perform double click action
	    act.doubleClick(target).perform();
	    
	    File file = new File("./autoIt/autoIt3.exe");
	    @SuppressWarnings("unused")
		String abc = file.getAbsolutePath();
	    Runtime.getRuntime().exec("C:\\Users\\siddh\\OneDrive\\Desktop\\auto3.exe");
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec("C:\\Users\\siddh\\OneDrive\\Desktop\\auto3.exe");
	    
	}
}
