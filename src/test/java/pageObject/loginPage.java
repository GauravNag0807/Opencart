package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage
{

	public loginPage(WebDriver driver) 
	{
		super(driver);
	}
	// Webelement locations 
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAdd;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	// webelement action
	public void setEmail(String email)
	{
		txtEmailAdd.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void ClickLogin()
	{
		btnLogin.click();
	}
}