package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMPageObject {
	WebDriver driver  = null;
	
	//Login page
	By username_field = By.name("username");
	By password_field = By.name("password");
	By login_button = By.xpath("//button[@type='submit']");
	By admin_field = By.xpath("//a/span");
	By leave_field = By.linkText("Leave");
	By PIM_field = By.linkText("PIM");
	By time_field = By.linkText("Time");
	
	//constructor
	public HRMPageObject(WebDriver driver){
		this.driver=driver;
	}
	public void setTextInUsername(String user_text ) {
		driver.findElement(username_field).sendKeys(user_text);		
	}
	public void setTextInPassword( String pwd_text ) {

		driver.findElement(password_field).sendKeys(pwd_text);		
	}	
	public void login_button() {
	driver.findElement(login_button).click();
	}
	public void admin_element() {
		driver.findElement(admin_field).click();
	}
	public void leave_element() {
		driver.findElement(leave_field).click();
	}
	public void PIM_element() {
		driver.findElement(PIM_field).click();
	}
	public void time_element() {
		driver.findElement(time_field);
	}
	
	
}
