package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {
	WebDriver driver = DriverFactory.getDriver();
	HomePage homepage = new HomePage(driver);
	LoginPage loginpage ;


	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		homepage.MyAccoutDropdown();
		homepage.Login();
		loginpage = new LoginPage(driver);
		
	}

	@When("user enters valid email {string}")
	public void user_enters_valid_email(String email) {
		loginpage.enterEmail(email);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String password) {
		loginpage.enterPassword(password);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		loginpage.click_Loginbtn();
	}

	@Then("login sucess message must be displayed")
	public void login_sucess_message_must_be_displayed() {
		System.out.println("<<");
	}


}
