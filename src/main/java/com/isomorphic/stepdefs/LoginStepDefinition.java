package com.isomorphic.stepdefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinition extends StepDefinitionInit {


	@Given("^I am on the sigin page$")
    public void i_am_on_the_sigin_page() throws Throwable {
    	System.out.println("I am on the sign page.");
    	  }
    
    @When("^Select the language and location on the welcome page$")
    public void select_the_language_and_location_on_the_welcome_page() throws Throwable {
    	System.out.println("Click on the Australia");
    	loginPO.clickAustralia();
    	

    }

    @Then("^Click on the member login tab on the top right$")
    public void click_on_the_member_login_tab_on_the_top_right() throws Throwable {	
    	System.out.println("Login as a Member");
    	loginPO.LoginMember();
    	
    	
    }

    
    @And("^Click on the \"([^\"]*)\" and the cursor starts blinking$")
    public void click_on_the_something_and_the_cursor_starts_blinking(String strArg1) throws Throwable {
    	System.out.println("Click on the user name");
    	loginPO.CLickUserName(strArg1);
    	
    }
    
    @And("^Click on the Password \"([^\"]*)\"$")
    public void click_on_the_password_something(String strArg1) throws Throwable {
    	
    	System.out.println("Click on the Password");
    	loginPO.EnterPassword(strArg1);
    }
    
    
    @And("^Click on the Login button and error message should reflect$")
    public void click_on_the_login_button_and_error_message_should_reflect() throws Throwable {
    
    
    }
    

}

