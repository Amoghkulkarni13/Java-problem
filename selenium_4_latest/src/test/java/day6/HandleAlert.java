package day6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class HandleAlert {

	public static void main(String[] args)  {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	 // driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  
	  //accpeting alert with ok button
//	  Alert myalert= driver.switchTo().alert();
//System.out.println(myalert.getText());  
//myalert.accept();

//accpeting alert for ok and cancel button
	//  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	//  driver.switchTo().alert().dismiss();
	  
	  
	  //in alert typing same input
	  driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

	  Alert myalert=driver.switchTo().alert();
	  myalert.sendKeys("amogh");
	  myalert.accept();
	  

         String res= driver.findElement(By.xpath("//p[@id='result']")).getText();
	  
         if(res.contains("amogh")) {
        	 
        	 System.out.println("Test passed");
         }
         else {
        	 System.out.println("test failed");
         }
         
         driver.quit();
	}
	

}
