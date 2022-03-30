package selectclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//1.Log on to demo web shop site click on books and select a value in sort by using select by visible text.
public class S5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		 WebElement date = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 Select dropdown = new Select(date);
		 dropdown.selectByVisibleText("Name: Z to A");
		 
		
		
		
	}

}
