package alerts_popup;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//handle the alert without using switchTo().alert();
//handle by Using explicit wait
public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
         WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait Declaration
         
         driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
         driver.manage().window().maximize();

         driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
         Thread.sleep(3000);

         Alert myAlert=mywait.until(ExpectedConditions.alertIsPresent()); // capture the alert in another way
         
         System.out.println(myAlert.getText());
         myAlert.accept();
         
         driver.close();
	}

}
