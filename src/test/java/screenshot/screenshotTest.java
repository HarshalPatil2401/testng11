package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.class)

public class screenshotTest extends base {
	
	
	
	@BeforeMethod
	public void setup()
	{
		intializastion();
	}
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void testScreenShot1()
	{
		Assert.assertEquals(true, true);
	}
	@Test
	public void testScreenShot2()
	{
		WebElement search=driver.findElement(By.xpath("//*[@name='q']"));
		search.sendKeys("youtube");
		
	}
	@Test
	public void testScreenShot3()
	{
		Assert.assertEquals(false, true);
	}

}
