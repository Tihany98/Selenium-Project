package automationproject4;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation {

	WebDriver driver;
	
	@BeforeTest
	public void init() {
		
		//Initialization
		
				WebDriverManager.edgedriver().setup();
				 driver = new EdgeDriver();
			
			
			//siteNavigate
			
					driver.get("https://trytestingthis.netlify.app/");
     				driver.manage().window().maximize();	
	}
	
	
	@Test(priority=1)
	
	public void Nameform ()  {
		
		driver.findElement(By.id("fname")).sendKeys("Sayma Akter");
		driver.findElement(By.id("lname")).sendKeys("Tihany");
		
	}
	
	@Test(priority=2)
		
		public void RadiobuttonTest() {
		
		WebElement radiobutton = driver.findElement(By.id("female"));
		radiobutton.click();
		
		assert radiobutton.isSelected();
		System.out.println(radiobutton.isSelected());
   }

	@Test(priority=3)
	
	public void DropdownTest() {
		WebElement testdropdown = driver.findElement(By.id("option"));
		Select dropdown = new Select (testdropdown);
		
		//dropdown.selectByIndex(1);
		
	    //dropdown.selectByValue("2");
		
		dropdown.selectByVisibleText("Option 3");
	}
	

	@Test(priority=4)
	
	public void ChecklistTest() {
		WebElement testcheckbox1 = driver.findElement(By.name("option1"));
		WebElement testcheckbox2 = driver.findElement(By.name("option2"));
		testcheckbox1.click();
		testcheckbox2.click();
	}
		
//Submit
	@Test(priority=5)
	
	public void SubmitButtonTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
	}
	
   @Test(priority=6)	
   public void BrowserClose() {
	   if (driver != null) {
	   driver.close();
	   }
   }
}
