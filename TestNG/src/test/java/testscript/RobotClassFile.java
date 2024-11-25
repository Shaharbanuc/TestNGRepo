package testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RobotClassFile extends Base{
	@Test
	public void robotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectpdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));	
		selectpdf.click();
		//this class prepare or select path to be copied
		StringSelection stringselection=new StringSelection("C:\\Users\\shanu\\Downloads\\Booking.com_ Confirmation.pdf");
		//copy file path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		//robot class to perform keyboard actions
		Robot robot=new Robot();
		robot.delay(2500);
		//robot.keyPress(KeyEvent.VK_ENTER);
		//robot.keyRelease(KeyEvent.VK_ENTER);
		//pasting
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
