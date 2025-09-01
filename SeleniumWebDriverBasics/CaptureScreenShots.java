package capturescreenshots;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {

	public static void main(String[] args) 
	{
	     WebDriver driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://demo.nopcommerce.com/");
	     driver.manage().window().maximize();
	     
	     //1) full page ScreenShots
	     TakesScreenshot ts =(TakesScreenshot)driver;
	     File sourseFile=ts.getScreenshotAs(OutputType.FILE);
	     File myFile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");//System.getProperty("user.dir") // this command will return project location dynamically
	     sourseFile.renameTo(myFile);// copy sourceFile to my file
	     System.out.println("Screenshot captured successfully!");
	     
	     // capture the screenshot of specific section
	     WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
         File sourcefeaProdu=featuredProducts.getScreenshotAs(OutputType.FILE);
         File myFeaPro = new File(System.getProperty("user.dir")+"\\Screenshots\\featureProeduct.png");
         sourcefeaProdu.renameTo(myFeaPro);
         System.out.println("FeatureProduct Screenshot captured successfully!");
         
         // capture webelement or specific element 
         WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
         File sourceLogo=logo.getScreenshotAs(OutputType.FILE);
         File myLogoFile = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
         sourceLogo.renameTo(myLogoFile);
         System.out.println("Logo Screenshot captured successfully!");

         
         driver.quit();
	}

}
