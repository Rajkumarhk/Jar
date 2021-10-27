package Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));

		int size = list.size();
		System.out.println(size);

		//Actions actions = new Actions(driver);

		//actions.keyDown(Keys.CONTROL).click(list.get(0))
		//.click(list.get(1))
		//	.click(list.get(2))
		//			.click(list.get(3)).build().perform();
		
		              //OR
		
		Actions actions = new Actions(driver);
		actions.clickAndHold().click(list.get(0));
		actions.clickAndHold().click(list.get(1));
		actions.clickAndHold().click(list.get(2));
		actions.clickAndHold().click(list.get(3));
		actions.clickAndHold().click(list.get(4));
		actions.clickAndHold().build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
