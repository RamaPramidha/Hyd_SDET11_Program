package programs;



import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import genericLibrary.ExcelFileLibrary;
import genericLibrary.JavaLibrary;
import genericLibrary.PropertyFileLibrary;
import genericLibrary.WebDriverLibrary;
import objectRepository.BackToProductsPage;
import objectRepository.CheckOutOverViewPage;
import objectRepository.CheckOutYourInformationPage;
import objectRepository.ProductsPage;
import objectRepository.YourCartPage;

public class AddToCartTest extends BaseClass{
	
	
@Test
public void addToCartTest()
{
	JavaLibrary jLib=new JavaLibrary();
	ExcelFileLibrary eLib=new ExcelFileLibrary();
	WebDriverLibrary wLib=new WebDriverLibrary();
	PropertyFileLibrary pLib=new PropertyFileLibrary();
	
	//reading the data
	//Launch the Browser

	
	ProductsPage pp=new ProductsPage(driver);
	//pp.getboltTshirtLnk().click();
	pp.clickboltTShirtLnk();
	BackToProductsPage bp=new BackToProductsPage(driver);
	//bp.getAddToCartBtn().click();
	bp.getAddToCartImg().click();
	
	YourCartPage ycp=new YourCartPage(driver);
	ycp.getChechOutBtn().click();
	
	CheckOutYourInformationPage cyip=new CheckOutYourInformationPage(driver);
	cyip.fillingDetailsAndClickContinue();	
	
	CheckOutOverViewPage cop=new CheckOutOverViewPage(driver);
	
	String ProductName = cop.getInventoryItemNameTxt().getText();
	//Assert.assertEquals(ProductName,"Sauce Labs Bolt T-Shirt");
	if(ProductName.equalsIgnoreCase("Sauce Labs Bolt T-Shirt"))
	{
		System.out.println("test is passed");
	}
	else 
	{
		System.out.println("test is failed");
	}
			
	
	
	    
	
	
	
}

}
