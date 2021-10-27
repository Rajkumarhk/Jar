package Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class working {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement firstimg = driver.findElement(By.xpath("//img[contains(@onclick,'window.location')]"));
		firstimg.click();
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement img2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		
		//"naturalWidth"=0  (W should be in capital
		
		if (img2.getAttribute("naturalWidth").equals("0")) {

			System.out.println("Yes it is a broken image");

		} else {
			System.out.println("It is an correct image");

		}


	}

}
