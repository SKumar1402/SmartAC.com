package SmartAC.Admin;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.smartac.base.TestBase;

import AbstractComponents.AbstractComponents;

public class TechnicianTest extends TestBase{
	AbstractComponents abc;
	String URL=prop.getProperty("StageNOCAdminURL");
	String email=prop.getProperty("SMACAdminLoginEmail");
	String password=prop.getProperty("SMACAdminLoginPassword");
	
	@BeforeTest
	public void createObject() {
		abc = new AbstractComponents(driver);
		abc.loginpage=abc.navigateToURL(URL);
		abc.navbar=abc.loginpage.login(email, password);
	}
	
	@Test(priority=1)
	public void VerifyTechnicianURL() {
		abc.tech=abc.navbar.techniciansTabClicked();
		String expectedURL=prop.getProperty("TechnicianPageURL");
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test(priority=2)
	public void TotalTechnicians() {
		System.out.println(abc.tech.getTotalTechnicianCount());
	}
	
	@Test(priority=3)
	public void VerifyAddATechnician() {
		abc.tech.addATechnicianButtonClicked();
		Faker faker = new Faker();
		String firstName=faker.name().firstName();
		String lastName=faker.name().lastName();
		String email=firstName+"."+lastName+"@smartac.com";
		System.err.println("First Name is : "+firstName);
		System.err.println("Last name is : "+lastName);
		System.err.println("Email is : "+email);
	}
	
	
}
