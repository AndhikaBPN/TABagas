//Author: Bagas
//Created_date: 9/29/2022
//Modified_date:

package com.sqa.psikotes.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sqa.psikotes.framework.connection.DriverSingleton;
import com.sqa.psikotes.framework.constant.Constants;
import com.sqa.psikotes.framework.utils.Utils;

public class DataUsersPage extends LoginPage{
	private WebDriver driver;
	public DataUsersPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	Button
	@FindBy(id = "ui-id-9")
	private WebElement btnTask;
	
	@FindBy(xpath = "//button[@id='52827_query']/span")
	private WebElement btnDataUsers;
	
//	@FindBy(id = "--_text")
//	private WebElement btnView;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
	private WebElement btnView;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]")
	private WebElement btnEdit;
	
	@FindBy(xpath = "//span[normalize-space()='Search']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//img[@id='tl_data_users--53078_finder']")
	private WebElement btnGreen;
	
	@FindBy(xpath = "//button[@id='53211_query']/span")
	private WebElement btnSave;
	
//	Dropdown
	@FindBy(xpath = "//select[@id='tl_data_users--53411_text']")
	private WebElement dropStatus;
	
	@FindBy(id = "tl_view_user--53301_text")
	private WebElement dropEditStatus;
	
	@FindBy(xpath = "//span[@id='ddcl-tl_view_user--53302_select']/span/span")
	private WebElement dropKategori;
	
//	Select
	@FindBy(xpath = "//option[@value='NON ACTIVE']")
	private WebElement selectNon;
	
	@FindBy(xpath = "//option[@value='ACTIVE']")
	private WebElement selectActive;
	
	@FindBy(xpath = "//select[@id='tl_view_user--53301_text']/option[2]")
	private WebElement selectEditActive;
	
	@FindBy(xpath = "//select[@id='tl_view_user--53301_text']/option[3]")
	private WebElement selectEditNon;
	
	@FindBy(id = "ddcl-tl_view_user--53302_select-i0")
	private WebElement selectStaff;
	
	@FindBy(id = "ddcl-tl_view_user--53302_select-i1")
	private WebElement selectLeader;
	
//	Insert
	@FindBy(xpath = "//input[@id='tl_data_users--53078_text']")
	private WebElement insSearch;
	
//	Validation
	@FindBy(xpath = "//input[@id='tl_data_users--53079_text']")
	private WebElement txtDataUsers;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-1']")
	private WebElement txtNameUser;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-2']")
	private WebElement txtEmailUser;
	
	@FindBy(xpath = "//td[@id='tl_data_users--53082-cell-0-4']")
	private WebElement txtStatusUser;
	
	@FindBy(id = "tl_viewedit_user--53383_text")
	private WebElement txtViewName;
	
	@FindBy(id = "tl_view_user--53299_text")
	private WebElement txtEditName;
	
	@FindBy(xpath = "//p[normalize-space()='Data Berhasil Di Update']")
	private WebElement txtDisimpan;
	
//	Click
	public void clickTask() {
		btnTask.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDataUsers() {
		btnDataUsers.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickInsSearch() {
		insSearch.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDrop() {
		dropStatus.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickNon() {
		selectNon.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickActive() {
		selectActive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDropEditStatus() {
		dropEditStatus.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEditActive() {
		selectEditActive.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickKategori() {
		dropKategori.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickStaff() {
		selectStaff.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickLeader() {
		selectLeader.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickSearch() {
		btnSearch.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickView() {
		btnView.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEdit() {
		btnEdit.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickGreen() {
		btnGreen.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickEnter() {
		this.insSearch.sendKeys(Keys.ENTER);
	}
	
	public void clickSave() {
		btnSave.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
	
//	Insert
	public void insertSearch(String search) {
		this.insSearch.sendKeys(search);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	
//	Validation
	public String getTxtDataUsers() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDataUsers);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtDataUsers.getText());
		return txtDataUsers.getAttribute("value");
	}
	
	public String getTxtNameUser() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtNameUser);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtNameUser.getText());
		return txtNameUser.getText();
	}
	
	public String getTxtEmailUser() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEmailUser);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEmailUser.getText());
		return txtEmailUser.getText();
	}
	
	public String getTxtStatusUser() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtStatusUser);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtStatusUser.getText());
		return txtStatusUser.getText();
	}
	
	public String getTxtViewName() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtViewName);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtViewName.getAttribute("value"));
		return txtViewName.getAttribute("value");
	}
	
	public String getTxtEditName() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtEditName);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtEditName.getAttribute("value"));
		return txtEditName.getAttribute("value");
	}
	
	public String getTxtDisimpan() {
		Utils.driverWaitTxt(driver, Constants.TIMEOUT, txtDisimpan);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		System.out.println(txtDisimpan.getText());
		return txtDisimpan.getText();
	}
}
