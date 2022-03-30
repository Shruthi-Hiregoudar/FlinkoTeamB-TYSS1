package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlerGuruPopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	WebElement	webeleemnt=driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	
	Actions action=new Actions(driver);
	action.doubleClick(webeleemnt).perform();
	
	Thread.sleep(2000);
	
	Alert alt=driver.switchTo().alert();
	alt.accept();
		

	}

}
