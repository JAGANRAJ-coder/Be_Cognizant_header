package testCases;

import org.testng.annotations.Test;

import pageObjects.EthicsPage;
import testBase.BaseClass;

public class TC_005_PageTitle extends BaseClass{

	@Test
	public void getNewsLetter() throws InterruptedException
	{
		System.out.println("\n========= TC_005_Ethics&Compliance_Title =========\n");
		ep=new EthicsPage(driver);
		try {
			
			ep.title();
			screenShot("T5");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("test failed");
			System.out.println("An exception occured:"+ e.getMessage());
		}
	}
}
