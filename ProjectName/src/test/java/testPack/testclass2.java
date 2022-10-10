package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass2 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass 2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod 2");
	}
	@Test
	public void test123()
	{
		System.out.println("test 123");
	}
	@Test
	public void test345()
	{
		System.out.println("test 345");
	}
	@Test
	public void test456()
	{
		System.out.println("test 456");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod 2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterclass 2");
	}
	
}
