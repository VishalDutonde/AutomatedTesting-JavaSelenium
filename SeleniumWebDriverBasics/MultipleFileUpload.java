package fileUpload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFileUpload {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		// single uploaded file 
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\vishal patil\\OneDrive\\Desktop\\vit.txt");
		String fileName=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		System.out.println(fileName);
		
	    if(fileName.matches("vit.txt"))
	    {
	      System.out.println("File Succesfully uploaded");	
	    }else
	    {
	    	System.out.println("file upload fail");
	    }*/ 

		//multiple uploaded file
		String file1="C:\\Users\\vishal patil\\OneDrive\\Desktop\\vit.txt";
		String file2="C:\\Users\\vishal patil\\OneDrive\\Desktop\\vishal.txt";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int noOfFileUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
       // validation 1) number of file uploaded
		if(noOfFileUploaded==2) {
    		System.out.println("All file Uploaded successfully ....");
        }else {
    		System.out.println(" uploaded fail  ....");

        }
		
		// validate 2) file name
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("vit.txt") 
				&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("vishal.txt")) 
		{
    		System.out.println("file Name maching ....");
		}else {
    		System.out.println("file name not same  ....");

        }
	}

}
