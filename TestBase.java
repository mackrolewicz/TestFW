package com.w2a.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

//import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.utilities.ExcelReader;

public class TestBase {

	
	
	
	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static FileInputStream	 fis;
	
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	
	public static WebDriverWait wait;
	
	@BeforeSuite
	public void setUp() throws IOException {
		
		
		if(driver==null) {
			
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
			config.load(fis);
			log.debug("Config file loaded !!!");
			
			
			FileInputStream fis1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
			OR.load(fis1);
			log.debug("Object Repository file loaded !!!");
			
		}
		
		if(config.getProperty("browser").equals("chrome")) {
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mackr\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Chrome Launched !!!");
			
			
		}
		
		else if(config.getProperty("browser").equals("firefox")) {
			
			
			System.setProperty("webdriver.gecko.driver","gecko.exe");
			driver = new FirefoxDriver();
			
			  
		}
		
		else if(config.getProperty("browser").equals("IE")) {
			
			
			System.setProperty("webdriver.gecko.driver","gecko.exe");
			driver = new FirefoxDriver();
			
			
		}
		
		driver.get(config.getProperty("testsiteurl"));
		log.debug("Navigated to : "+config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,5); 
			
			
			
		}
	

	public boolean isElementPresent(By by) {
		
		try {
			
			driver.findElement(by);
			return true;
			
		}catch(NoSuchElementException e) {
			
			
			return false;
			
		}
		
		
		
	}
	
	
	@AfterSuite
	public void tearDown() {
		if(driver!=null) {
		driver.quit();
		}
		
		log.debug("test execution completed successfully!!!");
	}
}
