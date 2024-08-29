package com.smartac.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class Adoption_page extends AbstractComponents{
	WebDriver driver;
	JavascriptExecutor js;
	public Adoption_page(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div.tech-body-container>div.tech-board-item-container a")
	public List<WebElement> techniciansList;
	
	@FindBy(css="div.hero-container:nth-child(1) a")
	public WebElement seeMostRecentLink;
	
	@FindBy (css="div.footer-container>a.all-link")
	public WebElement techListSeeAllLink;
	
	@FindBy (css="div.flex-column-2:nth-child(2) div.hero-container:nth-child(2) a")
	public WebElement seeAllIssuesLink;
	
	@FindBy (css="div#isVerified-filter>div")
	public WebElement unVerifiedInsall;
	
	@FindBy (css="div.hero-number.orange-text")
	public WebElement remainingInventoryCount;
	
	@FindBy (css="div.hero-number.blue-text")
	public WebElement totalInstalledHardwareUnits;
	
	@FindBy (css="div.nav-button.container-techs.active>div>div")
	public WebElement installationsSelectedTechName;
	
	public int techniciansCount() {
		int techListSize=techniciansList.size();
		return techListSize;
	}
	
	public void selectFirstTechnicianFromList(String techName) {
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", techniciansList.get(1));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(WebElement technician:techniciansList) {
			String text = (String) js.executeScript("return arguments[0].textContent;", technician);
			 if(text.contains(techName)) {
				 js.executeScript("arguments[0].click();", technician);
				 break;
			 }
		}
	}
	
	public void seeMostRecentLinkClicked() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", seeMostRecentLink);
	}
	
	public void techListSeeAllLinkClicked() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", techListSeeAllLink);
	}	
	
	public String getTextSeeAllLink() {
		return techListSeeAllLink.getText();
	}
	
	public void seeAllIssuesLinkClicked() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", seeAllIssuesLink);
	}
	
	public boolean unVerifiedInsallVisibility() {
		return unVerifiedInsall.isDisplayed();
	}
	
	public boolean GetRemainingInventoryCount(){
		js= (JavascriptExecutor) driver;
		String text = (String) js.executeScript("return arguments[0].textContent;", remainingInventoryCount);
		String actualtext=text.trim();
		int number=Integer.parseInt(actualtext);
		if(number>=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean GettotalInstalledHardwareUnits(){
		js= (JavascriptExecutor) driver;
		String text = (String) js.executeScript("return arguments[0].textContent;", totalInstalledHardwareUnits);
		String actualtext=text.trim();
		int number=Integer.parseInt(actualtext);
		if(number>=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public String installationsSelectedTechName() {
		js = (JavascriptExecutor) driver;
		String text = (String) js.executeScript("return arguments[0].textContent;", installationsSelectedTechName);
		String actualText=text.trim();
		return actualText;
	}

}
