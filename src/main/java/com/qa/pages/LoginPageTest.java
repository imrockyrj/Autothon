package com.qa.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class LoginPageTest extends TestBase{
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		
	}
	
	@Test(priority=3)
	public void loginTest(){
		}
	
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
}
