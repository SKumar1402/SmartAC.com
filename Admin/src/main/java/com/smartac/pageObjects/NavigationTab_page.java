package com.smartac.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class NavigationTab_page extends AbstractComponents{
	WebDriver driver;
	public NavigationTab_page(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(1) img")
	public WebElement adoptionTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(2) img")
	public WebElement techniciansTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(3) img")
	public WebElement leadsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(4) img")
	public WebElement systemHealthTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(5) img")
	public WebElement membersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(6) img")
	public WebElement recentCyclesTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(7) img")
	public WebElement userActivitiesTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(8) img")
	public WebElement serviceRequestsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(9) img")
	public WebElement memberOrdersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(10) img")
	public WebElement ordersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(11) img")
	public WebElement comfortCreditsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(12) img")
	public WebElement devicesTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(13) img")
	public WebElement eventsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(14) img")
	public WebElement quatlityAuditsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(15) img")
	public WebElement partnersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(16) img")
	public WebElement HVACProfileTab;

	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(17) img")
	public WebElement HVACCatelogTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(18) img")
	public WebElement airFilterManagementTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(19) img")
	public WebElement manageTestAlertsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(20) img")
	public WebElement productsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(21) img")
	public WebElement settingsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(22) img")
	public WebElement recentOnboardsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(23) img")
	public WebElement leadsUnpublishedTab;
	
	@FindBy (css="div.right-container>div.profile-container img")
	public WebElement profileIcon;
	
	@FindBy (css="div.active.profile-dropdown-container div.pd-list-item span")
	public WebElement logoutLink;
	
	public Adoption_page adoptionTabClicked() {
		adoptionTab.click();
		return new Adoption_page(driver);
	}
	
	public Technician_page techniciansTabClicked() {
		techniciansTab.click();
		return new Technician_page(driver);
	}
	
	public ManageTestAlert_Page manageTestAlertsTabClicked() {
		manageTestAlertsTab.click();
		return new ManageTestAlert_Page(driver);
	}
	
}
