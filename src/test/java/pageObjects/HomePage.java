package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[text()='be.cognizant']")
	WebElement beCognizant;

	@FindBy(xpath = "//button[@id='O365_MainLink_Me']")
	WebElement UserButton;

	@FindBy(xpath = "//div[@data-automation-id='HeroPatternElement']")
	List<WebElement> featuredTitle;

	@FindBy(xpath = "//div[@class='mectrl_accountDetails']/div[1]")
	WebElement UserInfo1;

	@FindBy(xpath = "//div[@class='mectrl_accountDetails']/div[2]")
	WebElement UserInfo2;

	@FindBy(xpath = "//button[@type='button']/span/span/span")
	List<WebElement> headerElements;

	@FindBy(xpath = "//ul[@role='presentation']")
	WebElement ul;

	By csul = By.xpath("//ul[@role='presentation']");
	// By csul=By.cssSelector("ms-ContextualMenu-list is-open list-281");
	// WebElement csul=driver.findElement(By.cssSelector("ms-ContextualMenu-list
	// is-open list-281"));

	public List<WebElement> headerElements() {
		return headerElements;
	}

	public void getHe() {
		for (WebElement headerElement : headerElements) {
			System.out.println(headerElement.getText());
		}
	}

	public void printingSubmenu() {
		for (WebElement headerElement : headerElements) {
			new Actions(driver).moveToElement(headerElement).click().perform();
			System.out.println("\n** Sub Header of " + headerElement.getText() + " are:**");

			waitforelement(csul);
			List<WebElement> subHeaders = ul.findElements(By.xpath("li"));
			for (WebElement subHeader : subHeaders) {
				System.out.println(subHeader.findElement(By.tagName("a")).getAttribute("name"));
			}
		}
	}

	public void clickBeCognizant() {
		beCognizant.click();
	}

	public WebElement UserButton() {
		return UserButton;

	}

	public WebElement UserInfo1() {
		return UserInfo1;
	}

	public WebElement UserInfo2() {
		return UserInfo2;
	}

}
