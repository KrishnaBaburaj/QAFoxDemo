package stepdefinitions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.HomePage;
import utils.DriverFactory;
public class HomeTest {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homepage = new HomePage(driver);

	@Given("user navigates to Home page")
	public void user_navigates_to_home_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	}


	@When("user clicks MyAccount dropdown")
	public void user_clicks_my_account_dropdown() {
		homepage.MyAccoutDropdown();;
	}

	@When("clicks register button")
	public void clicks_register_button() {
		homepage.register();
	}

	@Then("user must navigated to register page")
	public void user_must_navigated_to_register_page() {
		String register_url ="https://tutorialsninja.com/demo/index.php?route=account/register";
		assertEquals(register_url, homepage.pageurl());
		
	}

	@When("clicks login button")
	public void clicks_login_button() {
		homepage.Login();
	}

	@Then("user must navigated to login page")
	public void user_must_navigated_to_login_page() {
		String Login_url ="https://tutorialsninja.com/demo/index.php?route=account/login";
		assertEquals(Login_url, homepage.pageurl());
	}


	@When("user clicks the currency Dropdown")
	public void user_clicks_the_currency_dropdown() {
		homepage.CurrencyDropdown();
	}

	@When("Clicks the euro currency")
	public void clicks_the_euro_currency() {
		homepage.EuroCurrency();
	}

	@Then("the product price must be changed to euro")
	public void the_product_price_must_be_changed_to_euro() {
		assertTrue(homepage.EuroSymbol());
	}

	@When("Clicks the Pound currency")
	public void clicks_the_pound_currency() {
		homepage.PoundCurrency();
	}

	@Then("the product price must be changed to pound")
	public void the_product_price_must_be_changed_to_pound() {
		assertTrue(homepage.PoundSymbol());
	}

	@When("Clicks the dollars currency")
	public void clicks_the_dollars_currency() {
		homepage.DollarCurrency();
	}

	@Then("the product price must be changed to dollars")
	public void the_product_price_must_be_changed_to_dollars() {
		assertTrue(homepage.DollarSymbol());
	}

	@Given("user clicks the wishlist button")
	public void user_clicks_the_wishlist_button() {
		homepage.WishList();
	}

	@Given("Clciks the shopping cart button")
	public void clciks_the_shopping_cart_button() {
		homepage.Cart();
	}

	@Then("user must be navigated to shopping cart page")
	public void user_must_be_navigated_to_shopping_cart_page() {
		String checkoutUrl ="https://tutorialsninja.com/demo/index.php?route=checkout/cart";
		assertEquals(checkoutUrl, driver.getCurrentUrl());
	}

	@Given("Clciks the Checkout button")
	public void clciks_the_checkout_button() {
		homepage.CheckOut();
	}

	@When("user enters valid product name {string}")
	public void user_enters_valid_product_name(String valid_product) {
		homepage.SearchField(valid_product);
	}

	@When("clicks the Search button")
	public void clicks_the_search_button() {
		homepage.Searchbtn();
	}

	@Then("the search results must be displayed")
	public void the_search_results_must_be_displayed() {
		assertTrue(homepage.Search_results());
	}



}
