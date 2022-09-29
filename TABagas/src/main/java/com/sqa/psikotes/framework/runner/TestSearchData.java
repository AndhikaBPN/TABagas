package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;
import com.sqa.psikotes.framework.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchData {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private DataUsersPage dataUser = new DataUsersPage ();
	
	public TestSearchData() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("Admin click search field")
	public void admin_click_search_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSDU002001 Admin input search field with name")
	public void tsdu002001_admin_input_search_field_with_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSDU002001 Admin click search button")
	public void tsdu002001_admin_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("TSDU002001 The system check data users")
	public void tsdu002001_the_system_check_data_users() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
