package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class NavigationDemo {

	public static void main(String[] args) {

 
		WebDriver driver=new ChromeDriver();
		
	    driver.navigate().to("https://www.amazon.in/");
	     System.out.println(driver.getCurrentUrl());
	     
	     driver.navigate().to("https://www.flipkart.com/");
	     System.out.println(driver.getCurrentUrl());
	     
	     driver.navigate().back();
	     
	     driver.navigate().forward();
	     
	     driver.navigate().refresh();
	     
	     
	       
	    


}
}
