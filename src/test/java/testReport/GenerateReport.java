package testReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import bsh.BshClassManager.Listener;
@Listeners(screenshot.listener.class)
public class GenerateReport {
	
	static ExtentReports report;
	static ExtentTest test;
	
	@BeforeClass
	void generateReport()
	{
		report=new ExtentReports("user.dir"+"my report.html");
		test=report.startTest("Demo");
	}
	
	@Test
	void testMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Harshal/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url="https://rahulshettyacademy.com/seleniumPractise/#/";
		driver.navigate().to(url);
		String actual="GreenKart - veg and fruits kart1";
		String title=driver.getTitle();
		
		System.out.println(title);
		if(title.equalsIgnoreCase("GreenKart - veg and fruits kart"))
		{
			test.log(LogStatus.PASS, "Test is passed");
		}
		else
		{
			test.log(LogStatus.FAIL, "Test case is Failed");
		}
	//	Assert.assertEquals(actual, title);
		driver.close();
	}
	
	
	@AfterClass
	void end()
	{
		report.endTest(test);
		report.flush();
		
	}

}
