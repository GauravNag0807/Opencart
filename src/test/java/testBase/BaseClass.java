package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass
{
	public WebDriver driver;
	public Logger loger;
	public ResourceBundle rb;
	
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		rb=ResourceBundle.getBundle("config");  // load config.properties file to take data
		loger=LogManager.getLogger(this.getClass());
		/*ChromeOptions option= new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});*/
		WebDriverManager.chromedriver().setup(); 
		/*if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
		driver.get("http://localhost/opencode/index.php?route=common/home&language=en-gb");
		//driver.get(rb.getString("url"));
		driver.manage().window().maximize();
	}
	public void tear()
	{
		driver.close();
	}
	public String randomString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(9);
		return(generatedString);
	}
	public String randomNumber()
	{
		String generatedString2=RandomStringUtils.randomNumeric(10);
		return(generatedString2);
	}
	/* public String captureScreenshot(String tname)throws IOExceptions
	{
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	} */
}
