package jpetStoreckg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnHomePageFromBirdsPage extends BaseTest{
	
	@Test
	public void Tc32() throws IOException
	{
		BaseTest.invokeBrowser();	
		
		driver.findElement(By.xpath(".//*[@id='Content']/p[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='SidebarContent']/a[5]/img")).click();
		String expectedText = driver.findElement(By.xpath(".//*[@id='Catalog']/h2")).getText();
		
		Assert.assertEquals(expectedText, "Birds");
		
		System.out.println("Birds Catalogue Details page loaded successfully");
		driver.findElement(By.xpath(".//*[@id='LogoContent']/a/img")).click();
		String text = driver.findElement(By.xpath(".//*[@id='MenuContent']/a[2]")).getText();
		Assert.assertEquals(text, "Sign In");
		System.out.println("Successfully returned to Home Page from Birds Catalogue Page");
		
			
		BaseTest.closeBrowser();
	

	}

}
