package iSimpleMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTestNgCommands {
	  public WebDriver driver;
	  
/*    @BeforeTest
	public void beforeTest() {	
    		System.out.println("Before Test");
    			System.out.println("Initializing Browser");
        System.setProperty("webdriver.gecko.driver", ".\\seleniumDrivers\\geckodriver.exe");
       driver = new FirefoxDriver();
   			System.out.println("Browser Wait");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
    
	@Test (priority = 1)
	public void SampleTestScript5() {
		System.out.println("Test Case Number 5");
		Assert.assertEquals("TestCase5", "TestCase7");
	}
  
  
	@Test (priority = 0, invocationCount = 2)
	public void SampleTestScript7 () {
		System.out.println("Test Case Number 7 This Runs 2 times 'Invocation Count'");
		Assert.assertEquals("TestCase7", "TestCase7");
/*		ReusableCall1();
		ReusableCall2();*/
	}

	public void ReusableCall1 () {
		System.out.println("Reusable Call 1");
	}
	public void ReusableCall2 () {
		System.out.println("Reusable Call 2");
	}
	
	@Test (priority = 2, dependsOnMethods = {"SampleTestScript5"})
	public void SampleDependsOnMethods() {
		System.out.println("Sample Depends On Methods");
		ReusableCall2();
	}
	
	@Test (priority = 3, dependsOnMethods = {"SampleTestScript7"})
	public void SampleDependsOnMethods2() {
		System.out.println("Sample Depends On Methods 2 Refering to Script 7");
		ReusableCall1();
		ReusableCall2();
	}
	
	
/*	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		driver.quit();			
		System.out.println("Closing Browser");
	}*/
  
}
