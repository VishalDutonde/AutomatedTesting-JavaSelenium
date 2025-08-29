package javascriptexecutor;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavascriptExecutorDemo {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();
	     
	     WebElement input_name=driver.findElement(By.xpath("//input[@id='name']"));
	     // passing the text into a inputebox - alternate of sendskeys()  
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].setAttribute('value','john')", input_name);
	     
	     // clicking on element- alternate of click()
         WebElement radio_btn=driver.findElement(By.xpath("//input[@id='male']"));
         js.executeScript("arguments[0].click()", radio_btn);
         
	}

}
