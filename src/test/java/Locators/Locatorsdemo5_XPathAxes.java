package Locators;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo5_XPathAxes {

	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
         driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
      
      //self -Select the current node
     String text=driver.findElement(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/self::a	")).getText();
      System.out.println(text);//Indiabulls Real Esta
      
     //parent -Select the parent of the current node(alwys one)
    text=driver.findElement(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/parent::td")).getText();
     System.out.println(text);//Indiabulls Real Esta
     
      //child  -Selects all children of the current node(one or many)
     List<WebElement>childs=driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr/child::td"));
      System.out.println("number of Child element:"+childs.size());
      
      //Ancestor  -Selects all ancestors (parent,grandparent,etc)
      text=driver.findElement(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr")).getText();
      System.out.println(text);
      
      //Descendant -Selects all descendants(children,grandchildren,etc) of the current node
      List<WebElement>descendants=driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr/descendant::*"));
      System.out.println("Number of descendant nodes:"+descendants.size());
      
      //Following-Selects everything in the document after the closing tag of the current node
     List<WebElement>followingnodes=driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr/following::tr"));
      System.out.println("Number of following nodes:"+followingnodes.size());
      
      //Following-sibling:selects all siblings after the current node
     List<WebElement>followingsiblings =driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr/following-sibling::tr"));
     System.out.println("Number of following Siblings:"+followingsiblings.size()); 
      
     //Preceding-Selects all nodes that appear before the current node in the document
     List<WebElement>precedings =driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr/preceding::tr"));
     System.out.println("number of preceding nodes:"+precedings.size());
     
     //preceding-sibling-- Selects all the siblings before the current node
     List<WebElement>precedingsiblings =driver.findElements(By.xpath("//a[contains(text(),'Indiabulls Real Esta')]/ancestor::tr/preceding-sibling::tr"));
     System.out.println("Number of preceding Siblings:"+precedingsiblings.size()); 
   
      driver.quit();
      
      
      
	}

}
