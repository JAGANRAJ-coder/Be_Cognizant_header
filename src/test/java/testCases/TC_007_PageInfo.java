package testCases;

import org.testng.annotations.Test;

import pageObjects.EthicsPage;
import testBase.BaseClass;

public class TC_007_PageInfo extends BaseClass{

	@Test
	public void getTotalLikesAndViews() throws InterruptedException
	{
		System.out.println("\n========= TC_007_Ethics&Compliance_Info =========");
		ep=new EthicsPage(driver);
		try {
			System.out.println(ep.data.getText());
		}
		catch(Exception e)
		{
			System.out.println("test failed");
			System.out.println("An exception occured:"+ e.getMessage());
		}
	}
}
