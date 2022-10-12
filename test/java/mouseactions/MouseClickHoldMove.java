package mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickHoldMove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		WebElement boxA = driver.findElement(By.xpath("//li[@name='A']"));
		WebElement boxC = driver.findElement(By.xpath("//li[@name='C']"));
		Actions mouse_action = new Actions(driver);
		mouse_action.moveToElement(boxA);
		mouse_action.clickAndHold();
		mouse_action.moveToElement(boxC);
		mouse_action.build().perform();
		Thread.sleep(2000);
		//driver.close();
		System.out.println("Done");
					   

	}

}
