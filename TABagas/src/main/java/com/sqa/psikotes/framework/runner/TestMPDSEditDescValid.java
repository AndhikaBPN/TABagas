//Author: Bagas
//Created_date: 10/4/2022
//Modified_date:

package com.sqa.psikotes.framework.runner;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.page.ModulPageTambahan;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMPDSEditDescValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulPageTambahan modulPage = new ModulPageTambahan ();
	
	public TestMPDSEditDescValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSMP002001
	@Given("TSMPDS002001 Admin sudah membuka tambah deskripsi")
	public void tsmpds002001_admin_sudah_membuka_tambah_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka tambah deskripsi");
	}

	@When("TSMPDS002001 Admin klik icon edit")
	public void tsmpds002001_admin_klik_icon_edit() {
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik icon edit");
	}

	@Then("TSMPDS002001 Muncul pop up")
	public void tsmpds002001_muncul_pop_up() {
	    assertTrue(modulPage.getTxtEditDesk().contains("EDIT DESKRIPSI"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}
	
//	TSMPDS002002
	@Given("TSMPDS002002 Admin sudah masuk ke pop up edit deskripsi")
	public void tsmpds002002_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMPDS002002 Admin isi field Deskripsi soal")
	public void tsmpds002002_admin_isi_field_deskripsi_soal() {
	    String editDesk = "Ini deskripsi baru";
	    modulPage.editDesk(editDesk);
	    extentTest.log(LogStatus.PASS, "Admin isi field Deskripsi soal");
	}

	@When("TSMPDS002002 Admin klik tombol UPDATE")
	public void tsmpds002002_admin_klik_tombol_update() {
	    modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMPDS002002 Muncul pop up")
	public void tsmpds002002_muncul_pop_up() {
	    assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMPDS002002 Admin klik OK")
	public void tsmpds002002_admin_klik_ok() {
	    modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
//	TSMPDS002003
	@Given("TSMPDS002003 Admin sudah masuk ke pop up edit deskripsi")
	public void tsmpds002003_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMPDS002003 Admin isi field Ketentuan soal")
	public void tsmpds002003_admin_isi_field_ketentuan_soal() {
		String editKetentuan = "Ini ketentuan soal baru";
	    modulPage.editKetSoal(editKetentuan);
	    extentTest.log(LogStatus.PASS, "Admin isi field Ketentuan soal");
	}

	@When("TSMPDS002003 Admin klik tombol UPDATE")
	public void tsmpds002003_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMPDS002003 Muncul pop up")
	public void tsmpds002003_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMPDS002003 Admin klik OK")
	public void tsmpds002003_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
//	TSMPDS002004
	@Given("TSMPDS002004 Admin sudah masuk ke pop up edit deskripsi")
	public void tsmpds002004_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMPDS002004 Admin isi field Deskripsi soal")
	public void tsmpds002004_admin_isi_field_deskripsi_soal() {
		String editDesk = "Ini deskripsi baru lagiii";
	    modulPage.editDesk(editDesk);
	    extentTest.log(LogStatus.PASS, "Admin isi field Deskripsi soal");
	}

	@When("TSMPDS002004 Admin isi field Ketentuan soal")
	public void tsmpds002004_admin_isi_field_ketentuan_soal() {
		String editKetentuan = "Ini ketentuan soal baru lagiiii";
	    modulPage.editKetSoal(editKetentuan);
	    extentTest.log(LogStatus.PASS, "Admin isi field Ketentuan soal");
	}

	@When("TSMPDS002004 Admin klik tombol UPDATE")
	public void tsmpds002004_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMPDS002004 Muncul pop up")
	public void tsmpds002004_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMPDS002004 Admin klik OK")
	public void tsmpds002004_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}
	
//	TSMPDS002005
	@Given("TSMPDS002005 Admin sudah masuk ke pop up edit deskripsi")
	public void tsmpds002005_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMPDS002005 Admin hapus value di field Deskripsi soal")
	public void tsmpds002005_admin_hapus_value_di_field_deskripsi_soal() {
	    modulPage.clearDesk();
	    extentTest.log(LogStatus.PASS, "Admin hapus value di field Deskripsi soal");
	}

	@When("TSMPDS002005 Admin klik tombol UPDATE")
	public void tsmpds002005_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMPDS002005 Muncul pop up")
	public void tsmpds002005_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMPDS002005 Admin klik OK")
	public void tsmpds002005_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}

//	TSMPDS002006
	@Given("TSMPDS002006 Admin sudah masuk ke pop up edit deskripsi")
	public void tsmpds002006_admin_sudah_masuk_ke_pop_up_edit_deskripsi() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    modulPage.clickEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin sudah masuk ke pop up edit deskripsi");
	}

	@When("TSMPDS002006 Admin hapus value di field Ketentuan soal")
	public void tsmpds002006_admin_hapus_value_di_field_ketentuan_soal() {
		modulPage.clearKetSoal();
	    extentTest.log(LogStatus.PASS, "Admin hapus value di field Ketentuan soal");
	}

	@When("TSMPDS002006 Admin klik tombol UPDATE")
	public void tsmpds002006_admin_klik_tombol_update() {
		modulPage.clickUpdateDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol UPDATE");
	}

	@Then("TSMPDS002006 Muncul pop up")
	public void tsmpds002006_muncul_pop_up() {
		assertTrue(modulPage.getTxtDisimpan().contains("Berhasil Di Update"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}

	@Then("TSMPDS002006 Admin klik OK")
	public void tsmpds002006_admin_klik_ok() {
		modulPage.clickOKEditDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik OK");
	}

}
