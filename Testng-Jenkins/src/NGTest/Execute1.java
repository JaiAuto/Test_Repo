package NGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execute1 {	
    public WebDriver driver ;
     
  @Test
  public void fe() {
	  System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\vamsi\\Desktop\\capgemini selenium\\Selenium setup files\\chromedriver_win32 (1)\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("http://demo.guru99.com/test/newtours/login.php");
    
      driver.close();
	       
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
