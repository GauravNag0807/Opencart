package testCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Account_registration_page;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_01_AccountRegestration_test extends BaseClass
{
		@Test
	    public void test_Account_Registration()
	    {
			loger.info(" ***         Starting TC_01_AccountRegestration_test      ***");
			try
			{
				HomePage hp= new HomePage(driver);
		        hp.clickMyAccount();
		        loger.info("Clicked My Account");
		        hp.ClickRegister();
		        loger.info("Clicked Register");
		        Account_registration_page reg=new Account_registration_page(driver);
		        reg.setFirstName(randomString());
		        loger.info("Added FIRST NAME");
		        reg.setLastName(randomString());
		        loger.info("Added LAST NAME");
	         	reg.setEmail(randomString()+"@gmail.com");
	         	loger.info("Added EMAIL");
	         	reg.setPhone(randomNumber());
	         	loger.info("Added PHONE NUMBER");
	        	reg.setPassword("kjhckjsa");
	        	loger.info("Add PASSWORD");
	        	reg.setConPassword("kjhckjsa");
	        	loger.info("Confirmed same PASSWORD");
		        reg.setSubscribe();
		        loger.info("Clicked on SUBSCRIBE");
		        reg.setAgree();
		        loger.info("Clicked on AGREE");
		        reg.setContinue();
		        loger.info("Clicked on CONTINUE");
		        String ConMsg=reg.getConfirmationMsg();
		        loger.info("Validating MESSAGE");
		        Assert.assertEquals(ConMsg,"Your Account Has Been Created!","Test FAILED");
			}
			catch(Exception e)
			{
				loger.error("Test FAILED");
				Assert.fail();
			}
	    }
}