import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseiOSTest {
// 	public static void main(String[] args) throws MalformedURLException{ <-This is the old one

	public static IOSDriver DesiredCapabilities() throws MalformedURLException{
		// TODO Auto-generated method stub
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.2");
		//IOS XCUI Test Apple
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11 Pro");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
		capabilities.setCapability("commandTimeouts", "12000");
		
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/brianhaucke/Desktop/longtap.app");
		//capabilities.setCapability(MobileCapabilityType.APP, "/Users/brianhaucke/Desktop/ios_automation/UIKitCatalog.app");

		IOSDriver driver = new IOSDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return driver;
		
		
		

	}

}
