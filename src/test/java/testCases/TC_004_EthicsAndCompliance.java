package testCases;

import org.testng.annotations.Test;

import pageObjects.EthicsPage;
import testBase.BaseClass;

public class TC_004_EthicsAndCompliance extends BaseClass {

	@Test
	public void validateShareOption()
	{
		System.out.println("\n========= TC_004_EthicsAndCompliance  =========");
		ep=new EthicsPage(driver);
		try {
			ep.Ethics();
			screenShot("T4");
		}
		catch(Exception e)
		{
			System.out.println("test failed");
			System.out.println("An exception occured:"+ e.getMessage());
		}
	}
}
