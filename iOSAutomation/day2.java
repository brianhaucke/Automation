package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void ploan() 
	{
		System.out.println("good");
	}
	
	@BeforeTest
	//Start Appium Server and Stuff goes in @BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void shutdown()
	{
		System.out.println("Shutting everything down after tests are done");
	}
	

}
