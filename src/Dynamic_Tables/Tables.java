package Dynamic_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int size = columns.size();
		System.out.println(size);
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int size2 = rows.size();
		System.out.println(size2);
		
		WebElement percentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		
		String text = percentage.getText();
		System.out.println(text);
	}

}
