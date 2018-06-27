package com.qainfotech.training;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
	
public void setLogin(WebDriver driver)
	
{  
	//driver.switchTo().defaultContent();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='demo-2']/div/div[2]/ul/li[1]/a")));
	driver.findElement(By.xpath("//*[@id='demo-2']/div/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.id("txtUserName")).sendKeys("architKumar");
    driver.findElement(By.id("txtPassword")).sendKeys("");
	driver.findElement(By.name("Submit")).click();
	WebElement use = driver.findElement(By.id("txtPassword"));
		if(	use.getAttribute("style").contains("red"));

          {
	        System.out.println("Invalid Credentials ,Enter Password");
	       // driver.quit();
           }   

}
   public void enter_username_incorrect_password(WebDriver driver)
   { 
	   driver.findElement(By.id("txtUserName")).clear();
	   driver.findElement(By.id("txtUserName")).sendKeys("architkumar");
	   driver.findElement(By.id("txtPassword")).sendKeys("123");
		driver.findElement(By.name("Submit")).click();
		//driver.findElement(By.xpath("//*[@id='demo-2']/div/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//i[@class='icon-lock']")).click();
		WebElement use2 = driver.findElement(By.cssSelector("#login > form > div.loginTxt.txtHideDiv.alert.alert-error"));
		String store_message= use2.getText();
		System.out.println(store_message);
		if(store_message.equals("Invalid Login") )
		{
		System.out.println("incorrect credentials");
		}
		
		
   }
		public void enter_username_correct_password(WebDriver driver)
		{
			driver.findElement(By.id("txtUserName")).sendKeys("architkumar");
			driver.findElement(By.id("txtPassword")).sendKeys("Archit@321#");
			driver.findElement(By.name("Submit")).click();
			String use3=driver.getCurrentUrl();
			if(use3.equals("https://hris.qainfotech.com:8086/time/timesheet"))
			{
				System.out.println("You are logged in");
			}
			}
		}
		
		
   
