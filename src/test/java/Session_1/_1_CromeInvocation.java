package Session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_CromeInvocation
{
    public static void main(String[] args) 
	{
    	//Top casting
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/ ");
		
		String TitelOfApplication = driver.getTitle();
		System.out.println("The Title of Application is:-"+ TitelOfApplication);
		
		String ExpectedTitleOfApp = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			
			
		if(ExpectedTitleOfApp.equals(TitelOfApplication))		
		{
			System.out.println("The Expected and actual title is matching");
		}
		else
		{
			System.out.println("The Two titles are not matching");
		}
		driver.close();
		
		
	}

}
