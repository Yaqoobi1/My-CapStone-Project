package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CapDesktopPageObject extends Base {

	public CapDesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;
	@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
	private WebElement desktopText;
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearchText;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li[1]/a")
	private WebElement pcText;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/ul/li[2]/a")
	private WebElement macText;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement compareTotalText;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement hpCartOptionButton;
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addCartButton;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement hpSuccessMessageText;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]")
	private WebElement canonCartOptionButton;
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement canonoColorDropdown;
	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement canonSuccessMessageText;
	
    @FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/a[1]/img[1]")
    private WebElement canonEOS5DItem;
    @FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
    private WebElement reviews;
    @FindBy(xpath = "//input[@id='input-name']")
    private WebElement yourName;
    @FindBy(xpath = "//textarea[@id='input-review']")
    private WebElement yourReview;
    @FindBy(xpath = "//input[@type='radio'][@value='1']")
    private WebElement badRatingButton;
    @FindBy(xpath = "//input[@type='radio'][@value='5']")
    private WebElement goodRatingButton;
    @FindBy(xpath = "//button[@id='button-review']")
    private WebElement continueButton;
    @FindBy(xpath = "//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]")
    private WebElement reviewSuccessMessage;
    
    
    
    
	public void clickOnDesktops() {
		desktopTab.click();
	}

	public void showAllDesktops() {
		showAllDesktop.click();
	}

	public boolean desktopTextisPresent() {
		if (desktopText.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean refineSearchTextisPresent() {
		if (refineSearchText.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean pcTextisPresent() {
		if (pcText.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean macTextisPresent() {
		if (macText.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean compareTotalTextisPresent() {
		if (compareTotalText.isDisplayed())
			return true;
		else
			return false;
	}


	public void clickOnCartOptionButtonLP3065() {
		hpCartOptionButton.click();
	}
//how should I send an integer
	public void selectQuantity(Integer int1) {
		quantity.sendKeys("1");

	}

	public void clickOnAddToCartButton() {
		addCartButton.click();
	}

	
	public String hpSuccessMessage() {
		return hpSuccessMessageText.getText();
	}

	public void clickOnCartOptionButtonEos5D() {
		canonCartOptionButton.click();
	}

	public void selectCanonColor() {
		canonoColorDropdown.sendKeys("Red");
	}


	public String canonSuccessMessage() {
		return canonSuccessMessageText.getText();
	}
	
	public void clickOnCanonEOS5DItem() {
		canonEOS5DItem.click();
	}
	
	public void clickOnReviewLink() {
		reviews.click();
	}
//	public void enterYourName(String urName) {
//		yourName.sendKeys(urName);
//	
//	}
//	public void enterYourReview(String urReview) {
//		yourReview.sendKeys(urReview);
//		
//	}
	// Rating can not be selectd?
//	public void rating(String value) {
//		if (value.equalsIgnoreCase("badRating") && !badRating.isSelected())
//			badRating.click();
//		else if (value.equalsIgnoreCase("goodRating") && !goodRating.isSelected())
//			goodRating.click();
//	}
//	public void selectRatingButton() {
//		goodRatingButton.click();
//	}
	public void reviewInformation() {
		yourName.sendKeys("Wasiq");
		yourReview.sendKeys("This is a good product");
		goodRatingButton.click();
	}

	public void ClickOnContinueButton() {
		continueButton.click();
	}
	
	public boolean reviewSuccessMessage() {
		if(reviewSuccessMessage.isDisplayed())
		return true;
		else
			return false;
	}
	
	
}
