package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CapDesktopPageObject;
import utilities.UtilityClass;

public class CapDesktopsStepDef extends Base {

	CapDesktopPageObject capDesktopPageObject = new CapDesktopPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info(expectedPageTitle);

	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		capDesktopPageObject.clickOnDesktops();
		logger.info("User clicked on Desktops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		capDesktopPageObject.showAllDesktops();
		logger.info("User clicked on Show all desktops");
		UtilityClass.takeScreenShot();
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		Assert.assertTrue(capDesktopPageObject.desktopTextisPresent());
		Assert.assertTrue(capDesktopPageObject.refineSearchTextisPresent());
		Assert.assertTrue(capDesktopPageObject.pcTextisPresent());
		Assert.assertTrue(capDesktopPageObject.macTextisPresent());
		Assert.assertTrue(capDesktopPageObject.compareTotalTextisPresent());
		logger.info("User should see all items are present in Desktop page");
		UtilityClass.takeScreenShot();

	}

	@And("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		capDesktopPageObject.clickOnCartOptionButtonLP3065();
		logger.info("User clicked  ADD TO CART option on ‘HP LP3065’ item");
	}

	@And("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		capDesktopPageObject.selectQuantity(int1);
		logger.info("User selected quantity {int}");
		UtilityClass.takeScreenShot();
	}

	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		capDesktopPageObject.clickOnAddToCartButton();
		logger.info("User clicked add to Cart button");
		UtilityClass.takeScreenShot();

	}

	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
		capDesktopPageObject.hpSuccessMessage();
		logger.info("Success: you have added HP LP {int} to your Shopping cart!");
		UtilityClass.takeScreenShot();
	}

	@And("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		capDesktopPageObject.clickOnCartOptionButtonEos5D();
		logger.info("User clicked  ADD TO CART option on ‘Canon EOS 5D’ item");
		UtilityClass.takeScreenShot();
	}

	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		capDesktopPageObject.selectCanonColor();
		logger.info("User select color from dropdown ‘Red’");
		UtilityClass.takeScreenShot();

	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		capDesktopPageObject.canonSuccessMessage();
		logger.info("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’");
		UtilityClass.takeScreenShot();
	}

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		capDesktopPageObject.clickOnCanonEOS5DItem();
		logger.info("User clicked on Canon EOS 5D item");
		UtilityClass.takeScreenShot();

	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		capDesktopPageObject.clickOnReviewLink();
		logger.info("User clicked on write a review link");
		UtilityClass.takeScreenShot();

	}

	@And("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
//		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
//		capDesktopPageObject.enterYourName(info.get(0).get("yourName"));
//		capDesktopPageObject.enterYourReview(info.get(0).get("yourReview"));
//		capDesktopPageObject.selectRating(info.get(0).get("rating"));// Rating can not be selectd?
		capDesktopPageObject.reviewInformation();
		logger.info("Review information has been filled");
//		logger.info("user entered review info" + info.toString());
		UtilityClass.takeScreenShot();
	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() {
		logger.info("User clicked on Continue Button");
		UtilityClass.takeScreenShot();
	}

	// One parameter in step def, 0 parameter in gherkin
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.’")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		Assert.assertTrue(capDesktopPageObject.reviewSuccessMessage());
		logger.info("Thank you for your review. It has been submitted to the webmaster for approval.");
		UtilityClass.takeScreenShot();
	}

}
