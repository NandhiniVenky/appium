package com.docTalk.NewUser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewUserUtil {
	WebDriver  driver;
	WebDriverWait wait;
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0"); 
		capabilities.setCapability("deviceName","93d17a71");
		capabilities.setCapability("unicodeKeyboard","true");
		capabilities.setCapability("platformName","Android");  
	    capabilities.setCapability("appPackage", "com.getdoctalk.doctalk.app.patient.debug");
		capabilities.setCapability("appActivity","com.getdoctalk.doctalk.app.patient.onboarding.intro.OnBoardingIntroActivity");
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	
}
