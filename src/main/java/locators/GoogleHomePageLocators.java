package locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class GoogleHomePageLocators {

	@FindBy(id = "q")
	public WebElement searchField;
	
	@FindBy(name = "btnK")
	public WebElement searchBtn;
	
}
