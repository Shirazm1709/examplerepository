package com.crm.qa.testdata;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Loginpage;
import com.crm.qa.utility.TestUtil;

public class HomePagetest extends TestBase{
	Loginpage loginpage;
	HomePage homepage;
	TestUtil testutil;
	
	public HomePagetest(){
	 super();
	 	}

	@BeforeClass
	public void setup(){
	initilization();
	loginpage=new Loginpage();
	testutil = new TestUtil();
	homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyhomepagetittles(){
	String Homepagetittle = homepage.verifyHomepagetittle();
	Assert.assertEquals(Homepagetittle, "CMPRO", "Homepage tittle incorrect");
	}
	
	@Test(priority = 2)
	public void verifyusername(){
	testutil.switchtoframe(); 		
	Assert.assertTrue(homepage.verifycorrectusername());
	}
	
	@AfterClass
	public void closebroswer(){
	driver.close();
	}
	}
