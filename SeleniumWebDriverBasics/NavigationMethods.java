package nevigation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();// launch the crome browser
		
		driver.get("https://www.facebook.com/"); //open the page 
		
		// click on create new account button
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		System.out.println("navigation backword completed");
		
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("navigation forword completed");
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println("navigation refresh completed");
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		System.out.println("navigation to new website");

		
	}

}
