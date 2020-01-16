package Canvas.Gradle;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Analytics {
	
	static Logger log = Logger.getLogger(Amplify.class.getName());
	   
    public void team() throws IOException, InterruptedException   
    
{
	//Navigating to Analytics Page - Team View
	
	try
	{
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.id("analyticsAnchor")).click();
		
		Thread.sleep(3500);
		
		Browser.getInstance().findElement(By.id("teamtab")).click();
		
		System.out.println("Successfully navigated to Team View");
		
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Sucessfully navigated to Analytics Page","Pass"};
		reportObj.writeReport(reportValues);
		log.info("Sucessfully navigated to Analytics Page");
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Sucessfully navigated to Analytics Pager","Fail"};
		reportObj.writeReport(reportValues);
		log.info("An error occurred while navigating to Analytics Page");	
	}

	
	//Selecting Time Interval Dropdown :
	try
	{
		Thread.sleep(3000);
		
		Select Intervaldropdown = new Select(Browser.getInstance().findElement(By.className("analyticsPeriodClass")));
		Intervaldropdown.selectByVisibleText("Last Month");
		
		Thread.sleep(6000);	
		
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Selecting Time Interval Dropdown Last Month","Pass"};
		reportObj.writeReport(reportValues);
		log.info("Selecting Time Interval Dropdown Last Month");
	
	}
	
	
	catch(Exception e)
	{
		e.printStackTrace();
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Selecting Time Interval Dropdown Last Month","Fail"};
		reportObj.writeReport(reportValues);
		log.info("An error occurred while Selecting Time Interval Dropdown Last Month");
	}
		
		
  //Selecting values from Team Dropdown
	
	try
	{
		Thread.sleep(2000);
		
		Browser.getInstance().findElement(By.className("teamDropdownImg")).click();
		
		//Printing Team Value/Selecting Team value from drodpdown.
		
		Thread.sleep(2000);

		WebElement Team = Browser.getInstance().findElement(By.xpath("//*[@id='analyticsTeamDetail']/li[2]"));
		
		String Teamname = Team.getText();
		
		System.out.println("Team Name : "  +Teamname);
		
		Team.click();
		
		System.out.println("Team Details Selected sucessfully from the Team dropdown");
		
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Team selected from Team Detail table dropdown","Pass"};
		reportObj.writeReport(reportValues);
		String[] reportValues1 = {"Team Name printed successfully","Pass"};
		reportObj.writeReport(reportValues1);		
		log.info("Selecting values from the Team Dropdown");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Team selected from Team Detail table dropdown","Fail"};
		reportObj.writeReport(reportValues);		
		String[] reportValues1 = {"Team Name printed successfully","Fail"};
		reportObj.writeReport(reportValues1);
		
		log.info("An error occurred while selecting Team dropdow");
		
	}


}
}