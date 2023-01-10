package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	//declaration
//	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']/../../following-sibling::div/div/following-sibling::button")
	private WebElement boltTshirtLnk;
	
	
	//@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	//private WebElement bikeLightLnk;
	
	//initialization
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
    //utilization
	public WebElement getboltTshirtLnk() {
		return boltTshirtLnk;
	}

//	public WebElement getBikeLightLnk() {
//		return bikeLightLnk;
//	}
	
	//BusinessLibrary
	public void clickboltTShirtLnk()
	{
		boltTshirtLnk.click();
	}
	

}
