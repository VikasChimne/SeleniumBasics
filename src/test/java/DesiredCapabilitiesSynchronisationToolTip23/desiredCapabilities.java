package DesiredCapabilitiesSynchronisationToolTip23;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCapabilities {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		DesiredCapabilities some =new DesiredCapabilities();
		some.setAcceptInsecureCerts(true);
		//some.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://cacert.com");
	}
	
	@Test
	public void dsiredCapability()
	{
		System.out.println(driver.getTitle());
	}
	
	@After
	public void closewindo() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
}
