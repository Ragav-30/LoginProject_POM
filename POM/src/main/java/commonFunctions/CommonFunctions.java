package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {
	public static WebDriver driver=null;
	protected static Properties properties=null;
	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileinput = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinput);

		return properties;
	}


	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyFile();
		
		/*
		 * Map<String, Object> prefs= new HashMap<String, Object>();
		 * prefs.put("profile.default_content_setting_values.notifications",1);
		 * ChromeOptions option = new ChromeOptions();
		 * 
		 * option.setExperimentalOption("prefs", prefs);
		 */
		//String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		//String DriverLocation=properties.getProperty("DriverLocation");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ragav\\git\\LoginProject_POM\\POM\\drivers\\chromedriver.exe");
	        
	     driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get(url);
	
	}
	@AfterSuite
	public void tearDown() {
//driver.quit();
	}
}
