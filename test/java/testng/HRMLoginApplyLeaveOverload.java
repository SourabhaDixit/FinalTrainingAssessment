package testng;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HRMLoginApplyLeaveOverload {
	private static WebDriver driver = null;
	//Login 
  @Test(priority = 1)
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");//username
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");//password
		driver.findElement(By.xpath("//button[@type='submit']")).click();
 }
  //Apply leave
  @Test(priority = 2)
  public void hrmleave() {

		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys("2022-10-25");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  // Method overload for search function
  //data provider which provides one attribute
  @Test(dataProvider = "SearchByUsername", priority = 3 )
	 public void search(String username){
	  	System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/span")).click();//admin element 
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	
	 }	
//data provider which provides two attribute
  @Test(dataProvider = "SearchByUsernameEmpName" ,priority = 4 )
	public void search(String username, String empName) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);		
		driver.findElement(By.xpath("//div/input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a/span")).click();//admin element
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(username);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
		driver.findElement(By.xpath("//form//div//button[2]")).click();	
		
		 }
  @DataProvider(name = "SearchByUsernameEmpName")
  public static Object[][] dataProviderMethod()
  {
     return new Object[][] {{"Admin","Paul Collings"}};
  }
  @DataProvider(name = "SearchByUsername")
  public static Object[][] dataProviderMethod1()
  {
     return new Object[][] {{"Admin"}};
  }
  
}
