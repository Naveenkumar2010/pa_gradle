package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Logout 
{
	static Logger log = Logger.getLogger(Logout.class.getName());
	
	public void logout() throws InterruptedException, IOException
	{
		try
		{
			Thread.sleep(4500);
			//Browser.getInstance().findElement(By.className("profile-icon")).click();
			Actions actions = new Actions(Browser.getInstance());
			WebElement profile = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/li[contains(@class,'profile-icon')]/a"));
			actions.moveToElement(profile);
			actions.build().perform();
			
			Thread.sleep(2500);
			
			WebElement Number = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/div[2]/div[1]/ul/li[1]/a/span[1]"));
			String PhoneNo= Number.getText();
        
			System.out.println("Canvas US-Number : " +PhoneNo + '\n');	
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/div[2]/div[1]/ul/li[5]/a")).click();
			Browser.getInstance().close();
       	
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Logout off Canvas Application","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Logout off canvas application");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Logout off Canvas Application","Fail"};
			reportObj.writeReport(reportValues);
			Browser.getInstance().close();
			log.error("An error occurred while logging out");
		}
	}
}
