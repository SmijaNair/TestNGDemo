package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day5 
{
	

@Test(dataProvider="getData")
public void method1(String firstName, String lastName)
{
	System.out.println("**********Method 1 starts here**********");
	System.out.println("FullName is"+ firstName + lastName);
}

@DataProvider
public Object[][] getData()
{
	Object[][] data = new Object[3][2];
	
	data[0][0]="Smija";
	data[0][1]="Nair"; 
	
	data[1][0]="Ajay";
	data[1][1]="Sharma";
	
	data[2][0]="Neha";
	data[2][1]="Dhupia";
			
	return data;
}
}
