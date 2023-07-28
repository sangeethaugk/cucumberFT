package org.stepdefintion;

import java.util.List;
import java.util.Map;

import org.base.BaseClasses;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclasses.LoginPagePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithHeader extends BaseClasses {
	

	@Given("To user launch Chrome browser.")
	public void toUserLaunchChromeBrowser() {
		loadBrowser("chrome");	
	}

	@Given("To user pass valid url.")
	public void toUserPassValidUrl() {
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();    
	    
	}

	@When("To user pass valid username and invalid password.")
	public void toUserPassValidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		Map<String, String> a=d.asMap(String.class, String.class);
		String username=a.get("email");
		String password=a.get("password1");
		
		LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), username);
		enterText(l.getTxtPassword(), password);
	}

	@When("To user click login button.")
	public void toUserClickLoginButton() {
		LoginPagePojo l=new LoginPagePojo();
		clickElement(l.getLoginBtn());
	}
	
	@Then("To user verify valid.")
	public void toUserVerifyValid() {
	   WebElement output=driver.findElement(By.xpath("//div[contains(text(),'incorrect')]"));
	   String text=output.getText();
	   Assert.assertTrue(text.contains("incorrect"));
	}

	@Given("To user enter valid url.")
	public void toUserEnterValidUrl() {
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();    
	    
	}
	
	@When("To user pass invalid username and invalid password.")
	public void toUserPassInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> a=d.asMaps(String.class, String.class);
		Map<String, String> m=a.get(2);
		String username=m.get("phoneno");
		
		Map<String, String> m1=a.get(2);
		String password=m1.get("password");
		
		LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), username);
		enterText(l.getTxtPassword(), password);

	}

	@Then("To user to close the chrome browser.")
	public void toUserToCloseTheChromeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		closeBrowser();
	    
	}


	
	

}
