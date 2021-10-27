package Upload;

//incomplete -  thers no toolkit available - no stringselection aswell

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/upload.html");
		
		WebElement choosefile = driver.findElement(By.name("filename"));
		choosefile.click();
		
		//C:\Users\TEST\Downloads\testleaf.xlsx
		
		
	}

}
