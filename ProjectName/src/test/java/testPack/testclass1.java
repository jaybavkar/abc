package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass1 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeclass 1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod 1");
	}
	@Test
	public void test123()
	{
		System.out.println("test 1234");
	}
	@Test
	public void test345()
	{
		System.out.println("test 3456");
	}
	@Test
	public void test456()
	{
		System.out.println("test 4567");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod 1");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterclass 1");
	}
	
}
