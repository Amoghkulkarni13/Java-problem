package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		
		//using name loactor
		
		Thread.sleep(3000);
		
	WebElement searchbox=	driver.findElement(By.name("search"));
	searchbox.sendKeys("phone");
		
		//by id locator
	
	 boolean status=driver.findElement(By.id("logo")).isDisplayed();
	 System.out.println(status);
		
	 
	 //paritaial and lintext only for link
	
	 
	// driver.findElement(By.linkText("iPhone")).click();
	
	 
	// driver.navigate().back();
	 
	//classname 
	 
	List<WebElement> navbar= driver.findElements(By.className("list-inline-item"));
	System.out.println(navbar.size());
	 
   
	//tag name used for findEleement
	List<WebElement> image=driver.findElements(By.tagName("img"));
	System.out.println(image.size());
	
	
driver.quit();
		
		
		
		
		

	}

}
