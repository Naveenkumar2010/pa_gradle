package Canvas.Gradle;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;




public class Login {
  
	static Logger log = Logger.getLogger(Login.class.getName());
	
   
     public void login() throws IOException, InterruptedException
		{
			//Login to Canvas application with invalid credentials
			try
			{
				Thread.sleep(2000);			
				Browser.getInstance().get("https://dev1.mycanvas.io/#/login");		
								
				Thread.sleep(500);
				Browser.getInstance().manage().window().maximize();	
				
				Browser.getInstance().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				TakesScreenshot ts = (TakesScreenshot)Browser.getInstance();
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("C:\\Users\\naveenkumar.r\\Documents\\My Received Files\\Screen.png"));
				System.out.println("the Screenshot is taken");
				
				Thread.sleep(2000);	
				
				Browser.getInstance().close();
//				  TakesScreenshot scrShot =((TakesScreenshot)Browser.getInstance());
//				  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//				  FileUtils.copyFile(SrcFile, "C:\\Users\\naveenkumar.r\\Documents\\");
//				Thread.sleep(4000);												
//				Browser.getInstance().manage().window().maximize();						
//												
//				Thread.sleep(2000);			
//				Browser.getInstance().get("https://dev1.mycanvas.io/#/login");		
//								
//				Thread.sleep(500);
//									
//				Browser.getInstance().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//				Browser.getInstance().findElement(By.name("userName")).clear();		
//				WebElement Element = Browser.getInstance().findElement(By.xpath("//input[contains(@id='userName' OR @name='userNameddd')]"));
//				Element.sendKeys("naveenkumar.r@prodapt.com");						
//													
//				Thread.sleep(500);
//				Browser.getInstance().findElement(By.id("password")).clear();
//				Browser.getInstance().findElement(By.id("password")).sendKeys("test111");							
//								
//				Browser.getInstance().findElement(By.xpath("/html/body/div/div[\".*[^0-99].*\"]/div/div/div/div[\".*[^0-99].*\"]/form/button")).click();
//				Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div/div/div[\".*[^0-99].*\"]/form/div[\".*[^0-99].*\"]/span[contains(text(),'Error with login')]"));			
//				log.info("Error with login message verified");						
//				ReportGenerator reportObj = new ReportGenerator();
//				String[] reportValues = {"Login to Canvas application with invalid credentials","Pass"};
//				reportObj.writeReport(reportValues);
//				log.info("Login to canvas application with invalid credentials");
//				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
				ReportGenerator reportObj = new ReportGenerator();
				String[] reportValues = {"Login to Canvas application with invalid credentials","Fail"};
				reportObj.writeReport(reportValues);
				log.error("An error occurred while login with invalid credentials");
			}			
					
			//Login to Canvas application with valid credentials
			try
			{
//				Thread.sleep(1000);
//				
//				Browser.getInstance().findElement(By.name("userName")).clear();
//				Thread.sleep(1000);
//				Browser.getInstance().findElement(By.name("userName")).sendKeys("naveenkumar.r@prodapt.com");
//				Thread.sleep(1000);
//				Browser.getInstance().findElement(By.id("password")).clear();
//				Thread.sleep(1000);
//				Browser.getInstance().findElement(By.id("password")).sendKeys("p@assword");
//				Thread.sleep(1000);
//				WebElement a =  Browser.getInstance().findElement(By.xpath("/html/body/div/div[\".*[^0-99].*\"]/div/div/div/div[\".*[^0-99].*\"]/form/button"));
//				a.click();
//				Browser.getInstance().findElement(By.id("candidateAnchor"));
//				
//				ReportGenerator reportObj = new ReportGenerator();
//				String[] reportValues = {"Login to Canvas application with valid credentials","Pass"};
//				reportObj.writeReport(reportValues);
//				log.info("Login to canvas application with valid credentials");
			}
			catch (Exception e)
			{
				e.printStackTrace();
				System.exit(0);
				
				ReportGenerator reportObj = new ReportGenerator();
				String[] reportValues = {"Login to Canvas application with valid credentials","Fail"};
				reportObj.writeReport(reportValues);
				log.error("An error occurred while login with valid credentials");
			}			
			
  }


}	


