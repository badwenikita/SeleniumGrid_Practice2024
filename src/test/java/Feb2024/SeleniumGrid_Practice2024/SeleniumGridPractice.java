package Feb2024.SeleniumGrid_Practice2024;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class SeleniumGridPractice {
	
	WebDriver driver;
	ChromeOptions co;
	
	@BeforeTest
	public void setup()
	{
		/*
		co = new ChromeOptions();
		co.setCapability("enableVNC", true);	// to visualize the executing TCs in the containers we pass this capability Name. 
		co.setPlatformName("linux");
		try {
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), co);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		*/
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleTest()
	{
		String actual = driver.getTitle();
		System.out.println("Actual Title= "+actual);
		Assert.assertEquals(actual, "Google");
		
	}
	
	@Test
	public void urlTest()
	{
		String actual = driver.getCurrentUrl();
		System.out.println("Actual URL= "+actual);
		Assert.assertEquals(actual, "https://www.google.com/");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	

}
