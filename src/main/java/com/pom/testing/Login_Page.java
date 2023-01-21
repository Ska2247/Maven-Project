package com.pom.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(name = "Search Hotel")
	private WebElement search_Hotel;

	@FindBy(xpath = "//a[.='Booked Itinerary']")
	private WebElement booked_Itinerary;

	@FindBy(xpath = "//a[.='Change Password']")
	private WebElement change_Password;

	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logout_Btn;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room_Type;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement room_Nos;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_Room;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_Room;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search_Btn;

	@FindBy(xpath = "//input[@type='reset']")
	private WebElement reset;

	@FindBy(xpath = "//a[.='Adactin.com']")
	private WebElement lp_Website_Btn;

	@FindBy(xpath = "//a[.='www.adactin.com']")
	private WebElement about_Adactin;

	public Login_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getSearch_Hotel() {
		return search_Hotel;
	}

	public WebElement getBooked_Itinerary() {
		return booked_Itinerary;
	}

	public WebElement getChange_Password() {
		return change_Password;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getRoom_Nos() {
		return room_Nos;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}

	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}

	public WebElement getReset() {
		return reset;
	}

	public WebElement getLp_Website_Btn() {
		return lp_Website_Btn;
	}

	public WebElement getAbout_Adactin() {
		return about_Adactin;
	}

}
