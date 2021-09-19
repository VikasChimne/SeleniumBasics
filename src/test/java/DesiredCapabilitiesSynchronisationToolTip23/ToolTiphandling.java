package DesiredCapabilitiesSynchronisationToolTip23;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTiphandling {

	WebDriver driver;
	
	@Before
	public void desired()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips/");
	}
	
	@Test
	public void tooltip() throws InterruptedException
	
	{
		WebElement hoverButton = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverButton).build().perform();
		
		Thread.sleep(3000);
		
		WebElement suggestiontextElement = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
		String suggestionText = suggestiontextElement.getText();
		System.out.println("Suggestion Box text is : " + suggestionText);
		Assert.assertEquals("You hovered over the Button", suggestionText);
		
		
	}
	
	@After
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
}
