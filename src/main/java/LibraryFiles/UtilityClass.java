package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	
	
	public static String GetTestData(int rowindex, int colindex) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\28janSeleniumMavenNew\\TestData\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
	}
	
	public static void CaptureSS(WebDriver driver, int TCID ) throws IOException 
	{
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\eclipse-workspace\\28janSeleniumMavenNew\\TestOutput\\TestcaseID"+TCID+".jpg");
		
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
	public static String GetPFdata(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\28janSeleniumMavenNew\\PropertyFile.properties");
		
		Properties p1 = new Properties();
		p1.load(file);
		String value = p1.getProperty(key);
		return value;
	}
	
}
