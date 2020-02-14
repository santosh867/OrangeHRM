package demoOrange.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import demoOrange.Pageobjects.Loginpage;
import demoOrange.Utils.Readconfig;
import demoOrange.Utils.XLUtils;




public class TC_LoginTest_001 extends Baseclass {

	
	@Test
	
	
	public void Logintest() throws InterruptedException {
	
		logger.info("URL launched");
	Loginpage lp = new Loginpage(driver);
	Thread.sleep(3000);
	
	lp.txtUsername(username);
	Thread.sleep(3000);
	logger.info("username enterred");
	lp.txtPassword(password);
	logger.info("password entered");
	lp.btnLogin();
	logger.info("logined sucessfully");

	

	if(driver.getTitle().equals("OrangeHRM")){
		Assert.assertTrue(true);
	
	logger.info("test pass");
	}else {
		Assert.assertTrue(false);
		logger.info("test fail");
		
	}
	
	} 
	

}
	
	/*
	 * @DataProvider(name="LoginData") String [][] getData() throws IOException{
	 * String path =System.getProperty("user.dir")+
	 * "/src/test/java/demoOrange/TestData/Book4.xlsx"; int
	 * rownum=XLUtils.getrowcount(path, "Sheet1"); int
	 * colcount=XLUtils.getcellcount(path, "Sheet1", 1);
	 * 
	 * String Logindata[][]=new String[rownum][colcount]; for(int i=1;i<rownum;i++)
	 * { for(int j=0;j<colcount;j++) { Logindata[i-1][j]=XLUtils.getCellData(path,
	 * "Sheet1", i, j); } } return Logindata; }
	 */

