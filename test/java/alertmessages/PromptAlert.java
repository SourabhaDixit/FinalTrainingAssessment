

package alertmessages;
//Code for Prompt Alert

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Sourabha\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");//navigate to page
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.linkText("")).click();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();//find the element to prompt alert
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();//find the element to get alert
		Alert prompt=driver.switchTo().alert();
		System.out.println(prompt.getText());
		prompt.sendKeys("Automation Testing user");//send the data
		prompt.accept();//click on OK
		//prompt.dismiss();
		
	}

}