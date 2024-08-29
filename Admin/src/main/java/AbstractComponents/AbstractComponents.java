package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.smartac.pageObjects.NavigationTab_page;
import com.smartac.pageObjects.Technician_page;
import com.smartac.pageObjects.Adoption_page;
import com.smartac.pageObjects.Login_page;
import com.smartac.pageObjects.ManageTestAlert_Page;

public class AbstractComponents {
	WebDriver driver;
	public NavigationTab_page navbar;
	public Login_page loginpage;
	public Adoption_page adopt;
	public Technician_page tech;
	public ManageTestAlert_Page mta;
	
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
	}
	
	public void waitForWebElementToAppear(WebElement findby) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(findby ));
	}
	
	public void waitForElementToDisappear(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public void waitForElementToBeClickable(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public Login_page navigateToURL(String url) {
		driver.get(url);
		return new Login_page(driver);
	}

}
