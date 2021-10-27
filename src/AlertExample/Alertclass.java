package AlertExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement Alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		
		Alertbox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//2.
		
		WebElement confirmbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		confirmbox.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		//3.
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Duck");
		alert3.accept();
		
	}

}
