package assignments;
//was to launch the browser to demo web shop ,enter the valid email id in a new sletter text box
//click on subscribe using x path
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewsletterEmail']")).sendKeys("demo123@gmail.com");;
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
	}

}
