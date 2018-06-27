package com.qainfotech.training;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
	App app = new App();
	 WebDriver driver;
  @BeforeClass
  public void setDriver()
  { 
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\architkumar\\workspace\\chromedriver.exe");

	 driver = new ChromeDriver();
    driver.get("https://hris.qainfotech.com/login.php#");
  }
    
    @Test(priority=0)
    public void shouldAnswerWithTrue()
    {
    	
        //Assert.assertTrue(app.setLogin());
    }
    @Test(priority=1)
    public void setLogin1()
    {
    	
  app.setLogin(driver);
  	
    }
    @Test(priority=2)
   public void enter_username_incorrect_password()
   {
    	app.enter_username_incorrect_password(driver);
   }
   @Test(priority=3)
   public void enter_username_correct_password()
   {
	   app.enter_username_correct_password(driver);
   }
  }

