package com.baseWithRunner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static void click_On_Element(WebElement element) {
		element.click();

	}

	public static void clear_Element(WebElement element) {
		element.clear();

	}

	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static String get_Text(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String get_Attribute_Name(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public static boolean is_Enabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean is_Displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean is_Selected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}

	public static void sleep(long milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

//SELECT
	public static void select_Index(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void select_Value(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void select_Text(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static List<WebElement> get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static void right_click(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
		a.moveToElement(element).build().perform();
	}

	public static void down_and_enter() throws AWTException {
		Robot b = new Robot();

		b.keyPress(KeyEvent.VK_DOWN);
		b.keyPress(KeyEvent.VK_DOWN);

		b.keyPress(KeyEvent.VK_ENTER);
		b.keyPress(KeyEvent.VK_ENTER);

	}

// WEBDRIVER

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void get_Url(String url) {
		driver.get(url);
	}

	public static String get_Title() {
		String title = driver.getTitle();
		return title;
	}

	public static String get_Currenturl() {
		String currentUrl = driver.getCurrentUrl();

		return currentUrl;
	}

	public static void maximize(String commands) {
		if (commands.equalsIgnoreCase("maximize")) {
			driver.manage().window().maximize();
		} else if (commands.equalsIgnoreCase("minimize")) {
			driver.manage().window().minimize();
		}
	}

	public static String get_Window_Handle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public static Set<String> get_Window_Handles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

//NAVIGATION KEYS

	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}

	public static void navigation_Commands(String commands) {
		if (commands.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		} else if (commands.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		} else if (commands.equalsIgnoreCase("back")) {
			driver.navigate().back();
		}

	}
//BROWSER LAUNCH

	public static WebDriver browser_Config(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Maven\\Maven_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;

	}

//TAKES SCREENSHOT	

//	public static void takes_Screenshot(File screenshot, File pathname) throws IOException {
	//	TakesScreenshot ts = (TakesScreenshot) driver;
		//File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		//File d = new File("F:\\Maven\\Maven_Project\\snaps.png");
		//FileUtils.copyFile(screenshotAs, d);

	//}

}
