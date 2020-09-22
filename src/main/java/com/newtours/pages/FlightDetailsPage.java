package com.newtours.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.EphemeralPortRangeDetector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightDetailsPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name ="passCount")
	private WebElement passengers;
	
	@FindBy(name ="findFlights")
	private WebElement continuebtn;
	
	public FlightDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 30);
		PageFactory.initElements(driver	, FlightDetailsPage.class	);
	}
	
	public void selectpaseengers(String noofp)
	{
		this.wait.until(ExpectedConditions.visibilityOf(passengers));
		Select select=new Select(passengers);
		select.deselectByValue(noofp);
	}
	
	public void findflights()
	{
		this.continuebtn.click();
	}

}
