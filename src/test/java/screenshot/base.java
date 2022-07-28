package screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void intializastion()
	{
	    System.setProperty("webdriver.chrome.driver", "C:/Users/Harshal/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url="https://www.google.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	public static void failed(String testMethodName)
	{
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileHandler.copy(f, new File("C:/Users/Harshal/eclipse-workspace/TestNG11/target/screenshot/"+testMethodName+"sc.jpg"));
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
