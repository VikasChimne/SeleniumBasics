package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chroma.driver","C:\\Drivers\\chromdriver_win32\\chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		
		
		//id & name locators
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("T-shirts");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
		//linkText & partial linkText
		//driver.findElement(By.linkText("SIDDHANAM Women's Pure Cotton Printed T-shirt ")).click();
		//driver.findElement(By.partialLinkText("Women's Pure Cotton Printed Top ")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
