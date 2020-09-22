package test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeTest
	@Parameters({"keyword"})
	public void setupdriver(@Optional String searchtxt) throws WebDriverException, IOException
	{
		
		String host="localhost";
		DesiredCapabilities cap;
		
		if(System.getProperty("HUB_HOST")!= null)
		{
			host=System.getProperty("HUB_HOST");
		}
		
		String completeurl="http://"+host+":4444/wd/hub";
		
		if(System.getProperty("BROWSER")!= null && System.getProperty("BROWSER").equalsIgnoreCase("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			this.driver=new RemoteWebDriver(new URL(completeurl), cap);
			//this.driver=new ChromeDriver();
		}
		else
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-gpu"); // applicable to windows os only
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			options.addArguments("--headless");
			
			this.driver=new RemoteWebDriver(new URL(completeurl), options);
			//this.driver=new ChromeDriver();
			
		}
				
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		this.driver.get("https://www.google.com");
		this.driver.findElement(By.name("q")).sendKeys(searchtxt);
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"/test-output/screen.png"));
		this.driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		this.driver.findElement(By.id("logo")).click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		this.driver.quit();
	}

}
