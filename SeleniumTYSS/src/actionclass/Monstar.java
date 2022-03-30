package actionclass;
import org.openqa.selenium.By;
//•Write a script to launch monster.com, mouse hover on Jobs Search-->Jobs By Skills and click on Java Jobs
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monstar {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement jobsearch = driver.findElement(By.xpath("//a[contains(text(),'Job search')]"));
		action.moveToElement(jobsearch).build().perform();
		
		WebElement jobyskill = driver.findElement(By.xpath("(//a[contains(text(),'Jobs by Skills')])[1]"));
		action.moveToElement(jobyskill).build().perform();
		
		WebElement javajobs = driver.findElement(By.xpath("(//a[contains(text(),'Java Jobs')])[1]"));
		action.moveToElement(javajobs).click().perform();

	}

}
