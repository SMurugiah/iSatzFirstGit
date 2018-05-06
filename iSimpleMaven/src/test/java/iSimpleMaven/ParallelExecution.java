package iSimpleMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelExecution {


		@Test
		public void setUp()
		{       
			System.out.println("Parallel Execution:--> SetUP");
	                // This will write the log in HTML and on console as well 
			Reporter.log("Test1 is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
		}
		
		@Test
		public void loginApplication()
		{
			System.out.println("Parallel Execution:--> LogIn Application");
			Reporter.log("Test2 is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
		}
		
		@Test
		public void logoutApplication()
		{
			System.out.println("Parallel Execution:--> LogOut Application");
		 	Reporter.log("Test3 is executed via Thread and Thread Id is "+Thread.currentThread().getId(), true);
		}
		
	

	
}
