package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HRMPageObject;

public class HRMTestCases {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		hrmlogin();

	}
	//login test case
	public static void hrmlogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		HRMPageObject loginobj = new HRMPageObject(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginobj.setTextInUsername("Admin");
		loginobj.setTextInPassword("admin123");
		loginobj.login_button();
		loginobj.admin_element();
//		loginobj.search1("Admin");
//		loginobj.search2("Paul Collings");
//		loginobj.search_bt();
		loginobj.leave_element();
		loginobj.PIM_element();
		loginobj.time_element();
		System.out.println("Completed successfully");
	}

}
