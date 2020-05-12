package TestSuite;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordObjects;
import pageObjects.LoginPageObjects;

import resources.BaseE2E;

public class LogingPage extends BaseE2E {
	public static Logger Log = LogManager.getLogger(LogingPage.class.getName());
	public LoginPageObjects lp;

	@BeforeTest
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		Log.info("Driver is initialized");
		//driver.get(prop.getProperty("url"));
		Log.info("Navigate to homepage");
	}

@Test(dataProvider="getNegativData")
	
	public void basePageNavegation(String UserName,String Password) throws IOException, InterruptedException {
		
		// creating object to that class and invoke methods of it
				driver.get(prop.getProperty("url"));
		
				LoginPageObjects lp= new LoginPageObjects(driver);
		lp.getLogin().click();
		
	
		lp.getemail().click();
	
		lp.getemail().sendKeys(UserName);
		lp.getpassword().click();
		lp.getpassword().sendKeys(Password);
		
		Log.info("Successfully enerned test data");
		
		
		
		
		
		
	}




@Test(dataProvider="getCorrectData")

public void basePagePostive(String UserName,String Password) throws IOException, InterruptedException {
	
	// creating object to that class and invoke methods of it
			driver.get(prop.getProperty("url"));
	
			LoginPageObjects lp= new LoginPageObjects(driver);
	lp.getLogin().click();
	

	lp.getemail().click();

	lp.getemail().sendKeys(UserName);
	lp.getpassword().click();
	lp.getpassword().sendKeys(Password);
	
	Log.info("Successfully enerned postiv  test data");
	
	
}
	
		

@AfterTest // close page 

public void teardown() {
	driver.close();
	driver=null;

}

	
	

		@DataProvider
		public Object[][] getNegativData() {
			//Row stands for how many different data types test should run 
			Object [][] data= new Object[3][2];
			//1row
		   data [0][0]= "ira.maksumic@gmail.com";//first data
		   data [0][1]= "1234567";
		   //2row
		   data [1][0]= "ira.zildzo@gmail.com";//second data
		   data [1][1]= "33234567";
		   //3r0w
		   
		   data [2][0]= "ira.zildzo356@gmail.com";//third data
		   data [2][1]= "332343567";
		  
		  
			
			return data; 
			
		}
		@DataProvider
		public Object[][] getCorrectData() {
			//Row stands for how many different data types test should run 
			Object [][] data= new Object[1][2];
			//1row
		   data [0][0]= "ira.maksumic88@gmail.com";//first data
		   data [0][1]= "123456";
		   
		  
		  
			
			return data; 
			
		}
		
	
		
}