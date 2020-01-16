package Canvas.Gradle;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Imports {
	
	static Logger log = Logger.getLogger(Imports.class.getName());
	
	public void ImportsPage()  throws InterruptedException, IOException 
	{
		log.info("Invoking ImportModal class");
		
		try
		{
			Thread.sleep(3500);
			Actions action = new Actions(Browser.getInstance());
			WebElement elem = Browser.getInstance().findElement(By.className("settings-icon"));
			action.moveToElement(elem).build().perform();
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.className("settings-icon")).click();
			Thread.sleep(5500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/ol/li[3]")).click();
			Thread.sleep(2500);
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title " + title);
			
	   	    ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Import Page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to import page");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Import page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to import page");
		}
		
		//Searching in imports page.
		
		try
		{
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.id("findImport")).sendKeys("Jobvite");	
			
			WebElement search = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr/td[1]"));
			String searchresults = search.getText();
			System.out.println(searchresults);
			
			System.out.println("Search successfully");
			
			//Navigating to All View
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'candheadinglist')]/ul/li[1]")).click();
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.className("jobSearchX")).click();
			
			System.out.println("Search results successfully cleared");			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Search applied/cleared successfully","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Search applied/cleared successfully");						
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Search applied/cleared successfully","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while Searching applied/cleared successfully");
		}
		//Navigating to All page and applying filter
		try
		{
			Thread.sleep(5500);
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'candheadinglist')]/ul/li[1]")).click();
			
			Thread.sleep(2500);
						
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/span"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/img")).click();
			
			//Apply filter
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/ul/li/input[1]")).sendKeys("Vasanth");
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/ul/li/input[2]")).click();
			
	   	    ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to All page and applying filter","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to All page and applying filtere");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to All page and applying filter","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to All page and applying filter");
		}
		
		//Sorting & Clearing Filter
		try
		{
			//Applying sorting to all the fields
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[4]")).click();
			
			System.out.println("Successes column sorted successfully");
			
			Thread.sleep(2500);
					
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[5]")).click();
			
			System.out.println("Failures column sorted successfully");
			
			Thread.sleep(2500);			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[6]")).click();	
			
			System.out.println("Duplicates column sorted successfully");
			
			Thread.sleep(2500);			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]")).click();	
			
			System.out.println("Status column sorted successfully");
						
			Thread.sleep(2500);			

			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/img")).click();
			
			Thread.sleep(2500);	
			
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,400)");
			
			Thread.sleep(2500);
			
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(400,0)");
								
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/div/a")).click();
				
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Clearing Filter in All view","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Sort successfully applied to Successes column","Pass"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 = {"Sort successfully applied to Failures column","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 = {"Sort successfully applied to Duplicates column","Pass"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Sort successfully applied to Status column","Pass"};
			reportObj.writeReport(reportValues4);
			log.info("Clearing Filter and Sorting in All view");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Clearing Filter in All view","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Sort successfully applied to Successes column","Fail"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 = {"Sort successfully applied to Failures column","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 = {"Sort successfully applied to Duplicates column","Fail"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Sort successfully applied to Status column","Fail"};
			reportObj.writeReport(reportValues4);
			log.info("Clearing Filter and Sorting in All view");
		}
		
		//Status filter
		try
		{
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'candheadinglist')]/ul/li[2]")).click();
			
			Thread.sleep(2500);
		
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/span"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
		
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
			
	   //Appling Filter
			
			 Select dropdown =new Select(Browser.getInstance().findElement(By.xpath("//ul[contains(@id,'importStatus' )]/li/select")));
		     dropdown.selectByVisibleText("Show All");
			
		     Thread.sleep(1500);
		     
		     Browser.getInstance().findElement(By.xpath("//div[contains(@id,'importStatusFilterDivID')]//ul//li//input")).click();
		     
		     System.out.println("Status filter applied successfully");
		     
		     
	   //Navigating to All View
		     
		     Thread.sleep(3500);	     
		    
		 	 Browser.getInstance().findElement(By.xpath("//div[contains(@class,'candheadinglist')]/ul/li[1]")).click();
		 	 Thread.sleep(4500);
		 	 
	   //Clearing Filter from All View	 	 	 	
		 	 
		 	Actions actions1 = new Actions(Browser.getInstance());
			WebElement menu1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/span"));
			actions1.moveToElement(menu1);

			WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
			actions1.moveToElement(subMenu1);
			actions1.build().perform();
			Thread.sleep(2500);
		
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@id,'importStatusFilterDivID')]//div//a")).click();
		 	 
		 	 
			System.out.println("Status Filter successfully cleared");
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Status filter applied/cleared successfully in All/Mine view","Pass"};
			reportObj.writeReport(reportValues);
			log.info("successfully verified the functionalities of Status filter");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Status filter applied/cleared successfully in All/Mine view","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while verifingd the functionalities of Status filter");
		}
		
	

}
}