package Canvas.Gradle;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * Candidate V1 class file covers below functionalities : 
 * Testing search functionalities on candidate page.
 * Archiving/Restarting a candidate
 * Navigating to Chat page using chat helper.
 * Navigating to Portrait page & adding/removing Job.
 * Editing Candidate details & Uploading & checking resume functionalities.
 * Marking message as read/unread.
 * 
 */

public class Candidates_V1 {

	public void searchfield1() throws IOException
{
		Logger log = Logger.getLogger(Candidates_V1.class.getName());
		log.info("Invoking Candidates class");	
	
		//Invalid search in candidates page:
	
	    try
	    {
	    	Thread.sleep(13000);
    		
    		Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);			
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a")).click();
    		
    		Thread.sleep(7000);
    		
	        Browser.getInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	WebElement namefield = Browser.getInstance().findElement(By.className("search-candidate-name"));
	    	namefield.isEnabled();
	    	namefield.sendKeys("Invalid search");
	    	namefield.sendKeys(Keys.ENTER);
	       	    
	    	Thread.sleep(2500);	
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();	
			
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title : : " + title);			
	    	System.out.println("Search field Successfully cleared");
	    	
	    	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {" Searching an invalid Candidate with My Chats filter","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Searching an invalid candidate with my chats filter");
	    }
		catch(Exception e)
	    {
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching an invalid Candidate with My chats filter","Fail"};
			reportObj.writeReport(reportValues);
			log.info("Searching an invalid candidate with my chats filter");	
	    
	    }
	    
	   //Valid Search in Mine Page:
	   //Search By name
	    try
	    {
	    	Browser.getInstance().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	    	WebElement namefield1 = Browser.getInstance().findElement(By.className("search-candidate-name"));
	    	namefield1.isEnabled();
	    	namefield1.sendKeys("Naveen");
	    	namefield1.sendKeys(Keys.ENTER);
	    	
	    	Thread.sleep(4500);
	    	WebElement N1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[3]/span"));
	    	
	        String name = N1.getText();
	       
	        System.out.println(name + '\n');
	        
	    	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {" Searching a Candidate by Name","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Searching a Candidate by Name");
			
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();	
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    	Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
	    	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {" Searching a Candidate by Name","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while searching a Candidate by Name");		
	    }
	    
		//Search By email
		try
		{
			Browser.getInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			WebElement mailfield1 = Browser.getInstance().findElement(By.className("search-candidate-name"));
	    	mailfield1.isEnabled();
	    	mailfield1.sendKeys("naveenkumar.r@prodapt.com");
	    	mailfield1.sendKeys(Keys.ENTER);
	    	Thread.sleep(4500);
	    	
			WebElement C2 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[5]/span"));
			String name2 = C2.getText();
		
			System.out.println(name2 + '\n');
			Thread.sleep(4500);
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a Candidate by email","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Searching a Candidate by email");		
			
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a Candidate by email","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while searching a Candidate by email");	
		}
		
