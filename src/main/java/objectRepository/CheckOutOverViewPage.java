package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutOverViewPage {
	
	//Declaration
	
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private WebElement inventoryItemNameTxt;
	
	@FindBy(id = "finish")
	private WebElement finishBtn;
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement reactMenuBtn;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logOutBtn;
	
	//Initialization
	public CheckOutOverViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
   //utilization
	
	public WebElement getInventoryItemNameTxt() {
		return inventoryItemNameTxt;
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}

	public WebElement getReactMenuBtn() {
		return reactMenuBtn;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}
	
	//business Library
	
//	public void logOutOfApp(WebDriver driver)
//	{
//		mouseHoverOn(driver,reactMenuBtn );
//	}
//	
	
	
	

}
