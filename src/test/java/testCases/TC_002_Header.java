package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_002_Header extends BaseClass{

	@Test
	public void checkTitle()
	{
		System.out.println("\n========= TC_002_HeaderElements =========");
		hp=new HomePage(driver);
		try 
		{
			System.out.println("Elements present in header are:");
			hp.headerElements();
			hp.getHe();
		}
		catch(Exception e)
		{
			System.out.println("test failed");
			System.out.println("An exception occured:"+ e.getMessage());
		}		
	}
}
