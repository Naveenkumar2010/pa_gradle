package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CoachMode 
{
	
	static Logger log = Logger.getLogger(CoachMode.class.getName());
	
	public void coachMode() throws IOException
	{
		//Enter Coach Mode
		try
		{		
			Thread.sleep(5000);

			Actions actions = new Actions(Browser.getInstance());
			WebElement profile = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/li[contains(@class,'profile-icon')]/a"));
			actions.moveToElement(profile);
			actions.build().perform();
			
			Thread.sleep(2000);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/div[2]/div[1]/ul/li[4]/a")).click();
			Thread.sleep(2000);
			Select dropdown = new Select(Browser.getInstance().findElement(By.id("coachRecruiterList")));
			dropdown.selectByVisibleText("Raghunath Bhaskaran");
			
			Thread.sleep(3000);
			WebElement StartCoach = Browser.getInstance().findElement(By.xpath("//*[@id='start-coach-modal']/div/button"));
			StartCoach.isEnabled();
			StartCoach.click();
								
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Entering coach mode","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Entering coach mode");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Entering coach mode","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while entering coach mode");
		}
		
		//Naviagating to Chat Page
		
		try
		{
			Thread.sleep(7000);
			
			WebElement StartCoach1 = Browser.getInstance().findElement(By.id("chatAnchor"));
			StartCoach1.isEnabled();
			StartCoach1.click();
			//Browser.getInstance().findElement(By.id("chatAnchor")).click();
			Thread.sleep(3000);
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Sucessfully navigated to Chat Page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Sucessfully navigated to Chat Page in Coach Mode");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to chat page","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while navigating to chat page");
		}
		
/*		//Navigating to another user
		
		try
		{
			Thread.sleep(3000);
			Browser.getInstance().switchTo().activeElement();
						Select dropdown1 = new Select(Browser.getInstance().findElement(By.xpath("//*[@id='coachbannerdropdown']")));
			dropdown1.selectByVisibleText("Vasanth Martin");
			
			Browser.getInstance().findElement(By.className("coach-banner-gobutton")).click();
			
			Thread.sleep(3000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to another user","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while navigating to another user");
		}*/
		
		//Exit Coach Mode
		try
		{
			Thread.sleep(7000);

			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[41]/a")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Exiting coach mode","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Exiting coach mode");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Exiting coach mode","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while exiting coach mode");
		}
	}
}
