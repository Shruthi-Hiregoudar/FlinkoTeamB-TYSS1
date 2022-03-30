package assignments;
//write a script to launch browser (ebay.com) in the search field add iPhone and click on search
//using css selector and add JavaScript executor to scrolling down.

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		WebDriver	driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("iphone");
		driver.findElement(By.cssSelector("input#gh-btn")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");

	}

}
