package demoOrange.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;



public class Loginpage   {
	
	
	WebDriver ldriver;
	public  Loginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	@CacheLookup
	WebElement Usename;
	
	
	@FindBy(xpath="//input[@id='txtPassword']")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	/*
	 * @FindBy(
	 * css="div:nth-child(1) div.panelContainer:nth-child(6) ul:nth-child(1) li:nth-child(3) > a:nth-child(1)"
	 * )
	 * 
	 * @CacheLookup WebElement btnlogout;
	 */
	
	public void txtUsername(String Username) {
		Usename.sendKeys(Username);
	}
	
	public void txtPassword(String password) {
		txtpassword.sendKeys(password);
		
	}
		public void btnLogin() {
			btnLogin.click();
			
		
	}
		
	/*
	 * public void btnLogout() { btnlogout.click(); }
	 */
}
