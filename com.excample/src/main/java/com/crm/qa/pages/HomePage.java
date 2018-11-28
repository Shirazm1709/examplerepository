package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

@FindBy(xpath = "html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
		WebElement userNameLabel;

@FindBy(xpath = ".//*[@id='navmenu']/ul/li[4]/a")
		WebElement Contactlink;

@FindBy(xpath = ".//*[@id='navmenu']/ul/li[5]/a")
		WebElement DealsLink;

@FindBy(xpath = ".//*[@id='navmenu']/ul/li[6]/a")
		WebElement TaskLink;

//Initializing the Page object model 

public HomePage (){
	PageFactory.initElements(driver, this);
}

public String verifyHomepagetittle(){
	return driver.getTitle();
	}



public boolean verifycorrectusername(){
	return userNameLabel.isDisplayed();
	
}

public ContactPage clickoncontact(){
	Contactlink.click();
	return new ContactPage();
	
}
public DealsPage clickondeals(){
	DealsLink.click();
	return new DealsPage();
	
}

}
