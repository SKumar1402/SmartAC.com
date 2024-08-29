package com.smartac.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import AbstractComponents.AbstractComponents;

public class ManageTestAlert_Page extends AbstractComponents{
	WebDriver driver;
	public ManageTestAlert_Page(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css="div.sidebar-options div.option:nth-child(1).active")
	public WebElement createAlertsSelected;
	
	//Enter UID text field for Clear and Create Alerts
	@FindBy (css="input#uid")
	public WebElement EnterUIDTextField;
	
	@FindBy (css="button.cs-createAlertType")
	public WebElement selectAlertDropDown;
	
	@FindBy (css="div.sac-option-container.active>button>span")
	public List<WebElement> alertsList;
	
	@FindBy (css="button.ca-button span")
	public WebElement createAlertBtn;
	
	public void createAlertEnterUID(String UID) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='"+UID+"';", EnterUIDTextField);

	}
	
	public void selectAlertDropDownClicked() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectAlertDropDown);		
	}

	public void selectWaterAlert(String AlertType) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(WebElement alert:alertsList) {
			String text = (String) js.executeScript("return arguments[0].textContent;", alert);
			 if(text.contains(AlertType)) {
				 js.executeScript("arguments[0].click();", alert);
				 break;
			 }
			}
		}
	public void createAlertBtnClicked() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
	
		
		String inputValue = (String) (String) js.executeScript("return arguments[0].innerText;", createAlertBtn);
		System.out.println("Input Value is : " + inputValue);
		System.out.println("Button text is : "+createAlertBtn.getText());
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button/span[text()='Create Alert']"))));
		WebElement xpathlocator=driver.findElement(By.cssSelector("div.t-alerts-container>button.ca-button>span"));
		//js.executeScript("arguments[0].click();", xpathlocator);
		actions.moveToElement(xpathlocator).doubleClick().perform();
		//createAlertBtn.click();
	}
	
}
