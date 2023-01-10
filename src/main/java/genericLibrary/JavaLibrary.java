package genericLibrary;

import java.util.Date;
import java.util.Random;

public class JavaLibrary {
	
	/*This method contains    
	 * 
	 */
	public int getRandomNumber()
	{
		Random ran= new Random();
		int value=ran.nextInt(500);
		return value;
		
	}
	
	/*
	 *This method will return the current system date 
	 * @return
	 */
	public String getSystemDate()
	{
		Date d=new Date();
		String date=d.toString();
		return date;
		
	}
	/*
	 * this method will return the current system date in a specific format
	 * @return
	 */
	
	public String getSystemDateInSpecificFormat()
	{
		Date d=new Date();
		String[] dArr =d.toString().split(" ");
		String month=dArr[1];
		String date=dArr[2];
		String year=dArr[5];
		String time=dArr[3].replace(":", "-");
		String dateInFormat=date+"-"+month+"-"+year+"-"+time;
		return  dateInFormat;
		
	}
	
	


	
	
	
	

}
