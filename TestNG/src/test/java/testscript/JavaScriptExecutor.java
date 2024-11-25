package testscript;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base{
	@Test
	public void javaScriptExecutor()
	{
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		//it will calculate the height of window and scroll to bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	@Test
	public void buttonClick()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessage.sendKeys("shanu");
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmessage.click();
	}
	@Test
	public void buttonClickJavaScript()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessage=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='hi shanu';",entermessage);
		WebElement showmessage=driver.findElement(By.xpath("//button[@id='button-one']"));
		js.executeScript("arguments[0].click();",showmessage);
	}
}
