package org.stepdefintion;

import org.base.BaseClasses;
import org.pojoclasses.LoginPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineLogin extends BaseClasses {
	
	@When("To user enter {string} and {string}.")
	public void toUserEnterAnd(String username, String password) {
		launchUrl("https://www.facebook.com/");
		maximizeBrowser(); 
		LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), username);
		enterText(l.getTxtPassword(), password);
	    
	}

	@Then("To user verify the valid.")
	public void toUserVerifyTheValid() {
		LoginPagePojo l=new LoginPagePojo();
		clickElement(l.getLoginBtn());
	    
	}

}
