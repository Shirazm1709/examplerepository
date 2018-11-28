package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase{
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath = ".//*[@id='loginForm']/div/div/input")
	WebElement Login;
	
	@FindBy(xpath = ".//*[@id='navbar-collapse']/ul/li[2]/a/font")
	WebElement Signup;
	
	//Initializing the Page objects 
	public Loginpage(){
	PageFactory.initElements(driver, this);
	
	//Actions
	}
	public String Validatetittleofthepage1(){
	return driver.getTitle();
	}
	
	public HomePage Login(String un,String pwd){

		username.sendKeys(un);
		password.sendKeys(pwd);
		Login.click();
		
		return new HomePage();
		
	}
}
