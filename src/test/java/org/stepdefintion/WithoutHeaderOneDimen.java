package org.stepdefintion;

import java.util.List;

import org.base.BaseClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoclasses.LoginPagePojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithoutHeaderOneDimen extends BaseClasses{
/*	
	@Given("To user launch Chrome browser.")
	public void toUserLaunchChromeBrowser() {
		loadBrowser("chrome");	
	}

	@Given("To user pass valid url.")
	public void toUserPassValidUrl() {
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();    
	}
	
	@When("To user passed valid username and invalid password.")
	public void toUserPassedValidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
	   
		List<String> li=d.asList();
		String username=li.get(3);
		String password=li.get(1);
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
		WebElement output=driver.findElement(By.xpath("//a[contains(text(),'Fi')]"));
		boolean result=output.isDisplayed();
		System.out.println(result);
	    
	}

	@Given("To user enter valid url.")
	public void toUserEnterValidUrl() {
		launchUrl("https://www.facebook.com/");
		
	}

	@When("To user passed invalid username and invalid password.")
	public void toUserPassedInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
	    List<List<String>> ll=d.asLists();
	    List<String>li=ll.get(1);
	    String username=li.get(0);
	    String password=ll.get(2).get(1);
	    LoginPagePojo l=new LoginPagePojo();
		enterText(l.getTxtEmail(), username);
		enterText(l.getTxtPassword(), password);
	    
	}

	@Then("To user to close the chrome browser.")
	public void toUserToCloseTheChromeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		closeBrowser();
	    
	} */



}
