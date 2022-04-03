package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CamerasPageObject extends Base {

	public CamerasPageObject() { // this is a constructor to initialize WebDirver which run the test.constructor
									// name must be same as class name.

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameras;

	@FindBy(xpath = "//a[contains(text(),'Canon (1)')]")
	private WebElement canon;

	@FindBy(xpath = "//a[contains(text(),'Nikon (1)')]")
	private WebElement nokia;

	@FindBy(xpath = "//a[contains(text(),'Show All Cameras')]")
	private WebElement showAllCameras;

	@FindBy(xpath = "//h2[contains(text(),'Cameras')]")
	private WebElement camerasText;

	public void Cameras() {
		cameras.click();
	}

	public boolean ShowAllCamerasTextisPresent() {
		if (camerasText.isDisplayed())
			return true;
		else
			return false;
	}

}