package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_Links {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Link.html");
		
		WebElement link1 = driver.findElement(By.linkText("Go to Home Page"));
		link1.click();
		
		driver.navigate().back();
		
		WebElement link2 = driver.findElement(By.partialLinkText("Find where"));
		String where = link2.getAttribute("href");
		System.out.println(where);
		
		WebElement link3 = driver.findElement(By.partialLinkText("Verify am"));
		link3.click();
		
		String title = driver.getTitle();
		
		if (title.contains("404")) {
			System.out.println("Broken link ");
			
		} 
		
		driver.navigate().back();
		
		WebElement commonlink = driver.findElement(By.linkText("Go to Home Page"));
		commonlink.click();
		
		driver.navigate().back();
		
		List<WebElement> numoflinks= driver.findElements(By.tagName("a"));
		
		int size = numoflinks.size();
		
		System.out.println("Total num of links : " +size);
		
		
		
		
		
		
		
	}

}
