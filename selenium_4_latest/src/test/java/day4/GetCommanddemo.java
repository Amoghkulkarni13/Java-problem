package day4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommanddemo {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		
		
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		
		System.out.println("---------------");
		System.out.println(driver.getWindowHandle());//8E5F6B22A84C4CFEBA3E8ED6A29943E8
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
	Set<String> handles=	driver.getWindowHandles();
	
	for(String h:handles) {
		
		System.out.println(h);
	}
		
		
		
		
		
		driver.quit();
		
		
		
	}

}
