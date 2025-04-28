package pages;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	private By wishList = By.id("wishlist-total");
	private By cart = By.cssSelector("a[title='Shopping Cart']");
	private By Checkout = By.cssSelector("a[title='Checkout']");
	private By Search = By.cssSelector("input[name='search']");
	private By SearchBtn = By.className("input-group-btn");
	private By currencyDropdown = By.xpath("//span[text()='Currency']");
	private By euro = By.xpath("//button[text()='€Euro']");
	private By pound = By.xpath("//button[text()='£Pound Sterling']");
	private By dollar = By.xpath("//button[text()='$US Dollar']");
	private By Search_Results = By.xpath("div[class='product-thumb']");
	private By Eurocart = By.xpath("//span[contains(text(),'€') and @id='cart-total']");
	private By Poundcart= By.xpath("//span[contains(text(),'£') and @id='cart-total']");
	private By Dollarcart = By.xpath("//span[contains(text(),'$') and @id='cart-total']");


	//actions
	public void MyAccoutDropdown() {
		driver.findElement(Myaccount).click();;
	}
	public void register() {
		driver.findElement(Register).click();
	}
	public void Login() {
		driver.findElement(Login).click();
	}
	public void WishList() {
		driver.findElement(wishList).click();
	}
	public void Cart() {
		driver.findElement(cart).click();
	}
	public void CheckOut() {
		driver.findElement(Checkout).click();
	}
	public void SearchField(String search) {
		driver.findElement(Search).click();
		driver.findElement(Search).sendKeys(search);
	}
	public void Searchbtn() {
		driver.findElement(SearchBtn).click();
	}
	public void CurrencyDropdown() {
		driver.findElement(currencyDropdown).click();
	}
	public void EuroCurrency() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(euro))).click();;
	}
	public void PoundCurrency() {
		WebDriverWait wait1 = new WebDriverWait(driver,10);
		wait1.until(ExpectedConditions.visibilityOf(driver.findElement(pound))).click();;
	}
	public void DollarCurrency() {
		WebDriverWait wait2 = new WebDriverWait(driver,10);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElement(dollar))).click();;
	}
	public String pageurl() {
		return driver.getCurrentUrl();
	}
	public String Pagetitle() {
		return driver.getTitle();
	}
	public boolean Search_results() {
		return driver.findElement(Search_Results).isDisplayed();
	}
	public boolean EuroSymbol() {
		return driver.findElement(Eurocart).isDisplayed();
	}
	public boolean PoundSymbol() {
		return driver.findElement(Poundcart).isDisplayed();
	}
	public boolean  DollarSymbol() {
		WebDriverWait wait3 = new WebDriverWait(driver,10);
		wait3.until(ExpectedConditions.visibilityOf(driver.findElement(Dollarcart)));
		return driver.findElement(Dollarcart).isDisplayed();
	}

}
