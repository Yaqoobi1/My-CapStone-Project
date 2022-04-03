package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CapHomePageObject;
import utilities.UtilityClass;

public class CapHomePageDef extends Base {

	CapHomePageObject capHomePageObject = new CapHomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		capHomePageObject.clickOnCurrency();
        logger.info("User clicked on Currency");
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		capHomePageObject.SelectEuro();
		logger.info("User Chose Euro from dropdown");
		UtilityClass.takeScreenShot();
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		capHomePageObject.euroSignisPresent();
		logger.info("currency value changed to Euro");
		UtilityClass.takeScreenShot();
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		capHomePageObject.clickOnCart();
		logger.info("User clicked on shopping cart");
		UtilityClass.takeScreenShot();
	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		Assert.assertEquals(string, capHomePageObject.emptyCartMessageIsPresent());
		logger.info("Your shopping cart is empty!");
		UtilityClass.takeScreenShot();

	}

}
