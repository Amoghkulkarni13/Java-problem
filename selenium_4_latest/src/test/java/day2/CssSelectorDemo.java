  package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		// tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
	//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		//tag class 
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");
		
		//tag attribute
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		
		  
		

	}

}
