package com.test.step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.Hooks;
import com.test.pageobjects.RegisterPageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterPageTest {
	
	public static WebDriver driver;
	
	
	public RegisterPageTest() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, RegisterPageObjects.class);
	}
	
	
	
	
	@Given("^User open (\\d+)acres website$")
	public void user_open_acres_website(int arg1) throws Throwable {
	    
	}

	@When("^user click on Hamburger icon$")
	public void user_click_on_Hamburger_icon() throws Throwable {
	    
	}

	@When("^user click on register button$")
	public void user_click_on_register_button() throws Throwable {
	    
	}

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String name, String email, String pwd, String phone) throws Throwable {
	    
	}

	@Then("^user click on Register Now button$")
	public void user_click_on_Register_Now_button() throws Throwable {
	    
	}


}
