package com.objmanager;

import org.openqa.selenium.WebDriver;

import com.pom.testing.Address_Page;
import com.pom.testing.Booking_Page;
import com.pom.testing.Home_Page;
import com.pom.testing.Login_Page;

public class Page_Object_Manager {

	public WebDriver driver;

	private Home_Page hp;

	private Login_Page lp;

	private Booking_Page bp;

	private Address_Page ap;

	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
	}

	public Home_Page getHome_Page() {
		if (hp==null) {
			hp = new Home_Page(driver);
		}

		return hp;
	}

	public Login_Page getLogin_Page() {
		if (lp==null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}

	public Booking_Page getBooking_Page() {
		if (bp==null) {
			bp = new Booking_Page(driver);
		}
		return bp;
	}

	public Address_Page getAddress_Page() {
		if (ap==null) {
			ap = new Address_Page(driver);
		}
		return ap;
	}
}
