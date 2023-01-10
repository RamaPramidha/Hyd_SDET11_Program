package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
    //Declaration
	@FindBy(xpath = "//input[@id='user-name']")
	private WebElement usernameTxt;
	
	@FindBy(id = "password")
	private WebElement passwordTxt;
	
	@FindBy(id = "login-button")
	private WebElement loginBtn;
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTxt() {
		return usernameTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
		
	}
	public void loginApp(String username,String password)
	{
		getUsernameTxt().sendKeys(username);
		getPasswordTxt().sendKeys(password);
		getLoginBtn().click();
		
	}
	
	
		
	}
	
	
	


