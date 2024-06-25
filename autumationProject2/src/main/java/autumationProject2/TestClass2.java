package autumationProject2;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class TestClass2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		//siteNavigate
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		//Login
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		
		//Xpath
		
		
		//Relative Path for (Test.allTheThings() T-Shirt (Red)).
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='item_3_title_link']")).click();
		
		//Absolute path for (Add to Cart).
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/button")).click();

		//Relative Path for Shopping_cart_container.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		
		//Absolute path for Continue Shopping.
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[1]")).click();
	
    }									

}
