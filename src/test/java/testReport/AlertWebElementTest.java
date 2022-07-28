package testReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertWebElementTest {
	
	@BeforeMethod
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Harshal/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	
	@Test
	void TestMthod()
	{
		Assert.assertEquals(false, false);
		System.out.println("test is passed");
	}
	
	@AfterMethod
	void tearDown()
	{
		WebDriver driver = new ChromeDriver();
		driver.close();
		
	}

}
