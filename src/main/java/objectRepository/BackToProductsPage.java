package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToProductsPage {
	//Declaration
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addToCartImg;
	
	//initializtion
	public BackToProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getAddToCartImg() {
		return addToCartImg;
	}
	
	
	
	

}
