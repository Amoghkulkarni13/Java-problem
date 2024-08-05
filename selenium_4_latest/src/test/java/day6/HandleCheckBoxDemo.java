package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleCheckBoxDemo {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
	 List<WebElement> allcheckbox=  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
         System.out.println(allcheckbox.size());
         
       /*  for(int i=0;i<allcheckbox.size();i++) {
        	 
        	    allcheckbox.get(i).click();
         }
         */
         //last two checbox check it
         for(int i=5;i<allcheckbox.size();i++) {
        	 allcheckbox.get(i).click();
         }
         //select only first two checkbox
         
         for(int i=0;i<allcheckbox.size();i++) {
        	 if(i<2) {
        		 allcheckbox.get(i).click();
        	 }
         }
         
         //unselcting the checkbox 
         
         for(int i=0;i<allcheckbox.size();i++) {
        	 
        	 if(allcheckbox.get(i).isSelected()) {
        		 
        		 allcheckbox.get(i).click();
        	 }
         }
	}

}
