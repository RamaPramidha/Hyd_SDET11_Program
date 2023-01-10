package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class DisplayAllTheProductNamesTest extends BaseClass{
	
	
	@Test
	public void displayProducts()
	{
		
		List<WebElement> webelement=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
				
			
			for(WebElement wb:webelement )	
			{
				System.out.println(wb.getText());
			}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
