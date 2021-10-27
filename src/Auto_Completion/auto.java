package Auto_Completion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input  = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		
		for (WebElement webElement : list) {
			
			if (webElement.getText().equals("Web Services")) {
				webElement.click();
				
				System.out.println("selecting" + webElement.getText());
				break;
				
			}
		}

	}

}
