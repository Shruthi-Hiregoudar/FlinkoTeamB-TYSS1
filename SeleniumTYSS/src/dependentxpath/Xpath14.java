package dependentxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(text(),'Build your own ')]/../../..//input[@type='button']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
