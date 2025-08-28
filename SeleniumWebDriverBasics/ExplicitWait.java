package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();  // launch the chromeBrowser
	    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));//declaration 
        driver.get("https://automationexercise.com/");//open the given website
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        
        WebElement uname=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-qa='login-email']")));
        uname.sendKeys("vishalpatil");
        
        WebElement pword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        pword.sendKeys("vishal123");
       
        WebElement btnlogin=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        btnlogin.click();
        driver.close();
	}
}
