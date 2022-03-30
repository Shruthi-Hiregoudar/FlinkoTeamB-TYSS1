package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fccebook {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("demo1234@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("demo1234@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("demo123");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}
