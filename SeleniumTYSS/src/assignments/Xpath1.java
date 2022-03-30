package assignments;
//was to launch browser of demo web shop ,click on apparel and shoes .click on add to cart
//of first product,click on add to cart again and click on shopping cart ,click on check box
//click on checkout
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-5']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
	}

}
