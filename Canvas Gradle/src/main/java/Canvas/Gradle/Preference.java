package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Preference {
	static Logger log = Logger.getLogger(Preference.class.getName());
	
	public void PreferencePage() throws IOException  {
		//Navigating to Preference Page
		try
		{
			Thread.sleep(7000);
			//Browser.getInstance().findElement(By.className("profile-icon")).click();
			Actions actions = new Actions(Browser.getInstance());
			WebElement profile = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/li[contains(@class,'profile-icon')]/a/img"));
			actions.moveToElement(profile);
			actions.build().perform();
			
			Thread.sleep(2500);					
						
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/div[2]/div[1]/ul/li[3]/a")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Preference Page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Preference Page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Preference Page","Fail"};
			reportObj.writeReport(reportValues);
			Browser.getInstance().close();
			log.info("An error occurred while navigating to Preference Page");
		}
				
		//Updating contact information on the user setting page
		
		try
		{
			Actions actions = new Actions(Browser.getInstance());
			Thread.sleep(2500);	
						
			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[1]/div[1]/div[2]/span"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[1]/div[1]/div[2]/span")).click();
			
			Thread.sleep(5500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");
							
					
			Thread.sleep(6500);
			System.out.println("Profile image sucessfully updated");
			
			//Removing profile picture
		
			WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[1]/div[1]/div[2]/span[1]"));
			actions.moveToElement(subMenu1);
			actions.build().perform();
			
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[1]/div[1]/div[2]/span[1]")).click();
			
			Thread.sleep(2500);
			
			System.out.println("Profile Picture Sucessfully Removed");
			
			//Updating contact details
			
			Thread.sleep(1500);
			WebElement Fname = Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[1]/div[2]/div[1]/input"));
			Fname.clear();
			Fname.sendKeys("Naveen");
			
			Thread.sleep(2500);
			WebElement Lname = Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[1]/div[2]/div[2]/input"));
			Lname.clear();
			Lname.sendKeys("Kumar");
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("updatecontact")).click();
			
			System.out.println("Contact Details Updated Sucessfully");
			
			Thread.sleep(4500);
			
			//Updating Timezone details.
			
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[5]/div[2]/div[2]/div[1]/input")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='userTimezoneOptionsId']/li[3]/a")).click();;
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("changeTz")).click();
					
			System.out.println("Time Zone Details Updated Sucessfully");
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Updating/Removing of profile picture","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Updating/Removing of profile picture");
			String[] reportValues1 = {"First Name/Last Name updated successfully","Pass"};
			reportObj.writeReport(reportValues1);
			log.info("First Name/Last Name updated successfully");
			String[] reportValues2 = {"Timezone changed successfully","Pass"};
			reportObj.writeReport(reportValues2);			
			log.info("Timezone changed successfully");
		
			log.info("Successfully tested functionality on User Settings Page");
		}
		
		
		catch(Exception e)
		
		{
			e.printStackTrace();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Updating/Removing of profile picture","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"First Name/Last Name updated successfully","Fail"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 = {"Timezone changed successfully","Fail"};
			reportObj.writeReport(reportValues2);			
			log.info("An error occurred while checking functionality on user settings page");
		}
		
		//Navigating to Welcome Message and adding custom welcome message
		
		try
		{
			Thread.sleep(2500);
			//Navigating to Welcome Message
			
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[1]/ul/li[2]/ul/li[2]/a")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[1]/div/div[1]/div[1]/div[3]/input")).click();
			
			WebElement Custom = Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[1]/div/div[1]/div[1]/textarea"));
			Custom.clear();
			Custom.sendKeys("Adding Welcome Message using automation");;
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[1]/div/div[1]/div[1]/div[3]/input")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Welcome Message ","Pass"};
			reportObj.writeReport(reportValues);
			
			String[] reportValues1 = {"Custome Message Updated Successfully","Pass"};
			reportObj.writeReport(reportValues1);
			log.info("Welcome Message updated successfully");
								
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Welcome Message ","Fail"};
			reportObj.writeReport(reportValues);
			
			String[] reportValues1 = {"Custome Message Updated Successfully","Fail"};
			reportObj.writeReport(reportValues1);
			log.info("An error occured while updating welcome Message updated successfully");
		}
		
	//Navigating to Notifications page
		
		try
		{
			Thread.sleep(2500);
					
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[1]/ul/li[3]/a")).click();
			
			//Clicking Add Feed
			
			Browser.getInstance().findElement(By.className("addfeed")).click();
			
			Browser.getInstance().findElement(By.id("feedNameID")).sendKeys("Adding Digest");
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/table/tbody/tr[1]/td[2]/div/input")).click();
			
			//Checking Unsaved Changes
			
			Thread.sleep(2500);
					       	
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/button")).click();
			
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add digest modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in  add digest modal by clicking escape cancel");
        	
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/button")).click();
        	
               	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in  add digest modal by clicking esacpe-ok");
        	
        	Thread.sleep(2500);
        	
        	//Clicking Add Feed
			
			Browser.getInstance().findElement(By.className("addfeed")).click();
			
			Browser.getInstance().findElement(By.id("feedNameID")).sendKeys("Adding Digest");
						       	
            Thread.sleep(3500);
                      	       	
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/button")).click();
			
			Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add digest modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
			
        	
        	//Clicking Add Feed Again to add digest
			
			Browser.getInstance().findElement(By.className("addfeed")).click();
			
			Browser.getInstance().findElement(By.id("feedNameID")).sendKeys("Adding Digest");
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/table/tbody/tr[1]/td[2]/div/input")).click();
			
			Thread.sleep(2500);

			Browser.getInstance().findElement(By.xpath("//*[@id='myModalFeedId']/div/span")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/div[3]/button[2]")).click();
			
			System.out.println("Successfully added digest by clicking Save and Add");
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("feedNameID")).sendKeys("Adding Digest for second time");
		
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/div[3]/button[1]")).click();
			
			System.out.println("Successfully added digest by clicking Save");
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Notifications Page","Pass"};
			reportObj.writeReport(reportValues);	
			String[] reportValues0 = {"Verfiying Unsaved edits while adding digest","Pass"};
			reportObj.writeReport(reportValues0);	
			String[] reportValues1 = {"Digest successfully added by clicking 'Save' and 'Save and Add Another'","Pass"};
			reportObj.writeReport(reportValues1);	
			log.info("Digest added successfully");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Notifications Page","Fail"};
			reportObj.writeReport(reportValues);	
			String[] reportValues0 = {"Verfiying Unsaved edits while adding digest","Fail"};
			reportObj.writeReport(reportValues0);	
			String[] reportValues1 = {"Digest successfully added by clicking 'Save' and 'Save and Add Another'","Fail"};
			reportObj.writeReport(reportValues1);	
			log.info("An error occurred while adding digest");
		}
		
		//Edit Digest
		
		try
		{
			Thread.sleep(4500);
			
			WebElement Editdigest = Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[8]/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/img"));
			Editdigest.isEnabled();
			Editdigest.click();			
			
			Thread.sleep(3500);
			WebElement Edit = Browser.getInstance().findElement(By.id("feedNameID"));
			Edit.clear();
			Edit.sendKeys("Editing Digest");
						
			//Checking Unsaved Changes - Edit Modal
			
			Thread.sleep(2500);
					       	
			Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/button")).click();
			
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in edit digest modal by clicking close-cancel");
        	        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in edit digest modal by clicking escape cancel");
        	        	       	        	
        	//Saving Message Again
        	
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/div[3]/button[1]")).click();
        	
        	ReportGenerator reportObj = new ReportGenerator();
			
			String[] reportValues0 = {"Editing a digest & Verifying Unsaved Changes ","Pass"};
			reportObj.writeReport(reportValues0);	
			String[] reportValues1 = {"Digest Edited Successfully","Pass"};
			reportObj.writeReport(reportValues1);	
			log.info("Digest edited successfully");
        	
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			
			String[] reportValues0 = {"Editing a digest & Verifying Unsaved Changes ","Fail"};
			reportObj.writeReport(reportValues0);	
			String[] reportValues1 = {"Digest Edited Successfully'","Fail"};
			reportObj.writeReport(reportValues1);	
			log.info("An error while editing digest");
		}
		
		//Delete Digest using modal and using icon
		
		try
		{
			Thread.sleep(5500);
			
			Browser.getInstance().findElement(By.className("editDigestIcon")).click();
			
			//Delete from modal
					
			Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='addNewFeed']/div/div/div[3]/span")).click();
        	
        	Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='deleteFeed_confirm']/div/div[2]/button")).click();
			
        	Thread.sleep(3500);
        	
        	System.out.println("Successfully deleted by using modal");
        	
        	//Delete by using icon
			
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[8]/div[2]/div/table/tbody/tr/td[3]/div/div[2]/img")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[8]/div[2]/div/table/tbody/tr/td[3]/div/div[2]/div/span/span[4]")).click();
        	
        	System.out.println("Successfully deleted by using delete icon");
        	
        	ReportGenerator reportObj = new ReportGenerator();
			
			String[] reportValues0 = {"Digest deleted by clicking 'Delete Digest' from Edit Modal","Pass"};
			reportObj.writeReport(reportValues0);	
			String[] reportValues1 = {"Digest deleted by clicking delete icon'","Pass"};
			reportObj.writeReport(reportValues1);	
			log.info("Digest deleted successfully");
		}
		
		
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			
			
			String[] reportValues0 = {"Digest deleted by clicking 'Delete Digest' from Edit Modal","Fail"};
			reportObj.writeReport(reportValues0);	
			String[] reportValues1 = {"Digest deleted by clicking delete icon'","Fail"};
			reportObj.writeReport(reportValues1);	
			log.info("An error occurred while deleting digest");
		}
		
		//Navigating to OOO Page
		
		try
		{
			Thread.sleep(2500);
			//Navigating to OOO page
			
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[1]/ul/li[2]/ul/li[3]/a")).click();
			//Enabling Out of Office
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[2]/div[1]/ul/li[2]/label/span")).click();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[2]/div[1]/textarea")).clear();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[2]/div[1]/textarea")).sendKeys("For Testing purpose we are saving the Auto-reply messages");
			
			//Merge Tags
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[2]/div[2]/div/a[1]")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[2]/div[1]/textarea")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
						
			Thread.sleep(3500);		
			
			//Count
			
			//Save Changes
			Browser.getInstance().findElement(By.xpath("//*[@id='preferencePageRootElement']/div[2]/div[2]/a/div/button")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Enabling Toggle & Saving auto-reply messages","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Enabling Toggle & Saving auto-reply messages");
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Enabling Toggle & Saving auto-reply messages","Fail"};
			reportObj.writeReport(reportValues);		
			log.info("Enabling Toggle & Saving auto-reply messages");
		}	
		
	// Turning OFF the OOO
		
		try
		{
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[1]/a")).click();  
						
			System.out.println("Chat page");
						
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.id("candidateAnchor")).click();
			
			System.out.println("Candidate page");
			
			
			//Thread.sleep(4500);
			
			//Browser.getInstance().findElement(By.id("candidateAnchor")).click();
			
			//System.out.println("Candidate page");
			Thread.sleep(5500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[42]/a")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Turning Off - OOO","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Turning Off - OOOs");
						
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Turning Off - OOO","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while Turning Off - OOO");
		}
		
	
		
}		
}


