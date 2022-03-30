package framess;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class F1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();;
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@name='s'])[1]")).sendKeys("books");
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		
		
		Actions action = new Actions(driver);
		WebElement all = driver.findElement(By.xpath("//span[@id='current_filter']"));
		action.moveToElement(all).build().perform();
		
		WebElement automation = driver.findElement(By.xpath("//div[text()='Automation']"));
		action.moveToElement(automation).click().perform();
		
		

	}

}
