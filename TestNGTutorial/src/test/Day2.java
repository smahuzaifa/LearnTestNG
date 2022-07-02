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
	@BeforeTest //Before executing any other methods in this file, TestNG will first execute this method
	public void prerequisite()
	{
		System.out.println("Before Test, first execution");
	}
	@AfterTest
	public void last()
	{
		System.out.println("This will execute in the last");
	}
}
