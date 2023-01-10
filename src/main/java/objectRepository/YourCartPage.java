package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {
	
	//Declaration
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private WebElement inventoryItemNameHeader;
	
	@FindBy(id = "checkout")
	private WebElement chechOutBtn;
	
	//Initialization
	public YourCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getInventoryItemNameHeader() {
		return inventoryItemNameHeader;
	}

	public WebElement getChechOutBtn() {
		return chechOutBtn;
	}
	
	
	
	

}
