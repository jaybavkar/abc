package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class User {
	private WebDriver driver;
	
	
	@FindBy (xpath = "//a[text()='online']")
	public WebElement online;
		
		@FindBy (xpath = "//span[text()='Data and Privacy']")
		public WebElement dataAndPrivacy;
		
		@FindBy (xpath = "//a[text()='Reset your password']")
		public WebElement reset;
		
		
		
		public User (WebDriver driver123)
		{
			PageFactory.initElements(driver123, this);
			this.driver=driver123;
		}
		public void ClickOnDataAndPrivacy() {
			dataAndPrivacy .click();
		}
		
		public void ClickOnline() {
			online.click();
		}
		public void ClickOnReset() throws InterruptedException {
			
			reset.click();
			Thread.sleep(3000);
		}
		
		
		}
