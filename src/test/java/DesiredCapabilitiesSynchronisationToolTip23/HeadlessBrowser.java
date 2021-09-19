package DesiredCapabilitiesSynchronisationToolTip23;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		//options.addArguments("--incognito");
		options.addArguments("--disable-infobars");
		//options.addArguments("windo-size=1920,1080");
		//options.addArguments("window-size=800,600");
		options.addArguments("--ignore-certificate-errors");
		//options.addArguments("--disable-extension");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void Headless()
	{
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("Note 10 pro");
		WebElement searchbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.sendKeys(Keys.ENTER);
		
		System.out.println("After search the new Page Title is : " + driver.getTitle());
		
		WebElement firstlink = driver.findElement(By.xpath("//div[@class='a-section a-spacing-mini']//span[@class='a-truncate-cut']"));
		firstlink.click();
	}
	
	@After
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	

}
