package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesAndPDAsPageObject extends Base{
	public PhonesAndPDAsPageObject() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath ="//a[text()='Phones & PDAs']")
	private WebElement phonesAndPDAs;
	
	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement PhonePDAsText;
	
	@FindBy(xpath = "//button[@id='list-view']")
	private WebElement listButton;
	
	@FindBy(xpath = "//button[@id='grid-view']")
	private WebElement gridButton;
	
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productCompare;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortBy;
	
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement show;
	
	
	
public void phonesAndPDAs() {
	phonesAndPDAs.click();
}

public boolean PhonePDAsTextisPresent() {
	if(PhonePDAsText.isDisplayed())
		return true;
	else
		return false;
}




}

