package selectclass;
//3. Log on to demo web shop site click on books and select a value in view as by using select by value
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		 WebElement date = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 Select dropdown = new Select(date);
		 dropdown.selectByValue("http://demowebshop.tricentis.com/books?orderby=11");
		 
	}

}
