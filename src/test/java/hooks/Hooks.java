package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {
	
	@Before
	public void Setup() {
		DriverFactory.Init();
	}
	@After
	public void TearDown() {
		DriverFactory.quitDriver();
	}

}
