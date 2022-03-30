package selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		WebElement sortby = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select element = new Select(sortby);
		Thread.sleep(2000);
		List<WebElement> options = element.getOptions();
		for(int i=0;i<options.size();i++)
		{
			WebElement sortby1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
			Select element2 = new Select(sortby1);
			element2.selectByIndex(i);
		}

	}

}
