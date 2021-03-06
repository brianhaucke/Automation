import java.net.MalformedURLException;

import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SliderTest extends BaseiOSTest{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		
		driver.findElementByAccessibilityId("Sliders").click();
		IOSElement slider = (IOSElement)driver.findElementByXPath("//XCUIElementTypeSlider");
		slider.setValue("0%");
		slider.setValue("1%");
		Assert.assertEquals("100%", slider.getAttribute("value"));

	}

}
