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
	
	@FindBy(id = "ui-id-9")
	private WebElement btnTask;
	
	@FindBy(xpath = "//button[@id='52827_query']/span")
	private WebElement btnDataUsers;
	
	@FindBy(xpath = "//input[@id='tl_data_users--53079_text']")
	private WebElement txtDataUsers;
	
	public void clickTask() {
		btnTask.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public void clickDataUsers() {
		btnDataUsers.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtDataUsers() {
		return txtDataUsers.getAttribute("value");
	}
}
