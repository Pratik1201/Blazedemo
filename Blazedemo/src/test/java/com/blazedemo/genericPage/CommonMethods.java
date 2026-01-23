package com.blazedemo.genericPage;

import org.openqa.selenium.By;

public class CommonMethods extends MasterPage{

	public CommonMethods() throws Exception {
		super();
	}
		
	public void getWebElementText(String xpathkey) {
		String getTextOfWebElement = driver.findElement(By.xpath(loc.getProperty(xpathkey))).getText();
	}
	
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(loc.getProperty(xpathkey))).click();
	}
	
	

}


