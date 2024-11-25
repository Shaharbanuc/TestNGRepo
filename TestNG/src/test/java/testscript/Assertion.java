package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base{
	@Test
	public void assertEqualsTest()
	{
		driver.navigate().to("https://www.browserstack.com/");
		//title assertion
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		//test case will pass if actual and expected string are same,otherwise fails
		String expected="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		//Assert.assertEquals(actualstring, expected) --pass case
		//if not equals a third argument can be given as an error message
		Assert.assertEquals(actualstring, expected,"not matching");
	}
	@Test
	public void assertNotEquals()
	{
		driver.navigate().to("https://www.browserstack.com/");
		//title assertion
		String actualstring=driver.getTitle();
		System.out.println(actualstring);
		//here strings must not be equal to pass the test case
		String expected=" Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertNotEquals(actualstring, expected);
	}
	@Test
	public void assertTrue()
	{
		driver.navigate().to("https://www.browserstack.com/");
		//comparing get title with string inside equalsIgnoreCase method
		boolean var=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(var);
	}
	@Test
	public void assertFalseM()
	{
		driver.navigate().to("https://www.browserstack.com/");
		boolean var=driver.getTitle().equalsIgnoreCase(" Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertFalse(var, "failed because both strings are same");
	}

}
