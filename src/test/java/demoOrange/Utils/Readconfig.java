package demoOrange.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import demoOrange.Testcases.TC_LoginTest_001;

public class Readconfig  {
	static Properties prop;
	
	public Readconfig() {
		File src= new File("./Configuration\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
			
			
		}catch(Exception e) {
			System.out.println("exception is"+e.getMessage());
		}
	}
	
	public  String getAPPUrl() {
		String url =  prop.getProperty("baseURL");
		 return url;
	}
	
	public String getUsername() {
		String username = prop.getProperty("username");
		return username;
	}
	
	public String  getpassword() {
		String password = prop.getProperty("password");
		return password;
	}
	
	public String getchromepath() {
		String chromepath = prop.getProperty("chromepath");
		return chromepath;
	}

}
