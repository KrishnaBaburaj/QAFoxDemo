package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

public class LoginPage {
	
	WebDriver driver = DriverFactory.getDriver();
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//locators
	private By Email = By.cssSelector("input[id='input-email']");
	private By pass = By.cssSelector("input[id='input-password']");
	private By loginbtn = By.cssSelector("input[value='Login']");
	private By forgotpassLink = By.linkText("Forgotten Password");
	private By Errmsg = By.xpath("//div[text()='Warning: No match for E-Mail Address and/or Password.']");
	private By MyAccountDropdown =By.cssSelector("a[title='My Account']");
	private By Logout = By.linkText("Logout");
	//actions
	
	public void enterEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}
	public void enterPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	public void click_Loginbtn() {
		driver.findElement(loginbtn).click();
	}
	public void Forgot_passwordLink() {
		driver.findElement(forgotpassLink).click();
	}
	public String Error_message() {
		return driver.findElement(Errmsg).getText();
	}
	public String pageUrl() {
		return driver.getCurrentUrl();
	}
	public void enter_username_key(String email) {
		driver.findElement(Email).sendKeys(email,Keys.TAB);
	}
	public void enter_password_key(String password) {
		driver.findElement(pass).sendKeys(password,Keys.ENTER);
	}
	public void loginBtn_keys() {
		driver.findElement(loginbtn).sendKeys(Keys.ENTER);
	}
	public void MyAccountDropdown() {
		driver.findElement(MyAccountDropdown).click();
	}
	public void LogOut() {
		driver.findElement(Logout).click();
	}

}
