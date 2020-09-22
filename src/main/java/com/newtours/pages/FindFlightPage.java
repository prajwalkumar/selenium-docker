package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindFlightPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name ="reserveFlights")
	private WebElement firstSubmitbtn;
	
	@FindBy(name ="buyFlights")
	private WebElement secondSubmitbtn;
	
	public FindFlightPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 30);
		PageFactory.initElements(driver	, FindFlightPage.class	);
	}
	
	public void submitfindflight()
	{
		this.wait.until(ExpectedConditions.elementToBeClickable(firstSubmitbtn));
		this.firstSubmitbtn.click();
	}
	
	public void toToconfirmation()
	{
		this.wait.until(ExpectedConditions.elementToBeClickable(secondSubmitbtn));
		this.secondSubmitbtn.click();
	}
}

