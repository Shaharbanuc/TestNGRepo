package testscript;

import org.testng.annotations.Test;

public class TestClass {
	
	@Test(priority=2)
	public void sampleOne()
	{
		System.out.println("test one");
	}
	@Test(priority=3)
	public void testTwo()
	{
		System.out.println("test two");
	}
	@Test(priority=1)
	public void testThree()
	{
		System.out.println("test three");
	}
	

}
