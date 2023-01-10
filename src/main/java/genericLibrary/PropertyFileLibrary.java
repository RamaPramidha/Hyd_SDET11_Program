package genericLibrary;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertyFileLibrary {
	
	
		/*This method will read the data from property file for the key given by user
		 * @param
		 * @return
		 * @throws IOException
		 */
		public String readDataFromPropertyFile(String key) throws IOException
		{
			FileInputStream fis=new FileInputStream(IConstantsLibrary.PropertyPath);
			Properties pobj=new Properties();
			pobj.load(fis);
			String value=pobj.getProperty(key);
			return value;
			 
			
		}

	}



