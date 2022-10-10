package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	
	
	@FindBy (xpath ="//a[text()='User Agreement']")
	private WebElement userAgreement;
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement userName;
	
	@FindBy (xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Sign in']")
	private WebElement signIn;
	
	public Login (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnUserAgreement() {
		userAgreement.click();
	}
	
	public void SendUserName() {
		userName.sendKeys("asdfghjkl");
	}
	
	public void SendPassword() {
		password.sendKeys("zxcvbnm");
	}
	
	
}


