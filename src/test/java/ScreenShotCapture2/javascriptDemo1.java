package ScreenShotCapture2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ScreenShotCaptureNJavaScriptUtils1.JavaScriptUtil;
import net.bytebuddy.utility.JavaType;


public class javascriptDemo1 {

	WebDriver driver;
	WebDriverWait wait;
	JavaScriptUtil javaScriptUtil;
	String URL = "https://www.amazon.in/";
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		wait = new WebDriverWait(driver,15);
		javaScriptUtil = new JavaScriptUtil(driver);
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		//System.out.println(System.getProperty("user.dir"));
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		// Drawing border around the element
		javaScriptUtil.drawBorder(searchbox);
		
		//flashing the Element
		javaScriptUtil.flash(searchbox);
		
		searchbox.sendKeys("T-Shirts");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		
		//Cliking the element by using javascript
		javaScriptUtil.clickElementByJS(searchButton);
		
		//Fetching the page title by javascript
		String pageTitle = javaScriptUtil.getTitleByJS();
		System.out.println("Current Page Title is : " + pageTitle);
		
		Thread.sleep(3000);
		
		//Genrating alert by Javascript
		javaScriptUtil.generateAlert( "Current Page Title is : Amazon.in : T-Shirts");
		
		Thread.sleep(3000);
		
		//Handling Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		wait.until(ExpectedConditions.titleContains("T-Shirts"));
		
		WebElement javatpointlink = driver.findElement(By.xpath("//div[@class='a-section a-spacing-mini']//a/span/span[2]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(javatpointlink));
		
		javatpointlink.click();
		
	}
	@After
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
	
}
