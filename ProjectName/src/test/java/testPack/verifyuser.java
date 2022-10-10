 package testPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 


import pages.Login;
import pages.Reset;
import pages.User;



@Test
public class verifyuser {
	private WebDriver driver;
	private Login login;
	private Reset reset;
	private ArrayList <String> listOfAdress;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
		if(browserName.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\slenium2\\chromedriver2\\chromedriver.exe");
	     driver= new ChromeDriver();
		}
		
		if(browserName.equals("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "D:\\silenium\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	     driver= new FirefoxDriver();
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@BeforeClass
	public void createPomClassObject() {
		login = new Login(driver);
		reset = new Reset(driver);
	}
	
	
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Beforemethod");
		driver.get("https://www.linkedin.com/login");
		
		login = new Login(driver);
		login.ClickOnUserAgreement();
		
		String userPageUrl = driver.getCurrentUrl();
		if(userPageUrl.equals("https://www.linkedin.com/legal/user-agreement?trk=d_checkpoint_lg_consumerLogin_ft_user_agreement"))
		{
			System.out.println("useragreement is opened");
		}
		else {
			System.out.println("useragreement is not opened");
		}
		
		User user = new User(driver) ;
		user.ClickOnline();
		
	}

	public void test123() throws InterruptedException
	{
		User user = new User(driver) ;
		
		user. ClickOnReset();
		listOfAdress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(listOfAdress.get(1));
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if( url.equals("https://www.linkedin.com/uas/request-password-reset?trk=help-feature-launcher?trk=hc-hp-shortcuts"))
		{
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		reset = new Reset (driver);
	
	}
	
	@AfterMethod
	public void ClickOnBack() throws InterruptedException
	{
		 
		//Reset reset = new Reset(driver) ;
		reset. ClickOnBack();
		System.out.println("Back button pressed");
	}
	@AfterClass
	public void CleanPomObjects() {
		login = null;
		reset = null;
	}
	@AfterTest    
	public void ClosedBrowser()
	{
		System.out.println("AfterClass");
		driver.close();
		System.gc();
	}	
	
}
