package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebPopUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window +  "+parentwindow);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("list of window ");
		
		for (String handle : windows)
		{
			System.out.println(handle);
			if(!handle.equals(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin123@gmail.com");
				Thread.sleep(2000);
			}
			
		}
		driver.switchTo().window(parentwindow);
		System.out.println("parent windwo ");
		System.out.println(parentwindow);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		
		
	}

}
