package automationproject1pac;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class TestClass1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialization
		
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
		
		//Title Check //Type 1
		
		
		String ExpectedTitle="Swag Labs";
		String ActualTitle=driver.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle)){
			System.out.println("Title match");
		}
		
		else {
			System.out.println("Title doesn't match");
		}
		
		
		//Title Check //Type 2
		
	       //Assert.assertEquals(ActualTitle, ExpectedTitle,"Conditions");
		
		
		// URL Check // Type 1
		
		String Mainurl="https://www.saucedemo.com/inventory.html";
		String CurrentUrl=driver.getCurrentUrl();

		if(CurrentUrl.equals(Mainurl)) {
			System.out.println("URL match");
		}
		else {
			System.out.println("URL doesn't match");
		}
		
		
		
		// URL Check // Type 1
		//Assert.assertEquals(CurrentUrl, MainUrl,"Conditions");
		
		
	}
	
	

	
	

}
