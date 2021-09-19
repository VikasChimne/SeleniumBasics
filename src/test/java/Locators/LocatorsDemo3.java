package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chroma.driver","C:\\Drivers\\chromdriver_win32\\chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		
		Thread.sleep(2000);	
		//Tag & Id
   //driver.findElement(By.cssSelector("input#email")).sendKeys("David");
	driver.findElement(By.cssSelector("#email")).sendKeys("David");
	
   Thread.sleep(2000);	
       //Tag & Class
	//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("John");
	//driver.findElement(By.cssSelector(".inputtext")).sendKeys("John");
		
		//Tag & Attribute
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("Smith");	
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Smith");	
    
		
		//Tag,class & Attribute  
	//driver.findElement(By.cssSelector("input.inputtext[data-testId=royal_email]")).sendKeys("Smith");
	//driver.findElement(By.cssSelector("input.inputtext[data-testId=royal_pass]")).sendKeys("abc");		
		
		
		
	driver.close();

	}

}
