package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Reset {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@FindBy (xpath = "//a[text()='Back']")
	public WebElement back;
	
	public Reset (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =driver;
	}
	
	public void ClickOnBack() throws InterruptedException {
		wait = new WebDriverWait(driver,20);
		back.click();
}
}