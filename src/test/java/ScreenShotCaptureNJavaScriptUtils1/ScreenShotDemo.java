package ScreenShotCaptureNJavaScriptUtils1;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShotDemo 
{
	WebDriver driver;
	WebDriverWait wait;
	String URL = "https://www.amazon.in/";
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		wait = new WebDriverWait(driver,20);
	}
	
	@Test
	public void test1()
	{
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("T-shirts");
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		searchbutton.click();
		
		wait.until(ExpectedConditions.titleContains("T-shirts"));
		
		screenshotCapture(driver, "T-shirtskeywordResult");
	}

	@After
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
      public static void screenshotCapture(WebDriver driver, String fileNameToBe)
      {
    	// 1. Take Screenshot & store into a File
  		    File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		    
  		// 2. Copy the captured screenshot into the desired destination path
  		    try 
  		 {
  				
  		   // 3. Transferring the screenshot by hard coded path (Must not be used) 
		//FileUtils.copyFile(file, new File("C:\\Users\\user\\eclipse-workspace\\SeleniumBasics\\src\\test\\java\\ScreenShotCapture\\jpg\\"+ fileNameToBe + ".jpg"));

		// 3. Transferring the screenshot without hard coding (advisable to be used like this)
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")
				+ "/src/test/java/ScreenShotCapture/jpg/" + fileNameToBe + System.currentTimeMillis()+".jpg"));
		
  		  } catch(IOException e)
  		   
  		    {
  			  e.printStackTrace();
  		    }
	
	}
	
	
	
	
      
	
	
	
	
	
	
	

}
