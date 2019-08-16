package SeleniumPractise.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripDD {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		Actions ac=new Actions(driver);
		for(int i=0;i<=3;i++)
		{
		ac.sendKeys(Keys.ARROW_DOWN).perform();
	    }
		ac.sendKeys(Keys.ENTER).build().perform();
		System.out.println("From City Selected");
	}
}
