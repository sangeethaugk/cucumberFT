package org.stepdefintion;

import org.base.BaseClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclasses.LoginPagePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1Sample extends BaseClasses {
	
/*	@Given("To user launch Chrome browser.")
	public void toUserLaunchChromeBrowser() {
		loadBrowser("chrome");	
	}

	@Given("To user pass valid url.")
	public void toUserPassValidUrl() {
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();    
	}

	@When("To user enter valid username and invalid password.")
	public void toUserEnterValidUsernameAndInvalidPassword() {
		
		LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), "abc");
		enterText(l.getTxtPassword(), "Uda");
	 }  

	@When("To user click login button.")
	public void toUserClickLoginButton() {
		
		LoginPagePojo l=new LoginPagePojo();
		clickElement(l.getLoginBtn());
	}

	@Then("To user verify valid.")
	public void toUserVerifyValid() {
		WebElement output=driver.findElement(By.xpath("//a[contains(text(),'Fi')]"));
		boolean result=output.isDisplayed();
		System.out.println(result);
	    
	}

	@Given("To user enter valid url.")
	public void toUserEnterValidUrl() {
		launchUrl("https://www.facebook.com/");
	}

	@When("To user enter invalid username and invalid password.")
	public void toUserEnterInvalidUsernameAndInvalidPassword() {
		
		LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), "blue");
		enterText(l.getTxtPassword(), "2222");
	    
	}

	@Then("To user to close the chrome browser.")
	public void toUserToCloseTheChromeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		closeBrowser();
	    
	}*/
}
