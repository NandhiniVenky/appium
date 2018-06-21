package com.docTalk.LoggedInUser;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.docTalk.NewUser.NewUserConstants;

public class LoginUserTest {
LoginUserUtil login = new LoginUserUtil();

@BeforeMethod
@Parameters({"emailId","pwd"})
public void launchTheApp(@Optional(NewUserConstants.EMAIL_ID)String emailId,@Optional(NewUserConstants.PASSWORD)String pwd)throws Exception{
	login.setUp();
	login.loginToApp(emailId, pwd);
}
@Test
public void loginToAppUsingValidCredentials()throws Exception{
	login.signOutFromApp();
}

@Test
public void printSubscriptionDetailsOfPatient()throws Exception{
	login.subscriptionDetails();
}

}

