package X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("rajkumar");
		String ab = emailid.getAttribute("value");
		System.out.println(ab);
		
		WebElement apend = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		apend.sendKeys("111");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("sdffffefc");
		
		
		WebElement clearab = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearab.clear();
		
	}

}
