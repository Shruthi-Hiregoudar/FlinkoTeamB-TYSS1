package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-female']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("demo");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("h");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("demo123@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("demo123");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("demo123");
		driver.findElement(By.cssSelector("input[id='register-button']")).click();
		
	}

}
