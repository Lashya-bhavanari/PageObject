package pageObject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class PageMain extends BaseClass{
	
	public static void main(String[] args) throws MalformedURLException 
	{
		AndroidDriver<AndroidElement>driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		PageObjectHome poh  = new PageObjectHome(driver);
		
		
		
		poh.Preferences.click();
		
		PageObjectPreferences pop=new PageObjectPreferences(driver);
		pop.Dependencies.click();
		
		
		PageObjectDependencies pod = new PageObjectDependencies(driver);
		pod.WiFiPage.click();
		
		
	}
}
