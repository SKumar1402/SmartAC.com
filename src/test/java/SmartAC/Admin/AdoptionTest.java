package SmartAC.Admin;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.smartac.base.TestBase;

import AbstractComponents.AbstractComponents;

public class AdoptionTest extends TestBase{
	
	AbstractComponents abc;
	String URL=prop.getProperty("StageNOCAdminURL");
	String email=prop.getProperty("SMACAdminLoginEmail");
	String password=prop.getProperty("SMACAdminLoginPassword");
	String technicianName=prop.getProperty("technicianName");
	
	@BeforeTest
	public void createObject() {
		abc = new AbstractComponents(driver);
		abc.loginpage=abc.navigateToURL(URL);
		abc.navbar=abc.loginpage.login(email, password);
	}
	//Sunil
	@Test(priority=1)
	public void VerifyAdoptionURL() {
		abc.adopt=abc.navbar.adoptionTabClicked();
		String expectedURL=prop.getProperty("AdoptionPageURL");
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority=2)
	public void verifyTechnicianListCount() {
		abc.adopt.techListSeeAllLinkClicked();
		System.out.println(abc.adopt.techniciansCount());
	}
	
	@Test(priority=3)
	public void VerifyTechnicianNameLinking() {
		abc.adopt.selectFirstTechnicianFromList(technicianName);
		Assert.assertEquals(abc.adopt.installationsSelectedTechName(), technicianName);
	}
	
	
	/*
	@Test(priority=2)
	public void VerifyRemainingInvertoryValue() {
		Assert.assertTrue(abc.adopt.GetRemainingInventoryCount());
		System.out.println("Test Passed : Remaining Inventory is an integer value.");
	}
	
	
	@Test(priority=3)
	public void VerifyTotalInstalledHardwareUnits() {
		Assert.assertTrue(abc.adopt.GettotalInstalledHardwareUnits());
		System.out.println("Test Passed : Total Installed Hardware Units is a Integer value");
	}
	
	@Test(priority=2)
	public void VerifySeeMostRecentLink() throws InterruptedException {
		abc.adopt.seeMostRecentLinkClicked();
		String expectedURL=prop.getProperty("AdoptionSeeMostRecentURL");
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		driver.navigate().back();
	}

	@Test(priority=3)
	public void verifySeeAllIssuesLink() {
		abc.adopt.seeAllIssuesLinkClicked();
		String expectedURL=prop.getProperty("AdoptionSeeAllIssuesURL");
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	*/
}
