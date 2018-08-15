package com.test.step_definitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.helpers.Hooks;
import com.test.helpers.LoggerHelper;
import com.test.pageobjects.RegisterPageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.TestBase;

public class RegisterPageSteps {
	private final Logger log = LoggerHelper.getLogger(RegisterPageSteps.class);
	public WebDriver driver;
	public TestBase configFileReader;

	public RegisterPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, RegisterPageObjects.class);
	}

	@Given("^User open (\\d+)acres website$")
	public void user_open_acres_website(int arg1) throws Throwable {
		log.info("launch application");
		configFileReader = new TestBase();
		driver.get(configFileReader.getApplicationUrl());
	}

	@When("^user click on Hamburger icon$")
	public void user_click_on_Hamburger_icon() throws Throwable {
		log.info("click on hamburger icon");
		RegisterPageObjects.ham_icon.click();

	}

	@When("^user click on register button$")
	public void user_click_on_register_button() throws Throwable {
		 Thread.sleep(3000);
		log.info("click on register button");
		RegisterPageObjects.login.click();
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(RegisterPageObjects.login));
		//wait.until(ExpectedConditions.visibilityOf(RegisterPageObjects.login)).click();

	}

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String name, String email, String pwd, String phone) throws Throwable {
		// Thread.sleep(3000);
		RegisterPageObjects.name.sendKeys(name);
		RegisterPageObjects.email.sendKeys(email);
		RegisterPageObjects.pwd.sendKeys(pwd);
		RegisterPageObjects.ph_no.sendKeys(phone);
	}

	@Then("^user click on Register Now button$")
	public void user_click_on_Register_Now_button() throws Throwable {
		RegisterPageObjects.reg_Btn.click();

	}

	// *********************************************************************//

	@When("^user enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String name, String email, String pwd) throws Throwable {
		RegisterPageObjects.name.sendKeys(name);
		RegisterPageObjects.email.sendKeys(email);
		RegisterPageObjects.pwd.sendKeys(pwd);

	}

	@When("^user click on show button$")
	public void user_click_on_show_button() throws Throwable {
		Thread.sleep(3000);
		RegisterPageObjects.show_Btn.click();

	}

	@When("^user click on hide button$")
	public void user_click_on_hide_button() throws Throwable {
		Thread.sleep(3000);
		RegisterPageObjects.hide_Btn.click();

	}

}
