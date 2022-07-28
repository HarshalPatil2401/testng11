package screenshot;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
@Listeners(screenshot.listener.class)
public class runYoutube extends base {

	@BeforeMethod
	public void setUp()
	{
		/* System.setProperty("webdriver.chrome.driver", "C:/Users/Harshal/Downloads/chromedriver_win32 (1)/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String url="https://www.google.com/";
			driver.navigate().to(url);
			//driver.manage().window().maximize();*/
		intializastion();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@Test
	void openYoutube()
	{
		Assert.assertEquals(false, true);
	}
	
	
}
