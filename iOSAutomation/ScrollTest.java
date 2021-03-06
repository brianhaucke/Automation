import java.net.MalformedURLException;
import java.util.HashMap;

import io.appium.java_client.ios.IOSDriver;

public class ScrollTest extends BaseiOSTest{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		IOSDriver driver = DesiredCapabilities();
		//scroll swipe - Up / Down
		HashMap<String,Object>scrollObject = new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("name", "Web View");
		
		
		// driver.executeScript("mobile:scroll", scrollObject);
		
		driver.findElementByAccessibilityId("Web View").click();
		driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();
		                      
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
		driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
		driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");
		System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());



		
		

	}

}
