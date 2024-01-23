package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.MyAccountPage;
import pageObject.loginPage;
import testBase.BaseClass;

public class TC_02_LoginPageTest extends BaseClass
{
// testing steps
	@Test
	public void testlogin()
	{
		try
		{
			loger.info(" *** OPENING HOME PAGE ***");
		    HomePage hp=new HomePage(driver);
		    loger.info(" *** CLICKING ON MY ACCOUNT ***");
		    hp.clickMyAccount();
		    loger.info(" *** CLICKING ON LOGIN ***");
	        hp.clickLogin();
	        loger.info(" *** OPENING LOGIN PAGE ***");
	        loginPage lp=new loginPage(driver);
	        loger.info(" *** INSERTING EMAIL ***");
	        lp.setEmail(rb.getString("email"));
	        loger.info(" *** INSERTING PASSWORD ***");
	        lp.setPassword(rb.getString("password"));
	        loger.info(" *** CLICKING ON LOGIN BUTTON ***");
	        lp.ClickLogin();
	        loger.info(" *** OPENING MY ACCOUNT PAGE ***");
	        MyAccountPage map=new MyAccountPage(driver);
	        boolean targetpagemap=map.isMyAccountPage();
	        Assert.assertEquals(targetpagemap, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
