package com.stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Assignment2.utils.BaseTest;
import com.Assignmnet2.Pages.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage_stepDef extends BaseTest {
	WebDriver driver;
	
	HomePage obj=new HomePage(driver);
@Given("^User Launch Browser$")
public void user_Launch_Browser() {obj.initializeDriver(); }


@Given("^navigate to website$")
public void navigate_to_website() {
	obj.openUrl();
}

@When("^User Enter Pincode$")
public void user_Enter_Pincode()  {
	obj.AddressButton();
}

@Then("^User check their delivery Date$")
public void user_check_their_delivery_Date()  {
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
  }

@When("^Click on Mobile Button$")
public void click_on_Mobile_Button()  {
	obj.Mobiles();

   }

@Then("^User will Navigate to mobile page$")
public void user_will_Navigate_to_mobile_page()  {
	Assert.assertEquals(driver.getTitle(), "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in");    
}

}
