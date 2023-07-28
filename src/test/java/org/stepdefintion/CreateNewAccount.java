package org.stepdefintion;

import org.base.BaseClasses;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateNewAccount extends BaseClasses {
	
	@Given(": To launch chrome browser and url")
	public void toLaunchChromeBrowserAndUrl() {
		loadBrowser("chrome");	
		launchUrl("https://www.facebook.com/");
		maximizeBrowser();
	}

	@When(": To user Click create new account and fill firstname only")
	public void toUserClickCreateNewAccountAndFillFirstnameOnly() {
		applyWaitToAllElements();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("sangeetha");
	}

	@When(": To user click signup button")
	public void toUserClickSignupButton() {
		
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
	}



}
