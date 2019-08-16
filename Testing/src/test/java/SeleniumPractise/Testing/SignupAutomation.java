package SeleniumPractise.Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupAutomation {

	// TODO Auto-generated method stub
	    ChromeDriver driver;
		@Before
		public void intializeBrowser()
		{
		SignupAutomation sa=new SignupAutomation();	//Object creation
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		}
		
		@Test
		public void filldetails()
		{
	    SignupAutomation sa=new SignupAutomation();
        driver.findElement(By.id("u_0_l")).sendKeys("Vikram");  //To send the first name in the field.
	    driver.findElement(By.id("u_0_n")).sendKeys("patil");//To send the Last name in the field   
	    driver.findElement(By.name("reg_email__")).sendKeys("patilvikram123@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("patilvikram123@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Pass@1234");
	    WebElement ele1=driver.findElement(By.id("day"));
	    WebElement ele2=driver.findElement(By.id("month"));
	    WebElement ele3=driver.findElement(By.id("year"));
	    sa.ddSelection(ele1,"12");
	    sa.ddSelection(ele2,"May");
	    sa.ddSelection(ele3,"1990");
	    driver.findElement(By.cssSelector("input#u_0_6")).click(); //clicking the male Radio button
	    driver.findElement(By.id("u_0_15")).click();
		}
		
	  @After
	    public void closeBrowser()
	  {
		  driver.close();
	  }
	  
	
	public void ddSelection(WebElement ele,String visibletext)

	{
		Select sl=new Select(ele);
	    sl.selectByVisibleText(visibletext);
	    
	}
	
	}