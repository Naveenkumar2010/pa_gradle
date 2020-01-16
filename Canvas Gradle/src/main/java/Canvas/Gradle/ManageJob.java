package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ManageJob 
{
	static Logger log = Logger.getLogger(ManageJob.class.getName());
	
	public void JobPage() throws InterruptedException, IOException 
	{
		log.info("Invoking ManageJob class");
		//Navigating to JobPage
		try
		{
			Actions action = new Actions(Browser.getInstance());
			WebElement elem = Browser.getInstance().findElement(By.className("settings-icon"));
			action.moveToElement(elem).build().perform();
			Thread.sleep(4000);
			Browser.getInstance().findElement(By.className("settings-icon")).click();
			Thread.sleep(4000);
			Browser.getInstance().findElement(By.id("hoverNone")).click();
			
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title " + title);
			
     		ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Job page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to job page");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Job page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to job page");
		}
		
		//Navigating to All-Candiates page by clicking job count.
		
		try
		{
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/ul/li[2]")).click();
			
			System.out.println("Successfully navigated to Mine view");
			
			Thread.sleep(3000);
			WebElement jobcount = Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[2]/div/ul[2]/li[3]/a"));
			jobcount.isSelected();
			String count = jobcount.getText();
			System.out.println("Job Count : " + count + '\n');
			jobcount.click();

			Thread.sleep(4000);
								
			Actions action1 = new Actions(Browser.getInstance());
			WebElement elem1 = Browser.getInstance().findElement(By.className("settings-icon"));
			action1.moveToElement(elem1).build().perform();
			Thread.sleep(2000);
			Browser.getInstance().findElement(By.className("settings-icon")).click();
			Thread.sleep(2000);
			Browser.getInstance().findElement(By.id("hoverNone")).click();
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Candidates Page by clicking job count page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Candidates Page by clicking job count page");
		    
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Candidates Page by clicking job count page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to Candidates Page by clicking job count page");
		}
				
	 //Adding Job
		try
		{
			Thread.sleep(5000);
															
			Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[1]/div[2]/button")).click();
			Thread.sleep(2000);
			Browser.getInstance().findElement(By.id("title")).sendKeys("Software Dude II");
			Browser.getInstance().findElement(By.id("description")).sendKeys("Test to add job");
			Thread.sleep(5000);												
			WebElement Addclickjob = Browser.getInstance().findElement(By.xpath(".//*[@class='botm-section']/button[2]"));
			Addclickjob.isEnabled();
			Addclickjob.click();
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding a job in Mine View","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Adding a job");
		}
		catch(Exception e)
		{
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding a job","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while adding a job");
		}
	    
	    //Search Job
		try
		{
			Thread.sleep(2000);
			Browser.getInstance().findElement(By.id("findJob")).clear();
			Browser.getInstance().findElement(By.id("findJob")).sendKeys("Software");
			Thread.sleep(2000);
			WebElement e = Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[2]/div[1]/ul[2]/li[contains(text(),'Software Dude II')]"));
			String value = e.getText();
	  	
			if (value.equals("Software Dude II"))
			{
				ReportGenerator reportObj = new ReportGenerator();
				String[] reportValues = {"Searching a job in Mine/All View","Pass"};
				reportObj.writeReport(reportValues);
				log.info("Searching a job");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a job","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while searching a job");
		}
	    		         
	    //Editing Job
		try
		{
			Thread.sleep(3000);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/ul/li[1]")).click();
			
			System.out.println("Successfully navigated to All View");
			
			//Browser.getInstance().findElement(By.id("findJob")).clear();
			Thread.sleep(3000);			
			
			WebElement overclick = Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[2]/div[1]/ul[2]/li[8]/div[1]/a/span"));
			overclick.isEnabled();
			overclick.click();				
						
			Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[2]/div[1]/ul[2]/li[8]/div[2]/ul/li/a")).click();
			WebElement job = Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[8]/div/div[2]/div[1]/input"));
			job.clear();
			job.sendKeys("Editing Test Job");
		
			Thread.sleep(2000);	
			
			WebElement Addclickjob1 = Browser.getInstance().findElement(By.xpath(".//*[@id='edit-job']/div/div[2]/div[4]/button"));
			Addclickjob1.isEnabled();
			Addclickjob1.click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Editing a job in All View","Pass"};
			log.info("Editing a job");
			reportObj.writeReport(reportValues);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Editing a job in All View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while editing a job");
		}
		
	    //Deleting Job
		try
		{
			
			
			Thread.sleep(3500);
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/ul/li[2]")).click();
			
			System.out.println("Successfully navigated to Mine view");
			
			Thread.sleep(2000);
			Browser.getInstance().findElement(By.id("findJob")).clear();
			Browser.getInstance().findElement(By.id("findJob")).sendKeys("Edit");
			
			
			Thread.sleep(5000);
			Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[2]/div[1]/ul[2]/li[8]/div[1]/a/span")).click();
			Thread.sleep(3000);
			Browser.getInstance().findElement(By.xpath("//*[@id='job-content']/div[2]/div[1]/ul[2]/li[8]/div[2]/div")).click();															
			
			Browser.getInstance().findElement(By.xpath("//*[@id='deleteJob_confirm']/div/div[2]/button")).click();
			
			System.out.println("Successfully Job Deleted");
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a job in Mine View","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Deleting a job");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a job Mine View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while deleting a job");
		}
	}
}
