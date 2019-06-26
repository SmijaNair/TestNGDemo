package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class day1 extends Base
{
public static WebDriver driver;

@Test(priority =1)
public void testcase1()
{
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://classic.crmpro.com/login.cfm");
	
}
	
	
	    @Test(priority=2)
		public void PersonalLoan1()
		{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SmijaNair");;
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");;
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		}
	    
	    @Test
	    public void PersonalLoan2()
	    {
	    	System.out.println("PersonalLoan2");
	    }

}
