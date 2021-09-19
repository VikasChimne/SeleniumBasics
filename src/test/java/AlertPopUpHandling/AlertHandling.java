package AlertPopUpHandling;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertHandling
{
	
	WebDriver driver;//Instance variable

	@Before
   public void Test()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://testautomationpractice.blogspot.com/");
}

  @Test
  public void dropDown() throws InterruptedException
{
	WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
	alertButton.click();
	
	Alert alert = driver.switchTo().alert();
	
	Thread.sleep(2000);
	System.out.println("Text of alert is : " + alert.getText());
	
	
	Assert.assertEquals("Alert text is not matching","Press a button!", alert.getText());
	
	alert.accept();
}
  @After
  public void closewindow() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  } 
	  
  }

  
  
  
  
  
