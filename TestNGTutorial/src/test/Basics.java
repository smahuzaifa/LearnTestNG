package test;

import org.testng.annotations.Test;

public class Basics {
	/*
	 * For TestNg framework we can skip using main()
	 * We have to create a method and write our test cases in that method
	 * For multiple test scenarios we have to create multiple methods
	 * Then, to run it we just have to write @Test (annotation) before each method so that TestNG can detect it
	 * then we have to import the required libraries like import org.testng.annotations.Test;
	 */
	
	@Test
	public void Demo1()
	{
		System.out.println("Learning TestNG");
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Second Test Case in TestNG");
	}
}
