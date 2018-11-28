package com.crm.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.crm.qa.utility.TestUtil;

public class TestBase {

		public static WebDriver driver;
		public static Properties prop;
	
		public TestBase(){
		
	try{
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Duggi\\workspace\\com.excample\\src\\main\\java\\com\\crm\\qa\\config\\config.property");
		prop.load(ip);
	}
	catch (FileNotFoundException e){
		e.printStackTrace();
	}
	catch (IOException e){
		e.printStackTrace();
	}
	}
	public static void initilization(){
	String browserName= prop.getProperty("browser");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Duggi\\Desktop\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOAD, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITTIME, TimeUnit.SECONDS);
	 driver.get(prop.getProperty("url"));
}
	}