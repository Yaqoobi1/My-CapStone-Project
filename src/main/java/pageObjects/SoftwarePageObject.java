package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base{
     
	public SoftwarePageObject() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Software']")
	private WebElement software;
	
	@FindBy(xpath="//h2[text()='Software']")
	private WebElement softwareText;
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	public void Software() {
		software.click();
	}
	public boolean softwareTextisPresent() {
		if(softwareText.isDisplayed()) 
			return true;
		else
			return false;
		
	}
}


