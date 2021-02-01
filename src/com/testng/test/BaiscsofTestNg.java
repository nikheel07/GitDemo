package com.testng.test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaiscsofTestNg 
{
	
@BeforeClass
public void print()
{
	
	System.out.println("Mastering");
}
@AfterTest
public void SecondMethod()
{
	System.out.println("Second Method");
	
}
@Test(groups={"Smoke"})
public void ThirdMethod()
{
	System.out.println("ThirdMethod");
	
}



}
