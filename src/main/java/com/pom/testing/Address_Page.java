package com.pom.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement first_Name_Ap;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement last_Name_Ap;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement billing_Address_Ap;

	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cc_Num_Ap;

	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cc_Type_Ap;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expiry_Month_Ap;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiry_Year_Ap;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_Ap;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_Now_Btn_Ap;

	@FindBy(xpath = "//input[@id='cancel']")
	private WebElement cancel_Btn_Ap;

	@FindBy(xpath = "//a[.='Search Hotel']")
	private WebElement search_Hotel_Btn_Ap;

	@FindBy(xpath = "//a[.='Booked Itinerary']")
	private WebElement booked_Itinerary_Ap;

	@FindBy(xpath = "//a[.='Change Password']")
	private WebElement change_Pass_Ap;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout_Btn_Ap;

	public Address_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_Name_Ap() {
		return first_Name_Ap;
	}

	public WebElement getLast_Name_Ap() {
		return last_Name_Ap;
	}

	public WebElement getBilling_Address_Ap() {
		return billing_Address_Ap;
	}

	public WebElement getCc_Num_Ap() {
		return cc_Num_Ap;
	}

	public WebElement getCc_Type_Ap() {
		return cc_Type_Ap;
	}

	public WebElement getExpiry_Month_Ap() {
		return expiry_Month_Ap;
	}

	public WebElement getExpiry_Year_Ap() {
		return expiry_Year_Ap;
	}

	public WebElement getCvv_Ap() {
		return cvv_Ap;
	}

	public WebElement getBook_Now_Btn_Ap() {
		return book_Now_Btn_Ap;
	}

	public WebElement getCancel_Btn_Ap() {
		return cancel_Btn_Ap;
	}

	public WebElement getSearch_Hotel_Btn_Ap() {
		return search_Hotel_Btn_Ap;
	}

	public WebElement getBooked_Itinerary_Ap() {
		return booked_Itinerary_Ap;
	}

	public WebElement getChange_Pass_Ap() {
		return change_Pass_Ap;
	}

	public WebElement getLogout_Btn_Ap() {
		return logout_Btn_Ap;
	}

}
