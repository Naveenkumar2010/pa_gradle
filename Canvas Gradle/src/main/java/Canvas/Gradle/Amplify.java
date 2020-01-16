package Canvas.Gradle;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amplify {
	
	static Logger log = Logger.getLogger(Amplify.class.getName());
	   
    public void Bot() throws IOException, InterruptedException   
    
{
        //Schedule message - amplify from candidates page
    
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
    		
    		//Changing Team to Mine
    		
    		try
    	    {
    		   Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[2]/img[1]")).click();
    		   
    		   Thread.sleep(3500);
    		   
    		   Browser.getInstance().findElement(By.xpath("//*[@id='mineCandidateID']/li[1]")).click();
    		   
    		   System.out.println("Selecting Mine in Dropdown");
    		   
    	    }
    	   catch(Exception e)
    	    {
    		   e.printStackTrace();   
    	    }
    		
    		Thread.sleep(5500);
    		
    		Browser.getInstance().findElement(By.id("OverAllCheck")).click();
    		Thread.sleep(3500);
    		
    		Browser.getInstance().findElement(By.id("btn_homenewbatchmsg")).click();
    		Thread.sleep(1500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/ol[2]/li[2]/a")).click();
    		Thread.sleep(1500);   
    		
    		//Navigating to Amplify Modal
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[2]/div[1]")).click();
    		
    		Thread.sleep(1500);  
		
    		Browser.getInstance().findElement(By.id("configureInputID")).sendKeys("Test Title Schedule using Selenium");    	  		   		 		
    		
          	//Checking Unsaved Collection.
    		
    		Thread.sleep(1500);    	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel");
        	        	
        	Thread.sleep(2500);
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	Thread.sleep(2500);
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel");
        	
            Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[1]/button")).click();
        	              	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking esacpe-ok");
        	
        	Thread.sleep(2500);        	
        	Browser.getInstance().findElement(By.id("btn_homenewbatchmsg")).click();
    		Thread.sleep(1500);
    		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/ol[2]/li[2]/a")).click();
    	    Thread.sleep(1500);    	
    		
    		//Navigating to Amplify Modal
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[2]/div[1]")).click();
    		Thread.sleep(1500);  
		
    		Browser.getInstance().findElement(By.id("configureInputID")).sendKeys("Test Title Schedule using Selenium");        	
          	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok");
        	
        	Thread.sleep(2500);        	
        	
    		
    		//Adding Amplify Message again - 1st Modal:    		
    		
        	Browser.getInstance().findElement(By.id("btn_homenewbatchmsg")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/ol[2]/li[2]/a")).click();
    		
    		//Navigating to Amplify Modal
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[2]/div[1]")).click();
    		Thread.sleep(1500);  
		
    		
    		Thread.sleep(1500);    				
    		Browser.getInstance().findElement(By.id("configureInputID")).sendKeys("Test Title Schedule using Selenium");
    		
    		//Enabling track response
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.id("amplifyCheckBox")).click();
    		
    		Thread.sleep(1500);
    		
    		Browser.getInstance().findElement(By.className("clsCanvasbotConfig")).click();
    		
    		Thread.sleep(1500);
    		//Select Action
    		Browser.getInstance().findElement(By.xpath("//div[contains(@class,'tableContainer')]/div/div[1]/input")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyActionOptions']/li[1]/a")).click();
    		
    		System.out.println("Select Action Successfully added");
    		
    		//Configure Action
    		
    		Thread.sleep(2500);  
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionId']/input")).click();
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionMultipleOptions']/li[1]/div/input")).click();
    		
    		Browser.getInstance().findElement(By.id("configActionId")).click();
    		
    		Thread.sleep(2500);   
    		Browser.getInstance().findElement(By.className("clsResponseApplyBtn")).click();
    		
    		System.out.println("Action successfully added into the Amplify modal");
    		
    		
    		//Adding Action  - Import and Chat with optional message
    		
    		//Thread.sleep(2500);   
    		//Browser.getInstance().findElement(By.className("clsCanvasbotConfig")).click();
    		
    		Thread.sleep(1500);
    		//Select Action
    		Browser.getInstance().findElement(By.xpath("//div[contains(@class,'tableContainer')]/div/div[1]/input")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyActionOptions']/li[4]/a")).click();
    		
    		//Configure Action
    		
    		Thread.sleep(2500);  
    		Browser.getInstance().findElement(By.className("importnChatINputDiv")).click();
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='configActionSingleOptions']/li[3]/a")).click();
    		
    		Thread.sleep(1500);
    		
    		WebElement Optmessage = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'configBotSelectAction')]/div[4]/input"));
    		Optmessage.clear();
    		Optmessage.sendKeys("Test Optional Message");

    		Thread.sleep(2500);   
    		Browser.getInstance().findElement(By.className("clsResponseApplyBtn")).click();
    		
    		System.out.println("Second action added successfully");
    		    		
    		//Adding Third Action
    		//Thread.sleep(2500);   
    		//Browser.getInstance().findElement(By.className("clsCanvasbotConfig")).click();
    		
    		Thread.sleep(1500);
    		//Select Action
    		Browser.getInstance().findElement(By.xpath("//div[contains(@class,'tableContainer')]/div/div[1]/input")).click();
    		
    		Thread.sleep(1500);    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyActionOptions']/li[3]/a")).click();
    		
    		Thread.sleep(2500);   
    		Browser.getInstance().findElement(By.className("clsResponseApplyBtn")).click();
    		
    		System.out.println("Third Action Added Successfully");
    		   			
    		Browser.getInstance().findElement(By.id("nextScreenAmplify")).click();    		
    		  	
    		Thread.sleep(2500);    		    		   		
    		WebElement amplify = Browser.getInstance().findElement(By.id("txa_newmessage_amplify"));
    		amplify.sendKeys("Testing long message");
    		  		    		    				
    		//Checking Unsaved Collection.
    		
    		Thread.sleep(1500);   	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel");
        	        	
        	Thread.sleep(2500);
        	Actions action11 = new Actions(Browser.getInstance());
        	action11.sendKeys(Keys.ESCAPE).build().perform();
        	        	    	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	Thread.sleep(2500);
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel");
    		
    		//Adding Amplify Message again:  
        	
        	WebElement amplify1 = Browser.getInstance().findElement(By.id("txa_newmessage_amplify"));
    		amplify1.sendKeys("Amplifies are limited to 300 characters per message, so we've capped the length.");
    		    		
			//Checking the count 
			Thread.sleep(2500);
			WebElement Number = Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[6]/div[2]/div[2]"));
			String num = Number.getText();
			System.out.println("Message Count  " + num);
					
			//Schedule date and time
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'clsQuickSendSchdlDtTmeshow')]/button[contains(@class,'btn-amplify-schedulemsg')]")).click();
			
			WebElement datepicker = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/input"));
			datepicker.isEnabled();
			datepicker.click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("adp-next")).click();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/div/div[2]/div[18]")).click();
						
			Thread.sleep(2500);
			System.out.println("Date sucessfully added" + '\n');
			
			//Browser.getInstance().findElement(By.className("input-group-addon")).click();
			Browser.getInstance().findElement(By.xpath("//*[@id='schdTimePickerAmplify']/div[1]/span")).click();
			Thread.sleep(3500);
						
			WebElement Schtime = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/input"));
			Schtime.isEnabled();
			Schtime.click();
			Thread.sleep(2500);	
			
			System.out.println("Time sucessfully added" + '\n');
			
						
			WebElement Addtosch = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[4]/button"));
			Addtosch.isEnabled();
			Addtosch.click();
					
								
			Thread.sleep(4500);
							   
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifySend_confirm']/div/div[1]/button")).click();
			
			Thread.sleep(4500);
			
			action1.sendKeys(Keys.ESCAPE).build().perform();
        	Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_Amplifyconfirmation_modal']/div/div[2]/input")).click(); //Final OK
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok");
        	
			
//			//Adding message for second time - now we are not using
//			   
//			try {
//				WebElement Hide = Browser.getInstance().findElement(By.xpath("//*[@id='//*[@id='modalErrorAmplify']/div/div/div[3]"));
//				Hide.isEnabled();
//				Hide.click();
//			} catch (Exception e) {
//		
//			System.out.println("Trying to add date/time for second time");	
//			}
//		    		    
//			//Adding Date and Time again
//			
//			//Schedule date and time
//			Thread.sleep(5500);
//			Browser.getInstance().findElement(By.id("btn-amplify-schedulemsg")).click();
//			
//			WebElement datepicker1 = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/input"));
//			datepicker1.isEnabled();
//			datepicker1.click();
//			
//			Thread.sleep(2500);
//			
//			Browser.getInstance().findElement(By.className("adp-next")).click();
//			Thread.sleep(2500);
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/div/div[2]/div[18]")).click();
//						
//			Thread.sleep(2500);
//			System.out.println("Date sucessfully added" + '\n');
//			
//			//Browser.getInstance().findElement(By.className("input-group-addon")).click();
//			Browser.getInstance().findElement(By.xpath("//*[@id='schdTimePickerAmplify']/div[1]/span")).click();
//			Thread.sleep(3500);
//						
//			WebElement Schtime1 = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/input"));
//			Schtime1.isEnabled();
//			Schtime1.click();
//			Thread.sleep(2500);	
//			
//			System.out.println("Time sucessfully added" + '\n');
//			
//						
//			WebElement Addtosch1 = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[4]/button"));
//			Addtosch1.isEnabled();
//			Addtosch1.click();
//					
//								
//			Thread.sleep(4500);
//							   
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifySend_confirm']/div/div[2]/button")).click();
//			
//		    Thread.sleep(1500);
//		    
//		    System.out.println("Sucessfully messages scheduled  via Amplify Modal from Mine View" + '\n');
		    
		    
    		
		    ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully message has been scheduled and verified character limit via Amplify modal","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues11 = {"Successfully enabled Track Response and Team selected from create a chat here option","Pass"};
			reportObj.writeReport(reportValues11);
			String[] reportValues1 = {"Successfully tested unsaved edits by clicking - Escape key and by clicking off the modal","Pass"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 = {"Successfully enabled Track Response","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 = {"Successfully added actions into the Amplify modal","Pass"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Successfully added Import and Chat action with optional message - Amplify modal","Pass"};
			reportObj.writeReport(reportValues4);
			log.info("Successfully  message has been scheduled via Amplify modal");
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    		Browser.getInstance().navigate().refresh();
    	    ReportGenerator reportObj = new ReportGenerator();
    		String[] reportValues = {"Successfully  message has been scheduled and verified character limit via Amplify modal","Fail"};
    		reportObj.writeReport(reportValues);
    		String[] reportValues11 = {"Successfully enabled Track Response and Team selected from create a chat here option","Fail"};
    		reportObj.writeReport(reportValues11);
    		String[] reportValues1 = {"Successfully tested unsaved edits by clicking - Escape key and by clicking off the modal","Fail"};
    		reportObj.writeReport(reportValues1);
    		String[] reportValues2 = {"Successfully enabled Track Response","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 = {"Successfully added actions into the Amplify modal","Fail"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Successfully added Import and Chat action with optional message","Fail"};
			reportObj.writeReport(reportValues4);
    		log.info("An error occurred while scheduling message via Amplify modal");
    	}
    	
    	//Add Audience to existing bot
    	try
    	{
    		Thread.sleep(7000);
    		
    		Browser.getInstance().findElement(By.id("btn_homenewbatchmsg")).click();
    		Thread.sleep(1500);
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/ol[2]/li[2]/a")).click();
    		Thread.sleep(1500);
    		
    		//Navigating to Add to Existing Modal
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[2]/div[2]")).click();
    		
    		Thread.sleep(1500);
    		WebElement Existing = Browser.getInstance().findElement(By.className("existingAmplifyBotInput"));
    		Existing.sendKeys("Test Title");
    		Existing.click();
    		
    		Thread.sleep(2500);
    		
    		Browser.getInstance().findElement(By.xpath("//li[contains(@class,'amplifyLi')]/span")).click();

    		Thread.sleep(2500);
    		
    		//Schedule date and time
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'clsExistingSendSchdlDtTmeshow')]/button[contains(@class,'btn-amplify-schedulemsg')]")).click();
			
			WebElement datepicker = Browser.getInstance().findElement(By.xpath("//*[@id='amplifyExistingSendSchdlDtTme']/div/div[2]/div[1]/div/input"));
			datepicker.isEnabled();
			datepicker.click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("adp-next")).click();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyExistingSendSchdlDtTme']/div/div[2]/div[1]/div/div/div[2]/div[18]")).click();
						
			Thread.sleep(2500);
			System.out.println("Date sucessfully added for existing bot modal" + '\n');
			
			//Browser.getInstance().findElement(By.className("input-group-addon")).click();
			Browser.getInstance().findElement(By.xpath("//*[@id='schdTimePickerExistingAmplify']/div[1]/span")).click();
			Thread.sleep(3500);
						
			WebElement Schtime = Browser.getInstance().findElement(By.xpath("//*[@id='amplifyExistingSendSchdlDtTme']/div/div[2]/div[1]/div/input"));
			Schtime.isEnabled();
			Schtime.click();
			Thread.sleep(2500);	
			
			System.out.println("Time sucessfully added for existing bot modal" + '\n');
			
				
			Thread.sleep(2500);	
			WebElement Addtosch = Browser.getInstance().findElement(By.xpath("//*[@id='amplifyExistingSendSchdlDtTme']/div/div[2]/div[4]/button"));
			Addtosch.isEnabled();
			Addtosch.click();		
								
			Thread.sleep(8000);
							   
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyExistingSend_confirm']/div/div[2]/button")).click();
			
			System.out.println("Adding Audience to the Existing Bot");
			
			Thread.sleep(2500);
			Browser.getInstance().navigate().refresh();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Audience successfully added to the Existing Bot","Pass"};
			reportObj.writeReport(reportValues);			
			log.info("Audience been added to the existing bot");
    	}
    	catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Audience successfully added to the Existing Bot","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while Navigating to Canvasbot page");
		}
    	//Navigate to Canvasbot page
		try
		{		
			
			Thread.sleep(16000);		
			
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[6]/a"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[6]/a"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);			
    		
    		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[6]/a")).click();
			
									
			Thread.sleep(2500);				
			WebElement name = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/a[1]")); 
			String title1 = name.getText();
			
			System.out.println("CanvasBot : "+ title1);
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Canvasbot page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Canvasbot page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigate to Canvasbot page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while Navigating to Canvasbot page");
		}
    	
      //Printing the count values
		
		try
		{
			//Amplify
			WebElement Amplify = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[1]/div[4]/div[1]/span[1]")); 
			String botamplify = Amplify.getText();
			
			Thread.sleep(2500);
			System.out.println("Amplify Bot Count : "+ botamplify);
			
			
			WebElement Amplifymsg = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[1]/div[4]/div[2]/span[1]")); 
			String botamplifymsg = Amplifymsg.getText();
			
			Thread.sleep(1500);
			System.out.println("Amplify Messages Count : "+ botamplifymsg);
			
			//Keyword
			WebElement key = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[2]/div[4]/div[1]/span[1]")); 
			String botkey = key.getText();
			Thread.sleep(1500);
			System.out.println("Keyword Bot Count : "+ botkey);
			
			
			WebElement key1 = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[2]/div[4]/div[2]/span[1]")); 
			String keymsg = key1.getText();
			Thread.sleep(1500);
			System.out.println("keyword Processed Count : "+ keymsg);
					
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Printing the count values(Amplify/Keyword/Apply)","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Printing the count values(Amplify/Keyword/Apply)");
	 	}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Printing the count values(Amplify/Keyword/Apply)","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while printing the count values");
			
        }
		
		//Navigating to Message Details Page
		try
		{
			Thread.sleep(1500);			
			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[1]/div[5]/button")).click();
			
			Thread.sleep(5500);			
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,200)");
			
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[8]/span")).click();
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[8]/div/ul/li[1]")).click();
			
			System.out.println("Sucessfully navigated to Details page");
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(200,0)");
			Thread.sleep(3500);
			
			WebElement status = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[3]"));
			
			String Messagestatus = status.getText();
			
			System.out.println("Message Details Status : " + Messagestatus);			
							
			Thread.sleep(6500);
			//Editing Actions
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[3]/img")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyBranchActionList000']/div/div[1]/input")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyActionOptions000']/li[3]/a")).click();
			
			Thread.sleep(2500);
					
			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyBranchActionList000']/div/div[5]/input")).click();
						
			System.out.println("Sucessfully edited track response along with actions");
		
			Thread.sleep(4500);			
			
			WebElement Messagearea = Browser.getInstance().findElement(By.id("audienceMessageBodyID_9b7167ac-45b0-4f66-b6c5-17a26762e744"));
			Messagearea.clear();
			
			Messagearea.sendKeys("Changing message to check edit functionality from message details page");					
						
			System.out.println("Message sucessfully edited in message details page");		
			
						
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Message details page and editing the first message","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Message details page and editing the schedule-message");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Message details page and editing the schedule-message","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to Message details  page and edting the message");
		}
		
		//Navigating to audience page
		try
		
		{
			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(400,0)");
			Thread.sleep(2500);		
			
			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[4]/span[2]/a")).click();
			
			System.out.println("Successfully navigated to Audience Page");
			
			
			//Print the count details
			
			Thread.sleep(5500);
			
			WebElement count = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[9]/div[1]/div[2]"));
			String proscount = count.getText();
			System.out.println("Prospects Count :" + proscount);
			Thread.sleep(5500);
			
			//Applying Filters to delivery status
			
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[3]/span"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[3]/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[3]/img")).click();
			
			//Apply filter
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[3]/div[1]/ul/li[1]/input[1]")).sendKeys("raghu");
			
			Thread.sleep(3500);			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[3]/div[1]/ul/li[1]/input[2]")).click();	
			
			System.out.println("Filter successfully applied for Name Column");
			
			//Clearing Filter  
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[3]/img")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='nameAudienceFilterId']/div/a")).click();
			
			System.out.println("Filter successfully removed");
			
			Thread.sleep(6500);
			
			//Applying Delivery Status filter
			Actions actions1 = new Actions(Browser.getInstance());
			WebElement menu1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[4]/span"));
			actions1.moveToElement(menu1);

			WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[4]/img"));
			actions1.moveToElement(subMenu1);
			actions1.build().perform();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[4]/img")).click();
			
			Thread.sleep(2500);		
			
			Select dropdown = new Select(Browser.getInstance().findElement(By.id("idProspectStatusFilter")));
			dropdown.selectByVisibleText("Pending");	
						
			Thread.sleep(2500);			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[4]/div[1]/ul/li/input")).click();	
			
			System.out.println("Successfully applied filter to Deliver Status column");
										
			Thread.sleep(6500);
			
			//Applying Session Status filter
			Actions actions11 = new Actions(Browser.getInstance());
			WebElement menu11 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[5]/span"));
			actions11.moveToElement(menu11);

			WebElement subMenu11 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[5]/img"));
			actions11.moveToElement(subMenu11);
			actions11.build().perform();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[5]/img")).click();
			
			Thread.sleep(2500);		
			
			Select dropdown1 = new Select(Browser.getInstance().findElement(By.id("idProspectStatusFilter")));
			dropdown1.selectByVisibleText("Pending");	
						
			Thread.sleep(2500);			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[5]/div[1]/ul/li/input")).click();	
			
			System.out.println("Successfully applied filter to Session Status column");
										
			Thread.sleep(8000);
			
			System.out.println("Going to filter Message Title");
			//Selecting Message Title from Title Dropdown..
			
			WebElement messagedrop = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[2]/span/span"));
			actions.moveToElement(messagedrop);

			WebElement messagedrop1 = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[2]/span/span"));
			actions.moveToElement(messagedrop1);
			actions.build().perform();
			Thread.sleep(2500);	
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[2]/span/span")).click();
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'audienceMessageList')]/ul/li[2]")).click();
			
			System.out.println("Message Title successfully selected");
			
			
			//Applying Response Status Filter
			Thread.sleep(5500);
			
			Actions actions111 = new Actions(Browser.getInstance());
			WebElement menu111 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/span"));
			actions111.moveToElement(menu111);

			WebElement subMenu111 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/img"));
			actions111.moveToElement(subMenu111);
			actions111.build().perform();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/img")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='responseFilterId_9b7167ac-45b0-4f66-b6c5-17a26762e744']/div[3]/input")).click();
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='responseFilterId_9b7167ac-45b0-4f66-b6c5-17a26762e744']/div[4]/input")).click();
			System.out.println("No Response filter selected");
			
			Thread.sleep(4500);
			
			Actions actions2 = new Actions(Browser.getInstance());
			WebElement menu2 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/span"));
			actions2.moveToElement(menu2);

			WebElement subMenu2 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/img"));
			actions2.moveToElement(subMenu2);
			actions2.build().perform();
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/img")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='responseFilterId_9b7167ac-45b0-4f66-b6c5-17a26762e744']/div[2]/input")).click();
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='responseFilterId_9b7167ac-45b0-4f66-b6c5-17a26762e744']/div[2]/ul/li/input")).sendKeys("Test");
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='responseFilterId_9b7167ac-45b0-4f66-b6c5-17a26762e744']/div[4]/input")).click();
			System.out.println("Response filter selected");
				
			Thread.sleep(4500);
			
			Actions actions3 = new Actions(Browser.getInstance());
			WebElement menu3 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/span"));
			actions3.moveToElement(menu3);

			WebElement subMenu3 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/img"));
			actions3.moveToElement(subMenu3);
			actions3.build().perform();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[8]/img")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='responseFilterId_9b7167ac-45b0-4f66-b6c5-17a26762e744']/div[1]/a")).click();
			
			System.out.println("Successfully filter cleared");
			
			//Searching audience in Amplify Audience page.
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.id("amplifyOnLoad")).sendKeys("Invalid");
			
			Thread.sleep(2500);
			
			WebElement audiencename = Browser.getInstance().findElement(By.className("noRecordsStyle"));
			
			String name = audiencename.getText();
			
			System.out.println("Audience name : " + name);
			
			Thread.sleep(2500);			
						
			System.out.println("Searching for an invalid record");
			
			Browser.getInstance().findElement(By.className("amplifySearchClose")).click();
			
			
			//Valid Search			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("amplifyOnLoad")).sendKeys("Raghu");
			
			Thread.sleep(2500);
			
			WebElement audiencename1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/tbody/tr[2]/td[3]/span"));
			
			String name1 = audiencename1.getText();
			
			System.out.println("Audience name " + name1);
			
					
			//Deleting Audience //Individual Delete
			Thread.sleep(4500);
			
			
			WebElement menudel = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/tbody/tr[2]/td[9]/div/i/img"));
			actions.moveToElement(menudel);

			WebElement subMenudel = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/tbody/tr[2]/td[9]/div/i/img"));
			actions.moveToElement(subMenudel);
			actions.build().perform();
			Thread.sleep(2500);			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/tbody/tr[2]/td[9]/div/i/img")).click();
						
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/tbody/tr[2]/td[9]/div/div/span/span/span[3]")).click();
			Thread.sleep(2500);
			
			System.out.println("Deleting Individual Audience");
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.className("amplifySearchClose")).click();
			
			//Bulk Deleting Audience
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("checkBoxJob")).click();
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[9]/div[2]/a/span")).click();
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[9]/div[4]/div/div/p")).click();
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='deleteamplifyresponse_confirm']/div/div[2]/button")).click();
			
			System.out.println("Successfully deleted audiennce using - Global option");
			
			
