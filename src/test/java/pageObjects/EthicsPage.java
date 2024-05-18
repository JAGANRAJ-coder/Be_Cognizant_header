package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class EthicsPage extends BasePage {

	public EthicsPage(WebDriver driver) {
		super(driver);
	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//ul[@role='presentation']")
	WebElement ul;

	@FindBy(xpath = "//button[@name='Corporate Functions']")
	WebElement corpFun;

	@FindBy(xpath = "//span[text()='Legal & Corporate Administration']")
	WebElement lca;

	@FindBy(xpath = "//span[text()='Ethics and Compliance']")
	WebElement eac;

	@FindBy(xpath = "//div[@class='ms-List-page']")
	List<WebElement> listDivs;

	@FindBy(xpath = "//*[@id='8428faf2-1a3a-4f0a-9e89-19ee589a426d']")
	public WebElement data;
	@FindBy(xpath = "//*[ contains (text(), \"Resources / Links\" ) ][@id=\"CaptionElementView\"]")
	WebElement scroll;

	By cslca = By.xpath("//span[text()='Legal & Corporate Administration']");

	// By cslca=By.cssSelector("ms-ContextualMenu-link is-expanded root-343");

	By cseac = By.xpath("//span[text()='Ethics and Compliance']");

	public void Ethics() {

		new Actions(driver).moveToElement(corpFun).click().perform();
		waitforelement(cslca);

		new Actions(driver).moveToElement(lca).build().perform();
		waitforelement(cseac);

		boolean b = eac.isDisplayed();
		if (b) {
			System.out.println("Ethics and Compliance displayed");
		}
	}

	public void title() throws InterruptedException {
		eac.click();
		Thread.sleep(3000);
		String eacTitle = driver.getTitle();
		System.out.println("Title of page: " + eacTitle);
		js.executeScript("arguments[0].scrollIntoView();", scroll);
	}

	public void links() throws InterruptedException {

		List<WebElement> links = new ArrayList<WebElement>();

		for (WebElement listdiv : listDivs) {
			links.addAll(listdiv.findElements(By.tagName("a")));
		}
		List<String> urls = new ArrayList<String>();
		for (WebElement link : links) {

			System.out.println("Link text: " + link.getAttribute("aria-label"));
			System.out.println("Link : " + link.getAttribute("href"));

			urls.add(link.getAttribute("href"));

			System.out.println("*********************************");
		}

		System.out.println("Navigating to URLs....");

		for (String url : urls) {
			driver.navigate().to(url);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.navigate().back();
		}
	}
}
