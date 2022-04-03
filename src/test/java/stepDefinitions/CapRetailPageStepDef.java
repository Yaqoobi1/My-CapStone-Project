package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CapRetailPageObject;
import utilities.UtilityClass;

public class CapRetailPageStepDef extends Base {

	CapRetailPageObject capRetailPageObject = new CapRetailPageObject();

	@And("User click  on MyAccount")
	public void user_click_on_my_account() {
		capRetailPageObject.clickOnMyAccount();
		logger.info("User click  on MyAccount");
		UtilityClass.takeScreenShot();

	}

	@When("User click on Login")
	public void user_click_on_login() {
		capRetailPageObject.clickOnLogin();
		logger.info("User click on Login");
		UtilityClass.takeScreenShot();

	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password_tyaqoobi(String uName, String pass) {
		capRetailPageObject.enterEmailAndPassword(uName, pass);
		logger.info("user Enter " + uName + "and password " + pass);
		UtilityClass.takeScreenShot();

	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		capRetailPageObject.clickOnLoginButton();
		logger.info("User clicked on Login button");
		UtilityClass.takeScreenShot();

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(capRetailPageObject.myAccountTextisPresent());
		logger.info("User should i logged in to MyAccount dashboard");
		UtilityClass.takeScreenShot();
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		capRetailPageObject.clickOnRegAffiliate();
		logger.info("User clicked on ‘Register for an Affiliate Account’ link");

	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
//		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
//		capRetailPageObject.affiliateCompany(info.get(0).get("company"));
//		capRetailPageObject.affiliateWebsite(info.get(0).get("webSite"));
//		capRetailPageObject.affiliateTaxID(info.get(0).get("taxID"));
//		capRetailPageObject.affiliatePaymentMethod(info.get(0).get("cheque"));
//		logger.info("user entered information " + info.toString());
		capRetailPageObject.fillAffiliatForm();
		logger.info("The form is filled");
		UtilityClass.takeScreenShot();

	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		capRetailPageObject.affiliateAboutUsBox();
		logger.info("User check on About us check box");
		UtilityClass.takeScreenShot();

	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		capRetailPageObject.clickOnAffContinueButton();
		logger.info("User click on Continue button");
		UtilityClass.takeScreenShot();

	}

	@Then("User should see a success message {string}")
	public void user_should_see_a_success_message(String string) {
		capRetailPageObject.affiliateSuccessMessage();
		logger.info("Success: Your account has been successfully updated.");
		UtilityClass.takeScreenShot();

	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		capRetailPageObject.clickOnEditAffiliateInformation();
		logger.info("User click on ‘Edit your affiliate informationlink");
		UtilityClass.takeScreenShot();

	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		capRetailPageObject.clickOnAffiliateBankTransger();
		logger.info("user click on Bank Transfer radio button");
		UtilityClass.takeScreenShot();

	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> edit = dataTable.asMaps(String.class, String.class);
		capRetailPageObject.affiliateBankName(edit.get(0).get("bankName"));
		capRetailPageObject.affiliateAbaNumber(edit.get(0).get("abaNumber"));
		capRetailPageObject.affiliateSwiftCode(edit.get(0).get("swiftCode"));
		capRetailPageObject.affiliateaccountName(edit.get(0).get("accountName"));
		capRetailPageObject.affiliateaccountNumber(edit.get(0).get("accountNumber"));
		logger.info("user edit information " + edit.toString());
		UtilityClass.takeScreenShot();

	}

	@Then("User should see a success message'Success: Your account has been successfully updated.'")
	public void user_should_see_a_success_message_success_your_account_has_been_successfully_updated() {
		capRetailPageObject.affiliateEditSuccessMessage();
		logger.info("Success: Your account has been successfully updated.");
		UtilityClass.takeScreenShot();
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		capRetailPageObject.clickOnEditYourAccountInfo();
		logger.info("User click on ‘Edit your account information’ link");
		UtilityClass.takeScreenShot();

	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> editAcc = dataTable.asMaps(String.class, String.class);
		capRetailPageObject.editFirstName(editAcc.get(0).get("firstname"));
		capRetailPageObject.edidtLastName(editAcc.get(0).get("lastName"));
		capRetailPageObject.editEmailInfo(editAcc.get(0).get("email"));
		capRetailPageObject.editTelephone(editAcc.get(0).get("telephone"));
		logger.info("user edit account information " + editAcc.toString());

		UtilityClass.takeScreenShot();

	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		Assert.assertEquals(string,capRetailPageObject.editAccSuccessMessage()); 
		logger.info("Success: Your account has been successfully updated.");
		UtilityClass.takeScreenShot();

	}

}
