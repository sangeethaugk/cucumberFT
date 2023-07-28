package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClasses {
	
		public static WebDriver driver;
		public static Actions actions;
		public static Select select;
		public static Robot robot;
		public static KeyEvent keyEvent;
		public static Keys keys;
		public static File file;
		public static FileInputStream fin;
		public static FileOutputStream fout;
	/*	public static Workbook workbook;
		public static Sheet sheet;
		public static Row row;
		public static Cell cell; */
		
		/*This Method is for loading the browser*/
		public static void loadBrowser(String browserType) {
			if(browserType.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browserType.equals("edges"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browserType.equals("firefox"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}	
		}

		/* This Method is for maximising the browser window */
		
		public static void maximizeBrowser() {
			driver.manage().window().maximize();
			
		}
		
		/*Apply Implicit wait dynamic wait time applied for all WebElement */
		
		public static void applyWaitToAllElements()
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		
		/*To launch the url */
		
		public static void launchUrl(String url) {
			driver.get(url);
		}
		
		/* To pause program execution for given milliseconds */
		public static void pauseExecution(long milliseconds) {
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*To return the current webpage title */
		public static String getWebpageTitle() {
			String title=driver.getTitle();
			return title;
		}
		
		/* To return the current webpage url */
		public static String getWebpageUrl() {
			return driver.getCurrentUrl();
		}
		
		/*To quit the browser */
		public static void quitBrowser() {
			driver.quit();
		}
		 
		/*To enter text into a webElement */
		public static void enterText(WebElement element, String text){
			element.sendKeys(text);	
		}
		
	/*	public static void enterText(List<WebElement> element, String string){
			element.sendKeys(string);	
		} */
		
		/*To click a webElement */
		
		public static void clickElement(WebElement element) {
			element.click();
		}
		
		/*To move cursor over particular element */
		public static void moveCursorOverElement(WebElement element) {
			actions=new Actions(driver);
			actions.moveToElement(element).perform();
		}
		
		/*To perform drag and drop actions*/
		public static void dragAndDropElement(WebElement source, WebElement dest) {
			actions=new Actions(driver);
			actions.dragAndDrop(source, dest).perform();
		}
		
		/*To select a value from dropdown using visible text */
		public static void selectDropdownUsingText(WebElement element,String text) {
			select=new Select(element);
			select.selectByVisibleText(text);
		}
		
		/*To perform the keyboard actions */
		
		public static void keyboardActions() {
			try {
				robot=new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*To perform the key press actions 
		public static void keyPressActions(String text) {
			robot=new Robot();
			robot.keyPress(keyEvent.VK);
		}
		
		To perform the key release actions 
		public static void keyReleaseActions(String text) {
			robot=new Robot();
			robot.keyRelease(keyEvent.VK);
		} */
		
		/*To CLOSE the browser */
		public static void closeBrowser() {
			driver.close();
		}
		
		/*To get text from corresponding webElement */
		public static String getTextElement(WebElement element) {
			return element.getText();
		}
		
		/*To get attribute value for corresponding attribute name for given webelement */
		public static void getAttributeElement(WebElement element, String value) {
			String s=element.getAttribute(value);
			System.out.println(s);
		}
		
		/*To right click cursor mouse over particular element */
		public static void contextClickElement(WebElement element) {
			actions=new Actions(driver);
			actions.contextClick(element).perform();
		}
		
		/*To double click over particular element*/
		public static void doubleClickElement(WebElement element) {
			actions=new Actions(driver);
			actions.doubleClick(element).perform();
		}
		
		//To perform the key down and key up to press a key 
		public static void keyDownElement(WebElement element) {
			actions=new Actions(driver);
			actions.keyDown(element,Keys.SHIFT).perform();
			actions.keyUp(element,Keys.SHIFT).perform();
		}
		
		
	/*	public static void javaScriptScrollUp() {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("")
			
		} */
		
		//To accept the alert message
		public static void alertAccept() {
			Alert a=driver.switchTo().alert();
			a.accept();
		}
		
		//To accept the alert message
		public static void alertDismiss() {
			Alert a=driver.switchTo().alert();
			a.dismiss();
		}
		
		//To accept the alert message
		public static void alertSendKeysAccept(String value) {
			Alert a=driver.switchTo().alert();
			a.sendKeys(value);
			a.accept();
		}
		
		//To accept the alert message
		public static void alertSendKeysDismiss(String value) {
			Alert a=driver.switchTo().alert();
			a.sendKeys(value);
			a.dismiss();
		}
			
		//To accept the alert message
		public static void alertGetText() {
			Alert a=driver.switchTo().alert();
			a.getText();
		}
		
		/*To select a value from dropdown by value */
		public static void selectDropdownByValue(WebElement element,String text) {
			select=new Select(element);
			select.selectByValue(text);
		}
		
		/*To select a value from dropdown by Index */
		public static void selectDropdownByIndex(WebElement element,int n) {
			select=new Select(element);
			select.selectByIndex(n);
		}
		
		/*To check it is multiple using Select class */
		public static void selectIsMultiple(WebElement element) {
			Select s=new Select(element);
			boolean m=s.isMultiple();
			System.out.println(m);
		}
		
		/*To select all the options listed in dropdown */
		public static void selectGetOption(WebElement element) {
			Select s=new Select(element);
			List<WebElement> options=s.getOptions();
			System.out.println(options);
		}
		
		/*To select all the selected options listed in dropdown */
		public static void selectGetAllSelectedOption(WebElement element) {
			Select s=new Select(element);
			List<WebElement> options=s.getAllSelectedOptions();
			System.out.println(options);
		}
		
		/*To print first selected options listed in dropdown */
		public static void selectGetFirstSelectedOption(WebElement element) {
			Select s=new Select(element);
			WebElement options=s.getFirstSelectedOption();
			System.out.println(options);
		}
		
		/*To deselect a selected value in dropdown */
		public static void deselectDropdownByValue(WebElement element,String text) {
			select=new Select(element);
			select.deselectByValue(text);
		}
		
		/*To deselect a selected index in dropdown */
		public static void deselectDropdownByIndex(WebElement element,int n) {
			select=new Select(element);
			select.deselectByIndex(n);
		}
		
		/*To deselect a selected text in dropdown */
		public static void deselectDropdownByVisbleText(WebElement element,String text) {
			select=new Select(element);
			select.deselectByVisibleText(text);
		}
		
		/*To deselect all selected options  in dropdown */
		public static void deselectAllDropdown(WebElement element) {
			select=new Select(element);
			select.deselectAll();
		}
		
		//to navigate to the given url
		public static void togivenNavigator() {
			Navigation n=driver.navigate();
			n.refresh();	
		}
		
		//to navigate to the next page
		public static void forwardNavigator() {
			driver.navigate().forward();		
		}
			
		//to navigate to the previous page
		public static void backNavigator() {
			driver.navigate().back();
		}
			
		//to refresh a particular page
		public static void refreshNavigator() {
			driver.navigate().refresh();
		}

}
