package Download;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement link = driver.findElement(By.linkText("Download Excel"));
		link.click();
		
		Thread.sleep(3000);
		
		//C:\Users\TEST\Downloads
		//"C:\Users\TEST\Downloads\testleaf.xlsx"
		
		File filelocation = new File("C:\\Users\\TEST\\Downloads");
		
		File[] listFiles = filelocation.listFiles();
		
		for (File file : listFiles) {
			
			if (file.getName().equals("testleaf.xlsx")) {
				
				System.out.println("File downloaded");
				break;
				
			}
		}
	}

}
