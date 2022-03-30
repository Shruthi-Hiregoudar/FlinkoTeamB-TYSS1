package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertGuru99Popup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("admin12");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
		Alert alt= driver.switchTo().alert();
		alt.accept();
		Alert alt2 =driver.switchTo().alert();
		alt2.accept();
		driver.close();
	}

}
