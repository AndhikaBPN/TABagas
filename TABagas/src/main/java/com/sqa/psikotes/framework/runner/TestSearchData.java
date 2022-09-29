package com.sqa.psikotes.framework.runner;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.DataUsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchData {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	
	private DataUsersPage dataUsers = new DataUsersPage ();
	
	public TestSearchData() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("Admin harus klik field search Data Users pada halaman Data Users")
	public void admin_harus_klik_field_search_data_users_pada_halaman_data_users() {
		driver.get(Constants.URL);
		String username = "developer";
		String password = "23";
		System.out.println("admin_enter_valid_username_and_password : "+ username +" pwd : "+password);
		dataUsers.loginValidTwo(username, password);
		
	}

	@When("TSDU002001 Admin mengisi field dengan nama yang ingin dicari")
	public void tsdu002001_admin_mengisi_field_dengan_nama_yang_ingin_dicari() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("TSDU002001 Admin klik tombol search")
	public void tsdu002001_admin_klik_tombol_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("TSDU002001 Tampil nama yang dicari")
	public void tsdu002001_tampil_nama_yang_dicari() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
