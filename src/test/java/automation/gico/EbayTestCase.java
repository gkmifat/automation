package automation.gico;

import org.testng.annotations.Test;

import automation.gico.config.Util;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.util.List;

public class EbayTestCase {
  static WebDriver driver = null;
  @Test
  public void testCase1() {
	  try {
		  driver.get("https://www.ebay.com/");
		  driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		  driver.findElement(By.id("gh-btn")).click();
		  String resultFound = driver.findElement(By.cssSelector(".srp-controls__count-heading > span:nth-child(1)")).getText();
		  System.out.println("Total Result found : "+resultFound);
		  List<WebElement> relatedLists = driver.findElements(By.xpath("//div[@class='srp-related-searches']/span[2]"));
		  WebElement relLink=null;
		  for(int i=0;i<relatedLists.size();i++) {
			  relLink = relatedLists.get(i);
			  System.out.println("Related Links: "+relLink.getText());
		  }
		  Thread.sleep(2000);
		  
	  }catch(Exception exp) {
		  exp.printStackTrace();
	  }
  }


	public static WebDriver getFirefoxBrowser() {
		System.out.println("TestNG is starting for test case1...");
	
    	System.setProperty("webdriver.gecko.driver",Util.FIREFOX_DRIVER_PATH );  
        
        // Initialize Gecko Driver using Desired Capabilities Class  
    	WebDriver driver= new FirefoxDriver();  
        
       // Launch Website  
    	return driver;
    	
	}
	
	public static WebDriver getChromeBrowser() {
		System.out.println("TestNG is starting for test case1...");
		System.setProperty("webdriver.chrome.driver", Util.CHROME_DRIVER_PATH);       

		ChromeOptions opt = new ChromeOptions();
    	opt.setBinary(Util.CHROME_PATH);  //chrome binary location specified here
    	opt.addArguments("start-maximized"); //open Browser in maximized mode
    	WebDriver driver = new ChromeDriver(opt);
       // Launch Website  
    	return driver;
 
	}
	
	public static void closeBrowser() {
		System.out.println("closing browser");
		driver.quit();
		
	}
	
	@BeforeTest
	public void launchBrowser() {
		if(Util.BROWSER.equals(Util.FIREFOX)) {
			this.driver = getFirefoxBrowser();
		}else{
			this.driver = getChromeBrowser();
		}
	}
	
	@AfterTest
	public void closeSession() {
		System.out.println("TestNg finished");
		closeBrowser();
	}
}
