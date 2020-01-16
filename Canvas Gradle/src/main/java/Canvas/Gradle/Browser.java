package Canvas.Gradle;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 * This class file contains browser information
 *
 */
public class Browser 
{
	private static WebDriver driver = null;

	public static WebDriver getInstance() 
	{
		if(driver == null)
		{
			// System.setProperty("webdriver.chrome.driver", "D:/Selenium_latest_Version/chromedriver_win32/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");			
	    	final ChromeOptions capabilities = new ChromeOptions();
	    	final ChromeOptions chromeOptions = new ChromeOptions();
	    	chromeOptions.addArguments("--start-maximized");	    	
	    	Map<String, Object> prefs = new LinkedHashMap<>();
	    	prefs.put("credentials_enable_service", Boolean.valueOf(false));
	    	prefs.put("profile.password_manager_enabled", Boolean.valueOf(false));
	    	chromeOptions.setExperimentalOption("prefs", prefs);
	    	capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
	    	driver = new ChromeDriver(capabilities);
			
	    }
	    return driver;
	}	
}
