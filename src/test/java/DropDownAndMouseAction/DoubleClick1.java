package DropDownAndMouseAction;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick1 {
	
	WebDriver driver;
	
	@Before
	public void charge()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	@Test
	public void dropdown() throws InterruptedException
	{
		WebElement copytext = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
	
	  Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(copytext).build().perform();
	}
	
	@After
	public void closewindow() throws InterruptedException 
	{
		Thread.sleep(2000); 
		driver.quit();
	}
	

}
