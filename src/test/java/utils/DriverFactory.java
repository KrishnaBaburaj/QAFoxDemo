package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		 return driver;
	}
	
	public static WebDriver Init() {
		if(driver == null) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		}
		return driver;
	}
	public static void quitDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