		//Search By phone number on Jobs filter
		try
		{
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[3]/select[1]")).click();
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[3]/select[1]/option[2]")).click();
					
			WebElement phonenumfield1 = Browser.getInstance().findElement(By.className("search-candidate-name"));
			phonenumfield1.isEnabled();
			phonenumfield1.sendKeys("2027602200");
			phonenumfield1.sendKeys(Keys.ENTER);
						
			Thread.sleep(4500);
			WebElement Norecords = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[5]/div[1]/candidate-listingall/div[1]/h3"));
			String NR = Norecords.getText();
			System.out.println(NR);
			
			if(NR.contentEquals("0 Records"))
			{
				System.out.println("0 Records");
				Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			}				
			else
			{
			Thread.sleep(1500);
									
			WebElement C3 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[2]/td[4]"));
			String name3 = C3 .getText();
				
			System.out.println(name3 + '\n');			
			}
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[3]/select[1]")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[3]/select[1]/option[1]")).click();
			Thread.sleep(4500);
			
		    	
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
					
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a Candidate by phone number from Jobs view","Pass"};
			reportObj.writeReport(reportValues);
		    log.info("Searching a Candidate by phone number");	
		    }
	
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a Candidate by phone number","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occured while Searching a Candidate by phone number");
		}	
		
		//Search Resume in All/Mine
		
		try
		 {
			 
			// Selecting Resume Value from dropdown
			 
			Thread.sleep(4500); 
			Browser.getInstance().findElement(By.className("customFieldDropdown")).click();
			
			Thread.sleep(4500); 
			Browser.getInstance().findElement(By.xpath("//*[@id='customeFieldID']/li[2]/a")).click();	
			
						
		    Browser.getInstance().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		    WebElement namefield1 = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[1]/input[2]"));
		    namefield1.click();
		    namefield1.sendKeys("Test");
		    namefield1.sendKeys(Keys.ENTER);
		    	
		    System.out.println("Searching Resumes on Mine View");
		        
		    //Navigating to All View - Searching Resume
		    
		    Thread.sleep(4500); 
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[1]")).click();
		    
		    Thread.sleep(2500);
	
		    Browser.getInstance().findElement(By.className("customeFieldTagClose")).click();
		    
		    
		    Thread.sleep(4500); 
			Browser.getInstance().findElement(By.className("customFieldDropdown")).click();
			
			Thread.sleep(4500); 
			Browser.getInstance().findElement(By.xpath("//*[@id='customeFieldID']/li[1]/a")).click();	
			
			//Navigating to All View - Searching Resume
		    
		    Thread.sleep(4500); 
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[2]")).click();
		    Browser.getInstance().findElement(By.xpath("//*[@id='mineCandidateID']/li[1]")).click();
		    
		   
				    
		    ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a Resume in All/Mine View","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Searching a Resume in All/Mine View");				
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();				
			
		  }
		 
		 catch(Exception e)
		   {
		    e.printStackTrace();
		    Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
		    ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a Resume in All/Mine View","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occurred while sSearching a Resume");		
		   }
		
		//Archive chat text confirmation.
		
		try
		{
			System.out.println("Archiving candidates starts");
			Thread.sleep(4500);
			WebElement phonenumfield1 = Browser.getInstance().findElement(By.className("search-candidate-name"));
			phonenumfield1.isEnabled();
			phonenumfield1.sendKeys("Janine");
			phonenumfield1.sendKeys(Keys.ENTER);
			
			Thread.sleep(5500);			                                            
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/div[1]")).click();
			Thread.sleep(5500);
			
			WebElement archivetext = Browser.getInstance().findElement(By.xpath("//*[@id='archiveAllCandi_confirm']/div/span/p[2]"));			
			String arctext = archivetext.getText();			
			System.out.println(arctext);
			
			//Click OK
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='archiveAllCandi_confirm']/div/div[2]/button")).click();
			
			System.out.println("Successfully archived candidate");
			
			//Navigating to Archived by clicking dropdown
			
			Thread.sleep(4500);
			//Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]")).click();
			Browser.getInstance().findElement(By.className("dropdownPosDup")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTypeOptionsId']/li[4]/a")).click();
			
			Thread.sleep(5500);			                                            
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/div[1]")).click();
			
			System.out.println("Successfully restarted candidate");
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			
			//Navigating back to active
			
			Thread.sleep(4500);
			//Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]")).click();
			Browser.getInstance().findElement(By.className("dropdownPosDup")).click();
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTypeOptionsId']/li[3]/a")).click();
				
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully archived and restarted candidate ","Pass"};
			reportObj.writeReport(reportValues);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully archived and restarted candidate ","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An error occured while archiving candidate");
		}
		
		//Chat with candidate from options
		try
		{
		    	
			System.out.println("Navigating to chat page by clicking options starts");
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[3]")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[5]/div[1]/candidate-listingall/div[1]/div[2]/ul[2]/li[1]/span[3]")).click();
								
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateAnchor']")).click();
			
			
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title : " + title);
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Chatting with a candidate via chat navigator in Candidates page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Chatting with a candidate via options menu in Candidates page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Chatting with a candidate via options menu in Candidates page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while chatting with a candidate via options in Candidates page");

		}
		
		//View Candidate portrait page
		try
		{
			System.out.println("Navigating to portrait page starts");
 			Thread.sleep(6500);
			WebElement namefield1 = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]"));
			namefield1.isEnabled();
			namefield1.sendKeys("Naveen");
		                                      		
			Thread.sleep(5500);			                                            
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[1]/a")).click();
			Thread.sleep(5500);
			
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title : " + title);
			
			//Previewing Transcript from Portrait page
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[1]/button")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='showDropdown']/li[1]/a")).click();
			
			Thread.sleep(7000);
			
			//WebElement portraitclose = Browser.getInstance().findElement(By.xpath("//*[@id='potrait_preview_transcript']/div/div/div/button"));
			//portraitclose.isDisplayed();
			//portraitclose.click();
			
			
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='potrait_preview_transcript']/div/div/div/button"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='potrait_preview_transcript']/div/div/div/button/span"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='potrait_preview_transcript']/div/div/div/button/span")).click();
			
					
			System.out.println("Successfully previewed transcript from protrait page");
			
			//Assigning job from protrait page:
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,200)");
			
			Thread.sleep(4500);
			
			String name = "";
			try {
				WebElement Assignjob = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[3]/p[2]/a"));
				name = Assignjob.getText();
				System.out.println(name);
			} catch (Exception e) {
				
				
			}
			String name1 = "";
			try {
				WebElement Assignjob1 = Browser.getInstance().findElement(By.xpath(" //*[@id='wrap']/div[1]/div[2]/div/div[3]/p/a"));
				name1 = Assignjob1.getText();
				System.out.println(name1);
			} catch (Exception e) {
				
				
			}			
						
			if(name.contentEquals("Assign Job"))
				
			{
				
			Browser.getInstance().findElement(By.className("add-job-link")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[5]/div[1]/input")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[5]/div[1]/input")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[5]/div[2]/div/ul/li[3]/div/input")).click();
			
			Thread.sleep(4500);
			
			//Removing the job by unchecking the checkbox
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[5]/div[2]/div/ul/li[3]/div/input")).click();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.id("potraitupimg")).click();
			
			}
			
			else if(name1.contentEquals("+ Assign a Job"))
			{
				Browser.getInstance().findElement(By.className("add-job-link")).click();				
							
				Thread.sleep(4500);
				
				//Removing the job by unchecking the checkbox
				
				Browser.getInstance().findElement(By.xpath("//li[contains(@class,'attachmenttag')]/span[2]")).click();
				Thread.sleep(4500);
				
				Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[6]/p/button[1]")).click();
			}
			
			Thread.sleep(4500);					
			
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(300,0)");				
			
			System.out.println("Successfully assigned job from Portrait page");
			
			//Canvas Chats :
			
			Thread.sleep(5500);
			
		    ((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,500)");	
		    		    			
			WebElement viewchat = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/div[3]/div[8]/div/div[1]/div/div[5]/span"));
			String Canvaschats = viewchat.getText();                          
			System.out.println(Canvaschats);
			viewchat.click();
			
			Thread.sleep(10000);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chatview']/div/div/div[1]/button/span")).click();
			
				
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Previewing Transcript & Adding Jobs in portrait page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Previewing Transcript & Adding Jobs in portrait page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Previewing Transcript & Adding Jobs in portrait page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while viewing candidate portrait page when navigating from Candidates page");
		}
		
		//Edit Candidate details from Candidate listing page & uploading resume
		try
		{			
			System.out.println("Navigating to Edit candidates details page starts");
			
			Thread.sleep(8000);			
				    
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a")).click();
		    
		    Thread.sleep(3500);	    
			
		    Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
			
			Thread.sleep(5500);
			
			WebElement editfield1 = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]"));
			editfield1.isEnabled();
			editfield1.sendKeys("Naveen");
			editfield1.sendKeys(Keys.ENTER);
			
			System.out.println("Candiate name searhed successfully - Edit the candidate details");
			
			Thread.sleep(5500);			                                            
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[2]/a")).click();					
			
				
			WebElement Location = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[1]/div/div[6]/input"));
			Location.clear();
			Location.sendKeys("Test Location");
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.id("edit_socialSiteMap-linkedin")).clear();
					
					
			Thread.sleep(4500);
			WebElement Link = Browser.getInstance().findElement(By.id("edit_socialSiteMap-linkedin"));
			Link.clear();
			Link.sendKeys("https://www.linkedin.com/foobar");
			Thread.sleep(4500);														
					
			
			//Adding jobs and removing job:			
					
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[2]/div/div[8]/input")).sendKeys("TestJob");
			
			WebElement EditJob = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[2]/div[1]/div[8]/input"));
			EditJob.isEnabled();
			EditJob.click();
						
			Thread.sleep(6500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[2]/div/div[9]/div/ul/li[3]/div/input")).click();
			Browser.getInstance().findElement(By.xpath("//*[@id='editupimg']")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[2]/div/div[8]/input")).clear();
			
			System.out.println("Job Successfully added");
			
			//Adding Tags
			Thread.sleep(5500);
			
			Browser.getInstance().findElement(By.id("addcantagsearchinput")).sendKeys("Test");
			
			Browser.getInstance().findElement(By.id("addcantagsearchinput")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[2]/div/div[12]/div[2]/div/ul/li[3]/div/input")).click();
				
			Browser.getInstance().findElement(By.id("uptagimg")).click();
			Thread.sleep(4500);
			
			WebElement Addclick1 = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div/editcandidatedetails/div[2]/div/div[13]/button[contains(text(),'Save Changes')]"));
			Addclick1.isEnabled();
			Addclick1.click();	
			
			Thread.sleep(4500);
			
			System.out.println("Tags added Successfully via Edit Candidate Page");
			
			//Remove Tags
			
			Thread.sleep(4500);	
			
			Browser.getInstance().findElement(By.className("attachmenttagclose")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='potraittagDel']/span/span[4]")).click();
			
			System.out.println("Tag Deleted Successfully");
			
			//Job Deleted Successfully
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.className("job-delete-icon")).click();
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='potraitjobMsgDel']/span/span[4]")).click();
			
			System.out.println("Job Deleted Successfully");
			
			
			Thread.sleep(5500);
			WebElement uploadElement = Browser.getInstance().findElement(By.xpath("//li[contains(@class,'DownloadResumeLiClass')]//span[contains(@class,'resumeUploadPotrait')]"));
			uploadElement.isEnabled();
			uploadElement.click();			
			
			Thread.sleep(6500);						
						
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\TestUpload.exe");
				
				
			ConfigRead con = new ConfigRead();										
			
			Robot r=new Robot();
			Thread.sleep(2500);
					
			StringSelection stringresume = new StringSelection(con.getProperty("ResumePath"));
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringresume, null);
			Thread.sleep(4500);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);		
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(4500);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			Thread.sleep(6500);
					
			System.out.println("Resume Uploaded Successfully");
			
			Thread.sleep(10000);
			
			WebDriverWait wait = new WebDriverWait(Browser.getInstance(), 10);
	   	 		   	 
	   	 	wait.until(ExpectedConditions.elementToBeClickable(By.className("downloadSpan"))).click();
	   	 	Thread.sleep(10000);
			
			WebElement gen = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[1]/div[1]/input"));
			gen.isEnabled();
			gen.click();
			
			System.out.println("Enable Gender from Portrait Page");
			
			Thread.sleep(4500);
			
			WebElement national = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[2]/div[1]/input"));
			national.isEnabled();
			national.click();
			
			System.out.println("Enable Nationality from Portrait Page");
			
			Thread.sleep(4500);
			
			WebElement Selectall = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[6]/div[1]/input"));
			Selectall.isEnabled();
			Selectall.click();
			
			System.out.println("Enable Select All from Portrait Page");
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[2]/button[2]")).click();
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,300)");	
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='email-candidate-portrait']/div/button")).click();
			
			//Adding some notes field :
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,600)");	
			
			WebElement notes = Browser.getInstance().findElement(By.className("resumenotes"));
			notes.clear();
			notes.sendKeys("Test add notes");
			
			System.out.println("Adding some notes in Portrait Page");
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[2]/button[1]")).click();
						
			Thread.sleep(7000);		
			
			//Invoking Magic Resume from Chat Page
				
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[1]/ul/li[2]/a/img")).click();
			
			System.out.println("View Resume from Chat Page");
			
			Thread.sleep(4500);
			
			WebElement gen1 = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[1]/div[1]/input"));
			gen1.isEnabled();
			gen1.click();
			
			System.out.println("Enable Gender from Chat Page");
			
			Thread.sleep(4500);
			
			WebElement national1 = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[2]/div[1]/input"));
			national1.isEnabled();
			national1.click();
			
			System.out.println("Enable Nationality from Chat Page");
			
			Thread.sleep(4500);
			
			WebElement Selectall1 = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[6]/div[1]/input"));
			Selectall1.isEnabled();
			Selectall1.click();
			
			System.out.println("Enable Select All from Chat Page");
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[2]/button[2]")).click();
			
			System.out.println("Enable Share modal from Chat Page");
			
			Thread.sleep(4500);
						
			Browser.getInstance().findElement(By.xpath("//*[@id='email-candidate-portrait']/div/button")).click();
			
			Thread.sleep(4500);
			
			WebElement DeSelectall = Browser.getInstance().findElement(By.xpath("//*[@id='Resume_de-identification']/div[3]/div[3]/div/div/div[6]/div[1]/input"));
			DeSelectall.isEnabled();
			DeSelectall.click();
			
			System.out.println("Disbale Share modal from Chat Page");
			
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.className("resumeclose")).click();			
		
			//Navigating to Candidates page and view portrait page to delete resume 
			Thread.sleep(4500);
					    
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a")).click();
		    													    
		    Thread.sleep(3500);	    
			
		    Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
			
			Thread.sleep(5500);
			
			WebElement VP = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]"));
			VP.isEnabled();
			VP.sendKeys("Naveen");
			VP.sendKeys(Keys.ENTER);
			
			
			
			Thread.sleep(5500);			                                            
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[1]/a")).click();					
						
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.cssSelector(".fa.fa-trash-o")).click();
					
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='resumedeletealert']/span/span[4]")).click();
				    
		    System.out.println("Resume modal deleted Successfully");		    	    
								
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Editing candidate details & Operations of Magic Resume from Candidates page & Adding/Removing Jobs","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Editing candidate details from Candidates page");
	  }
		
	  catch(Exception e)
		
	  {
 			e.printStackTrace();
 			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Editing candidate details from Candidates page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while editing candidate details from Candidates page");
	  }
		
	//Mark as Unread & Read 
		
	 try
	 
	 { 
		 
		    System.out.println("Performing Mark as read/unread operation starts");
		 	Thread.sleep(5500);
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a")).click();
		    
			    
		    Thread.sleep(4500);
		    
			Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
		 	Thread.sleep(4500);
			WebElement editfield1 = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]"));
			editfield1.isEnabled();
			editfield1.sendKeys("(317) 653-3349");
			editfield1.sendKeys(Keys.ENTER);
			
			Thread.sleep(4500);
								
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[3]/a")).click();					
			
			Thread.sleep(4500);
			WebElement radiobutton = Browser.getInstance().findElement(By.id("OverAllCheck"));
			radiobutton.isSelected();
			radiobutton.click();
            Thread.sleep(4500);
            WebElement overflow = Browser.getInstance().findElement(By.xpath("//div[@id='sub-menu']/a/span[1]"));
            overflow.click();
            Thread.sleep(4500);
            Browser.getInstance().findElement(By.xpath("//*[@id='allglobalcheckboxid']/ul/li[2]/a")).click();
            Thread.sleep(4500);           
                     
            WebElement MarkOK = Browser.getInstance().findElement(By.xpath("//*[@id='bulk_confirmation_modal_markRead']/div/div[2]/input"));
            MarkOK.isSelected();
            MarkOK.click();
            Thread.sleep(4500);
            
            System.out.println("Mark OK");
                        
        	Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[3]/a")).click();
						
			Thread.sleep(4500);
			
			//Checking the count 
			
			WebElement Number1 = Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chat-link')]/span"));
			String count = Number1.getText();
			System.out.println("Message Count: " + count);
			Thread.sleep(6500);
			
			//Clicking top-nav chat bubble - ALL View
			
			Browser.getInstance().findElement(By.xpath("//a[contains(@class,'message-bubble-btn')]/img")).click();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.className("markall-read")).click();	
			
			System.out.println("Clicking MarkasRead on topnav chat bubble");
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//a[contains(@class,'message-bubble-btn')]/img")).click();
			Thread.sleep(4500);
						
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
		    
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Marking as Unread & Read from Candidate Listing Page and from Top Nav Chat bubble from All view","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Marking as Unread & Read from Candidate Listing Page and from Top Nav Chat bubble from All View");
	
	 }
	 
	 catch(Exception e)
	 {		 	
		    e.printStackTrace();
		    //Browser.getInstance().navigate().refresh();
		    Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Marking as Unread & Read from Candidate Listing Page and from Top Nav Chat bubble from All view","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while marking as Unread & Read from Candidate Listing Page and from Top Nav Chat bubble");
	 }
	 
	 
	 //Opt-In support
	 
	 try
	 {
		 Thread.sleep(4500);
		    
		 Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
		 Thread.sleep(4500);
		 WebElement editfield1 = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]"));
		 editfield1.isEnabled();
		 editfield1.sendKeys("Naveen");
		 editfield1.sendKeys(Keys.ENTER);
			
		 Thread.sleep(4500);
		 
		 Browser.getInstance().findElement(By.id("OverAllCheck")).click();
		 
		 //Selecting Opt-in from Global overflow menu
		 
		 
		 WebElement overflow = Browser.getInstance().findElement(By.xpath("//div[@id='sub-menu']/a/span[1]"));
         overflow.click();
         Thread.sleep(4500);
         Browser.getInstance().findElement(By.xpath("//*[@id='allglobalcheckboxid']/ul/li[5]/a")).click();
         Thread.sleep(4500);           
                  
         WebElement OK = Browser.getInstance().findElement(By.xpath("//*[@id='BulksmsOptIn']/div/div[2]/button"));
         OK.isSelected();
         OK.click();
         Thread.sleep(4500);
         
         System.out.println("Selecting OK from confirmation model");
         
         
         //Printing Opt-In status:         
                 
         Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
         
         Thread.sleep(1000);
 	    
         Actions actions = new Actions(Browser.getInstance());
 		 WebElement profile = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[4]/a"));
 		 actions.moveToElement(profile);
 		 actions.build().perform();
 		
 		 WebElement Team = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[4]/a"));
 		 actions.moveToElement(Team);
 		 actions.build().perform();
 	    
 		 Thread.sleep(1000);
 		
 		 WebElement TeamName = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div[2]/ul/li[4]/div/ul/li/span[2]"));
 		 String Name = TeamName.getText();
 		
 		 System.out.println("Opt-In Status : " + Name);
 		 		
 		 System.out.println("Opt-in status details printed successfully");
         
         Thread.sleep(4500);
         
         ReportGenerator reportObj = new ReportGenerator();
         String[] reportValues ={"Selecting Global overflow menu - Opt-In","Pass"};
         reportObj.writeReport(reportValues);         
         String[] reportValues1 ={"Printing Opt-In status name from individual overflow menu","Pass"};
         reportObj.writeReport(reportValues1);
         log.info("Opt-In Status On/Off");
                
		 }
	 
	 catch(Exception e)
	 
	    {
		 
		 e.printStackTrace();
		 //Browser.getInstance().navigate().refresh();
		 Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
		 ReportGenerator reportObj = new ReportGenerator();
	     String[] reportValues ={"Selecting Global overflow menu - Opt-In","Fail"};
	     reportObj.writeReport(reportValues);         
	     String[] reportValues1 ={"Printing Opt-In status name from individual overflow menu","Fail"};
	     reportObj.writeReport(reportValues1);
	     log.info("An error occurred while Opt-In Status On/Off");
	                
     	}
	 
}
}
