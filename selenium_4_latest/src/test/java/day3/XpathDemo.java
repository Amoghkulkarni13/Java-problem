package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath using single attributes
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Amogh");
		
		//xpath using mutiple attributes
		
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@placeholder=\"Search\"]")).sendKeys("Kulkarni");
		
		
		//xpath using and or 
		//driver.findElement(By.xpath("//input[@placeholder='Search'and @placeholder='Search']")).sendKeys("Messi");
		//driver.findElement(By.xpath("//input[@placeholder='Search'or @placeholder='Search']")).sendKeys("Kulkarni");
		
		//xpath using text
		//driver.findElement(By.xpath("//button[@class='btn btn-light btn-lg']")).click();
		
	//	driver.navigate().back();
		
		
		
	WebElement logo=	driver.findElement(By.xpath("//h3[normalize-space()='Featured']"));
	System.out.println(logo.isDisplayed());
	System.out.println(logo.getText());
	
	driver.quit();
     
		
	}

}
