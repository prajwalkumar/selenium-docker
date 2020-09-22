package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FligtConfirmationPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(xpath  ="//font[contains(text(), 'Flight Confirmation')]")
	private WebElement flightconfirmation;
	
	@FindBy(xpath  ="//font[contains(text(), 'USD')]")
	private WebElement prices;
	
	@FindBy(linkText ="SIGN-OFF")
	private WebElement signoff;
	
	public FligtConfirmationPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 30);
		PageFactory.initElements(driver	, FligtConfirmationPage.class	);
	}
	
	public void frintconfirmation()
	{
		this.wait.until(ExpectedConditions.visibilityOf(flightconfirmation));
		System.out.println("confirmation");
		this.signoff.click();
	}

}
