package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightNav_Features {
	
static Logger log = Logger.getLogger(Preference.class.getName());
	
	public void History() throws IOException  {
		
	//Navigating to Message history page
		
		try
		{
			System.out.println("Navigating to Chat Page");
			Thread.sleep(8000);			
			Actions action = new Actions(Browser.getInstance());
			WebElement e = Browser.getInstance().findElement(By.xpath(".//*[@id='chatAnchor']"));
			action.moveToElement(e).build().perform();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath(".//*[@id='chatAnchor']")).click();
								
			Thread.sleep(8000);		
			Browser.getInstance().findElement(By.id("search")).clear();
			Browser.getInstance().findElement(By.id("search")).sendKeys("Vasanth");
			
			Thread.sleep(7500);			
			Browser.getInstance().findElement(By.id("a0d308e1-3238-4171-b788-c4bd1fc2619e")).click();
							
			Thread.sleep(7500);
				
			WebElement Messagehistory = Browser.getInstance().findElement(By.xpath("//*[@id='chatRightNavID']/div[1]/div[9]/div/span"));
			Messagehistory.isEnabled();		
			Messagehistory.click();
			
			Thread.sleep(4500);
			
			WebElement Recruiter = Browser.getInstance().findElement(By.xpath("//*[@id='chatviewdetail']/div/ul/li[1]")); 
																			  
			Recruiter.click();
			
			WebElement Name = Browser.getInstance().findElement(By.className("recuritername"));
			
			String Recname = Name.getText();
			
			System.out.println(Recname);
			
			Thread.sleep(3500);
			
			String mainwindow = Browser.getInstance().getCurrentUrl();
			System.out.println(mainwindow);
						
			//Selecting today in datefilter dropdown
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='gridSystemModalLabel']/div/div[2]/input")).click();
		
			Browser.getInstance().findElement(By.xpath("//*[@id='messagePeriodListOptionsId']/li[2]/a")).click();
			Thread.sleep(2500);			
				
			Actions actions = new Actions(Browser.getInstance());
			
			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='gridSystemModalLabel']/img[1]"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='gridSystemModalLabel']/img[1]")).click();
			
			System.out.println("Message history downloaded successfully");
			
			Thread.sleep(25000);
						
			String originalHandle = Browser.getInstance().getWindowHandle();

			//Do something to open new tabs

			for(String handle : Browser.getInstance().getWindowHandles()) {
			  if (!handle.equals(originalHandle)) {
			       Browser.getInstance().switchTo().window(handle);
			       Browser.getInstance().close();
			    }
			    }

			Browser.getInstance().switchTo().window(originalHandle);
			Thread.sleep(6500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='historyview']/div/div/div[1]/button/span")).click();
			
			//Thread.sleep(6500);	
			
			//Browser.getInstance().findElement(By.xpath("//*[@id='chatRightNavID']/div[26]/div[1]/img")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Message History - Right Nav..","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Successfully opened Recruiter modal and selected date filter option","Pass"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 = {"Message history downloaded successfully","Pass"};
			reportObj.writeReport(reportValues2);
			
			log.info("Successfully performing operaions in Message History modal");
			
			
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Message History - Right Nav..","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues2 = {"Message history downloaded successfully","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues1 = {"Successfully opened Recruiter modal and selected date filter option","Fail"};
			reportObj.writeReport(reportValues1);
			log.info("An error occurred while performing operations in Message History modal");
		}
		
	//View history modal
			
		try
		{
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'share-section')]/button[contains(@class,'backgroundColore43465Imp')]")).click();
			
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.className("input-box-fname")).click();
			Thread.sleep(2500);
			//Browser.getInstance().findElement(By.className("candisingleCheck")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='messageListOptionsId']/li[3]/div/input")).click();
			
			Thread.sleep(5500);	
			
			Browser.getInstance().findElement(By.className("clearFilterClass")).click();
			
			System.out.println("Recruiter value selected");		
			
			//Selecting today in datefilter dropdown
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='gridSystemModalLabel']/div/div[2]/input")).click();
		
			Browser.getInstance().findElement(By.xpath("//*[@id='messagePeriodListOptionsId']/li[2]/a")).click();
			Thread.sleep(2500);	
			
			System.out.println("Successfully selected date filter");
			
			Browser.getInstance().findElement(By.xpath("//*[@id='historyview']/div/div/div[1]/button/span")).click();
			
			Thread.sleep(4500);	
			//Thread.sleep(6500);	
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRightNavID']/div[26]/div[1]/img")).click();
						
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully opened View History Modal - Right Nav..","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Successfully selected value Recruiter filter and selected date filter option","Pass"};
			reportObj.writeReport(reportValues1);
			
			log.info("Successfully performing operations in View Message History modal");
						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully opened View History Modal - Right Nav..","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Successfully selected value Recruiter filter and selected date filter option","Fail"};
			reportObj.writeReport(reportValues1);
			
			log.info("An error occurred while performing operations in View Message History modal");
		}
		
		//Attachments
		
		try
		{
			Thread.sleep(10000);	
										
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRightNavID']/div[1]/div[10]/div")).click();				
			
			Thread.sleep(7500);	
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[2]/div[3]/div[1]/div[2]/img")).click();
			
			Thread.sleep(7500);	
			Browser.getInstance().findElement(By.xpath("//*[@id='previewDocModal']/span")).click();
			
			Thread.sleep(7500);
			
			Browser.getInstance().findElement(By.className("closeMessageHistoryIcon")).click();
											
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Attachments - Right Nav.","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Successfully previewed/closed modal","Pass"};
			reportObj.writeReport(reportValues1);
			
			log.info("Successfully performing operations in Attachments modal");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Attachments - Right Nav.","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Successfully previewed/closed modal","Fail"};
			reportObj.writeReport(reportValues1);
			
			log.info("An error occurred while performing operations in Attachments modal");
		}
		
		//Potential Jobs		
		
		try
		{
						
			Thread.sleep(7500);	
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[1]/div[5]/div")).click();
			
			Thread.sleep(4500);
			
			WebElement potentialjobs = Browser.getInstance().findElement(By.xpath("//*[@id='jobviewdeatil']/div[1]/input"));
			potentialjobs.sendKeys("Potential Job");			
			
			Thread.sleep(4500);
			
			WebElement job = Browser.getInstance().findElement(By.xpath("//*[@id='jobviewdeatil']/div[2]/div/ul/li[3]/div/input"));
			job.isSelected();
			job.click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='jobviewdeatil']/div[1]/input")).click();
			
			Thread.sleep(4500);

			Browser.getInstance().findElement(By.xpath("//*[@id='jobviewdeatil']/div[3]/span")).click();
			//Browser.getInstance().findElement(By.className("chat-job-close-btn")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRightNavID']/div[5]/div[1]/img")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Potential Jobs - Right Nav.","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Jobs applied/removed successfully - Right Nav.","Pass"};
			reportObj.writeReport(reportValues1);
			
			log.info("Successfully performing operations in Potential Jobs");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Potential Jobs - Right Nav.","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Jobs applied/removed successfully - Right Nav.","Fail"};
			reportObj.writeReport(reportValues1);
			
			log.info("An error occurred while performing operations in Potential Jobs");
		}
		
		//Potential Tags
		try
		{
						
			Thread.sleep(7500);	
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[1]/div[6]/div")).click();
			
			Thread.sleep(2500);
			
			WebElement potentialtags = Browser.getInstance().findElement(By.xpath("//*[@id='tagsviewdeatil']/div[1]/input"));
			potentialtags.sendKeys("Account Tag");
			
			Thread.sleep(4500);
			
			WebElement tag = Browser.getInstance().findElement(By.xpath("//*[@id='tagsviewdeatil']/div[2]/div/ul/li[3]/div/input"));
			tag.isSelected();
			tag.click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='tagsviewdeatil']/div[1]/input")).click();
			
			
			Thread.sleep(4500);

			Browser.getInstance().findElement(By.xpath("//*[@id='tagsviewdeatil']/div[4]/span")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRightNavID']/div[3]/div[1]/img")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Potential tags - Right Nav.","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Tags applied/removed successfully - Right Nav.","Pass"};
			reportObj.writeReport(reportValues1);
			
			log.info("Successfully performing operations in Potential Tags");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Potential Tags - Right Nav.","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Tags applied/removed successfully - Right Nav.","Fail"};
			reportObj.writeReport(reportValues1);
			
			log.info(" An error occurred while performing operations in Potential Tags");
		}
		
		//Notes
		
		try
		{
			Thread.sleep(8000);	
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[1]/div[7]/div")).click();
			
			//Adding notes
			
			WebElement notes = Browser.getInstance().findElement(By.id("notes"));
			notes.clear();
			notes.sendKeys("Test Adding notes");
			
			Thread.sleep(3500);		
					
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[4]/div[1]/span[2]")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Notes section - Right Nav.","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Notes Removed/Added - Right Nav.","Pass"};
			reportObj.writeReport(reportValues1);
			
			log.info("Successfully performing operations in Notes Section");
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Notes section - Right Nav.","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Notes Removed/Added - Right Nav.","Fail"};
			reportObj.writeReport(reportValues1);
			
			log.info("An error occurred when performing operations in Notes Section");
		}
}
}
