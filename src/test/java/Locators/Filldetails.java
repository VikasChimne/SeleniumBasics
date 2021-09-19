package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filldetails {

	public static void main(String[] args) throws InterruptedException {
		String url = "http://demo.automationtesting.in/Register.html";
		WebDriver driver;
		   driver = new ChromeDriver();
	    // driver = new FirefoxDriver();
		
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get(url);

Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vicky");
 System.out.println("Step 01 ==>  First Name is : Vicky");
 
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Patil");
System.out.println("Step 02 ==>  Last Name is : Patil");
		
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("ParijatNagar,Aurangabad,MH,INDIA");	
System.out.println("Step 03 ==>  Address : ParijatNagar,Aurangabad,MH,INDIA");	
	
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("vickypatil249@gmail.com");
System.out.println("Step 04 ==>  Email Adress : vickypatil249@gmail.com");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8149184148");
System.out.println("Step 05 ==>  Phone No : 8149184148");
		
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Male']")).click();	
System.out.println("Step 06 ==>  Select option : Male");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Cricket']")).click();
System.out.println("Step 07 ==>  Select option : Cricket");

Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id='msdd']")).click();
System.out.println("Step 08 ==>  Click on Language Box");
		
Thread.sleep(2000);
driver.findElement(By.xpath("//ul/li/a[text()='English']")).click();
System.out.println("Step 09 ==>  select Languages option : English");

Thread.sleep(2000);
driver.findElement(By.xpath("//option[contains(text(),'CSS')]")).click();
System.out.println("Step 10 ==>  select Skills option : CSS");

Thread.sleep(2000);
driver.findElement(By.xpath("//option[@value='Germany']")).click();
System.out.println("Step 11 ==>  Select Country option : Germany");
		
Thread.sleep(2000);
driver.findElement(By.xpath("//span[@role='combobox']")).click();
System.out.println("Step 12 ==>  Click on Select Country Box");
		
Thread.sleep(1000);
driver.findElement(By.xpath("//li[text()='India']")).click();
System.out.println("Step 13 ==>  Select Country option : India");
		
Thread.sleep(1000);
driver.findElement(By.id("yearbox")).click();
System.out.println("Step 14 ==>  Click on year Box");
		
Thread.sleep(1000);
driver.findElement(By.xpath("//div/select/option[@value='1993']")).click();
System.out.println("Step 15 ==>  Select Year Of Birth : 1993");
		
Thread.sleep(1000);
driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
System.out.println("Step 16 ==>  Click on Month Box");
		
Thread.sleep(1000);
driver.findElement(By.xpath("//div/select/option[@value='September']")).click();
System.out.println("Step 17 ==>  Select Month Of Birth : September");
				
Thread.sleep(1000);
driver.findElement(By.id("daybox")).click();
System.out.println("Step 18 ==>  Click on Day Box");
		
Thread.sleep(1000);
driver.findElement(By.xpath("//div/select/option[@value='24']")).click();
System.out.println("Step 19 ==>  Select Day Of Birth : 24");
		
Thread.sleep(1000);		
driver.findElement(By.id("firstpassword")).sendKeys("abcde");
System.out.println("Step 20 ==>  First password : abcde");
		
Thread.sleep(1000);
driver.findElement(By.id("secondpassword")).sendKeys("abcde");
System.out.println("Step 21 ==>  Second password : abcde");
	
Thread.sleep(5000);
driver.quit();
	}

}

