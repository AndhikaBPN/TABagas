//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ModulPageTambahan;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMPDSDeleteDescValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulPageTambahan modulPage = new ModulPageTambahan ();
	
	public TestMPDSDeleteDescValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
	@Given("TSMPDS003 Admin sudah membuka tambah deskripsi")
	public void tsmpds003_admin_sudah_membuka_tambah_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka tambah deskripsi");
	}

//	TSMPDS003001
	@When("TSMPDS003001 Admin klik delete")
	public void tsmpds003001_admin_klik_delete() {
	    modulPage.clickDeleteDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik delete");
	}

	@Then("TSMPDS003001 Muncul pop up delete")
	public void tsmpds003001_muncul_pop_up_delete() {
	    assertTrue(modulPage.getTxtConfirmDelete().contains("Yakin ingin menghapus ini ?"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up delete");
	}

	@Then("TSMPDS003001 Admin klik TIDAK")
	public void tsmpds003001_admin_klik_tidak() {
	    modulPage.clickTidakDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik TIDAK");
	}
	
//	TSMPDS003002
	@When("TSMPDS003002 Admin klik delete")
	public void tsmpds003002_admin_klik_delete() {
		modulPage.clickDeleteDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik delete");
	}

	@When("TSMPDS003002 Admin klik YA")
	public void tsmpds003002_admin_klik_ya() {
	    modulPage.clickYaDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik YA");
	}

	@Then("TSMPDS003002 Muncul pop up data telah dihapus")
	public void tsmpds003002_muncul_pop_up_data_telah_dihapus() {
	    assertEquals(modulPage.getTxtDihapus(), "Data berhasil dihapus!");
	    extentTest.log(LogStatus.PASS, "Muncul pop up data telah dihapus");
	}

	@Then("TSMPDS003002 Admin klik OK")
	public void tsmpds003002_admin_klik_ok() {
		modulPage.clickOKDeleteDesk();
		extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
}
