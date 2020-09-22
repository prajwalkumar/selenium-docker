package com.newtours.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy(name="firstName")
	private WebElement firstnametxt;
	
	@FindBy(name="lastName")
	private WebElement lastnametxt;
	
	@FindBy(name="email")
	private WebElement usernametxt;
	
	@FindBy(name="password")
	private WebElement passwordtxt;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmpasswordtxt;
	
	@FindBy(name="register")
	private WebElement submitbtn;
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		this.wait=new WebDriverWait(driver, 30);
		PageFactory.initElements(driver	, RegistrationPage.class	);
	}
	
	public void goTo()
	{
		this.driver.get("https://vins-udemy.s3.amazonaws.com/docker/docker-book-flight.html");
	
		this.wait.until(ExpectedConditions.visibilityOf(firstnametxt));
		this.wait.until(ExpectedConditions.visibilityOf(lastnametxt));
	}
	
	public void enteruserdetails(String fn, String ln)
	{
		this.firstnametxt.sendKeys(fn);
		this.firstnametxt.sendKeys(ln);
	}
	
	public void enterusercreds(String un,String pw)
	
	{
		this.usernametxt.sendKeys(un);
		this.passwordtxt.sendKeys(pw);
		this.confirmpasswordtxt.sendKeys(pw);
	}
	
	public void submit()
	{
		this.submitbtn.click();
	}

}
