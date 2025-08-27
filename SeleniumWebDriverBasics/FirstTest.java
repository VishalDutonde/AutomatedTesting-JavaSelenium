package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		
		// Set the path to ChromeDriver (if not set in system PATH)
        // System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title =driver.getTitle();
		System.out.println(title);
		
		// Validate URL
		if(url.matches("https://www.facebook.com/"))
		{
			System.out.println("Valid app.....");
		}else
		{
			System.out.println("InValid app......");
		}
		
        // Validate Title
		if(driver.getTitle().matches("Facebook – log in or sign up"))
		{
			System.out.println("valid title.....");
		}
		
        // Interact with login form
		driver.findElement(By.id("email")).sendKeys("Vishal777@gmail");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
	    
	   // Close browser
	   driver.close();
       driver.quit();
	}
}
