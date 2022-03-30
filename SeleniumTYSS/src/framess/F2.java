package framess;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Shruthi/Downloads/iframe.html");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='FR1']"));
		Thread.sleep(2000);
		driver.switchTo().frame(frame1);
		Thread.sleep(4000);
		
	
		
	}

}
