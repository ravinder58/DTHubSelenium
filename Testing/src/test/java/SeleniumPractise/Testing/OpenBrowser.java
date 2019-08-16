package SeleniumPractise.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://economictimes.indiatimes.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("ticker")).sendKeys("Car");  //To click on the menu icon dropdown.
	}

}
