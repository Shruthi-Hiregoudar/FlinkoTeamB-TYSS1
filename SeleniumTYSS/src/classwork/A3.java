package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Write a program to navigate to facebook and select your birthday in dropdown using index values.
public class A3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown =new Select(day);
		dropdown.selectByIndex(11);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown1 =new Select(month);
		dropdown1.selectByIndex(10);
	}
	

}
