package day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondClass {
	WebDriver driver;
	@Test(priority=10)
	void openapp() {
		
	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
	}
	@Test(priority=20)
  void login() {
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	 
  }
	@Test(priority=30)
	void close() {
		
		driver.quit();
		
	}
	

	
}
