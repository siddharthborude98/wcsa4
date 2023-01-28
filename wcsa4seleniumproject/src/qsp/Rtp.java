package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("which browser you want open");
			String browserValue = sc.next();

			if (browserValue.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				driver.close();
			}

			else if (browserValue.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				driver.close();
			} else {
				System.out.println("enter a browser name");
			}
		}

	}
}
