package org.pojoclasses;

import org.base.BaseClasses;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePojo extends BaseClasses {
	
		//Non parameterised constructor
		public LoginPagePojo() {
			PageFactory.initElements(driver,this);
		}
		
		//Find the private webElement or object using annotations
		//@FindBy(locname="locvalue")
		@FindBy(id="email")
		private WebElement txtEmail;
		@FindBy(id="pass")
		private WebElement txtPassword;
		@FindBy(name="login")
		private WebElement loginBtn;
	    @FindBy(xpath="//div[contains(text(),\"The password that you've entered is incorrect. \")]")
	    private WebElement txtErrorMessage;
		
	    //To access private webElement all over the project
	    public WebElement getTxtEmail() {
			return txtEmail;
		}
		public WebElement getTxtPassword() {
			return txtPassword;
		}
		public WebElement getLoginBtn() {
			return loginBtn;
		}
		public WebElement getTxtErrorMessage() {
			return txtErrorMessage;
		}
	    
				

	}


