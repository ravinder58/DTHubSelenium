package SeleniumPractise.Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbXpth {

	// TODO Auto-generated method stub
	    ChromeDriver driver;
		@Before
		public void intializeBrowser()
		{
          
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
		}
		
		@Test
		public void filldetails()
		{
	    FbXpth sa=new FbXpth();
         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manush");              //XPATH with TAG with Attribute
         driver.findElement(By.xpath("//*[@id='u_0_n']")).sendKeys("Sharma");                        //Dynamic tag with attribute
         driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_0_q']")).sendKeys("msarma@gmail.com"); //XPATH with the OR syntax
         driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("msarma@gmail.com");   //XPATH with the confirmation email.
         driver.findElement(By.xpath("//*[@*='u_0_x']")).sendKeys("Pass@1234");                     //XPATH with the dynamic attribute name
         WebElement day=driver.findElement(By.xpath("//select[contains(@name,'birthday_day')]"));
         WebElement month=driver.findElement(By.xpath("//select[contains(@id,'month')]"));   
         WebElement Year=driver.findElement(By.xpath("//select[contains(@id,'year')]"));
         sa.ddSelection(day,"15");
         sa.ddSelection(month,"Sept");
         sa.ddSelection(Year,"1996");
         driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
         driver.findElement(By.xpath("//button[text()='Sign Up']")).click();  //Clicking the sign up button.
         
		}
	
	  public void ddSelection(WebElement ele,String visibletext)

	 {
		Select sl=new Select(ele);
	    sl.selectByVisibleText(visibletext);
	    
	 }
	
	}