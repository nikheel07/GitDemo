package com.testng.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebLogin 
{
@Parameters({"URL","Pass"})	
@Test()
public void FirstMethod(String urlname,String password)
{
	System.out.println(urlname);
	System.out.println(password);
}
@Test(dataProvider="getData")
public void Mobilelogout(String uname,String pass)
{
	System.out.println("Mobile Logout mmmm");
	System.out.println(uname);

	System.out.println(pass);

}
@Test(enabled=false)
public static void Mobile1(String x)
{
	System.out.println(x);
}

@Test(groups={"Smoke"})
public void Mobile2()
{
	System.out.println("Mobile2");
}
@Test(enabled=true)
public void Mobile3()
{
	String l="I am the string that is passed";
	Mobile1(l);
	
}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[3][2];
	data[0][0]="Nik";
	data[0][1]="password";
	data[1][0]="Sun";
	data[1][1]="password1";
	data[2][0]="ram";
	data[2][1]="password2";
	return data;
}

}
