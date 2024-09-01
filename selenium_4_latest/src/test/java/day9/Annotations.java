package day9;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@BeforeMethod()
	void login() {
		System.out.println("login to the application");
	}
	
	@Test(priority=2)
	void search() {
		System.out.println("search the product in the application..");
	}
	
	@Test(priority=1)
	void advancedsearch() {
		System.out.println("advanced search in the applicaton");
	}
	
	@AfterMethod
	void closeapp() {
		
		System.out.println("close the application...");
	}
	
	
	
	

}
