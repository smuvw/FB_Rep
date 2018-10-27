package com.FreeCRM;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountTest {
	
	
	ChromeDriver driver; //instance variable 
	
	@BeforeMethod
	public void getData() {
		System.out.println("get data ");
	}
	
	@AfterMethod
	public void CloseData() {
		System.out.println("clsoe get data ");
	}
	
	@Test(priority=1)
	public void Login() {
	   driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test(priority=2,dependsOnMethods= {"Login"})
	public void Logout() {
		driver.close();
	}

}
