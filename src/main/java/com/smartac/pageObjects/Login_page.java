package com.smartac.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.AbstractComponents;

public class Login_page extends AbstractComponents{
	WebDriver driver;
	public Login_page(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input#email")
	public WebElement loginEmail;
	
	@FindBy (css="input#password")
	public WebElement loginPassword;
	
	@FindBy (css="button.l-button")
	public WebElement LoginButton;
	
	public NavigationTab_page login(String Email, String Password) {
		loginEmail.sendKeys(Email);
		loginPassword.sendKeys(Password);
		LoginButton.click();
		return new NavigationTab_page(driver);
	}
}
