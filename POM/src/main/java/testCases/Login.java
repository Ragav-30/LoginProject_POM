package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\Eclipse Workspace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node0ssyqpoi7vnb212tm1bmcxtuzq705399.node0");
		
		WebElement element =driver.findElement(By.xpath("//*[text()='Basic Upload']/following::span[1]"));
		element.click();
		System.out.println("success");
	
        String file ="C:\\Users\\ragav\\OneDrive\\Pictures\\Screenshots\\resume.png";
		StringSelection str= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("sucess");
		
 }
}
