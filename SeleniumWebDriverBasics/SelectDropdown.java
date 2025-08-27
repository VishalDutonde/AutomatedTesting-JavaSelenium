package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDropdown {
 public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     
     WebElement  dropdown=driver.findElement(By.xpath("//select[@id='country']"));
     Select dropContry = new Select(dropdown);    // first we create Selectclass Obj and pass webEle
     
     //dropContry.selectByValue("india");            // selectByValue()
     //dropContry.selectByVisibleText("France");     //selectByVisibleText()
     //dropContry.selectByIndex(3);                  //selectByIndex()
     
     //Capture the option from the dropdown
     List<WebElement> allOptions=dropContry.getOptions();
     System.out.println("Number of Option in dropDown : "+allOptions.size());
     
     // print all the option 
     /*for(WebElement options:allOptions)
     {
    	 System.out.println(options.getText());
     }*/
     
     for(int i=0;i<allOptions.size();i++)
     {
    	 System.out.println(allOptions.get(i).getText());
     }
     
     driver.close();
     
 }	 
 }

