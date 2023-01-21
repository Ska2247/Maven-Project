package com.pom.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement login_Btn;

	@FindBy(xpath = "//a[.='Forgot Password?']")
	private WebElement forgot_Pass;

	@FindBy(xpath = "//a[.='New User Register Here']")
	private WebElement new_User;

	public Home_Page(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Btn() {
		return login_Btn;
	}

	public WebElement getForgot_Pass() {
		return forgot_Pass;
	}

	public WebElement getNew_User() {
		return new_User;
	}

}
