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
	public WebElement memberOrdersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(7) img")
	public WebElement ordersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(8) img")
	public WebElement serviceRequestsTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(9) img")
	public WebElement comfortCreditTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(10) img")
	public WebElement partnersTab;
	
	@FindBy (css="div.navbar-container>nav.middle-container>a:nth-child(11) img")
	public WebElement settingsTab;
	
	@FindBy (css="div.app-modal button:nth-child(1)")
	public WebElement recentCycles;
	
	@FindBy (css="div.app-modal button:nth-child(2)")
	public WebElement devicesTab;
	
	@FindBy (css="div.app-modal button:nth-child(3)")
	public WebElement eventsTab;
	
	@FindBy (css="div.app-modal button:nth-child(4)")
	public WebElement quatlityAuditsTab;
	
	@FindBy (css="div.app-modal button:nth-child(5)")
	public WebElement HVACProfileTab;

	@FindBy (css="div.app-modal button:nth-child(6)")
	public WebElement HVACCatelogTab;
	
	@FindBy (css="div.app-modal button:nth-child(7)")
	public WebElement airFilterManagementTab;
	
	@FindBy (css="div.app-modal button:nth-child(8)")
	public WebElement manageTestAlertsTab;
	
	@FindBy (css="div.app-modal button:nth-child(9)")
	public WebElement recentOnboardsTab;
	
	@FindBy (css="div.app-modal button:nth-child(10)")
	public WebElement leadsUnpublishedTab;
	
	@FindBy (css="div.app-modal button:nth-child(11)")
	public WebElement memberSupportTab;
	
	@FindBy (css="div.app-modal button:nth-child(12)")
	public WebElement userActivityTab;
	
	@FindBy (css="button.more-tool")
	public WebElement moreToolsbutton;
	
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
