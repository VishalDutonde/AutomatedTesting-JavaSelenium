package alerts_popup;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
         driver.manage().window().maximize();
         // 1) Normal Alert with Ok Button
         /*driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
         Thread.sleep(3000);
         //driver.switchTo().alert().accept();
         Alert myAlert=driver.switchTo().alert();
      
         System.out.println(myAlert.getText());
         myAlert.accept();*/
         
         // 2) confirmation Alert Ok & Cancal Button
         /*driver.findElement(By.xpath("//input[@id='confirmexample']")).click();
         Thread.sleep(3000);
         //driver.switchTo().alert().accept();  // close alert using ok btn
         driver.switchTo().alert().dismiss();   // close alert using cancal btn*/
         
         // 3) Prompt alert input box 
         driver.findElement(By.xpath("//input[@id='promptexample']")).click();
         Alert myAlert=driver.switchTo().alert();
         myAlert.sendKeys("Welcome");
         myAlert.accept();
         
         
	}

}
