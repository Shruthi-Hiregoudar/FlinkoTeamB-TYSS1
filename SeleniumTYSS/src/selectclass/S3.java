package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S3 {

	public static void main(String[] args) throws Exception {
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
		
		 WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
		 Select dropdown = new Select(date);
		 dropdown.selectByValue("18");
		 
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 Select dropdown1 = new Select(month);
	   	 dropdown1.selectByValue("4");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select dropdown2 = new Select(year);
		dropdown2.selectByValue("2018");
	}

}
