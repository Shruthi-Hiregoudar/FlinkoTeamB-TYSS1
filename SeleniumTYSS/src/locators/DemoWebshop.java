package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("input#gender-female")).click();
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("demo");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("h");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("demo123@gmail.com");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("demo123");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("demo123");
		driver.findElement(By.cssSelector("input.register-next-step-button")).click();
		driver.close();
		
	}

}
