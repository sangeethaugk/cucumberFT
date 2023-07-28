package org.stepdefintion;

import org.base.BaseClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclasses.LoginPagePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClasses {

	@Given("user launch the facebook application.")
	public void user_launch_the_facebook_application() {
		loadBrowser("chrome");	
	}
	
	@Given("To user maximaize browser")
	public void to_user_maximaize_browser() {
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
	}

	@When("user enter username and password.")
	public void user_enter_username_and_password() {
		LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), "abc");
		enterText(l.getTxtPassword(), "Uda");
	    
	}

	@When("user click login button.")
	public void user_click_login_button() {
		
		LoginPagePojo l=new LoginPagePojo();
		clickElement(l.getLoginBtn());
		
	}
	
	@Then("user sees the error message for invalid login attempt")
	public void userSeesTheErrorMessageForInvalidLoginAttempt() {
		WebElement output=driver.findElement(By.xpath("//a[contains(text(),'Fi')]"));
		boolean result=output.isDisplayed();
		System.out.println(result);
	    
	}    

}
