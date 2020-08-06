package actions;

import locators.GoogleHomePageLocators;

public class GoogleHomePageActions {

	GoogleHomePageLocators googleHomePageLocators = new GoogleHomePageLocators();
	
	public void fillTheGoogleSerchField(String text) {
		googleHomePageLocators.searchField.sendKeys(text);
//		PageFactory(SeleniumDriver.getDriver(), googleHomePageLocators);
	}
	
}
