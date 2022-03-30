package findElements;

import java.util.List;

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
			driver.get("http://demowebshop.tricentis.com/");
			Thread.sleep(2000);
		   List<WebElement>	objlinks =driver.findElements(By.tagName("a"));
		   Thread.sleep(2000);
		   for(WebElement objcurrentlinks :objlinks)
		   {
			 String  Strlinktext=objcurrentlinks.getText();
			 System.out.println(Strlinktext);
		   }
		}


	

}
