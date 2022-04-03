package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CapLaptopAndNotebooksPageObject extends Base {
	
	public CapLaptopAndNotebooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = " //a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooks;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNoteBooks;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "//a[contains(text(),'MacBook')]")
	private WebElement successMessage;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartText;
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/button[1]")
	private WebElement addCartOption;
	@FindBy(xpath = "//a[contains(text(),'Windows (0)')]")
	private WebElement windows;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/button[1]")
	private WebElement redBox;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement macBookComparisonIcon;
	@FindBy(xpath =  "//body/div[@id='product-category']/div[2]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[3]/i[1]")
	private WebElement macBookAirComparisonIcon;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement compSuccessMessage;
	@FindBy(xpath = "//a[@id='compare-total']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//h1[contains(text(),'Product Comparison')]")
	private WebElement productComparisonText;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement sonyVaioWishList;
	@FindBy(xpath = "//body/div[@id='product-category']/div[1]")
	private WebElement sonyVaioMessage;
	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	private WebElement macBookPro;
	@FindBy(xpath = "//h2[contains(text(),'$2,000.00')]")
	private WebElement macBookProPrice;
	@FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
	private WebElement laptopAndNotebooks;
	
	
	//a[contains(text(),'Windows (0)')]


	
	public void clickOnLaptopsAndNoteBooksTab() {
		laptopsAndNoteBooks.click();
	}
	public void clickOnShowAllLaptopAndNotebookOption() {
		showAllLaptopsAndNoteBooks.click();
	}
	public void clickOnMacBookItem() {
		macBook.click();
	}
	public String macBookSuccessMessage() {
		return successMessage.getText();
	}
	public boolean addedItemTextsisPresent(){
		if(cartText.isDisplayed())
			return true;
		else
			return false;	
	}
	public void clickOnAddToCartOption() {
		addCartOption.click();
	}
	
	public void clickOnRedBox() {
		redBox.click();
	}
	
	public boolean removedItemTextisPresent() {
		if(cartText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnMacBookComparisonIcon() {
		macBookComparisonIcon.click();
	}
	
	public void clickOnMacBookAirComparisonIcon() {
		macBookAirComparisonIcon.click();
	}
	public String macBookAirSuccessMessage() {
		return compSuccessMessage.getText();
	}
	
	public void clickOnProductComparisonLink() {
		productComparisonLink.click();
	}
	
	public boolean productComparisonTextisPresent() {//how locate chart//@production
		if(productComparisonText.isDisplayed())
			return true;
		else
			return false;
		
	}
	public void addSonyVaioToWishList() {
		sonyVaioWishList.click();
	}
	public String accountCreatationMessageForSonyVaio() {
		return sonyVaioMessage.getText();
		
	}
	public void clickOnMacBookPro() {
		macBookPro.click();
	}
	public boolean laptopAndNotebooks() {
		if(laptopAndNotebooks.isDisplayed())
			return true;
		else
			return false;
	}
	public boolean macProUnitPrice() {
		if(macBookProPrice.isDisplayed())
			return true;
		else
			return false;
	}
	
}
