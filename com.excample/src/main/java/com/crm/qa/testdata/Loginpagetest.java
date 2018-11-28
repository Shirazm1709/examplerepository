package com.crm.qa.testdata;

import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpage;

public class Loginpagetest extends TestBase{
	Loginpage loginpage;
	HomePage homepage;
	
	public Loginpagetest(){
	 super();
	 	}

	@BeforeClass
	public void setup(){
	initilization();
	 loginpage=new Loginpage();
	}
	
	@Test (priority = 1)
	public void loginPagetittletest(){
	String tittle = loginpage.Validatetittleofthepage1();
	Assert.assertEquals(tittle, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test (priority = 2)
	public void loginTest(){
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));	
	}
	
	@AfterClass
	public void close(){
	driver.close();
	}
		
	}

	