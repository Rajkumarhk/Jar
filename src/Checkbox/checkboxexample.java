package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxexample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement check = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		if (check.isSelected()) {
			
			//use check.isdisplayed to select the check the box
			
			check.click();
			
		}
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		
		if (check1.isSelected()) {
			
			check1.click();
			
		}
	}

}
