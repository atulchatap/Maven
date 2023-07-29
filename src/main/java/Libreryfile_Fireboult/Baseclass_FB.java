package Libreryfile_Fireboult;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Baseclass_FB {
	
	public WebDriver driver;
	public void initializebrowser() throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get(Utilityclass_FB.GetPFData("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
	}
	

}
