package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shruthi/Downloads/dropDown%20(1).html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='m1']"));	
		Select element = new Select(dropdown);
		System.out.println(element.isMultiple());
		driver.close();

	}

}
