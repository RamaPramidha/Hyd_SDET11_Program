package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutYourInformationPage {
	
	//Declaration
	
	@FindBy(id = "first-name")
	private WebElement firstnameTxt;
	
	@FindBy(id = "last-name")
	private WebElement lastnameTxt;
	
	@FindBy(id = "postal-code")
	private WebElement pastalCodeTxt;
	
	@FindBy(id = "continue")
	private WebElement continueBtn;
	
	//Initializtion
	public CheckOutYourInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
   //Utilization
	public WebElement getFirstnameTxt() {
		return firstnameTxt;
	}

	public WebElement getLastnameTxt() {
		return lastnameTxt;
	}

	public WebElement getPastalCodeTxt() {
		return pastalCodeTxt;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}	
	
	//Business Library
	public void fillingDetailsAndClickContinue()
	{
		getFirstnameTxt().sendKeys("abc");
		getLastnameTxt().sendKeys("def");
		getPastalCodeTxt().sendKeys("123");
		getContinueBtn().click();
				
	}

}
