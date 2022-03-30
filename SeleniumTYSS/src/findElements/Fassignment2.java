package findElements;
//write the script to print the names of the link present in home page of amazon using findElements


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fassignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> objlinks=driver.findElements(By.tagName("a"));
		for(WebElement objcurrentlinks:objlinks)
		{
				
			String linktext = objcurrentlinks.getText();
			System.out.println(linktext);
		}

	}

}
