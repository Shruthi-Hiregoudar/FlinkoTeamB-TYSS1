package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("basvanagudi");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("karnataka");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("560030");
		 WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		 Select dropdown = new Select(country);
		 Thread.sleep(2000);
		 dropdown.selectByValue("FRANCE");
		 
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin123@gmail.com");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("admin123");
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 
		
	}

}
