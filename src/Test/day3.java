package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 
{
	@Parameters({"URL"})
@Test
public void WebloginCarloan(String urlname)
{
	System.out.println("Web login Car");
	System.out.println("day 3"+urlname);
}

@Test
public void Mobilelogin()
{
	System.out.println("mobile login Car");
}
@Test
public void Mobilelogin2()
{
	System.out.println("mobile login Car2");
}
@Test
public void Mobilelogin3()
{
	System.out.println("mobile login Car3");
}
@Test
public void LoginApicall()
{
	System.out.println("login api call Car");
}
}
