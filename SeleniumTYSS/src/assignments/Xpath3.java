package assignments;
//launch browser of demo web shop- ,click on any oe radio button and click on vote using xpath
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com");
				driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
				driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
			

	}

}
