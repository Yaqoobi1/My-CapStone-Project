package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CapHomePageObject extends Base {

	public CapHomePageObject() {//this is a constructor
		PageFactory.initElements(driver, this);// inside the constructor we write PageFactory to initiate elements
	}

	@FindBy(xpath = "//body")
	private WebElement HomePage;
	@FindBy(xpath = "//a [contains(text(),'TEST ENVIRONMENT')]")
	private WebElement testEnvironmentText;
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement searchBox;
	@FindBy(xpath = "//*[@type='button'][@xpath='1']")
	private WebElement searchButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement shoppingCart;
	@FindBy(xpath = "//*[@class='dropdown-toggle'][@xpath='1']")
	private WebElement desktops;
	@FindBy(xpath = "//*[@data-toggle='dropdown'][@xpath='1']")
	private WebElement labtopsAndNotebooks;
	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;
	@FindBy(xpath = "//a[contains(text(),'Tablets')]")
	private WebElement tablets;
	@FindBy(xpath = "//a[contains(text(),'Software')]")
	private WebElement software;
	@FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
	private WebElement phoneAndPDAs;
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement cameras;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3Players;
	@FindBy(xpath = "//div[@class='swiper-button-prev'][@xpath='1']")
	private WebElement prevSwiperButton;
	@FindBy(xpath = "//div[@class='swiper-button-next'][@xpath='1']")
	private WebElement nextSwiperButton;
	@FindBy(xpath = "//h3[contains(text(),'Featured')]")
	private WebElement featred;
	
	@FindBy(xpath = "//span[contains(text(),'Currency')]")//span[contains(text(),'Currency')]
	private WebElement currency;
	@FindBy(xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euro;
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroSign;
	@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyCartMessage;

	public void clickOnCurrency() {
		currency.click();
	}

	public void SelectEuro() {
		euro.click();
	}

	public boolean euroSignisPresent() {
		if (euroSign.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnCart() {
		shoppingCart.click();
	}

	public String emptyCartMessageIsPresent() {
		return emptyCartMessage.getText();
	}

	public boolean testEnvironmentTextisPresent() {
		if (testEnvironmentText.isDisplayed()) {
			return true;

		} else
			return false;

	}
}