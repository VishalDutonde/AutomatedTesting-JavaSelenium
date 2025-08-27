package com.selenium.basics;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class StatusMethods {

	public static void main(String[] args) {
      
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.className("lnXdpd"));
		
		boolean display =ele.isDisplayed();
		//If an element is visible before interacting (isDisplayed()),
		System.out.println(display);
		
		System.out.println(ele.isEnabled());
		//If it's clickable/editable (isEnabled()),
		
		System.out.println(ele.isSelected());
		//If a radio/checkbox is selected (isSelected()).



	}

}
