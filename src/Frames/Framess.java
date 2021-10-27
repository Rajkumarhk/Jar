package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement butn1 = driver.findElement(By.id("click"));
		butn1.click();
		
		String text = driver.findElement(By.id("click")).getText();
		System.out.println(text);
		
		//imp = switch to default frame of the page 
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement butn2 = driver.findElement(By.id("Click1"));
		butn2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		
		int size = totalframes.size();
		System.out.println(size);
		
	}

}
