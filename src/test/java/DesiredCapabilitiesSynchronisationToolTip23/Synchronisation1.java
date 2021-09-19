package DesiredCapabilitiesSynchronisationToolTip23;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation1 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Before
	public void setup()
	{
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/");
     wait = new WebDriverWait(driver,15);
	}
	
	@Test
	public void synchro()
	{
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("nokia");
		
		List<WebElement>searchList = driver.findElements(By.xpath("//div[@id='suggestions-template']/div[@id='suggestions']/div[@data-alias='aps']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(searchList));
		
		for (int i =0; i < searchList.size(); i++)
		{
			System.out.println(searchList.get(i).getText());
		}
		
	}
	@After
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
		
		
		
		
		
		
		
		
		
}
     
     
     
     
     
     
     
     

