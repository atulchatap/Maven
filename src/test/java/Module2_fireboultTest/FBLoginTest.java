package Module2_fireboultTest;

import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libreryfile_Fireboult.Baseclass_FB;
import Libreryfile_Fireboult.Utilityclass_FB;
import Module2_Fireboult.FBEmailPwdPage;
import Module2_Fireboult.FBLoginPage;
import Module2_Fireboult.FBMyprofilePage;
import Module2_Fireboult.FBResultPage;
import Module2_Fireboult.FBSearchPage;

public class FBLoginTest extends Baseclass_FB{

	FBLoginPage login;
	FBEmailPwdPage emailpwd;
	FBMyprofilePage myprofile;
	FBSearchPage search;
	FBResultPage result;
	int TCID;
	
	@BeforeClass
	public void openbrowser () throws IOException, InterruptedException 
	{
		initializebrowser();
		
		login = new FBLoginPage(driver);
		emailpwd = new FBEmailPwdPage(driver);
		myprofile = new FBMyprofilePage(driver);
		search = new FBSearchPage(driver);
		result = new FBResultPage(driver);
		
	}
	
	@BeforeMethod
	public void loginpage() throws InterruptedException, IOException 
	{
        login.ClickFBLoginPageLogin();
		Thread.sleep(2000);
		emailpwd.InpFBEmailPwdPageEmail(Utilityclass_FB.GetPFData("email"));
		Thread.sleep(2000);
		emailpwd.InpFBEmailPwdPagePwd(Utilityclass_FB.GetPFData("pwd"));
		Thread.sleep(2000);
		emailpwd.ClickFBEmailPwdPagesignin();
		Thread.sleep(2000);
		myprofile.ClickFBMyprofilePageSearchbutton();
		search.InpFBMyprofilePageSearchbox(Utilityclass_FB.GetPFData("uti"));
		Thread.sleep(2000);
		search.ClickFBMyprofilePageResult();
		Thread.sleep(2000);
	}
	
	@Test
	public void Buyproduct() throws InterruptedException 
	{
		TCID=104;
		result.OpenDDFBResultPageMore();
		Thread.sleep(2000);
		result.ClickFBResultPagegold();
		Thread.sleep(2000);
		result.ClickFBResultPageNotify();
		
	}
	
	@AfterMethod
	public void logout() 
	{
		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}

	
}
