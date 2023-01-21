package com.pom.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class Final_Page {

	public WebDriver driver;

	@FindBy(xpath = "//a[.='Click here to login again']")
	private WebElement login_Again_Btn;

	@FindBy(xpath = "//a[.='Adactin.com']")
	private WebElement fp_Website_Btn;

	@FindBy(xpath = "//a[.='www.adactin.com']")
	private WebElement about_Adactin_Fp;

	public WebElement getlogin_Again_Btn() {
		return getlogin_Again_Btn();
	}

	public WebElement getfp_Website_Btn() {
		return getfp_Website_Btn();
	}

	public WebElement getabout_Adactin_Btn() {
		return getabout_Adactin_Btn();
	}

}
