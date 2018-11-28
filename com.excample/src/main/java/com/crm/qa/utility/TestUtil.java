package com.crm.qa.utility;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static final long PAGELOAD = 20;
	;
	public static final long IMPLICITTIME= 10;
	
	public void switchtoframe(){
		driver.switchTo().frame("mainpanel");
	}
	
	
	
}
