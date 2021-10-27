package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/home.html");

		WebElement dropdown = driver.findElement(By.
				xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/img"));

		dropdown.click();
		//1.
		WebElement firstlist = driver.findElement(By.id("dropdown1"));
		Select select = new Select(firstlist);

		select.selectByIndex(1);
		//2.
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(dropdown2);

		select1.selectByValue("2");

		//3.

		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));

		Select select2 = new Select(dropdown3);

		select2.selectByVisibleText("UFT/QTP");
		//4.

		WebElement drop = driver.findElement(By.className("dropdown"));

		Select select3 = new Select(drop);

		List<WebElement> options = select3.getOptions();
		int size = options.size();
		System.out.println("No. of list : " +size);

		//5.
		WebElement dropdown4 = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[5]/select"));

		Select select4 = new Select(dropdown4);

		dropdown4.sendKeys("Loadrunner");

		//6.

		WebElement dropdown5 = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));

		Select select5 = new Select(dropdown5);

		select5.selectByIndex(1);
		select5.selectByIndex(3);

		//to check if the slected drop down has multiple selections or not 
		
		boolean multiple = select5.isMultiple();
		System.out.println(multiple);
		






	}

}
