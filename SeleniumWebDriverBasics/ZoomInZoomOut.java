package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();
	     
	     JavascriptExecutor js =(JavascriptExecutor)driver;
	     js.executeScript("document.body.style.zoom='50%'"); //set zoom level 50%
	     Thread.sleep(3000);
	     
	     js.executeScript("document.body.style.zoom='70%'"); //set zoom level 70%
	     Thread.sleep(3000);
	     
	     js.executeScript("document.body.style.zoom='100%'"); //set zoom level 100%
	     Thread.sleep(3000);
	     
	}

}
