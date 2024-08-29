package com.smartac.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class Leads_page extends AbstractComponents{
	WebDriver driver;
	public Leads_page(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="div.qf-container>div:nth-child(1)")
	public WebElement urgentLeadsTab;
	
	@FindBy (css="div.qf-container>div:nth-child(2)")
	public WebElement watchingLeadsTab ;
	
	@FindBy (css="div.qf-container>div:nth-child(3)")
	public WebElement allLeadsTab ;
	
	@FindBy (css="div.qf-container>div:nth-child(3)")
	public WebElement unit10PlusYearsLeadTab ;
	
	@FindBy (css="div.qf-container>div:nth-child(1)>.align-end>div:nth-child(2)")
	public WebElement urgentLeadsCount ;
	
	@FindBy (css="div.qf-container>div:nth-child(2)>.align-end>div:nth-child(2)")
	public WebElement watchingLeadsCount ;
	
	@FindBy (css="div.qf-container>div:nth-child(3)>.align-end>div:nth-child(2)")
	public WebElement allLeadsCount ;
	
	@FindBy (css="div.qf-container>div:nth-child(4)>.align-end>div:nth-child(2)")
	public WebElement unit10PlusYearsLeadCount ;
	
	@FindBy (css="div.flex-center-column>div#sac-search>input")
	public WebElement searchLeadsTextField ;
	
	@FindBy (css="div#lead-filter>div.nav-button")
	public WebElement allFiltersButton ;
	
	@FindBy (css="div#lead-filter>div:nth-child(2)")
	public WebElement sortByFilterButton ;
	
	@FindBy (css="div#lead-filter>div:nth-child(3)")
	public WebElement unitAgeFilterButton ;
	
	@FindBy (css="div#lead-filter>div:nth-child(4)")
	public WebElement leadTypeFilterButton ;
	
	@FindBy (css="div#lead-filter>div:nth-child(5)")
	public WebElement statusFilterButton ;
	
	@FindBy (css="div#lead-filter>div:nth-child(6)")
	public WebElement selectPartnerButton ;
	
	@FindBy (css="div#lead-filter>div:nth-child(6) input")
	public WebElement searchPartnerTextField ;
	
	@FindBy (css="div#lead-filter>div:nth-child(6) div.partner-options>div div")
	public List<WebElement> partnersNameList ;
	
	@FindBy (css="div#lead-list>div#lead-card")
	public List<WebElement> leadsList ;
}
