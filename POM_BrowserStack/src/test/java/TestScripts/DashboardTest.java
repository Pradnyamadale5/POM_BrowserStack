package TestScripts;

import org.testng.annotations.Test;

import BrowserStackPages.BrowserStackDashboardPage;
import BrowserStackPages.BrowserStackSignInPage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DashboardTest
{
  public WebDriver driver ;
  BrowserStackSignInPage bssip;
  BrowserStackDashboardPage bsdp;
  
  
  @Test(priority = 1)
   public void loginTest()
  {
	  bssip = new BrowserStackSignInPage(driver);
//	  bssip.enterUserEmail("info@utkarshaaacademy.com");
//	  bssip.enterUserPassword("gujar1311");
	  bssip.enterUserEmail("pradnya.madle.sndt@gmail.com");
	  bssip.enterUserPassword("pradnya1987");
	  bssip.ClickOnLogin();
  }
  
  @Test(priority = 2)
  public void Dashboardtest()
  {
	  bsdp = new BrowserStackDashboardPage(driver);
	  bsdp.UserProfileClick();
	  bsdp.ClickonSummary();
	  //Assert.assertEquals(bsdp.verifyUserName(), "Utkarshaa Academy");
	  Assert.assertEquals(bsdp.verifyUserName(), "Pradnya Madale");
  }
  @BeforeTest
  public void setup() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.browserstack.com/users/sign_in");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
