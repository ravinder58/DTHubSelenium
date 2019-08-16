package SeleniumPractise.Testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModifierKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Searchbtn=driver.findElement(By.cssSelector("label#loginbutton"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(Searchbtn).keyUp(Keys.CONTROL).build().perform();//Control keys are also pressed and click key is also pressed.
		
		System.out.println("Current Url is "+driver.getCurrentUrl());
		
		 String current_url=driver.getWindowHandle(); //Return Type is String
		 Set <String> all=driver.getWindowHandles();   //Return Type is Set of String
		 System.out.println("Total windows are "+all.size());
		 for(String s:all)
		 {
			 driver.switchTo().window(s);
			 
		 }
		 
		 System.out.println("After switcing Url "+driver.getCurrentUrl());
		 driver.switchTo().window(current_url);
		 System.out.println("After again switching Url value is "+driver.getCurrentUrl());
		 
	}

}
