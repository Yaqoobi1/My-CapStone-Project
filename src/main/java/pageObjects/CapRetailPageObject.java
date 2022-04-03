package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CapRetailPageObject extends Base {

	public CapRetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement login;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	private WebElement loginButton;
	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	private WebElement myAccountText;

	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement regAffiliateLink;
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteName;
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement cheque;
	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement payeeName;
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
	private WebElement aboutUsBox;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement affContinueButton;
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement successMessage;

	@FindBy(xpath = "//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliateInfo;
	@FindBy(xpath = "//body/div[@id='account-affiliate']/div[1]/div[1]/form[1]/fieldset[2]/div[2]/div[1]/div[3]/label[1]/input[1]")
	private WebElement bankTransfer;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumber;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;
	@FindBy(xpath = "//body/div[@id='account-account']/div[1]")
	private WebElement AffiliateSuccessMessage;

	@FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
	private WebElement editAccountInfo;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement editEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephone;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editSuccessMessage;

	// Login Account
	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnLogin() {
		login.click();
	}

	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.clear();
		email.sendKeys(emailValue);
		password.clear();
		password.sendKeys(passwordValue);
		
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public boolean myAccountTextisPresent() {
		if (myAccountText.isDisplayed())
			return true;
		else
			return false;
	}

	// Affiliate Register
	public void clickOnRegAffiliate() {
		regAffiliateLink.click();
	}

//	public void affiliateCompany(String company) {
//		companyName.clear();
//		companyName.sendKeys(company);
//
//	}
//
//	public void affiliateWebsite(String webSite) {
//		websiteName.clear();
//		websiteName.sendKeys(webSite);
//	}
//
//	public void affiliateTaxID(String taxId) {
//		taxID.clear();
//		taxID.sendKeys(taxId);
//	}
//
//	public void affiliatePaymentMethod() {
//		cheque.click();
//	}
	
	public void fillAffiliatForm() {
		companyName.sendKeys("abc");
		websiteName.sendKeys("cbd");
		taxID.sendKeys("1245");
		cheque.click();
		payeeName.sendKeys("wasiq");
		
		
	}

	public void affiliateAboutUsBox() {
		aboutUsBox.click();
	}

	public void clickOnAffContinueButton() {
		affContinueButton.click();
	}

	public String affiliateSuccessMessage() {
		return successMessage.getText();

	}

//Edit Affiliate from
	public void clickOnEditAffiliateInformation() {
		editAffiliateInfo.click();
	}

	public void clickOnAffiliateBankTransger() {
		bankTransfer.click();
	}

	public void affiliateBankName(String bName) {
		bankName.clear();
		bankName.sendKeys(bName);

	}

	public void affiliateAbaNumber(String abaNum) {
		abaNumber.clear();
		abaNumber.sendKeys(abaNum);

	}

	public void affiliateSwiftCode(String swCode) {
		swiftCode.clear();
		swiftCode.sendKeys(swCode);

	}

	public void affiliateaccountName(String acName) {
		accountName.clear();
		accountName.sendKeys(acName);

	}

	public void affiliateaccountNumber(String acNumber) {
		accountNumber.clear();
		accountNumber.sendKeys(acNumber);

	}

	public String affiliateEditSuccessMessage() {
		return AffiliateSuccessMessage.getText();

	}

//Edit Account Info
	public void clickOnEditYourAccountInfo() {
		editAccountInfo.click();
	}

	public void editFirstName(String fName) {
		firstName.clear();
		firstName.sendKeys(fName);
	}

	public void edidtLastName(String lName) {
		lastName.clear();
		lastName.sendKeys(lName);
	}

	public void editEmailInfo(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}

	public void editTelephone(String phone) {
		telephone.clear();
		telephone.sendKeys(phone);
	}

	public String editAccSuccessMessage() {
		return editSuccessMessage.getText();
	}



}
