package genericLibrary;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CheckOutOverViewPage;
import objectRepository.LoginPage;


public class BaseClass {
	
	
	public PropertyFileLibrary pLib = new PropertyFileLibrary();
	public ExcelFileLibrary eLib = new ExcelFileLibrary();
	public JavaLibrary jLib = new JavaLibrary();
	public WebDriverLibrary wLib = new WebDriverLibrary();
	
	
	public WebDriver driver = null;
	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("--- database connected successfully ---");
	}
	
	@BeforeClass
	public void bcConfig() throws IOException
	{
		String BROWSER = pLib.readDataFromPropertyFile("browser");
		String URL = pLib.readDataFromPropertyFile("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("--- Browser launched successfully -> "+BROWSER+" ---");
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println("--- Browser launched successfully -> "+BROWSER+" ---");
		}
		else
		{
			System.out.println("invalid browser name");
		}
		
		wLib.maximiseWindow(driver);
		wLib.waitForPageLoad(driver);
		driver.get(URL);
		
	}
	
	
	@BeforeMethod
	public void bmConfig() throws IOException
	{
		
		String USERNAME = pLib.readDataFromPropertyFile("username");
		String PASSWORD = pLib.readDataFromPropertyFile("password");
		
	    LoginPage lp=new LoginPage(driver);
//		lp.getUsernameTxt().sendKeys(USERNAME);
//		lp.getPasswordTxt().sendKeys(PASSWORD);
//		lp.getLoginBtn().click();
		lp.loginApp(USERNAME, PASSWORD);
		System.out.println(" --- login is successfull ---");
	}
	
	@AfterMethod
	public void amConfig()
	{
		CheckOutOverViewPage covp=new CheckOutOverViewPage(driver);
		
		covp.getReactMenuBtn().click();
		covp.getLogOutBtn().click();
		System.out.println("--- Logout successfull ---");
	}
	
	
	@AfterClass
	public void acConfig()
	{
		driver.quit();
		System.out.println("--- browser closed successfully ---");
	}
	

	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("--- database closed successfully ---");
	}

}
	
	
	
	
	
	
	


