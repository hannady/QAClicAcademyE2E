package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseE2E {
public WebDriver driver;
public Properties prop;

public WebDriver initializeDriver() throws IOException {

			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\iram\\NewProject2020\\QAClickProjectE2E\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName=prop.getProperty("browser");
			System.out.println(browserName);

			// CHROME BROWSER
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\iram\\Desktop\\SELENIUM\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
               driver = new ChromeDriver();
				
			} else if (browserName.equals("fireforx")) {

				// execute in FIREFOX
			} else if (browserName.equals("internetExplorer")) {

				// EXECUTE in IE
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			return driver;
		}
public void getScreenShot(String testCaseName,WebDriver driver) throws IOException {
	TakesScreenshot ts= (TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String destinationFile= System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
}
		
}
