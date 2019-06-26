package Test;

import org.openqa.selenium.WebDriver;


public class Base 
{
public static WebDriver driver;

public Base()
{
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://classic.crmpro.com/login.cfm");
	
}


}
