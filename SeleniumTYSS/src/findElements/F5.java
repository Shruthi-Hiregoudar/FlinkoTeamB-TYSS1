package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	   List<WebElement>	objlinks =driver.findElements(By.xpath("//input[@type='radio']"));   
	   int count=0;
	  for(int i=0;i<objlinks.size();i++)
	  {
		  count++;
	  }
	System.out.println(count);

	}

}
