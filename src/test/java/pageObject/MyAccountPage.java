package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage
{

	public MyAccountPage(WebDriver driver) 
	{
	super(driver);
	}
	// Webelement for validation
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement mssMyAccount;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement lnkLogout;
	// Action 
	public boolean isMyAccountPage()
	{
		try
		{
			return(mssMyAccount.isDisplayed());
		}
			catch (Exception e)
			{
				return false;
			}
	}
	public void clickLogout()
	{
		lnkLogout.click();
	}
}
