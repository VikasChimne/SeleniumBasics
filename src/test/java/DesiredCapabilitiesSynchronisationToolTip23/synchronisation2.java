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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronisation2 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	Actions act;
	
	@Before
	public void setup()
	{
	  driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in/");
	  
	  wait = new WebDriverWait(driver, 15);
	  act = new Actions(driver);
	}
	
	@Test
	public void synchro2()
	{
		WebElement helloSignInButton = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		act.moveToElement(helloSignInButton).build().perform();
		
		List<WebElement> yourAccountOptions = driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a/span"));
		wait.until(ExpectedConditions.visibilityOfAllElements(yourAccountOptions));
		System.out.println("After mouse hover on Hello, \"Sign In\" Your Account List contains total of Options in number as - " + helloSignInButton.getSize());
		System.out.println("And the List options available as below - ");
		for (int i = 0; i < yourAccountOptions.size() ; i++)
		{
			System.out.println((i+1) + " " + yourAccountOptions.get(i).getText());
		}
	}
	@After
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
