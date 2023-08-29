package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class SearchResultPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	private By productsResults = By.cssSelector("div.product-layout");
	
	
	
	
	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);	
	}

	public int getSearchResultsCount() {
		return eleUtil.waitForElementsVisible(productsResults,AppConstants.MEDIUM_TIME_OUT).size();
		
	}
	public ProductInfoPage selectProduct(String producrName) {
		eleUtil.clickElementWhenReady(By.linkText(producrName),AppConstants.MEDIUM_TIME_OUT);
		return new ProductInfoPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
