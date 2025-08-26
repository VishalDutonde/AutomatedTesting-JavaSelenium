package alerts_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 //Link: https://the-internet.herokuapp.com/basic_auth
 //Syntax: https://username:password@the-internet.herokuapp.com/basic_auth
 //        https://admin:admin@the-internet.herokuapp.com/basic_auth
public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
   
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
