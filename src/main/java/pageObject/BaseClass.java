package pageObject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
//		HashMap <String,Boolean> map=new HashMap<String,Boolean>();
//				map.put("w3c", false);

		
		File appDir= new File("src/main/java");
		//File app= new File(appDir,"General-Store.apk");
		File app= new File(appDir,"ApiDemos-debug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		//capabilities.setCapability("appium:chromeOptions",Map.of("w3c",false));
		AndroidDriver<AndroidElement>driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	return driver;
	}
}
