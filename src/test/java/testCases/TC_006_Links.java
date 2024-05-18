package testCases;

import org.testng.annotations.Test;

import pageObjects.EthicsPage;
import testBase.BaseClass;

public class TC_006_Links extends BaseClass{
	
	@Test
	public void checkingLinks()
	{
		System.out.println("\n========= TC_006_ResourcesLinks =========");
		System.out.println("Links Available are:");
		ep=new EthicsPage(driver);
		try {
			ep.links();
			}
			catch(Exception e)
			{
				System.out.println("test failed");
				System.out.println("An exception occured:"+ e.getMessage());
			}
	}
	
}
