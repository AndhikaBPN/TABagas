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

public class TestMPDSAddDescValid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ModulPageTambahan modulPage = new ModulPageTambahan ();
	
	public TestMPDSAddDescValid() {
		driver = SceneHooks.driver;
		extentTest = SceneHooks.extentTest;
	}
	
//	TSMPDS001001
	@Given("TSMPDS001001 Admin sudah login dan sudah membuka halaman modul")
	public void tsmpds001001_admin_sudah_login_dan_sudah_membuka_halaman_modul() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		extentTest.log(LogStatus.PASS, "Admin sudah login dan sudah membuka halaman modul");
	}

	@When("TSMPDS001001 Admin klik icon plus")
	public void tsmpds001001_admin_klik_icon_plus() {
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin klik icon plus");
	}

	@Then("TSMPDS001001 Muncul pop up")
	public void tsmpds001001_muncul_pop_up() {
	    assertTrue(modulPage.getTxtJudulDesk().contains("Deskripsi"));
	    extentTest.log(LogStatus.PASS, "Muncul pop up");
	}
	
//	TSMPDS001002
	@Given("TSMPDS001002 Admin sudah membuka halaman modul dan sudah klik icon plus")
	public void tsmpds001002_admin_sudah_membuka_halaman_modul_dan_sudah_klik_icon_plus() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman modul dan sudah klik icon plus");
	}
	
	@When("TSMPDS001002 Admin mengisi field Deskripsi modul")
	public void tsmpds001002_admin_mengisi_field_deskripsi_modul() {
	    String desk = "Ini Deskripsi";
	    modulPage.insertDesk(desk);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Deskripsi modul");
	}

	@When("TSMPDS001002 Admin klik tombol ADD")
	public void tsmpds001002_admin_klik_tombol_add() {
	    modulPage.clickAddDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol ADD");
	}

	@Then("TSMPDS001002 Deskripsi bertambah")
	public void tsmpds001002_deskripsi_bertambah() {
	    assertEquals(modulPage.getTxtDeskModul(), "Ini Deskripsi");
	    extentTest.log(LogStatus.PASS, "Deskripsi bertambah");
	}

	@Then("TSMPDS001002 Deskripsi dihapus")
	public void tsmpds001002_deskripsi_dihapus() {
	    modulPage.clickDeleteDesk();
	    modulPage.clickYaDesk();
	    modulPage.clickOKDeleteDesk();
	    extentTest.log(LogStatus.PASS, "Deskripsi dihapus");
	}
	
//	TSMPDS001003
	@Given("TSMPDS001003 Admin sudah membuka halaman modul dan sudah klik icon plus")
	public void tsmpds001003_admin_sudah_membuka_halaman_modul_dan_sudah_klik_icon_plus() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman modul dan sudah klik icon plus");
	}

	@When("TSMPDS001003 Admin mengisi field Ketentuan soal")
	public void tsmpds001003_admin_mengisi_field_ketentuan_soal() {
	    String ketSoal = "Ini ketentuan soal";
	    modulPage.insertKetSoal(ketSoal);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Ketentuan soal");
	}

	@When("TSMPDS001003 Admin klik tombol ADD")
	public void tsmpds001003_admin_klik_tombol_add() {
		modulPage.clickAddDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol ADD");
	}

	@Then("TSMPDS001003 Deskripsi bertambah")
	public void tsmpds001003_deskripsi_bertambah() {
	    assertEquals(modulPage.getTxtKetSoal(), "Ini ketentuan soal");
	    extentTest.log(LogStatus.PASS, "Deskripsi bertambah");
	}

	@Then("TSMPDS001003 Deskripsi dihapus")
	public void tsmpds001003_deskripsi_dihapus() {
		modulPage.clickDeleteDesk();
	    modulPage.clickYaDesk();
	    modulPage.clickOKDeleteDesk();
	    extentTest.log(LogStatus.PASS, "Deskripsi dihapus");
	}
	
//	TSMPDS001004
	@Given("TSMPDS001004 Admin sudah membuka halaman modul dan sudah klik icon plus")
	public void tsmpds001004_admin_sudah_membuka_halaman_modul_dan_sudah_klik_icon_plus() {
		driver.get(Constants.URL);
		modulPage.clickOk();
		modulPage.clickMenuTask();
		modulPage.clickSubmenuModul();
		modulPage.clickLast();
	    modulPage.clickDeskripsi();
	    extentTest.log(LogStatus.PASS, "Admin sudah membuka halaman modul dan sudah klik icon plus");
	}

	@When("TSMPDS001004 Admin mengisi field Deskripsi modul")
	public void tsmpds001004_admin_mengisi_field_deskripsi_modul() {
		String desk = "Ini Deskripsi";
	    modulPage.insertDesk(desk);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Deskripsi modul");
	}

	@When("TSMPDS001004 Admin mengisi field Ketentuan soal")
	public void tsmpds001004_admin_mengisi_field_ketentuan_soal() {
		String ketSoal = "Ini ketentuan soal";
	    modulPage.insertKetSoal(ketSoal);
	    extentTest.log(LogStatus.PASS, "Admin mengisi field Ketentuan soal");
	}

	@When("TSMPDS001004 Admin klik tombol ADD")
	public void tsmpds001004_admin_klik_tombol_add() {
		modulPage.clickAddDesk();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol ADD");
	}

	@Then("TSMPDS001004 Deskripsi bertambah")
	public void tsmpds001004_deskripsi_bertambah() {
		assertEquals(modulPage.getTxtDeskModul(), "Ini Deskripsi");
		assertEquals(modulPage.getTxtKetSoal(), "Ini ketentuan soal");
	    extentTest.log(LogStatus.PASS, "Deskripsi bertambah");
	}
}
