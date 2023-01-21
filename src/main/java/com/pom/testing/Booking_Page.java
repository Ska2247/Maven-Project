package com.pom.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {

	public WebDriver driver;

	@FindBy(xpath = "//a[.='Search Hotel']")
	private WebElement search_Hotel_Bp;

	@FindBy(xpath = "//a[.='Booked Itinerary']")
	private WebElement booked_Itinerary_Bp;

	@FindBy(xpath = "//a[.='Change Password']")
	private WebElement change_Pass_Bp;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout_Btn_Bp;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio_Btn_Bp;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement continue_Btn_Bp;

	@FindBy(xpath = "//input[@name='cancel']")
	private WebElement cancel_Btn_Bp;

	@FindBy(xpath = "//a[.='Adactin.com']")
	private WebElement bp_Website;

	@FindBy(xpath = "//a[.='www.adactin.com']")
	private WebElement about_Adactin_Bp;

	public Booking_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getSearch_Hotel_Bp() {
		return search_Hotel_Bp;
	}

	public WebElement getBooked_Itinerary_Bp() {
		return booked_Itinerary_Bp;
	}

	public WebElement getChange_Pass_Bp() {
		return change_Pass_Bp;
	}

	public WebElement getLogout_Btn_Bp() {
		return logout_Btn_Bp;
	}

	public WebElement getRadio_Btn_Bp() {
		return radio_Btn_Bp;
	}

	public WebElement getContinue_Btn_Bp() {
		return continue_Btn_Bp;
	}

	public WebElement getCancel_Btn_Bp() {
		return cancel_Btn_Bp;
	}

	public WebElement getBp_Website() {
		return bp_Website;
	}

	public WebElement getAbout_Adactin_Bp() {
		return about_Adactin_Bp;
	}

}