//			//Adding amplify message from audience page.
//			Thread.sleep(2500);
//			Browser.getInstance().findElement(By.id("checkBoxJob")).click();
//			
//			//Thread.sleep(2500);
//			
//			Browser.getInstance().findElement(By.className("amplifyImportGreenButtonStyle")).click();			
//						
//			Thread.sleep(1500);    	
//			
//			//Navigating to Amplify Modal
//    		
//    		Browser.getInstance().findElement(By.xpath("//*[@id='amplifyModal']/div/div[2]/div[1]")).click();
//    		Thread.sleep(1500);  
//		
//			
//    		Browser.getInstance().findElement(By.id("configureInputID")).sendKeys("Test Title Schedule using Selenium - Audience Page");	
//    		Browser.getInstance().findElement(By.id("configureInputID")).sendKeys("...");
//			
//    		//Enabling track response
//    		Thread.sleep(2500);    		
//    		Browser.getInstance().findElement(By.id("amplifyCheckBox")).click();
//    		    		   		
//    		Browser.getInstance().findElement(By.id("nextScreenAmplify")).click();
//    		
//    		Thread.sleep(2500);    		    		   		
//    		WebElement amplify = Browser.getInstance().findElement(By.id("txa_newmessage_amplify"));
//    		amplify.sendKeys("Testing Schedule message");
//    		
//    		
//    		Thread.sleep(2500);    		
//    		//Schedule date and time
//			Browser.getInstance().findElement(By.id("btn-amplify-schedulemsg")).click();
//			
//			WebElement datepicker = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/input"));
//			datepicker.isEnabled();
//			datepicker.click();
//			
//			Thread.sleep(2500);			
//			Browser.getInstance().findElement(By.className("adp-next")).click();
//			Thread.sleep(2500);
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/div/div[2]/div[18]")).click();
//						
//			Thread.sleep(2500);
//			System.out.println("Date sucessfully added" + '\n');
//		
//			Browser.getInstance().findElement(By.xpath("//*[@id='schdTimePickerAmplify']/div[1]/span")).click();
//			Thread.sleep(3500);
//						
//			WebElement Schtime = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[1]/div/input"));
//			Schtime.isEnabled();
//			Schtime.click();
//			Thread.sleep(2500);	
//			
//			System.out.println("Time sucessfully added" + '\n');
//			
//						
//			WebElement Addtosch = Browser.getInstance().findElement(By.xpath("//*[@id='amplifySendSchdlDtTme']/div/div[2]/div[4]/button"));
//			Addtosch.isEnabled();
//			Addtosch.click();
//					
//								
//			Thread.sleep(2500);		   
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifySend_confirm']/div/div[2]/button")).click();
//		    		    
//		    Thread.sleep(1500);		    
//		    System.out.println("Sucessfully messages scheduled  via Amplify Modal from  Amplify Audience page" + '\n');
//    		
//		    Thread.sleep(8500);
//			//Bulk Delete
//			
//			//Browser.getInstance().findElement(By.id("checkBoxJob")).click();
//			Thread.sleep(2500);			
//			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[9]/div[2]/a/span")).click();
//			
//			Thread.sleep(2500);			
//			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTable']/thead/tr/th[9]/div[4]/div/div/p")).click();
//			
//			Thread.sleep(2500);			
//			Browser.getInstance().findElement(By.xpath("//*[@id='deleteamplifyresponse_confirm']/div/div[2]/button")).click();
//			
//			Thread.sleep(2500);			
//			System.out.println("Bulk-Deleting Audience");
//			
//			//Navigate to Details page and delete the message
//			Thread.sleep(4500);			
//			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'ampdetails')]/span/span[1]/a")).click();
//			Thread.sleep(2500);
//			
//			//Browser.getInstance().findElement(By.className("deleteCampaign")).click();
//			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div[1]/div[2]/div[6]")).click();
//			Thread.sleep(2500);			
//			Browser.getInstance().findElement(By.xpath("//*[@id='deleteamplifyincident_confirm']/div/div[2]/button")).click();
//			
//			System.out.println("Message Sucessfully Deleted");
//											
//			//Selecting Schedule Message from dropdowmn
//			
//			Select dropdown12 =new Select(Browser.getInstance().findElement(By.id("ampTableSelectList")));
//			dropdown12.selectByVisibleText("Scheduled");
//			
//			Thread.sleep(3500);			
//			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,200)");
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr[1]/td[9]/span")).click();
//			
//			Thread.sleep(2500);
//			
//			//Removing Schedule from overflow menu
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr[1]/td[9]/div/ul/li[3]/p")).click();
//			
//			//Delete Confirmation modal
//			
//			Thread.sleep(3500);
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='cancelMessageSchedule']/div/div[2]/button")).click();
//			
//			System.out.println("Messsage removed successfully from dashboard page");
//			
//			//Selecting Schedule Message from dropdowmn
//			
//			Select dropdown2 =new Select(Browser.getInstance().findElement(By.id("ampTableSelectList")));
//			dropdown2.selectByVisibleText("Draft");
//			
//			Thread.sleep(3500);
//			
//					
//			((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,200)");
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr[1]/td[9]/span")).click();
//			
//			Thread.sleep(2500);	
//					
//			Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[9]/div/ul/li[3]/p")).click();
//			
//			//Delete Confirmation modal
//			
//			Thread.sleep(3500);
//			
//			Browser.getInstance().findElement(By.xpath("//*[@id='deleteamplifyincident_confirm']/div/div[2]/button")).click();
//			
//			
//			System.out.println("Message sucessfully deleted");
			
			//Navigating to Amplify Dashboard Page
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[1]/span[1]")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Audience Page","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues3 = {"Filter applied successfully","Pass"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Filter cleared successfully","Pass"};
			reportObj.writeReport(reportValues4);
			String[] reportValues41 = {"Session Status filter applied/removed successfully","Pass"};
			reportObj.writeReport(reportValues41);
			String[] reportValues5 = {"No Response radio button successfully selected for Response Filter","Pass"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 = {"Response Filter applied successfully","Pass"};
			reportObj.writeReport(reportValues6);
			String[] reportValues7 = {"Clear filter for response filter applied successfully","Pass"};
			reportObj.writeReport(reportValues7);
			String[] reportValues8 = {"Searching audience with valid/invalid records","Pass"};
			reportObj.writeReport(reportValues8);
			String[] reportValues9 = {"Audience deleted successfully using delete icon and using global option","Pass"};
			reportObj.writeReport(reportValues9);
			
			log.info("Navigating to Audience Page and deleting schedule message");
						
		}
		catch(Exception e)
		{
			e.printStackTrace();	
			Browser.getInstance().navigate().refresh();
			//Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/div[1]/span[1]")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Successfully navigated to Audience Page","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues3 = {"Filter applied successfully","Fail"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Filter cleared successfully","Fail"};
			reportObj.writeReport(reportValues4);
			String[] reportValues41 = {"Session Status filter applied/removed successfully","Fail"};
			reportObj.writeReport(reportValues41);
			String[] reportValues5 = {"No Response radio button successfully selected for Response Filter","Fail"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 = {"Response Filter applied successfully","Fail"};
			reportObj.writeReport(reportValues6);
			String[] reportValues7 = {"Clear filter for response filter applied successfully","Fail"};
			reportObj.writeReport(reportValues7);
			String[] reportValues8 = {"Searching audience with valid/invalid records","Fail"};
			reportObj.writeReport(reportValues8);
			String[] reportValues9 = {"Audience deleted successfully using delete icon and using global option","Fail"};
			reportObj.writeReport(reportValues9);
			
			log.info("An error occurred while navigating to Audience Page and deleting schedule message");
		}
		
		//Creating a bot using create bot option
		
		try
		{
			Thread.sleep(6500);
			
			Browser.getInstance().findElement(By.className("createBotAmplify")).click();
			
			Thread.sleep(5500);
			
			Browser.getInstance().findElement(By.className("audienceMessageBodyFocus0")).sendKeys("Message Body using Selenium Automation");
			
			System.out.println("Message Body sucessfully added");
			
			//Enabling Track Response
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chat-history-check')]/input")).click();
			
			System.out.println("Successfully enabled Track Response checkbox for first slot");
			
			//Adding Conditional
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'validationNotification')]//div[2]/img")).click();
			
			Thread.sleep(1500);
	        Select dropdown3 =new Select(Browser.getInstance().findElement(By.xpath("//*[@id='rulecontainer']/div[1]/span[2]/select")));
	    	dropdown3.selectByVisibleText("Contains"); 
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='equal']/span/input")).sendKeys("Test Amplify Validation Modal");
	    	
	    	Thread.sleep(500);
	    	
	    	Browser.getInstance().findElement(By.className("Add-rule")).click();
	    	
	    	Select dropdown2 =new Select(Browser.getInstance().findElement(By.className("classCampOerator")));
	     	dropdown2.selectByVisibleText("AND");
	     	
	     	Thread.sleep(1500);
	     	Select dropdown1 =new Select(Browser.getInstance().findElement(By.xpath("//*[@id='rulecontainer']/div[2]/span[2]/select")));
	    	dropdown1.selectByVisibleText("Is Anything"); 
			
	    	Thread.sleep(500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='validationModal']/div/div/div[6]/button")).click();
	    	    	
	    	System.out.println("Validation modal successfully added");
			
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.className("configAmplifyIcon")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	//Adding Action
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='ShowactionAmplifySlot00']/div/div[1]/input")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='amplifyActionOptions00']/li[1]/a")).click();
	    	
	    	//config action
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='configActionId00']/input")).click();
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='configActionMultipleOptions00']/li[3]/div/input")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='configActionId00']/input")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//*[@id='ShowactionAmplifySlot00']/div/div[5]/input")).click();
	    	
	    	System.out.println("Action successfully added");
	    	
	    	Thread.sleep(3500);
	    	
	    	//Disabling Track  Response
	    	
	    	Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chat-history-check')]/input")).click();
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='disableTrackResponseID']/div/div/button[1]")).click();
			
			System.out.println("Disabling Track and deleting all the conditionals");
			
			//Enable Pause Message
			
			Thread.sleep(3500);
			Actions actions3 = new Actions(Browser.getInstance());
			WebElement menu3 = Browser.getInstance().findElement(By.className("hoverPauseButton"));
			actions3.moveToElement(menu3);

			WebElement subMenu3 = Browser.getInstance().findElement(By.className("hoverPauseButton"));
			actions3.moveToElement(subMenu3);
			actions3.build().perform();
			Thread.sleep(4500);			
			
			Browser.getInstance().findElement(By.className("hoverPauseButton")).click();
			
			System.out.println("Message Paused Successfully");
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Bot created successfully using Create Bot button","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues3 = {"Enabling Track response for the first message","Pass"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Validation successfully added for the first message","Pass"};
			reportObj.writeReport(reportValues4);
			String[] reportValues41 = {"Action added successfully for the first message","Pass"};
			reportObj.writeReport(reportValues41);
			String[] reportValues5 = {"Disabling Track Response and deleting all the conditional by selecting Okay in the confirmation modal","Pass"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 = {"Paused Message Successfully","Pass"};
			reportObj.writeReport(reportValues6);
					
			log.info("Creating bot by clicking Createbot button and checking its functionalities");
	    	
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Bot created successfully using Create Bot button","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues3 = {"Enabling Track response for the first message","Fail"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Validation successfully added for the first message","Fail"};
			reportObj.writeReport(reportValues4);
			String[] reportValues41 = {"Action added successfully for the first message","Fail"};
			reportObj.writeReport(reportValues41);
			String[] reportValues5 = {"Disabling Track Response and deleting all the conditional by selecting Okay in the confirmation modal","Fail"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 = {"Paused Message Successfully","Fail"};
			reportObj.writeReport(reportValues6);
					
			log.info("An error occurred while creating bot by clicking Createbot button and checking its functionalities");
		}
		
		//Second Message
		
		try
		{
			Thread.sleep(5500);
			
			Browser.getInstance().findElement(By.className("tableCampAddSlot")).click();
			
			Thread.sleep(1500);
			
			WebElement  AmplifyMessage = Browser.getInstance().findElement(By.className("audienceMessageBodyFocus1"));
			AmplifyMessage.sendKeys("Message Body using Selenium Automation - 1");
						
			Thread.sleep(3500);
			AmplifyMessage.sendKeys("#");
			Thread.sleep(3500);
			AmplifyMessage.sendKeys(Keys.TAB);
			
			//Uploading Attachments
			
			Thread.sleep(1500);
			
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div[1]/span"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div[1]/span/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div[1]/span/img")).click();			
				
			Thread.sleep(1500);
						
			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div[1]/ol/li[1]/a")).click();
		    
		    Thread.sleep(5500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");	  
			
			
			System.out.println("Document uploaded successfully - Upload from attachments");
			
			Thread.sleep(5500);
			
			
	/*		WebElement menu1 = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div/span"));
			actions.moveToElement(menu1);

			WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div/span/img"));
			actions.moveToElement(subMenu1);
			actions.build().perform();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div/span/img")).click();	
						
			Thread.sleep(500);
			
		    Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[1]/div[3]/div/ol/li[2]/a")).click();
		    
		    Thread.sleep(1500);
		    WebElement Libsearch = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'modal-footer')]/div/input")); 
		    Libsearch.isEnabled();
		    Libsearch.click();
		    Libsearch.sendKeys("test");
	   	 		   	 	
	   	 	Thread.sleep(4500);
	   	 	
	   	 	WebElement Resclick = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatattachementfile')]/ol/li/a[contains(text(),'Testdoc.pdf')]"));
	   	 	Resclick.isEnabled();
	   	 	Resclick.click();   	 	
	   	 		   	 	
	   	 	Thread.sleep(3500);*/
	   	 	
	   	 	//Changing interval dropdown
	   	 	
	   	 	Browser.getInstance().findElement(By.className("inputBoxClassCamp-select")).click();
	   	 	
	   	    Thread.sleep(2500);
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='timeDropDownValue1']/li[3]")).click();
	   	    
	   	    System.out.println("Time interval dropdown updated successfully");
	   	    
	   	    Thread.sleep(3500);	   	      	     	     	    
	   	       	    	   	    
	   	    //Navigating to Audience page by clicking bull-horn
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[2]/div[2]/div[1]/img")).click();
	   	    
	   	    System.out.println("Navigating to Audience Page using bullhorn icon");
	   	 
	   	    Thread.sleep(3500);
	   	    
	   	    Browser.getInstance().findElement(By.className("inactiveanalyticstab")).click();
	   	    
	   	    
	   	    System.out.println("Navigating to Message Details Page");

	   	    Thread.sleep(4500);
	   	    
	   	    //Deleting Individual Message
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[3]/button")).click();
	   	    Thread.sleep(1500);
	   	    
            Browser.getInstance().findElement(By.xpath("//*[@id='deleteMessage1']/span/span[4]")).click();
            
            System.out.println("Individual Message Deleted Successfully");
            
            //Deleting Amplify bot
	   	    
            Thread.sleep(3500);
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[5]/div/div[1]/div/div[1]/div[2]/div[4]/span")).click();
	   	    
	   	    Thread.sleep(1500);
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='deleteamplifyincident_confirm']/div/div[2]/button")).click();
	   	    
	   	    System.out.println("Amplify bot deleted successfully");   
	   	    
	   	    ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Second message added successfully","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues2 = {"Attachments added successfully for the second message","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Saved message using # been opened and message been added successfully by clicking TAB","Pass"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Intervals updated successfully","Pass"};
			reportObj.writeReport(reportValues4);
			String[] reportValues5 = {"Navigating to Audience page by clicking Audience Icon","Pass"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 = {"Deleting Second message by clicking x button","Pass"};
			reportObj.writeReport(reportValues6);
			String[] reportValues7 = {"Deleting Amplify bot using Delete Amplify modal","Pass"};
			reportObj.writeReport(reportValues7);
			
			log.info("Creating bot by clicking Createbot button and adding second message and testing basic functionalties");
	   	      	    	   	       	    						
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Second message added successfully","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues2 = {"Attachments added successfully for the second message","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Saved message using # been opened and message been added successfully by clicking TAB","Fail"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 = {"Intervals updated successfully","Fail"};
			reportObj.writeReport(reportValues4);
			String[] reportValues5 = {"Navigating to Audience page by clicking Audience Icon","Fail"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 = {"Deleting Second message by clicking x button","Fail"};
			reportObj.writeReport(reportValues6);
			String[] reportValues7 = {"Deleting Amplify bot using Delete Amplify modal","Fail"};
			reportObj.writeReport(reportValues7);
			
			log.info("An error occurred while adding second message and testing basic functionalties");
		}
		
}
}
