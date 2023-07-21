package com.stepdefination;

import org.openqa.selenium.WebDriver;

import com.Assignment2.utils.BaseTest;
import com.Assignmnet2.Pages.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	
	
	WebDriver driver;
	LoginPage Login;
	
	@Given("^The User Launches the browser\\.$")
	public void the_User_Launches_the_browser() throws Throwable {
		BaseTest.initializeDriver();
	   	}

	@And("^User clicks on SignIn link$")
	public void user_clicks_on_SignIn_link() throws Throwable {
		Login.signIn();
	  }

	@When("^the user Enter '(\\d+)' and 'Jain(\\d+)'$")
	public void the_user_Enter_and_Jain(String user, String pass) throws Throwable {
		Login.enterEmail(user);
		Login.clickContinue();
		Login.password(pass);
	}

	@Then("^User should be able to LogIn to the Application\\.$")
	public void user_should_be_able_to_LogIn_to_the_Application() throws Throwable {
		Login.entersubmit();
	}

}
