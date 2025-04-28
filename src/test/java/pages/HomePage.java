package pages;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

public class HomePage {
	WebDriver driver = DriverFactory.getDriver();
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	//locators
	private By Myaccount =By.xpath("//a[@title='My Account']");
	private By Register = By.linkText("Register");
	private By Login = By.linkText("Login");
	
	
	//actions
	public void MyAccoutDropdown() {
		driver.findElement(Myaccount).click();;
	}
	public void Register() {
		driver.findElement(Register).click();
	}
	public void Login() {
		driver.findElement(Login).click();
	}

}
