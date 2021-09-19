package DropDownAndMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkpagetitle {

	public static void main(String[] args) {
		WebDriver driver;
		driver =new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		
		String Giventitle ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String Currenttitle =driver.getTitle();
		System.out.println("Fetching current title :" + Currenttitle);
		
		
		if (Giventitle.equals(Currenttitle)) 
		{ 
			System.out.println("Title is matched successfully");
		}
		else 
		{
			System.out.println("Title is not matched");
		}
		driver.quit();
		
		
	}
}

