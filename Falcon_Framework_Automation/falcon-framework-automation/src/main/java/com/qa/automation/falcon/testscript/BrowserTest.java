package com.qa.automation.falcon.testscript;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

import com.atmecs.falcon.automation.ui.selenium.Find;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.ui.seleniuminterfaces.IFind;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.qa.automation.falcon.testsuite.SampleTestSuiteBase;

public class BrowserTest extends SampleTestSuiteBase {
	

	private ReportLogService report = new ReportLogServiceImpl(BrowserTest.class);
	WebDriver driver;
	Verify verify = new Verify();
	 IFind ifind = new Find();

	// opening the URL
	@Test
	@Parameters({ "os", "osVersion", "browser", "browserVersion" })
	public void BrowserClassVerification(String os, String osVersion, String br, String browserVersion)
			throws InterruptedException {
		report.info("Opening browser: " + br);
		browser.openURL("https://itera-qa.azurewebsites.net/home/automation", os, osVersion, br, browserVersion);
		report.info("Maximizing browser window");
		browser.maximizeWindow();
	}

}
