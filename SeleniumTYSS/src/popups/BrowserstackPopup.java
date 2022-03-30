package popups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserstackPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("adminm");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("admimn12345@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("admin12");
		Actions action=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//input[@id='user_submit']"));
		action.moveToElement(click).click().perform();
		Thread.sleep(2000);
		
		
	}

}
