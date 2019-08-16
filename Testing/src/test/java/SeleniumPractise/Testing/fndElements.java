package SeleniumPractise.Testing;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fndElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROYAL COMPUTER\\Downloads\\Softwares\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	   List<WebElement> ls=driver.findElements(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
	   System.out.println("Total boxes "+ls.size());
	   int i=0;
	   Scanner sc=new Scanner(System.in);
	   for(WebElement e:ls)
	   {  
		   i=i+1;
	      
	   switch(i)
	   
	    {
	       case 1:  System.out.println("Enter Value of First name");
	                e.sendKeys(sc.nextLine());
	                break;
	    	   
	       case 2:  System.out.println("Enter Value of Last name");
                     e.sendKeys(sc.nextLine());
                     break;
                     
	       case 3:  System.out.println("Enter Value of email address");
                     e.sendKeys(sc.nextLine());
                     break;
                      
	       case 4:  System.out.println("Enter Value of	New Password");
                    e.sendKeys(sc.nextLine());
                    break;
	            
	  
	      }
		  
	   }
		
		 
	}

}
