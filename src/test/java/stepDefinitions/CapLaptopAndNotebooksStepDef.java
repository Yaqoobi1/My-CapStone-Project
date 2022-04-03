package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CapLaptopAndNotebooksPageObject;
import utilities.UtilityClass;

public class CapLaptopAndNotebooksStepDef extends Base {
	
	CapLaptopAndNotebooksPageObject capLaptopAndNoteBooksPageObject = new CapLaptopAndNotebooksPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		capLaptopAndNoteBooksPageObject.clickOnLaptopsAndNoteBooksTab();
		logger.info("User click on Laptop &NoteBook tab");
	    UtilityClass.takeScreenShot();
	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		capLaptopAndNoteBooksPageObject.clickOnShowAllLaptopAndNotebookOption();
		logger.info("User click on Show all Laptop &NoteBook option");
		UtilityClass.takeScreenShot();
		
	   
	}
	
	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		capLaptopAndNoteBooksPageObject.clickOnMacBookItem();
		logger.info("User clicked on MacBook");
		UtilityClass.takeScreenShot();
		
	  
	}

	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		capLaptopAndNoteBooksPageObject.macBookSuccessMessage();
		logger.info("You have added MacBook to your shopping cart!");
	    UtilityClass.takeScreenShot();
	}

	@And("User should see ‘{int} item\\(s){double}’ showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(Integer int1, Double double1) {
		capLaptopAndNoteBooksPageObject.addedItemTextsisPresent();
//		logger.info(double1)
        UtilityClass.takeScreenShot();
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() {
		capLaptopAndNoteBooksPageObject.clickOnAddToCartOption();
		logger.info("User click on cart option");
		UtilityClass.takeScreenShot();
	    
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		capLaptopAndNoteBooksPageObject.clickOnRedBox();
		logger.info("user click on red X button to remove the item from cart");
		UtilityClass.takeScreenShot();
	   
	}

	@Then("item should be removed and cart should show ‘{int} item\\(s)’")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		capLaptopAndNoteBooksPageObject.removedItemTextisPresent();
//		logger.info(int1);
	    UtilityClass.takeScreenShot();
	}
	
	
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
			String actualPageTitle = driver.getTitle();
			String expectedPageTitle = "Laptops & Notebooks";
			Assert.assertEquals(expectedPageTitle, actualPageTitle);
			logger.info(expectedPageTitle);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		capLaptopAndNoteBooksPageObject.clickOnMacBookComparisonIcon();
		UtilityClass.takeScreenShot();
	   
	}

	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		capLaptopAndNoteBooksPageObject.clickOnMacBookAirComparisonIcon();
		logger.info("User click on product comparison icon on ‘MacBook Air");
		UtilityClass.takeScreenShot();
	    
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		capLaptopAndNoteBooksPageObject.macBookAirSuccessMessage();
		logger.info("You have added MacBook Air to your product comparison!");
		UtilityClass.takeScreenShot();
	    
	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		capLaptopAndNoteBooksPageObject.clickOnProductComparisonLink();
		logger.info("User click on Product comparison link");
		UtilityClass.takeScreenShot();
	   
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		capLaptopAndNoteBooksPageObject.productComparisonTextisPresent();
		logger.info("User should see Product Comparison Chart");
        UtilityClass.takeScreenShot();
	}
	
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		capLaptopAndNoteBooksPageObject.addSonyVaioToWishList();
		logger.info("User click on heart icon to add ‘Sony VaIO’ laptop to wish list");
	    UtilityClass.takeScreenShot();
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		capLaptopAndNoteBooksPageObject.accountCreatationMessageForSonyVaio();
	    logger.info("You must login or create an account to save Sony VAIO to your wish list!");
	    UtilityClass.takeScreenShot();
	}
	
	@And("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		capLaptopAndNoteBooksPageObject.clickOnMacBookPro();
		logger.info("User click on ‘MacBook Pro’ item");
		UtilityClass.takeScreenShot();
		
	    
	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		Assert.assertTrue(capLaptopAndNoteBooksPageObject.macProUnitPrice());
//		logger.info(double1);
		UtilityClass.takeScreenShot();
	    
	}

	

}
