package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Account_registration_page extends BasePage
{

	public Account_registration_page(WebDriver driver)
	{
		super(driver);
	}
	//Elements
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	@FindBy(name="lastname")
	WebElement txtLastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtPhone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConPassword;
	@FindBy(xpath="//label[normalize-space()='Yes']")
	WebElement btnSubscribe;
	@FindBy(xpath="//input[@name='agree']")
	WebElement btnAgree;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmationMsg;

public void setFirstName(String fname)
{
	txtFirstname.sendKeys(fname);
}
public void setLastName(String lname)
{
	txtLastname.sendKeys(lname);
}
public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}
public void setPhone(String phone)
{
	txtPhone.sendKeys(phone);
}
public void setPassword(String password)
{
	txtPassword.sendKeys(password);
}
public void setConPassword(String password)
{
	txtConPassword.sendKeys(password);
}
public void setSubscribe()
{
	Actions act=new Actions(driver);
	act.click(btnSubscribe).perform();
}
public void setAgree()
{
	btnAgree.click();
}
public void setContinue()
{
	btnContinue.click();
}
public String getConfirmationMsg()
{
	try
	{
		return(msgConfirmationMsg.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
		
	}
}
}

