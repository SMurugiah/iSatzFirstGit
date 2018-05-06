package iSimpleMaven;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class iAAFirstTestNG {
    public WebDriver driver;		

    @BeforeTest
	public void beforeTest() {	
    		System.out.println("Before Test");
    			System.out.println("Initializing Browser");
        System.setProperty("webdriver.gecko.driver", ".\\seleniumDrivers\\geckodriver.exe");
       driver = new FirefoxDriver();
   			System.out.println("Browser Wait");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
		@Test (priority = 2)
		public void SampleTestScript1 () {
			System.out.println("Test Case Number 1");
			Assert.assertEquals("TestCase1", "TestCase1");
		}
		
		@Test (priority = 3)
		public void SampleTestScript3 () {
			System.out.println("Test Case Number 3");
			Assert.assertEquals("Google", "Google");
		}
		
		@Test (priority = 1)
		public void SampleTestScript5() {
			System.out.println("Test Case Number 5");
			Assert.assertEquals("TestCase5", "TestCase5");
		}

		@Test (priority = 0, invocationCount = 7, description = "This Test Executes 7 Times")
		public void SampleTestScript7() {
			System.out.println("Test Case Number 7");
			Assert.assertEquals("TestCase7", "TestCase7");
			System.out.println("Navigate to Google");
			driver.get("https://www.google.com");
		}
		
		@AfterTest
		public void afterTest() {
    		System.out.println("After Test");
			driver.quit();			
			System.out.println("Closing Browser");
		}
		

		@BeforeSuite
		public void beforeSuite() {
		System.out.println("Before Suite will always execute prior to all annotations or tests in the suite.");
		}

		@BeforeClass
		public void beforeClass() {
		System.out.println("Before Class will always execute prior to Before Method and Test Method ");
		}
		
		@BeforeMethod
		public void beforeMethod() {
		System.out.println(" Before Method will execute before every test method");
		}

		@AfterMethod
		public void afterMethod() {
		System.out.println("After Method will execute after every test method ");
		}

		@AfterClass
		public void afterClass() {
		System.out.println("After Class will always execute later to After Method and Test method");
		}

		@AfterSuite
		public void afterSuite() {
		System.out.println("After suite will always execute at last when all the annotations or test in the suite have run.");
		}


}
