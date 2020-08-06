package steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class BeforeSteps {
	
	public WebDriver driver = null;
	
	@Before
	public void setUp() {			
//		driver = new FirefoxDriver();
//		driver.manage().window().setSize(new Dimension(1200, 765));
//		driver.get("https://www.google.com");
	}
	
	
}
