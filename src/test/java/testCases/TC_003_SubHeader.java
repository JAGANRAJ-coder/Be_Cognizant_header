package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_003_SubHeader extends BaseClass{

	@Test
	public void validateAuthorInfoDisplay()
	{
		System.out.println("\n========= TC_003_SubHeaderElements =========");
		hp=new HomePage(driver);
		try {
			hp.printingSubmenu();
			
		}
		catch(Exception e)
		{
			System.out.println("test failed");
			System.out.println("An exception occured:"+ e.getMessage());
		}
	}
}
