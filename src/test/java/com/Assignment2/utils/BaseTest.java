package com.Assignment2.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest {
	static WebDriver driver;
	static File file=new File("./Resources/Config.properties");
	static FileInputStream fis=null;
	static Properties prop=new Properties();
	static {
		
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
		public static void initializeDriver() {
			String browserName= prop.getProperty("browser");
			 if(browserName.equalsIgnoreCase("edge")) {
			  System.setProperty(prop.getProperty("edgeDriverProperty"),prop.getProperty("edgeDriverPath") );
			  driver = new EdgeDriver();
			 }
				
			 else if(browserName.equalsIgnoreCase("firefox")) {
			  System.setProperty(prop.getProperty("geckoDriverProperty"),prop.getProperty("geckoDriverPath") );
			  driver = new FirefoxDriver();
			 }
				
			 else if(browserName.equalsIgnoreCase("chrome")) {
			  System.setProperty(prop.getProperty("chromeDriverProperty"),prop.getProperty("chromeDriverPath") );
			  driver= new ChromeDriver();
				  }

				  }
			public static void openUrl()
		{
			driver.get(prop.getProperty("url"));
		}
		public static void close()
		{
			driver.close();
		}


}
