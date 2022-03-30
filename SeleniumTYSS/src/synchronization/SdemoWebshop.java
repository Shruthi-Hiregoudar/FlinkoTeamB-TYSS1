package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdemoWebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   	 WebDriver driver=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.get("http://demowebshop.tricentis.com/login");
	   	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     driver.findElement(By.linkText("Register")).click();;
	     driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	     driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("demo");
	     driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("h");
	     driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("demo1234@gmail.com");
	     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("demo1234");
	     driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("demo1234");
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
