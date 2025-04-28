package pages;

import org.openqa.selenium.By;
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

}
