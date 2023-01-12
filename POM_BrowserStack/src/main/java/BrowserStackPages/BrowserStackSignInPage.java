package BrowserStackPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserStackSignInPage 
{
	//Object repository
	WebDriver driver;
	By UserEmail = By.xpath("//input[@id='user_email_login']");
	By UserPassword = By.xpath("//input[@id='user_password']");
	By LoginBtn = By.xpath("//input[@id='user_submit']");
	
	//Constructor
	public BrowserStackSignInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Methods
	public void enterUserEmail(String useremail)
	{
		driver.findElement(UserEmail).sendKeys(useremail);
	}
	public void enterUserPassword(String userpassword)
	{
		driver.findElement(UserPassword).sendKeys(userpassword);
	}
	public void ClickOnLogin()
	{
		driver.findElement(LoginBtn).click();
	}
	

}
