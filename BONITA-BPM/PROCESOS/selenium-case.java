package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class selenium-case {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testSelenium-case() throws Exception {
		selenium.open("/bonita/portal/homepage#?_pf=1&_p=tasklistinguser");
		selenium.click("css=input[type=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		selenium.click("//button[@type='button']");
		selenium.click("link=Selenium 1.0");
		selenium.type("id=search", "");
		selenium.click("css=th.Cell--checkbox.ng-scope > input[type=\"checkbox\"]");
		selenium.click("id=btn-group-unassign");
		selenium.click("css=th.Cell--checkbox.ng-scope > input[type=\"checkbox\"]");
		selenium.click("id=btn-group-assigntome");
		selenium.click("css=td.Cell--checkbox.ng-scope > input[type=\"checkbox\"]");
		selenium.click("css=button.Toolbar-button.Resize-full");
		selenium.selectWindow("null");
		selenium.type("name=pbInput0", "123");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
