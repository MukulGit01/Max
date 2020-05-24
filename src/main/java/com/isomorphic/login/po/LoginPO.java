package com.isomorphic.login.po;


import org.openqa.selenium.support.ui.WebDriverWait;

import com.isomorphic.automation.framework.TestSession;
import java.sql.Driver;
import java.sql.DriverAction;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.isomorphic.framework.pagefactory.MobileWebViewPage;



/**
 * 
 * @author Nimit Jain
 *
 */

public class LoginPO extends MobileWebViewPage {

	WebDriverWait wait = new WebDriverWait(session.driver, 40);

	public LoginPO(TestSession session) throws Exception {
		super(session, "Applications/isomorphic/login");
	}
	
	/**
	 * Used to enter username
	 * 
	 */
	
	public void enterUserName(String username) {
		element("userName").sendKeys(username);
	}
	
	public void clickAustralia() {
		
		element("ClickLocation").click();
	}

	
    public void LoginMember() {
		
		element("MemberLogin").click();
	}
    
    public void CLickUserName(String strArg1) {
    	
		element("CLickUserName").sendKeys(strArg1);
	    
	}
    
    public void EnterPassword(String strArg1) {
    	
		element("EnterPassword").sendKeys(strArg1);
		
}



}
	
	
	
	
	




	
	

