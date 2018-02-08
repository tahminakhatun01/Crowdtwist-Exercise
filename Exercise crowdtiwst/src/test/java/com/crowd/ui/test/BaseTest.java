package com.crowd.ui.test;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;

	import org.junit.Before;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	

	public class BaseTest 
	{
		
		WebDriver driver;
		@Before
		public void openBrowser() throws IOException  
		{
			FileInputStream file= new FileInputStream("config.properties");
			Properties properties= new Properties();
			properties.load(file);
			
			if (properties.getProperty("browser").equals("firefox"))
			{
			
				System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("=========Browser open===========");
				driver.get(properties.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			else if (properties.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
				 driver= new ChromeDriver();
				 System.out.println("=========Browser open===========");
				 driver.get(properties.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				 
			}
			
			
		}
		@After

		public void closeBrowser() {
			driver.close();
			System.out.println("=========Browser Close===========");
			
		}
	}

 

