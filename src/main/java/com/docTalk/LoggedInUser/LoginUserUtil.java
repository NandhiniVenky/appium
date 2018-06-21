package com.docTalk.LoggedInUser;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.docTalk.NewUser.NewUserConstants;
import com.docTalk.NewUser.NewUserObjectRepo;

public class LoginUserUtil  {
	WebDriver  driver;
	WebDriverWait wait;
	
	public void setUp() throws MalformedURLException{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0"); 
		capabilities.setCapability("deviceName","emulator-5556");
		capabilities.setCapability("unicodeKeyboard","true");
		capabilities.setCapability("platformName","Android");  
	    capabilities.setCapability("appPackage", "com.getdoctalk.doctalk.app.patient.debug");
		capabilities.setCapability("appActivity","com.getdoctalk.doctalk.app.patient.onboarding.intro.OnBoardingIntroActivity");
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	public void loginToApp(String emailId,String pwd)throws Exception{
		driver.findElement(By.id(NewUserObjectRepo.LAUNCHPAGE_LOGINUSER_LINK_ID)).click();
		String loginPageTitle = driver.findElement(By.xpath(LoginUserObjectRepo.LOGIN_TEXT_XPATH)).getText();
		if(loginPageTitle.equals(LoginUserconstants.LOGINTEXT)){
		driver.findElement(By.id(LoginUserObjectRepo.EMAIL_ADDRESS_FIELD_ID)).sendKeys(emailId);
		driver.findElement(By.id(LoginUserObjectRepo.PASSWORD_FEILD_ID)).sendKeys(pwd);
		driver.findElement(By.id(LoginUserObjectRepo.LOGIN_BUTTON_ID)).click();
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(NewUserObjectRepo.MORE_TAB_ON_HOMEPAGE_ID)));
		driver.findElement(By.id(NewUserObjectRepo.MORE_TAB_ON_HOMEPAGE_ID)).click();
		}
	}
	
		public void signOutFromApp() throws Exception{
		String userEmailId = driver.findElement(By.id(NewUserObjectRepo.USER_MAILID_ID)).getText();
		Assert.assertEquals(userEmailId, NewUserConstants.EMAIL_ID);
		String userName = driver.findElement(By.id(NewUserObjectRepo.USER_NAME_ID)).getText();
		Assert.assertEquals(userName, NewUserConstants.USER_NAME);
		driver.findElement(By.id(NewUserObjectRepo.RIGHT_CHEVRON_ID)).click();
		driver.findElement(By.id(NewUserObjectRepo.SIGNOUT_OPTION_ID)).click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(NewUserObjectRepo.SEARCH_BUTTON_ID)));
	    driver.findElement(By.xpath(NewUserObjectRepo.SEARCH_BUTTON_ID)).click();
		}

		public void subscriptionDetails() throws Exception{
		driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_DETAILS_SECTION_ID)).click();
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(LoginUserObjectRepo.SUBSCRIPTIONDETAILS_TITLE_XPATH)));
		String ActualTitle = driver.findElement(By.xpath(LoginUserObjectRepo.SUBSCRIPTIONDETAILS_TITLE_XPATH)).getText();
		Assert.assertEquals(ActualTitle, LoginUserconstants.SUBSCRIPTION_TITLE);
		String cycleLabel = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_CYCLE_LABEL_ID)).getText();
		String cycleValue = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_CYCLE_VALUE_ID)).getText();
		System.out.println("The cycle label :" +cycleLabel);
		System.out.println("The cycle value :"+cycleValue);
		String daysLabel = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_REMAINING_DAYS_LABEL_ID)).getText();
		String daysValue = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_REMAINING_DAYS_VALUE_ID)).getText();
		System.out.println("The Remaining Days label :" +daysLabel);
		System.out.println("The Remaining Days value :"+daysValue);
		String docLabel = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_DOCTOR_NAME_LABEL_ID)).getText();
		String docValue = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_DOCTOR_NAME_VALUE_ID)).getText();
		System.out.println("The Remaining Days label :" +docLabel);
		System.out.println("The Remaining Days value :"+docValue);
		String specialityLabel = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_SPECIALITY_LABEL_ID)).getText();
		String specialityValue = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_SPECIALITY_VALUE_ID)).getText();
		System.out.println("The Remaining Days label :" +specialityLabel);
		System.out.println("The Remaining Days value :"+specialityValue);
		String monthlyLabel = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_MONTHLYFEE_LABEL_ID)).getText();
		String monthlyValue = driver.findElement(By.id(LoginUserObjectRepo.SUBSCRIPTION_MONTHLYFEE_VALUE_ID)).getText();
		System.out.println("The Remaining Days label :" +monthlyLabel);
		System.out.println("The Remaining Days value :"+monthlyValue);
		}
	
	
}
