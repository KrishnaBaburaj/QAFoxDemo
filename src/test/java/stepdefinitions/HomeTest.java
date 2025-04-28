package stepdefinitions;
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
		homepage.Register();
	}

	@Then("user must navigated to register page")
	public void user_must_navigated_to_register_page() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	@When("clicks login button")
	public void clicks_login_button() {
		homepage.Login();
	}

	@Then("user must navigated to login page")
	public void user_must_navigated_to_login_page() {
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);

	}
}
