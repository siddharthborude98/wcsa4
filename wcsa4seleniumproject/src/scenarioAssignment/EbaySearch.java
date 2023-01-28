package scenarioAssignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class EbaySearch {
	ChromeDriver driver;
	String url="https://www.ebay.in/sns";
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//siddh//OneDrive//Desktop//WCSA4//chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get(url);
	}
	public void searchProduct(String product,String category)
	{
		driver.findElement(By.id("gh-ac")).sendKeys(product);
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select SelectCategory = new Select(dropdown);
		SelectCategory.selectByVisibleText(category);
		driver.findElement(By.id("gh-btn")).click();
		String result = driver.findElement(By.xpath("//h1[contains(text(),' results for ')]")).getText();
		System.out.println(result);
		
	
	}
	public void getNthResult(int productNumber)
	{
		String xpathExpression = String.format("//*[@id=\"srp-river-results\"]/ul/li[%d]",productNumber);
		String nthProduct = driver.findElement(By.xpath(xpathExpression)).getText();
		System.out.println(nthProduct);
		System.out.println("---------------------------------------------------------------------------------------");
	}
	public void getAllProduct() {
		List<WebElement> allProducts=driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
		Iterator<WebElement> iteratorAllProducts=allProducts.iterator();
		while (iteratorAllProducts.hasNext()) {
		        WebElement product = iteratorAllProducts.next();
		        System.out.println(product.getText());
		        System.out.println("---------------------------------------------------------------------------------");
			
		}
		
	}
	public void getAllProductAndScrollDown() {
		List<WebElement> allProducts=driver.findElements(By.xpath("//div[@id='srp-river-results']/ul/li"));
		Iterator<WebElement> iteratorAllProducts=allProducts.iterator();
		Actions act = new Actions(driver);
		while (iteratorAllProducts.hasNext()) {
		        WebElement product = iteratorAllProducts.next();
		        act.moveToElement(product).build().perform();
		        System.out.println(product.getText());
		        System.out.println("---------------------------------------------------------------------------------");
		}
		
	}
	
	public static void main(String[] args) {
		EbaySearch search=new EbaySearch();
		search.invokeBrowser();
		search.searchProduct("AppleWatches","Watches");
		search.getNthResult(10);
		search.getAllProduct();
		search.getAllProductAndScrollDown();
		
	
	}


}
