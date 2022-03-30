package selectclass;
//Select the items in display listbox one by one using index 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//2. 1.Log on to demo web shop site click on books and select a value in  display by using select by index 
public class S7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		 WebElement date = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		 Select dropdown = new Select(date);
		 dropdown.selectByIndex(5);
		 

	}

}
