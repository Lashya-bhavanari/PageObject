package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObjectHome {
	
		public  PageObjectHome(AndroidDriver<AndroidElement> driver)//in this way we can form a connection between our actual test case and our page object file

		
		{
			PageFactory.initElements(new AppiumFieldDecorator(driver),this);//for selenium just use(driver,this) no need to use decorator 
		}
		
		
		@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Preference\"]")//if it is IOS then use IOSFindBy
		public WebElement Preferences;
}
