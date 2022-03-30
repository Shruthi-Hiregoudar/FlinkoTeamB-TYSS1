package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class s11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shruthi/Downloads/dropDown%20(1).html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='m1']"));
		
		Select fruit = new Select(dropdown);
		fruit.selectByValue("6");
		Thread.sleep(3000);
		
		fruit.selectByIndex(2);
	    Thread.sleep(3000);
	   
	    fruit.selectByVisibleText("Orange");
	    Thread.sleep(3000);
		
	    
	    fruit.deselectByVisibleText("Orange");
	    Thread.sleep(3000);
	    
	    fruit.deselectByIndex(2);
	    Thread.sleep(3000);
	    
	    fruit.deselectByValue("6");
	    Thread.sleep(3000);
	    driver.close();


		

	}

}
