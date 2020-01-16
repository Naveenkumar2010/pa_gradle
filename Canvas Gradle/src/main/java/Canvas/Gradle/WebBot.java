package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebBot {
	
	static Logger log = Logger.getLogger(Amplify.class.getName());
	   
    public void wedBot() throws IOException, InterruptedException
    {
    	
    	//Navigating to Follow WebBot
    	try
    	{
    		Thread.sleep(7000);
            Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[6]/a")).click();
            
            //Print Bot Count
            
            WebElement BC = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[4]/div/span[1]"));
            String Botcount = BC.getText();
            
            System.out.println("Bot Count : " +Botcount);
            
            //Navigating to Web Bot Page
            
            Thread.sleep(1500);
            Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[5]/button")).click();
            
            System.out.println("Successfully navigated to Web Bot Page");
            
            ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Web Bot Page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Successfully navigated to Web Bot Page");
             		
    	}
        catch (Exception e)
    	{
        	e.printStackTrace();
        	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Web Bot Page","Fail"};
			reportObj.writeReport(reportValues);
			log.info("An errro occurred Successfully navigated to Web Bot Pager");
    	}
    	
    	//Checking Unsaved Modals
    	
    	try
    	{
    		try 
    		{
    		Thread.sleep(5000);
    		Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
    		 		
    		Thread.sleep(4000);
    		
    		WebElement Titlecheck = Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[1]/label"));
    		String Name = Titlecheck.getText();
    		System.out.println("Name of the Webbot" + Name);
    		
    		Thread.sleep(2000);
    		
    		if(Name.contentEquals("Title")) {
    			
    			System.out.println("Title verified");
    			 		      		       		       		
    		}
    		else
    		{
    			Thread.sleep(5000);
        		Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
        		 		
    		}
    		}
    		
    		catch (Exception e)
    		{
    			e.printStackTrace();
    			Thread.sleep(5000);
        		Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
    		}
    		
    		Thread.sleep(4000);
    		
    		WebElement Title = Browser.getInstance().findElement(By.id("titleWebbot"));
    		Title.clear();
    		Title.sendKeys("Editing Test title for Test automation");
    		
    		//Checking Unsaved Collection.
    		Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
        	
        	Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsavedBotChanges']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in Webbot modal by clicking header-cancel");
        	
        	
        	Thread.sleep(4000);
        	
        	Browser.getInstance().findElement(By.className("addnewBotButton")).click();
        	Thread.sleep(3500);
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsavedBotChanges']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(3500);
        	
        	System.out.println("Checking Unsaved changes in Webbot modal by clicking NewBot button -  cancel");
        	
        	//Checking unsaved changes by clicking top-nav
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("candidateAnchor")).click();
        	
        	Thread.sleep(2500);
	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsavedBotChanges']/div/div[1]/input")).click(); //TopNav Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in Webbot modal by clicking top nav - Candidates cancel");
        	
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.className("streamNotifyCls")).click();
        	
        	Thread.sleep(2500);
	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsavedBotChanges']/div/div[1]/input")).click(); //TopNav Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in Webbot modal by clicking top nav - Bell Icon cancel");
        	
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsavedBotChanges']/div/div[2]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in Webbot modal by clicking header-OK");
        	        	       	        	
        	//Checking unsaved changes by clicking OK
        	Thread.sleep(2500);   
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
        	
            Thread.sleep(3500);
        	WebElement Title1 = Browser.getInstance().findElement(By.id("titleWebbot"));
    		Title1.clear();
    		Title1.sendKeys("Checking unsaved changes test automation");
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Title successfully updated");
        	
        	Thread.sleep(4000);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[6]/a")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsavedBotChanges']/div/div[2]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in Webbot modal by clicking Top Nav-Campaign -OK");
        	
        	Thread.sleep(4000);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[5]/button")).click();
        	
        	System.out.println("Successfully navigating back to Webbot page");
        	
        	Thread.sleep(3500);       	
        	        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
        	
            Thread.sleep(3500);
        	WebElement Title12 = Browser.getInstance().findElement(By.id("titleWebbot"));
    		Title12.clear();
    		Title12.sendKeys("Test Title to Test Automation");
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Title successfully updated");
        	
        	Thread.sleep(3500);
        	//Updating the color code
        	        	
        	((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,300)");
        	Thread.sleep(4000);
        	
        	WebElement ColorElement =Browser.getInstance().findElement(By.cssSelector("input[colorpicker='hex']"));
        	ColorElement.click();
        	
        	Actions act = new Actions(Browser.getInstance());
        	        	
        	WebElement drag = Browser.getInstance().findElement(By.xpath("/html/body//div[contains(@class,'colorpicker-visible')][1]//colorpicker-saturation/i"));
        	act.moveToElement(drag).build();
        	act.dragAndDropBy(drag, 01, 01).perform();     	
        	
        	Thread.sleep(2500);
        	        	       	
        	WebElement close = Browser.getInstance().findElement(By.xpath("/html/body//div[contains(@class,'colorpicker-visible')][1]//button"));
        	act.moveToElement(close).build().perform();
        	//close.click();
        	
        	
        	System.out.println("Color Changed Successfully");
    		
        	Thread.sleep(1500);
        	Browser.getInstance().findElement(By.id("launchButton")).clear();
        	Browser.getInstance().findElement(By.id("launchButton")).sendKeys("Launch button Text");
        	
        	Thread.sleep(500);
        	Browser.getInstance().findElement(By.id("headerText")).clear();
        	Browser.getInstance().findElement(By.id("headerText")).sendKeys("Header Text"); 
        	
        	Thread.sleep(500);
        	Browser.getInstance().findElement(By.id("footerText")).clear();
        	Browser.getInstance().findElement(By.id("footerText")).sendKeys("Foorter Text");
        	
        	Thread.sleep(500);
        	Browser.getInstance().findElement(By.id("submitText")).clear();
        	Browser.getInstance().findElement(By.id("submitText")).sendKeys("Submit Text");
        	
        	Thread.sleep(500);
        	Browser.getInstance().findElement(By.id("confirmText")).clear();
        	Browser.getInstance().findElement(By.id("confirmText")).sendKeys("Confirmation Text");
        	
        	System.out.println("Texts successfully added");
        	
        	//Adding Domain
        	
        	Thread.sleep(500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[5]/input")).clear();
        	Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[5]/input")).sendKeys("test@gocanvas.io");
        	
        	System.out.println("Domain Details Added Successfully");
        	
        	ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Successfully tested unsaved changes by clicking outside the modal","Pass"};
 			reportObj.writeReport(reportValues);
 			String[] reportValues1 = {"Successfully tested unsaved changes by clicking header in the modal","Pass"};
 			reportObj.writeReport(reportValues1);
 			String[] reportValues12 = {"Successfully tested unsaved changes by clicking Top-Nav header","Pass"};
 			reportObj.writeReport(reportValues12);
 			String[] reportValues13 = {"Successfully tested unsaved changes by clicking Bell Icon","Pass"};
 			reportObj.writeReport(reportValues13);
 			String[] reportValues2 = {"Successfully updated the title of the web bot","Pass"};
 			reportObj.writeReport(reportValues2);
 			String[] reportValues3 = {"Successfully updated the title of styling header","Pass"};
 			reportObj.writeReport(reportValues3);
 			String[] reportValues4 = {"Color changed successfully","Pass"};
 			reportObj.writeReport(reportValues4);
 			log.info("Successfully updating the fields in the web bot detail");
        	       	       	
    		
    	}
    	 catch (Exception e)
    	{
    		e.printStackTrace();
    		ReportGenerator reportObj = new ReportGenerator();
  			String[] reportValues = {"Successfully tested unsaved changes by clicking outside the modal","Fail"};
  			reportObj.writeReport(reportValues);
  			String[] reportValues1 = {"Successfully tested unsaved changes by clicking header in the modal","Fail"};
  			reportObj.writeReport(reportValues1);
  			String[] reportValues12 = {"Successfully tested unsaved changes by clicking Top-Nav header","Fail"};
 			reportObj.writeReport(reportValues12);
 			String[] reportValues13 = {"Successfully tested unsaved changes by clicking Bell Icon","Fail"};
 			reportObj.writeReport(reportValues13);
  			String[] reportValues2 = {"Successfully updated the title of the web bot","Fail"};
  			reportObj.writeReport(reportValues2);
  			String[] reportValues3 = {"Successfully updated the title of styling header","Fail"};
  			reportObj.writeReport(reportValues3);
  			String[] reportValues4 = {"Color changed successfully","Fail"};
 			reportObj.writeReport(reportValues4);
  			log.info("An error occured while updating the fields in the web bot detail");
  			
    	}
    	
    	//Adding Auto Reply and Action List
    	
    	try
    	{
    		System.out.println("Going to add auto-reply message");
    		
    		((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,400)");
    		Thread.sleep(6000);
    		Browser.getInstance().findElement(By.id("txa_auto_replyddaf75be-c99e-458d-9f5b-ffc3cc71d2de")).clear();
    		Thread.sleep(2500);
    		WebElement Autoreply = Browser.getInstance().findElement(By.id("txa_auto_replyddaf75be-c99e-458d-9f5b-ffc3cc71d2de"));
    		
    		Thread.sleep(3500);
    		Autoreply.sendKeys("#");
			Thread.sleep(2500);
			Autoreply.sendKeys(Keys.DOWN);
			Autoreply.sendKeys(Keys.DOWN);
			Autoreply.sendKeys(Keys.TAB);	
			
			Thread.sleep(3500);
			Autoreply.sendKeys("#");
			Thread.sleep(2500);
			Autoreply.sendKeys(Keys.DOWN);	
			Autoreply.sendKeys(Keys.DOWN);
			Thread.sleep(2500);
			Autoreply.sendKeys(Keys.UP);
			Thread.sleep(2500);
			Autoreply.sendKeys(Keys.TAB);
			Autoreply.click();
			
			Thread.sleep(3500);				
			
			System.out.println("Saved message been added by clicking TAB and Keyboard events in Chat - Web Bot");
			
			Autoreply.sendKeys("Adding message using automation");
    		
    		Thread.sleep(3500);
    		
    		//Uploading Resouces
    		
    		Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[4]/div[2]/div[1]/span/img"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[4]/div[2]/div[1]/span/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[4]/div[2]/div[1]/span/img")).click();
    		
    		Thread.sleep(1500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='autoreplyAttachmentListddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/li[1]/a")).click();
    		
    		Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");
	 					
			System.out.println("Document Uploaded Successfully");
			
			//Uploading Resource
			
			Thread.sleep(4000);
		
			Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[4]/div[2]/div[1]/span/img")).click();
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='autoreplyAttachmentListddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/li[2]/a")).click();
			
			Thread.sleep(1500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='style-1']/ol/li/span/a")).click();
	   	 	Thread.sleep(1500);
	   	 	Browser.getInstance().findElement(By.className("attchmentinputbox")).sendKeys("test");
			
	   	 	Thread.sleep(2500);
	   	 	
	   	 	WebElement Resclick = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatattachementfile')]/ol/li/a[contains(text(),'Testdoc.pdf')]"));
	   	 	Resclick.isEnabled();
	   	 	Resclick.click();   	 	
	   	 		   	 	
	   	 	Thread.sleep(3500);
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlibraryModal']/div/div[1]/button")).click();
	   	 		    	 		      	   
	   	 	System.out.println("Resource Uploaded Successfully");
	   	 	
	   	 	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully added Auto-reply messages with Attachments","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Web Bot","Pass"};
			reportObj.writeReport(reportValues2);
		   	    
			log.info("Successfully added Auto-reply messages");
    	}
    	 catch (Exception e)
    	
    	{
    		e.printStackTrace();
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Successfully added Auto-reply messages with Attachments","Fail"};
 			reportObj.writeReport(reportValues);
 			String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Web Bot","Fail"};
 			reportObj.writeReport(reportValues2);
 	   	    
 			
 			log.info("An error occurred while adding Auto-reply messages");
    	}
    	
    	//Adding Action into the WebBot Detail
    	
    	try
    	{
    		Thread.sleep(2500);  
    		//Select Action
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[6]/div/div/div[1]/div[1]/div/input")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webActionOptionsddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/li[1]/a")).click();
    		
    		System.out.println("Select Action Successfully added");
    		
    		//Configure Action
    		
    		Thread.sleep(2500);  
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionIdddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/input")).click();
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionMultipleOptions']/li[1]/div/input")).click();
    		
    		Thread.sleep(1500);
    		Browser.getInstance().findElement(By.id("configActionIdddaf75be-c99e-458d-9f5b-ffc3cc71d2de")).click();
    		
    		Thread.sleep(2500);   
    		Browser.getInstance().findElement(By.className("clsResponseApplyBtn")).click();
    		
    		System.out.println("Action successfully added into the Amplify modal");
    		
    		//Adding Second Action
    		
    		Thread.sleep(2500);
    		//Select Action
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[6]/div/div/div[1]/div[1]/div/input")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webActionOptionsddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/li[3]/a")).click();
    		
    	   		    		    		
    		Thread.sleep(2500);   
    		Browser.getInstance().findElement(By.className("clsResponseApplyBtn")).click();
    		
    		System.out.println("Second Action Added Successfully");
    		
    		
    		//Adding Third Action - Import and Chat
    		Thread.sleep(1500);
    		//Select Action
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[6]/div/div/div[1]/div[1]/div/input")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webActionOptionsddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/li[4]/a")).click();
    		
    		//Configure Action
    		
    		Thread.sleep(2500);  
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionIdddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div[1]")).click();
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionSingleOptions']/li[2]/a")).click();
    		
    		Thread.sleep(1500);
    		WebElement close = Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/form/div[6]/div/div/div[1]/div[4]/input"));
    		close.clear();
    		close.sendKeys("Test Optional Message");
    		
    		Thread.sleep(2500);   
    		Browser.getInstance().findElement(By.className("clsResponseApplyBtn")).click();
    		
    		System.out.println("Third Action - Import and chat added successfully");
    		
    		   		
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Adding Action item into Web Bot","Pass"};
 			reportObj.writeReport(reportValues);
 			String[] reportValues1 = {"Adding Second Action into Web Bot","Pass"};
 			reportObj.writeReport(reportValues1);
 			String[] reportValues2 = {"Adding import and chat action with optional message - web bot","Pass"};
 			reportObj.writeReport(reportValues2);
 			
 			log.info("Successfully adding actions");
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Adding Action item into Web Bot","Fail"};
 			reportObj.writeReport(reportValues);
 			String[] reportValues1 = {"Adding Second Action into Web Bot","Fail"};
 			reportObj.writeReport(reportValues1);
 			String[] reportValues2 = {"Adding import and chat action with optional message - web bot","Fail"};
 			reportObj.writeReport(reportValues2);
 			
 			log.info("An error occurred while adding actions");
    	}
    	
    	//Save and Publish
    	
    	try    	   	
    	{
    		Thread.sleep(2500);  
    		//Save and Publish
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/div/div[3]/button")).click();
    		Thread.sleep(2500);

    		Browser.getInstance().findElement(By.xpath("//*[@id='suretoPublish']/div/div[2]/input")).click();
    		
    		Thread.sleep(3500);
    		
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Save and Published Web Bot","Pass"};
 			reportObj.writeReport(reportValues);
 			log.info("Save and publishing web bot");
    	}   
    	catch (Exception e)
    	{
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Save and Published Web Bot","Fail"};
 			reportObj.writeReport(reportValues);
 			log.info("An error occurred while publishing web bot");
    	}
    	
    	//Archive and Restore
    	
    	try
    	{
    		Thread.sleep(2500);
    		Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
    		
    		((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,1000)");
    		Thread.sleep(3500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/div/div[2]/span")).click();
    		
    		Thread.sleep(1500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='archiveBotddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/span/span[4]")).click();
    		
    		System.out.println("Successfully Archived");
    		
    		Thread.sleep(2500);

    		Select dropdown = new Select(Browser.getInstance().findElement(By.className("dashboardDropdown")));
    		dropdown.selectByVisibleText("Show Archived");
    		
    		Thread.sleep(2500);
    		Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]/div[1]")).click();
    		
    		((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,1000)");
    		Thread.sleep(3500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='webBotContainerIDddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/div/div[1]/div/div[2]/span")).click();
    		
    		Thread.sleep(1500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='archiveBotddaf75be-c99e-458d-9f5b-ffc3cc71d2de']/span/span[4]")).click();
    		
    		System.out.println("Successfully Restored");
    		
    		Thread.sleep(2500);

    		Select dropdown1 = new Select(Browser.getInstance().findElement(By.className("dashboardDropdown")));
    		dropdown1.selectByVisibleText("Show Active");
    		
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Web Bot Archived Successfully","Pass"};
 			reportObj.writeReport(reportValues);
 			String[] reportValues1 = {"Web Bot Restored Successfully","Pass"};
 			reportObj.writeReport(reportValues1);
 			log.info("Archiveing and Restoring Web Bot");
    		    		
    	}
    	catch (Exception e)
    	{
    		ReportGenerator reportObj = new ReportGenerator();
 			String[] reportValues = {"Web Bot Archived Successfully","Fail"};
 			reportObj.writeReport(reportValues);
 			String[] reportValues1 = {"Web Bot Restored Successfully","Fail"};
 			reportObj.writeReport(reportValues1);
 			log.info("An error occurred whie archiveing and restoring Web Bot");
    		
    	}
    	
}    
}