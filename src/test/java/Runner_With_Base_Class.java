
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseWithRunner.Base_Class;
import com.objmanager.Page_Object_Manager;
import com.pom.testing.Address_Page;
import com.pom.testing.Booking_Page;
import com.pom.testing.Home_Page;
import com.pom.testing.Login_Page;

public class Runner_With_Base_Class extends Base_Class {

	public static WebDriver driver = browser_Config("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		maximize("maximize");

		get_Url("https://adactinhotelapp.com/index.php");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Home_Page
		send_Keys(manager.getHome_Page().getUsername(), "Karthi224");
		send_Keys(manager.getHome_Page().getPassword(), "1234567");
		click_On_Element(manager.getHome_Page().getLogin_Btn());

//Login_Page
		select_Index(manager.getLogin_Page().getLocation(), 3);
		select_Text(manager.getLogin_Page().getHotels(), "Hotel Sunshine");
		select_Text(manager.getLogin_Page().getRoom_Type(), "Deluxe");
		select_Index(manager.getLogin_Page().getRoom_Nos(), 2);
		select_Index(manager.getLogin_Page().getAdult_Room(), 3);
		select_Index(manager.getLogin_Page().getChild_Room(), 1);
		click_On_Element(manager.getLogin_Page().getSearch_Btn());

//Booking_Page
		click_On_Element(manager.getBooking_Page().getRadio_Btn_Bp());
		click_On_Element(manager.getBooking_Page().getContinue_Btn_Bp());

//Address_Page		
		send_Keys(manager.getAddress_Page().getFirst_Name_Ap(), "Karthick");
		send_Keys(manager.getAddress_Page().getLast_Name_Ap(), "S");
		send_Keys(manager.getAddress_Page().getBilling_Address_Ap(), "Beach road,Tamilnadu,India");
		send_Keys(manager.getAddress_Page().getCc_Num_Ap(), "1234567890123456");

		select_Index(manager.getAddress_Page().getCc_Type_Ap(), 2);
		select_Index(manager.getAddress_Page().getExpiry_Month_Ap(), 3);
		select_Index(manager.getAddress_Page().getExpiry_Year_Ap(), 2);

		send_Keys(manager.getAddress_Page().getCvv_Ap(), "123");
		click_On_Element(manager.getAddress_Page().getBook_Now_Btn_Ap());
		click_On_Element(manager.getAddress_Page().getBooked_Itinerary_Ap());

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("F:\\Maven\\Maven_Project\\snaps\\Adactin2.png");
		FileUtils.copyFile(screenshotAs, file);

		click_On_Element(manager.getAddress_Page().getLogout_Btn_Ap());

	}

}
