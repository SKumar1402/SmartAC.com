package com.smartac.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class Technician_page extends AbstractComponents{
	WebDriver driver;
	public Technician_page(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="div.t-list-container>div")
	public List<WebElement> technicianList;
	
	@FindBy (css="button.invite-tech-btn")
	public WebElement addATechnicianButton;
	
	@FindBy (css="input#firstName")
	public WebElement addTech_FirstName;
	
	@FindBy (css="input#lastName")
	public WebElement addTech_LastName;
	
	@FindBy (css="input#email")
	public WebElement addTech_Email;
	
	@FindBy (css="div.t-item-container>div.t-info-container:nth-child(4) div.t-header")
	public List<WebElement> technicianStatus;
	
	public int getTotalTechnicianCount() {
		int TechiciansListSize=technicianList.size();
		return TechiciansListSize;
	}
	
	public void addATechnicianButtonClicked() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addATechnicianButton);
	}
	
	public void fillAddTechnicianForm(String firstName, String lastName, String email) {
		addTech_FirstName.sendKeys(firstName);
		addTech_LastName.sendKeys(lastName);
		addTech_Email.sendKeys(email);
	}
	

}
