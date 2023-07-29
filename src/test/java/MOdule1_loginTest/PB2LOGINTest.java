package MOdule1_loginTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import Module1_login.PB2Homepage;
import Module1_login.PB2Loginpage;
import Module1_login.PB2MobNumpage;
import Module1_login.PB2MyAccpage;
import Module1_login.PB2Profilepage;
import Module1_login.PB2Pwdpage;

public class PB2LOGINTest extends BaseClass {
	
	PB2Loginpage login;
	PB2MobNumpage mobnum;
	PB2Pwdpage pwd;
	PB2Homepage MyAcc;
	PB2MyAccpage MyProfile;
	PB2Profilepage Username;
	int TCID;
	
	@Parameters ("browsername")
	@BeforeClass
	public void openBrowser(String browsername) throws EncryptedDocumentException, IOException 
	{

		
		Initializebrowser(browsername);
		
		login= new PB2Loginpage(driver);
		mobnum = new PB2MobNumpage(driver);
		pwd = new PB2Pwdpage(driver);
		MyAcc = new PB2Homepage(driver);
		MyProfile = new PB2MyAccpage(driver);
		Username = new PB2Profilepage(driver);
	}
	
	
	@BeforeMethod
	public void Login() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		login.ClickPB2LoginpageSignin();
		mobnum.InpPB2MObNumPageMobNum(UtilityClass.GetPFdata("mobnum"));
		mobnum.ClickPB2MObNumPageLoginWithPwd();
		Thread.sleep(2000);
		pwd.InpPB2PwdpagePassword(UtilityClass.GetPFdata("pwd"));
		Thread.sleep(2000);
		pwd.ClickPB2PwdpageLogin();
		Thread.sleep(4000);
	}
	@Test
	public void verifyusername() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		TCID= 103;
		MyAcc.MovetoPB2HomepageMyAcc();
		Thread.sleep(2000);
		MyProfile.ClickonPB2MyProfilepageProfile();
		Thread.sleep(2000);
		Username.SwitchtoPB2ProfilepageChildWindow();
		Thread.sleep(2000);
		String acttext = Username.GetPB2ProfilepageUsename();
		String exptext = UtilityClass.GetTestData(0, 2);
		org.testng.Assert.assertEquals(acttext, exptext);
		
	}
	@AfterMethod
	public void logout(ITestResult s1) throws IOException 
	{
		if(s1.getStatus()== ITestResult.FAILURE)
		{
			UtilityClass.CaptureSS(driver, TCID);
		}
		
	}

	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
