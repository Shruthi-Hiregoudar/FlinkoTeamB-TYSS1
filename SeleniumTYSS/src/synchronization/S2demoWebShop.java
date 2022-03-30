package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class S2demoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	   	 WebDriver driver=new ChromeDriver();
	   	 driver.manage().window().maximize();
	   	 driver.get("http://demowebshop.tricentis.com/login");
	   	 
	   	WebDriverWait wait = new WebDriverWait(driver, 40);
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']")));
	   	
	   	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin123@gmail.com");
	   	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin123");
	   	
	   	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button-1 login-button']")));
	   	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}

}
