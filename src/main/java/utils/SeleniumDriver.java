package utils;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumDriver {

	private static WebDriver driver = null;
	
	public SeleniumDriver(String url) {			
		driver = new FirefoxDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get(url);
	}
	
	private static void setUrl(String url) {
		driver.get(url);
		
		//ctrl + shift + M to import static
		//assertTrue(1 ==1 );
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
