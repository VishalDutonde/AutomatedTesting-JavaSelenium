package wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();  // launch the chromeBrowser
		//Fluent Wait Declaration 
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                              .withTimeout(Duration.ofSeconds(10))
                              .pollingEvery(Duration.ofSeconds(2))
                              .ignoring(NoSuchElementException.class);
		
		driver.get("https://demo.guru99.com/test/newtours/");//open the given website
        driver.manage().window().maximize();
        
        WebElement txtuser=wait.until(new Function<WebDriver,WebElement>(){
        	public WebElement apply(WebDriver driver) {
        		return driver.findElement(By.xpath("//input[@name='userName']"));
        	}
        });
        txtuser.sendKeys("vishal");
        
        driver.close();
        
	}

}
