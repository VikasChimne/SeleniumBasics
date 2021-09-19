package DropDownAndMouseAction;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingBySelectClass {
	
	WebDriver driver;
	
	@Before
	public void dropdown()
	{
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	
	@Test
	public void dropdown1() throws InterruptedException
	{
		WebElement selectMenu = driver.findElement(By.xpath("//*[@id=\"speed\"]"));
		selectMenu.click();
		
		WebElement selectfile = driver.findElement(By.xpath("//*[@id=\"files\"]"));
		selectfile.click();
		
		WebElement selectNumber = driver.findElement(By.xpath("//*[@id=\"number\"]"));
		selectNumber.click();
		
		WebElement selectProduct = driver.findElement(By.xpath("//*[@id=\"products\"]"));
		selectProduct.click();
		
		WebElement selectAnimal = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
		selectAnimal.click();
		
		
		
		Select speed = new Select(selectMenu);
		speed.selectByVisibleText("Fast");
		
		Thread.sleep(2000);
		
		Select files = new Select(selectfile);
		files.selectByVisibleText("DOC file");
		
		Thread.sleep(2000);
		
		Select number = new Select(selectNumber);
		number.selectByVisibleText("5");
		
		Thread.sleep(2000);
		
		Select products = new Select(selectProduct);
		products.selectByVisibleText("Iphone");
		
		Thread.sleep(2000);
		
		Select animals = new Select(selectAnimal);
		animals.selectByVisibleText("Big Baby Cat");
		
	}
		@After
		public void closewindow() throws InterruptedException
		{
			Thread.sleep(2000);
			driver.quit();
		}
		
		
		
	

}
