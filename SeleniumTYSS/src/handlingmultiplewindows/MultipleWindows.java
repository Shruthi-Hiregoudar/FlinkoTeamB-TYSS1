package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String Prentwindow = driver.getWindowHandle();
		System.out.println("preant window "+Prentwindow);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("list of windows present");
		for (String handles: windows)
		{	
			System.out.println(handles);
			if(!handles.equals(Prentwindow))
			{
			System.out.println("child window  "+handles);
			driver.switchTo().window(handles);
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("admin");
			Thread.sleep(2000);
			driver.close();
			}
			
		}
		driver.switchTo().window(Prentwindow);	
		System.out.println(Prentwindow);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("admin");
		
		
		
	}

}
