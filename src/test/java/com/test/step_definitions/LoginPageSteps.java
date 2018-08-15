package com.test.step_definitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.test.helpers.Hooks;
import com.test.helpers.LoggerHelper;
import com.test.pageobjects.LoginPageObjects;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import utility.TestBase;

public class LoginPageSteps {
	private final Logger log = LoggerHelper.getLogger(LoginPageSteps.class);
	public WebDriver driver;
	public TestBase configFileReader;

	public LoginPageSteps() {
		driver = Hooks.driver;
		PageFactory.initElements(driver, LoginPageObjects.class);
	}

	@And("^user enter \"([^\"]*)\" \"([^\"]*)\" in input box$")
	public void user_enter_in_input_box(String uname, String pwd) throws Throwable {
		LoginPageObjects.uname.sendKeys(uname);
		LoginPageObjects.pwd.sendKeys(pwd);
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		LoginPageObjects.login_Btn.click();

	}

}
