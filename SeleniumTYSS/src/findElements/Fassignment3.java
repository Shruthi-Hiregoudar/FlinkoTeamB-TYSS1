package findElements;
//write the script to take a count of language radio buttons present in the Amazon page below is the website.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fassignment3 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/gp/customer-preferences/select-language");
			List<WebElement> objlinks=driver.findElements(By.xpath("//i[@class='a-icon a-icon-radio']"));
			int count=0;
			for(int i=0;i<objlinks.size();i++)
			  {
				  count++;
			  }
			System.out.println(count);
	}

}
