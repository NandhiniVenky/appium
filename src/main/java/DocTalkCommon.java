import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.PressesKeyCode;
import io.appium.java_client.android.AndroidKeyCode;

public class DocTalkCommon extends DocTalkObjectRepo {
	WebDriver  driver;
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0"); 
		capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("unicodeKeyboard","true");
		capabilities.setCapability("platformName","Android");  
	    capabilities.setCapability("appPackage", "example.com.githubissues");
		capabilities.setCapability("appActivity","example.com.githubissues.ui.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
    public void enterReproName(String reproName)throws Exception{
      WebElement searchBar = driver.findElement(By.id(SEARCHBAR_ID));
       searchBar.sendKeys(reproName);
       ((PressesKeyCode) driver).pressKeyCode(84);
       ((PressesKeyCode) driver).pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH);	
    	List<WebElement> listOfIssues = driver.findElements(By.id(LISTOFISSUES_ID));
    	for(WebElement issues :listOfIssues){
    		if(issues.equals(listOfIssues))
    		System.out.println("List of Issue :" + issues);
    		else if(issues.equals(0)){
    			System.out.println("No issues found for the searched repository");
    		}
    		else{
    			System.out.println("oops..some error occured");
    		}
    			
    	}	
   
    }
    
}
