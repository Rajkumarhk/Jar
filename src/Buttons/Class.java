package Buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\TEST\\Desktop\\New folder\\Selenium_V\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		//1. get the position of the button
		
		WebElement position = driver.findElement(By.id("position"));
		Point location = position.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("X value is : " +x + " " + "Y value is : " +y);
		
		//2. get button color
		
		WebElement buttoncolor = driver.findElement(By.id("color"));
		String cssValue = buttoncolor.getCssValue("background-color");
		
		System.out.println(cssValue);
		
		//3. get the size of the button
		
		WebElement size = driver.findElement(By.id("size"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("Height is " +height + "Width is " + width);
	}

}
