package com.qa.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static Properties prop; 
	public static WebDriver driver;
	
	public TestBase() {
		prop = new Properties(); 
		try {
			InputStream input=new FileInputStream("D:\\workspace\\CucumberPOM_BDD\\src\\main\\java\\com\\qa\\config\\Config.properties");
			prop.load(input);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void invokeURL() {
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\CucumberPOM_BDD\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
