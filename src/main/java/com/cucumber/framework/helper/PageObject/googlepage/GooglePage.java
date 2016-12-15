package com.cucumber.framework.helper.PageObject.googlepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;

import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class GooglePage extends PageBase {
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(GooglePage.class);

	public GooglePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/** Web Elements */
	
	@FindBy(name="q")
	public WebElement searchBox;
	
	@FindBy(css="#_fZl")
	public WebElement submit;

	@FindBy(css=".r")
	public List<WebElement> searchResults;


	public void sendKeys(String text){
		searchBox.sendKeys(text);
	}

	public void typeGoogleSearch(String text){
		searchBox.sendKeys(text);
	}

	public void clickGoogleSearch(){
		submit.click();
	}

	public String getUrl()
	{
		return driver.getCurrentUrl();
	}



	
	/** Public Methods  **/
	
	public WebDriver getDriver() {
		return this.driver;
	}

}
