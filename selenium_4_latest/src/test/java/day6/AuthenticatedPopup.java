package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		//http://the-internet.herokuapp.com/basic_auth
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		String compare=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
		
		if(compare.contains("Congratulations")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		

	}

}
