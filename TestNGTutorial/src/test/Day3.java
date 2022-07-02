package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void WebLoginCar()
	{
		System.out.println("Web Login Car");
	}
	@Test
	public void MobileLoginCar()
	{
		System.out.println("Mobile Login Car");
	}
	@Test
	public void APILoginCar()
	{
		System.out.println("API Login Car");
	}
	@Test
	public void APILoginCar2()
	{
		System.out.println("API Login Car2");
	}
	@Test
	public void APILoginCar3()
	{ 
		System.out.println("API Login Car3");
	}
	@Test
	public void APILoginCar4()
	{
		System.out.println("API Login Car4");
	}
	@BeforeSuite
	//Will execute first when suite has been asked to run
	public void beforeAll()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	//Will execute at end of suite
	public void afterAll()
	{
		System.out.println("After suite");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}

}
