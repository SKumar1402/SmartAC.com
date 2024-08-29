package com.smartac.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import AbstractComponents.AbstractComponents;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	public AbstractComponents abc;
	
	public TestBase() {
		try {
			prop = new Properties();
			final FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\Test_Data\\Test_data.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

	@BeforeTest
	public WebDriver LaunchBrowser() {
		String browserName = System.getProperty("Browser")!=null? System.getProperty("Browser"):prop.getProperty("Browser");
				//prop.getProperty("Browser");

		if (browserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			if(browserName.contains("headless")) {
			options.addArguments("headless");
			}
			// Launching the browser
			driver = new ChromeDriver(options);
		} else if (browserName.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions(); 
			driver = new EdgeDriver(edgeOptions);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
	}	
	
}
