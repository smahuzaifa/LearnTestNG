package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void day2()
	{
		System.out.println("Day 2");
	}
	@Test (groups= {"Smoke"})
	public void smoke()
	{
		System.out.println("Smoke");
	}
	@BeforeTest //Before executing any other methods in this file, TestNG will first execute this method
	public void prerequisite()
	{
		System.out.println("Before Test");
	}
	@AfterTest
	//Will execute in last of test suite and not at the end of framework
	public void last()
	{
		System.out.println("After Test");
	}
}
 