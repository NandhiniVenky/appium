package com.edgenetworks.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EdgeNetworkUtil {
	WebDriver  driver;
	@Test
	public void loginToEdgeNetwork()throws Exception{
		System.setProperty("webdriver.chrome.driver", "/Users/lenskart/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://edgetest.teamwork.com/#/dashboard/welcome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String loginPageTitle = driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_TEXT_XPATH)).getText();
		Assert.assertEquals(loginPageTitle, EdgeNetworkContants.EDGE_NETWORK_LOGINPAGETITLE);
		driver.findElement(By.id(EdgeNetworkObjectRepo.EDGE_NETWORK_EMAIL_ID)).sendKeys(EdgeNetworkContants.EDGE_NETWORK_EMAILID);
		driver.findElement(By.id(EdgeNetworkObjectRepo.EDGE_NETWORK_PWD_ID)).sendKeys(EdgeNetworkContants.EDGE_NETWORK_PWD);
		driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_LOGIN_XPATH)).click();
		WebElement ele = driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWROK_CROSS_BUTTON_XPATH));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_ADDPROJECT_BUTTON_XPATH)));
	   	driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_ADDPROJECT_BUTTON_XPATH)).click();
		driver.findElement(By.id(EdgeNetworkObjectRepo.EDGE_NETWORK_ADD_NEWPROJECT_ID)).sendKeys(EdgeNetworkContants.EDGE_NETWORK_PROJECTHEADING);
		driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_SUBMIT_BUTTON_XPATH)).click();
		driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_ADDTASK_XPATH)).click();
		driver.findElement(By.name(EdgeNetworkObjectRepo.EDGE_NETWORK_TASKNAME_NAME)).sendKeys(EdgeNetworkContants.EDGE_NETWORK_TASKNAME);
		driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_TASK_CREATED_XPATH)).click();
		driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_EDIT_OPTION_XPATH)).click();
		driver.findElement(By.xpath(EdgeNetworkObjectRepo.EDGE_NETWORK_CLOSE_BUTTON_XPATH)).click();
	}
}