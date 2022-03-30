package findElements;
//Write a script to print the names of the html tag "td" using findElemets
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fassignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
	   List<WebElement>	objlinks =driver.findElements(By.tagName("td"));   
	   for(WebElement objcurrentlinks :objlinks)
	   {
		 String  Strlinktext=objcurrentlinks.getText();
		 System.out.println(Strlinktext);
	   }

	}

}
