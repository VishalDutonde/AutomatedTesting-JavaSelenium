package checkboxhandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.edge.driver", "C:\\drivers\\edge\\msedgedriver.exe");
     WebDriver driver= new EdgeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://testautomationpractice.blogspot.com/");
     driver.manage().window().maximize();
     //1) Select the specific Checkbox
     //driver.findElement(By.xpath("//input[@id='tuesday']")).click();
    
     //2) Select all the CheckBox
    List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));

   /*for(int i=0;i<checkBoxes.size();i++)
     {
    	 checkBoxes.get(i).click();
     }*/
     
   /*for(WebElement checkbox:checkBoxes)
     {
    	 checkbox.click();
     }*/
     
   /*3) Select Last Three Checkboxes
     total checkbox- how many checkbox want to select = starting index
     7-3=4
    for(int i=4;i<checkBoxes.size();i++)
    {
    	checkBoxes.get(i).click();
    }*/
    
  /*4)Select first three checkboxes
    for(int i=0; i<3;i++)
    {
    	checkBoxes.get(i).click();
    }*/
    
    //5)unselect checkbox if they are selected
    for(int i=0; i<3;i++)
    {
    	checkBoxes.get(i).click();
    }
    Thread.sleep(5000);
    for(int i=0; i<3;i++)
    {   if(checkBoxes.get(i).isSelected())
        {
    	 checkBoxes.get(i).click();
        }
    }
     //driver.close();
     
	}

}
