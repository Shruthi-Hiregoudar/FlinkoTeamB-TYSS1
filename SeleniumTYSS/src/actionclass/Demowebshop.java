package actionclass;
//Logon to Demoshop website and mouse hover “Electronics” and select any submenu items


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demowebshop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		action.moveToElement(men).build().perform();
		
		WebElement shirts = driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"));
		action.moveToElement(shirts).click().perform();
		  
		
	}

}
