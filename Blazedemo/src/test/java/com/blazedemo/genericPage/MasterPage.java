package com.blazedemo.genericPage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	public static WebDriver driver;
	public Properties prop;
	public Properties loc;
	public Properties td;
	
	public MasterPage() throws Exception{
		FileInputStream ip = new FileInputStream(".\\src\\test\\java\\com\\blazedemo\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);
		
		FileInputStream fs = new FileInputStream(".\\src\\test\\java\\com\\blazedemo\\repository\\locators.properties");
		loc = new Properties();
		loc.load(fs);
		
		FileInputStream ts = new FileInputStream(".\\src\\test\\java\\com\\blazedemo\\repository\\testdata.properties");
		td = new Properties();
		td.load(ts);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("No browser details found");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
	}

}
