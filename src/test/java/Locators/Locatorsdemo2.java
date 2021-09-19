package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chroma.driver","C:\\Drivers\\chromdriver_win32\\chromdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ ");
		driver.manage().window().maximize();
		
		//classname
		int sliders=driver.findElements(By.className("homeslider_container")).size();
		System.out.println(sliders);
		
		//TagName
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
