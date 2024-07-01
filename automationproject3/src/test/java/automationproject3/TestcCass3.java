package automationproject3;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestcCass3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Initialization
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
	
	
	//siteNavigate
	
			driver.get("https://trytestingthis.netlify.app/");
			driver.manage().window().maximize();
	
	//Name form
	
			driver.findElement(By.id("fname")).sendKeys("Sayma Akter");
			driver.findElement(By.id("lname")).sendKeys("Tihany");
			
	//Radio Button		
			
			
			WebElement radiobutton = driver.findElement(By.id("female"));
			radiobutton.click();
			
			assert radiobutton.isSelected();
			System.out.println(radiobutton.isSelected());
			
			
	//Dropdown
			
			WebElement testdropdown = driver.findElement(By.id("option"));
			Select dropdown = new Select (testdropdown);
			
			//dropdown.selectByIndex(1);
			
		    //dropdown.selectByValue("2");
			
			dropdown.selectByVisibleText("Option 3");
			
	//Checklist	
			
			WebElement testcheckbox1 = driver.findElement(By.name("option1"));
			WebElement testcheckbox2 = driver.findElement(By.name("option2"));
			testcheckbox1.click();
			testcheckbox2.click();
			
			
	//Submit
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
			
			
			
	
	}
	
	
	
	

}
