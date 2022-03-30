package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
		action.moveToElement(men).build().perform();
		
		WebElement shirts = driver.findElement(By.xpath("//a[contains(text(),'Casual Shirts')]"));
		action.moveToElement(shirts).click().perform();
	}

}
