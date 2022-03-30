package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContains1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(@class,'ico-register')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'gender-female')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("h");
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@class,' single-line password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[contains(@name,'ConfirmPassword')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[contains(@id,'register')]")).click();
	}

}
