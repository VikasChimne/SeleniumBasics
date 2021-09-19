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

public class DragAndDrop {
	
	
	WebDriver driver;
	
	@Before
	public void Practice1()
	{
		System.getProperty("WebDriver.Chrome.Driver", "C:\\Users\\user\\eclipse-workspace\\SeleniumBasics\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/droppable");
	}
	
	@Test
	public void dropDown() throws InterruptedException
	{
		WebElement element = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement  element1 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
		act.dragAndDrop(element, element1).build().perform();
	}
	@After
	public void closebrowser()
	{
		driver.quit();
	}

}
