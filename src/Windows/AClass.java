package Windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//imp -  to create a parent window
		
		String mainwindow = driver.getWindowHandle();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		WebElement clickhomepage = driver.findElement(By.id("home"));
		clickhomepage.click();
		
		Set<String> handle= driver.getWindowHandles();
		
		for (String newwindow : handle) {
			
			//imp- switch the cursor to new window 
			
			driver.switchTo().window(newwindow);
			
		}
		WebElement editbtn = driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']"));
		editbtn.click();
		driver.close();
		
		driver.switchTo().window(mainwindow);
		
		WebElement multiplewindow = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		multiplewindow.click();
		
		int size = driver.getWindowHandles().size();
		System.out.println("No. of windows opened = " +size);
		
		WebElement rdbtn = driver.findElement(By.id("color"));
		rdbtn.click();
		
		Set<String> newwindowhandles = driver.getWindowHandles();
		
		for (String allwindows : newwindowhandles) {
			
			if (!allwindows.equals(newwindowhandles)) {
				driver.switchTo().window(allwindows);
				driver.close();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
