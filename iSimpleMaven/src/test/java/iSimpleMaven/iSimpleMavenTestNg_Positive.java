package iSimpleMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class iSimpleMavenTestNg_Positive {

	
	@Test (priority = 2)
	public void SampleTestScript1 () {
		System.out.println("Test Case Number 1");
	}

	@Test
	public void SampleTestScript2 () {
		System.out.println("Test Case Number 2");
		Assert.assertEquals("Google", "Google");
	}
	
	@Test (priority = 3)
	public void SampleTestScript3 () {
		System.out.println("Test Case Number 3");
	}
	
	@Test
	public void SampleTestScript4 () {
		System.out.println("Test Case Number 4");
	}
	
	
	@Test (priority = 1)
	public void SampleTestScript5() {
		System.out.println("Test Case Number 5");
	}
	
	@Test
	public void SampleTestScript6() {
		System.out.println("Test Case Number 6");
	}
	
	@Test (priority = 0)
	public void SampleTestScript7() {
		System.out.println("Test Case Number 7");
	}
	
	
	
}
