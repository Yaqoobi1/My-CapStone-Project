package stepDefinitions;


import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {
	
	// In this class we will define Before Hooks and After hooks of Cucumber
		// Before hooks will run before each scenario
		// After hooks will run after each scenario


	
	@Before
	public void beforeHooks(Scenario scenario) {
		
		browser();//This method comes from base class and will launch browser
		openBrowser();//This method comes from base class and will launch url
		
	}
    @After
	public void afterHooks(Scenario scenario) {
    	tearDown();
		
	}
    }
    
