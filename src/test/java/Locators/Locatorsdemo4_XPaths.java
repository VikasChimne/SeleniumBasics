package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo4_XPaths {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromdriver_win32\\chromdriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//Absolute XPath
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")).click();
		
		//Relative XPath
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		
		//xpath with 'or'
		//driver.findElement(By.xpath("//[input[@id='twotabsearchtextbox' or @name='field-keywords']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//[input(@id='nav-search-submit-button' or @value='Go']")).click();
				
		//xpath with 'and'
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//input[@type='submit' and @class='nav-input nav-progressive-attribute']")).click();
		
		//xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@id,'twotabsearch')]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		
		//xpath with start-with()
	    driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtext')]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//input[starts-with(@type,'sub')]")).click();
		
		//xpath with text()
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//chained xpath
		//driver.findElement(By.xpath("//form[@id='searchbox']//*[@id='nav-search-submit-button']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//form[@id='searchbox']//input[@type='submit']")).click();
		
		driver.quit();
		
		}

}
