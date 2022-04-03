package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{
	
	public ComponentsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	
	@FindBy(xpath = "//a[contains(text(),'Mice and Trackballs (0)')]")
	private WebElement miceAndTrackballs;
	
	@FindBy(xpath = "//a[contains(text(),'Monitors (2)')]")
	private WebElement monitors;
	
	@FindBy(xpath = "//a[contains(text(),'Printers (0)')]")
	private WebElement printers;
	
	@FindBy(xpath = "//a[contains(text(),'Scanners (0)')]")
	private WebElement scanners;
	
	@FindBy(xpath = "//a[contains(text(),'Web Cameras (0)')]")
	private WebElement webCameras;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Components')]")
	private WebElement showAllComponents;
	
	@FindBy(xpath = "//h2[contains(text(),'Components')]")
	private WebElement componentsTex;
	
	
	public void Components() {
		components.click();
	}
	public boolean componentsTexisPresent() {
		if(componentsTex.isDisplayed())
			return true;
		else
			return false;
	}
}
