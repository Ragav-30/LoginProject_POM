package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjects {
    
	static public WebElement googletextbox(ChromeDriver driver) {
		return driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	}
	static public WebElement findfb(ChromeDriver driver) {
		return driver.findElement(By.xpath("//h3[contains(text(),\"Facebook - log in or sign up\")]"));
	}
	static public WebElement password(ChromeDriver driver) {
		return driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		
	}
	static public WebElement email(ChromeDriver driver) {
		return driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
	}
	static public WebElement loginbutton(ChromeDriver driver) {
		return 	driver.findElement(By.xpath("//button[@name=\"login\"]"));
		
	}
	static public WebElement profilebutton(ChromeDriver driver) {
		return 	driver.findElement(By.xpath("//*[@id=\":Riql9ad5bb9l5qq9papd5aq:\"]"));
		
	}
	
	
}
