package Radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttonclass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement opt1 = driver.findElement(By.name("news"));
		opt1.click();
		
		boolean status = opt1.isSelected();
		System.out.println(status);
	}

}
