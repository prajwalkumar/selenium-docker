package com.newtours.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.newtours.pages.FindFlightPage;
import com.newtours.pages.FlightDetailsPage;
import com.newtours.pages.FligtConfirmationPage;
import com.newtours.pages.RegistrationConfirmationPage;
import com.newtours.pages.RegistrationPage;

import test.BaseTest;

public class BookFlightTest extends BaseTest{
	
	public WebDriver driver;
	
	
	@Test
	public void registrationPage()
	{
		System.out.println(" do nothins");
	}
	
	
//	@Test
//	public void registrationPage()
//	{
//		RegistrationPage rp=new RegistrationPage(driver);
//		rp.goTo();
//		rp.enteruserdetails("prajwal", "kumar");
//		rp.enterusercreds("praj", "kum");
//		rp.submit();
//	}
//	
//	@Test(dependsOnMethods = "registrationPage")
//	public void registrationconfirmation()
//	{
//		RegistrationConfirmationPage rcp=new RegistrationConfirmationPage(driver);
//		
//		rcp.gotoflightdetails();
//	}
//	
//	@Test(dependsOnMethods = "registrationconfirmation")
//	public void fligtdetailspage()
//	{
//		String st=new String("3");
//		FlightDetailsPage fd=new FlightDetailsPage(driver);
//		fd.selectpaseengers(st);
//		fd.findflights();
//	}
//
//	@Test(dependsOnMethods = "fligtdetailspage")
//	public void findflightpage()
//	{
//		FindFlightPage ff=new FindFlightPage(driver);
//		ff.submitfindflight();
//		ff.toToconfirmation();
//	}
//	
//	@Test(dependsOnMethods = "findflightpage")
//	public void fligtconfirmation()
//	{
//		FligtConfirmationPage fc=new FligtConfirmationPage(driver);
//		fc.frintconfirmation();
//	}
	
	
}
