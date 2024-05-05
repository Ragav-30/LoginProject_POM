package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static WebDriver driver=null;
	static Properties properties=null;
	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileinput = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinput);

		return properties;
	}


	@BeforeSuite
	public void launchBrowser() {

		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String DriverLocation=properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverLocation);
	        
	        driver= new ChromeDriver();
		}
		
		
	}
	@AfterSuite
	public void tearDown() {

	}
}
