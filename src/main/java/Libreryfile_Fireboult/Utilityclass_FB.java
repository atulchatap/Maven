package Libreryfile_Fireboult;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilityclass_FB {

	public static String GetPFData(String key) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\28janSeleniumMavenNew\\Propertyfile_FB.properties");
		Properties p1 = new Properties();
		p1.load(file);
		
		String value = p1.getProperty(key);
		
		return value;
	}
	
	public static void GetData() throws FileNotFoundException 
	{
		FileInputStream file = new FileInputStream("");
		
		
	}
	
	
	
}
