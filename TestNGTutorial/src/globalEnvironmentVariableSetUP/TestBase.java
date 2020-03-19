package globalEnvironmentVariableSetUP;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {
	public WebDriver driver = null;
	
	@Test
	public void Login() throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("F:\\EclipseIde_workSpace\\TestNGTutorial\\dataDriven.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("UserName"));
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "E:\\SeleniumChrome\\chromedriver.exe");
			System.setProperty(prop.getProperty("chromeDriver"), prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("fireFox"))
		{
			//System.setProperty("webdriver.gecko.drive", "E:\\SeleniumFireFox\\geckodriver.exe");
			System.setProperty(prop.getProperty("firFoxDriver"), prop.getProperty("firFoxPath"));
			driver = new FirefoxDriver();
			
		}
		else
		{
			//System.setProperty("webdriver.ie.driver", "E:\\SeleniumIE\\MicrosoftWebDriver.exe");
			System.setProperty(prop.getProperty("IeDriver"), prop.getProperty("IePath"));
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}
	

}
