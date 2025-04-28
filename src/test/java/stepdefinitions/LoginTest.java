package stepdefinitions;

import static org.junit.Assert.assertEquals;

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
		
	}


	@When("user enters invalid email {string}")
	public void user_enters_invalid_email(String invalid_email) {
		loginpage.enterEmail(invalid_email);
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalid_password) {
		loginpage.enterPassword(invalid_password);
	}

	@Then("proper error msg should be displayed")
	public void proper_error_msg_should_be_displayed() {
		assertEquals("Warning: No match for E-Mail Address and/or Password.", loginpage.Error_message());
	}

	@Given("clicks the forgotpassword link")
	public void clicks_the_forgotpassword_link() {
		loginpage.Forgot_passwordLink();
	}

	@Then("user shoud navigated to forgotPassword page")
	public void user_shoud_navigated_to_forgot_password_page() {
		String forgot_pass_pageUrl="https://tutorialsninja.com/demo/index.php?route=account/forgotten";
		assertEquals(forgot_pass_pageUrl, loginpage.pageUrl());
	}

	@When("user enters valid email {string} using keyboard")
	public void user_enters_valid_email_using_keyboard(String username) {
		loginpage.enter_username_key(username);
	}

	@When("user enters valid password {string}  using keyboard")
	public void user_enters_valid_password_using_keyboard(String password) {
		loginpage.enter_password_key(password);
	}

	@When("user clicks login button  using keyboard")
	public void user_clicks_login_button_using_keyboard() {
		loginpage.loginBtn_keys();
	}

	@When("click the back button in the browser")
	public void click_the_back_button_in_the_browser() {
		driver.navigate().back();
	}

	@When("click logout button")
	public void click_logout_button() {
		loginpage.MyAccountDropdown();
		loginpage.LogOut();
	}


}
