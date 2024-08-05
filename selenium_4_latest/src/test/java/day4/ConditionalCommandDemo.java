package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ConditionalCommandDemo {

	public static void main(String[] args) {
		
		

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		
		//isDisplayed() or isEnabled()
	boolean present=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	boolean absent=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
	
	 System.out.println(present + " "+ absent);

	 
	 //isSelected()
	 WebElement maleradio=driver.findElement(By.xpath("//input[@id='gender-male']"));
	 WebElement femaleradio=driver.findElement(By.xpath(" //input[@id='gender-female']"));
	 
	System.out.println("Before Selection-");
	 
	 System.out.println(maleradio.isSelected());
	 System.out.println(femaleradio.isSelected());
			 
	maleradio.click();
	
	
	System.out.println("After Selection-");
	 
	 System.out.println(maleradio.isSelected());
	 System.out.println(femaleradio.isSelected());
			 
	
	 
	}

}
