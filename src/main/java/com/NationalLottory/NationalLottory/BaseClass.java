package com.NationalLottory.NationalLottory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import pages.OpenAccountPage;

public class BaseClass {

	WebDriver driver;
	OpenAccountPage op;

	@Before

	public void openBrowser() {
		// System.setProperty("webdriver.opera.driver", "operadriver");
		// driver = new OperaDriver();
		// System.setProperty("webdriver.gecko.driver", "geckodriver");
		// WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		op = new OpenAccountPage(driver);
driver.get("https://www.national-lottery.co.uk/");
	}

}