package demoOrange.Testcases;

import java.util.concurrent.TimeUnit;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import demoOrange.Utils.Readconfig;




public class Baseclass    {
	
	Readconfig readconfig = new Readconfig();
	
	public String baseURL= readconfig.getAPPUrl();
	public String username= readconfig.getUsername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String brows) {
		logger=logger.getLogger("orange");
		PropertyConfigurator.configure("log4j1.properties");
		
		
		
		if(brows.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
			driver=new ChromeDriver();
			
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
		
	
	
	

}
	
	

