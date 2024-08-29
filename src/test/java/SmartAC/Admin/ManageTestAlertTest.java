package SmartAC.Admin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.smartac.base.TestBase;

import AbstractComponents.AbstractComponents;

public class ManageTestAlertTest extends TestBase{
	
	AbstractComponents abc;
	String URL=prop.getProperty("StageNOCAdminURL");
	String email=prop.getProperty("SMACAdminLoginEmail");
	String password=prop.getProperty("SMACAdminLoginPassword");
	String UID=prop.getProperty("CreateAlertUID");
	String WaterAlert=prop.getProperty("WaterAlert");
	String CoilFreezeAlert=prop.getProperty("CoilFreezeAlert");
	
	@BeforeTest
	public void createObject() {
		abc = new AbstractComponents(driver);
		abc.loginpage=abc.navigateToURL(URL);
		abc.navbar=abc.loginpage.login(email, password);
		
	}
	
	@Test(priority=1)
	public void VerifyManageTestAlerttabFunctionality() throws InterruptedException {
		Thread.sleep(10000);
		abc.mta=abc.navbar.manageTestAlertsTabClicked();
		abc.mta.createAlertEnterUID(UID);
		abc.mta.selectAlertDropDownClicked();
		Thread.sleep(2000);
		abc.mta.selectWaterAlert(WaterAlert);
		Thread.sleep(5000);
		abc.mta.createAlertBtnClicked();
	}

}
