package Canvas.Gradle;

import java.awt.Robot;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * Candidate V2 class file covers below functionalities : 
 * Bulk Send.
 * Quick Edit.
 * Filtering tags column & Exporting Candidates.
 * Testing Filter operations for all the columns on the candidates page.
 * 
 */

public class Candidates_V2 {
	
	public void candidate2() throws IOException, InterruptedException
	{
	
		Logger log = Logger.getLogger(Candidates_V1.class.getName());
		log.info("Invoking Candidates class");	
		
	//Bulk Send message 
	try
    {
			System.out.println("Performing Bulk Send operation starts");
			Thread.sleep(8000);
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[1]/a")).click();
		    //Schedule message by clicking Schedule message button - All View
			Thread.sleep(5500);
			
			WebElement editfield2 = Browser.getInstance().findElement(By.className("search-candidate-name"));
			editfield2.isEnabled();
			editfield2.sendKeys("(317) 653-3349");
			editfield2.sendKeys(Keys.ENTER);
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.id("OverAllCheck")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.id("btn_homenewbatchmsg")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/ol[2]/li[1]/a")).click();
			
			Thread.sleep(4500);
			
				
			WebElement BulkSend = Browser.getInstance().findElement(By.id("txa_newmessage"));
					
			Thread.sleep(3500);
			BulkSend.sendKeys("#");
			Thread.sleep(1500);
			BulkSend.sendKeys(Keys.DOWN);
			BulkSend.sendKeys(Keys.TAB);	
			
			Thread.sleep(3500);
			BulkSend.sendKeys("#");
			Thread.sleep(1500);
			BulkSend.sendKeys(Keys.DOWN);
			BulkSend.sendKeys(Keys.DOWN);
			BulkSend.sendKeys(Keys.UP);
			Thread.sleep(1500);
			BulkSend.sendKeys(Keys.TAB);
			BulkSend.click();
			
			Thread.sleep(3500);				
			
			System.out.println("Saved message been added by clicking TAB and Keyboard events");
			
			BulkSend.sendKeys("Testing long message to see the long characters and also message shouldn't exceeds to 200 characters. Testing long message to see the long characters and shouldn't exceeds.Testing long message to see the long characters and also message shouldn't exceeds to 200 characters.");
				
			//Confiramation modal when exceeds 200 characters.
			
			System.out.println("Quick Sends are limited to 200 characters per message, so we've capped the length. Please review your message before you send!");
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='reachedLastCharacterDivID']/div/div/button")).click();
			
			//Checking the count 
			Thread.sleep(4500);
			WebElement Number = Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[2]/div[2]"));
			String num = Number.getText();
			System.out.println("Message Count  " + num);
			
		
			//Schedule date and time
			Browser.getInstance().findElement(By.className("btn-batch-schedulemsg")).click();
			
			WebElement datepicker = Browser.getInstance().findElement(By.xpath("//*[@id='quickSendSchdlDtTme']/div/div[2]/div[1]/div/input"));
			datepicker.isEnabled();
			datepicker.click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.className("adp-next")).click();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='quickSendSchdlDtTme']/div/div[2]/div[1]/div/div/div[2]/div[18]")).click();
						
			Thread.sleep(4500);
			System.out.println("Date Successfully added" + '\n');
			
			Browser.getInstance().findElement(By.className("input-group-addon")).click();
			Thread.sleep(4500);
						
			WebElement Schtime = Browser.getInstance().findElement(By.xpath("//*[@id='quickSendSchdlDtTme']/div/div[2]/div[1]/div/input"));
			Schtime.isEnabled();
			Schtime.click();
			Thread.sleep(4500);	
			
			System.out.println("Time Successfully added" + '\n');
			
						
			WebElement Addtosch = Browser.getInstance().findElement(By.xpath("//*[@id='quickSendSchdlDtTme']/div/div[2]/div[4]/button"));
			Addtosch.isEnabled();
			Addtosch.click();
					
								
			Thread.sleep(4500);
		   
			Browser.getInstance().findElement(By.xpath("//*[@id='quickSend_confirm']/div/div[2]/button")).click();
		    		    
		    Thread.sleep(1500);
		    
		    System.out.println("Successfully messages scheduled  via Quick Send Modal from ALL View" + '\n');
		    
		    //Browser.getInstance().navigate().refresh();
		    
		    //Sending message by clicking Send now button - Mine View
		    
		    //Selecting "My Actve" from 2nd dropdown
		    
		    Thread.sleep(5500);
		    Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/img")).click();
		    Thread.sleep(2500);
		    Browser.getInstance().findElement(By.xpath("//*[@id='candidateTypeOptionsId']/li[3]/a")).click();
		        
		    System.out.println("Successfully navigated to Mine View");
		    
		    Thread.sleep(4500);
			Browser.getInstance().findElement(By.id("OverAllCheck")).click();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.id("btn_homenewbatchmsg")).click();
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[3]/ol[2]/li[1]/a")).click();
			Thread.sleep(4500);
				
			WebElement BulkSend1 = Browser.getInstance().findElement(By.id("txa_newmessage"));
			BulkSend1.sendKeys("Testing long message"); 
				
			Browser.getInstance().findElement(By.className("Add-Welcome-Message")).click();
			
			//Checking the count 
			
			WebElement Number1 = Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[2]/div[2]"));
			String num1 = Number1.getText();
			System.out.println("Message Count" + num1);
			
			Robot r1 = new Robot();
			Thread.sleep(1500);			
			r1.keyPress(KeyEvent.VK_ENTER);			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='batchMessageModal']/div/div[3]/form/div[5]/div/div/span")).click();
			Thread.sleep(4500);
				
			Browser.getInstance().findElement(By.xpath("//*[@id='mergetags']/div/div[2]/span")).click();		 
				
			Browser.getInstance().findElement(By.xpath("//*[@id='batchMessageModal']/div/div[3]/form/div[5]/div/div/span")).click();
			Thread.sleep(4500);
				
			Browser.getInstance().findElement(By.xpath("//*[@id='mergetags']/div/div[5]/span")).click();
			Thread.sleep(4500);
			
			//Adding Saved Message into Quick Send Modal
			
			Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[4]/span[1]/img")).click();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[2]/div[3]/div[2]/ul/li[1]")).click();
						
			System.out.println("Saved Message added Successfully");
			
			//Uploading attachment and Library Resource
			Thread.sleep(4500);
			
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[4]/span[2]/img"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[4]/span[2]/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);			
						
			Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[4]/span[2]/img")).click();
			
			Thread.sleep(4500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='bulkattachmentlist']/li[1]/a")).click();
	   	 	
	   	 	Thread.sleep(5500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");	   	 	
	   	 						
			System.out.println("Document Uploaded Successfully");
			
			//Uploading Resource
			
			Thread.sleep(4500);
		
			Browser.getInstance().findElement(By.xpath("//*[@id='div_message']/div[4]/span[2]/img")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='bulkattachmentlist']/li[2]/a")).click();
			
			Thread.sleep(1500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='style-1']/ol/li/span/a")).click();
	   	 	Thread.sleep(1500);
	   	 	Browser.getInstance().findElement(By.className("attchmentinputbox")).sendKeys("test");
			
	   	 	Thread.sleep(5500);
	   	 	
	   	 	WebElement Resclick = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatattachementfile')]/ol/li/a[contains(text(),'Testdoc.pdf')]"));
	   	 	Resclick.isEnabled();
	   	 	Resclick.click();   	 	
	   	 		   	 	
	   	 	Thread.sleep(4500);
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlibraryModal']/div/div[1]/button")).click();
	   	 		    	 		      	   
	   	 	System.out.println("Resource Uploaded Successfully");
			
			//Sent Now confirmation modal
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='batchMessageModal']/div/div[3]/form/div[6]/button[2]")).click();
						   	 		   	 	
	   	 	Thread.sleep(4500);
			 	 	
	   	 	WebElement Send = Browser.getInstance().findElement(By.xpath("//*[@id='sendNow_confirm']/div/div[2]/button"));
	   	 	Send.isSelected();
	   	 	Send.click();   	   	     	
	   	 	   	    	   
			System.out.println("Sucessfull messages sent with attachments via Quick Send Modal" + '\n');
										
							
			ReportGenerator reportObj = new ReportGenerator();
			
			String[] reportValues ={"Successfully messages scheduled by adding saved messages and attachments from All View via Quick Send","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Quick Send Modal","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues1 ={"Successfully messages sent by adding saved messages and attachments  from All View via Quick Send","Pass"};
			reportObj.writeReport(reportValues1);
			log.info("Successfully messages scheduled/sent with attachments via Quick Send from All/Mine View");
				
				
	 }
	catch(Exception e)
	 {
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			//Thread.sleep(3500);
			//Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Successfully messages scheduled by adding saved messages and attachments from All View via Quick Send","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Quick Send Modal","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues1 ={"Successfully messages sent by adding saved messages and attachments  from All View via Quick Send","Fail"};
			reportObj.writeReport(reportValues1);
			log.error("An error occurred while sending Message via Quick Send with attachments from All/Mine View");
				
	 }
		
//	//Candidate Visibility- Performing Quick Edit from Mine View
//	try
//	
//	{
//		   
//			Thread.sleep(6500);	
//			System.out.println("Performing Quick Edit operations/And filtering tag operations starts");
//			Thread.sleep(4500);
//			Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]")).clear();
//			Thread.sleep(6500);		    
//		   		
//			WebElement namefield1 = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'candidate-search')]//input[contains(@id,'candidateSearch')][1]"));
//			namefield1.isEnabled();
//			namefield1.sendKeys("Vasanth");
//			namefield1.sendKeys(Keys.ENTER);
//			
//	
//			//Quick Edit - Add/Removing jobs	
//			Thread.sleep(4500);
//			WebElement radiobutton = Browser.getInstance().findElement(By.id("OverAllCheck"));
//			radiobutton.isSelected();
//			radiobutton.click();
//			Thread.sleep(4500);
//        	WebElement overflow = Browser.getInstance().findElement(By.xpath("//div[@id='sub-menu']/a/span[1]"));
//        	overflow.click();
//        	Thread.sleep(4500);
//        
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsId']")).click();
//    
//        	Thread.sleep(4500);
//        
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[1]/td[2]/input")).sendKeys("Test");
//        	WebElement QuickEdit = Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[1]/td[2]/input"));
//        	QuickEdit.isEnabled();
//        	QuickEdit.click();
//                
//        	Thread.sleep(4500);                    
//                  
//        	Browser.getInstance().findElement(By.xpath("//*[@id='efc849ad-c366-47e0-bfeb-f190a2fcd3e9']")).click();
//       
//        
//        	Thread.sleep(1500);
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[1]/td[2]/input")).click();
//        	
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[1]/td[2]/input")).clear();
//        
//        	WebElement removejobs = Browser.getInstance().findElement(By.className("bulkCheckBox"));
//        	removejobs.isEnabled();
//        	removejobs.click();  
//        	
//        	System.out.println("Quick Edit - Jobs Added Successfully");
//        	 			
//            //Adding Tags
//        	
//        	Thread.sleep(2500);
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/input")).sendKeys("Test");
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/input")).click();
//        	
//        	Thread.sleep(2500);
//        	WebElement QuickTag = Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/input"));
//        	QuickTag.isEnabled();
//        	QuickTag.click();      	
//        	
//            
//        	Thread.sleep(4500);                    
//                  
//        	WebElement Selected = Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/div/div/ul/li[3]/div/input"));
//        	Selected.isEnabled();
//        	Selected.click();
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/input")).click();
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/input")).clear();
//        	
//        	Thread.sleep(1500);
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/table/tbody/tr[3]/td[2]/input")).click();
//        	
//        	Thread.sleep(1500);
//        	                	
//        	WebElement removejobs1 = Browser.getInstance().findElement(By.className("customcheckbox"));
//        	removejobs1.isEnabled();
//        	removejobs1.click();  
//        	
//        	Thread.sleep(4500);
//        	
//        	System.out.println("Quick Edit - Tags Added Successfully");
//            
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEditJobsModalId']/div/div[3]/div/div[1]/button")).click(); 
//        	
//        	Thread.sleep(4500);
//        	Browser.getInstance().findElement(By.xpath("//*[@id='quickEdit_confirm']/div/div[2]/button")).click();
//        	
//        	System.out.println("Adding Jobs & Tags via Quick Edit - All Candidates ");
//        	             	        	      
//          	        																
//			//Filter Tags
//        	
//        	Thread.sleep(2500);
//        	
//        	Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
//        	
//        	Thread.sleep(4500);
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
//        	      	       	
//        	       	
//        	//Selecting dropdown values in filter tags
//        	
//        	
//        	Thread.sleep(4500);
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[2]/div/ul/li[2]/div/img")).click();
//        	
//        	Thread.sleep(4500);     	
//       	     	       	
//        	Browser.getInstance().findElement(By.className("matchTagfiltering")).click();
//        	
//        	System.out.println("Match All values successfully selected from the dropdown");
//        	
//        	//Selecting Match None value from dropdown      	  	       	        	
//    	       
//        	Thread.sleep(4500);
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
//        	
//        	Thread.sleep(4500);
//    	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[2]/div/ul/li[2]/div/img")).click();
//    		
//        	Thread.sleep(4500);
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[2]/ol/li[3]/div")).click();
//        	
//        	System.out.println("Match None values successfully selected from the dropdown");
//        	
//        	Thread.sleep(4500);
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[1]/span[1]")).click();
//        	
//        	Thread.sleep(4500);
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[2]/div/ul/li[2]/input[1]")).sendKeys("Test");
//        	Thread.sleep(2500);
//        	Browser.getInstance().findElement(By.className("goBtnTagChat")).click();
//        	
//        	Thread.sleep(4500);        	    	
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[2]/div/ul/li[3]/div/input")).click();
//        	
//        	Thread.sleep(4500);
//        	
//        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/div[2]/div/ul/li[3]/div/input")).click();
//        	
//        	System.out.println("Tag Filtered Successfully");
//        	
//        	//Exporting Candidates From All Candidates Page        	
//			
//			Thread.sleep(4500);
//			Browser.getInstance().findElement(By.id("OverAllCheck")).click();
//								
//			Thread.sleep(4500);
//			
//			Browser.getInstance().findElement(By.id("btn_export")).click();
//			
//			Thread.sleep(4500);
//			Browser.getInstance().findElement(By.id("OverAllCheck")).click();
//			
//			System.out.println("Exporting candidates by clicking Export button");
//			
//			ReportGenerator reportObj = new ReportGenerator();
//			String[] reportValues ={"Successfully navigated to All Candidates Page & Exported Candidates & Filtering Tags/Adding Tags","Pass"};
//			reportObj.writeReport(reportValues);
//			String[] reportValues1 ={"Selecting dropdown values in filter tags section - Candidates Page","Pass"};
//			reportObj.writeReport(reportValues1);
//			log.info("Successfully navigated to All view & Filtering Tags/Adding Tags");
//	}
//	catch(Exception e)
//	{		
//			e.printStackTrace();
//			Browser.getInstance().navigate().refresh();
//			ReportGenerator reportObj = new ReportGenerator();
//			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
//			String[] reportValues ={"Successfully navigated to All Candidates Page & Exported Candidates & Filtering Tags/Adding Tags","Fail"};
//			reportObj.writeReport(reportValues);
//			String[] reportValues1 ={"Selecting dropdown values in filter tags section","Fail"};
//			reportObj.writeReport(reportValues1);
//			log.info("An error occurred while navigating to All Candidates Page and doing actions & Filtering Tags/Adding Tags");
//	}
//	
	
	
	//Selecting Column Selector - Applying filter values
	try
	{    
			
		System.out.println("Performing filter operations for all column starts");
		Thread.sleep(5500);
		Actions actions = new Actions(Browser.getInstance());
		
		WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img"));
		actions.moveToElement(subMenu);
		actions.build().perform();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img")).click();
			
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.className("allPgSelectorInput")).click();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='Addmultiselectjob1']/input")).click();
		
		System.out.println("Successfully enabled all the columns using column filter");
		
		Thread.sleep(4500);
		
		//Applying Recruiter Filter	   	   
		
		WebElement recfilter = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[10]/span"));
		actions.moveToElement(recfilter);

		WebElement recfilter1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[10]/img"));
		actions.moveToElement(recfilter1);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[10]/img")).click();
				
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='canvasChatFiltersID']/ul/li[2]/div/input")).click();
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='canvasChatFiltersID']/ul/li[10]/div/input")).click();
		
		Thread.sleep(4500);
		
		((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,400)");
		
		WebElement RC = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[10]/div[1]/div[2]/input"));
		RC.isEnabled();
	    RC.click();
	    Thread.sleep(4500);
	    	    			
		System.out.println("Successfully disabled Mine and enabled Raghunath user from Recruiter filter & navigated to ALL view");
	
		//Applying Import Filter
		Thread.sleep(4500);    	  
		
		WebElement IF = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[13]/span"));
		actions.moveToElement(IF);

		WebElement importfilter = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[13]/img"));
		actions.moveToElement(importfilter);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[13]/img")).click();
		Thread.sleep(4500);
		
		 WebElement horizontal = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[14]"));
		    
		((JavascriptExecutor) Browser.getInstance()).executeScript("arguments[0].scrollIntoView();",horizontal );
		
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='importFiltersID']/ul/li[1]/div/input")).click();
		
		Thread.sleep(4500);
		WebElement Importapply = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[13]/div[1]/div[2]/input"));
		Importapply.isEnabled();
		Importapply.click();
	    Thread.sleep(4500);
		
	    WebElement count = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[5]/div[1]/candidate-listingall/div[1]/h3")); 
		String records1 = count.getText();
		
		System.out.println("Import filter record count : "+ records1);  
		System.out.println("Successfully applied filter on Imports page");
		
		Thread.sleep(4500);
	  	
		WebElement Import1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[13]/img"));
		actions.moveToElement(Import1);
		actions.build().perform();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[13]/img")).click();
		
		Thread.sleep(4500);
		
		WebElement horizontal1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[14]"));
	    
		((JavascriptExecutor) Browser.getInstance()).executeScript("arguments[0].scrollIntoView();",horizontal1 );
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//div[contains(@class,'filterClearDiv')]/span[2]/span[1]")).click();
		
		System.out.println("Clearing Import Filter");
		
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues ={"Successfully enabling column selector from Mine view","Pass"};
		reportObj.writeReport(reportValues);
		String[] reportValues1 ={"Enabling Recruiter filter from Mine View","Pass"};
		reportObj.writeReport(reportValues1);
		String[] reportValues2 ={"Enabling Import filter from All View and printing the candidate record count","Pass"};
		reportObj.writeReport(reportValues2);
		String[] reportValues3 ={"Disabling Import filter from All View","Pass"};
		reportObj.writeReport(reportValues3);
		log.info("Successfully Tested functionalities on  Enrich Candidate API with Conversational Info card");
	    }
		
		catch(Exception e)
		{
			e.printStackTrace();
			//Browser.getInstance().navigate().refresh();
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Successfully enabling column selector from Mine view","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 ={"Enabling Recruiter filter from Mine View","Fail"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 ={"Enabling Import filter from All View and printing the candidate record count","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Disabling Import filter from All View","Fail"};
			reportObj.writeReport(reportValues3);
			log.info("An error occurred while testing functionalities on  Enrich Candidate API with Conversational Info card");
		}	
	
		
		try
		{
		
		//Applying/Clearing Added On - filter
		
		Thread.sleep(6500);    	 
		Actions actions = new Actions(Browser.getInstance());
		
		WebElement AddedON = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[14]/span"));
		actions.moveToElement(AddedON);

		WebElement AddedON1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[14]/img"));
		actions.moveToElement(AddedON1);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[14]/img")).click();
				
		Thread.sleep(4500);
		
		WebElement horizonta3 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[17]"));
	    
		((JavascriptExecutor) Browser.getInstance()).executeScript("arguments[0].scrollIntoView();",horizonta3 );
		
		Thread.sleep(4500);
        Select dropdown =new Select(Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[14]//select")));
    	dropdown.selectByValue("lt");
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.id("dateAddedFilter")).click();
		Browser.getInstance().findElement(By.className("adp-prev")).click();

		
		Thread.sleep(4500);

		Browser.getInstance().findElement(By.xpath("//*[@id='style-15']/li/div/div/div[2]/div[21]")).click();
		
		System.out.println("Date Added Successfully");
		
		Thread.sleep(1500);
	
		WebElement Addedon1 = Browser.getInstance().findElement(By.xpath("//*[@id='dateAdded']/ul/li/input"));
		actions.moveToElement(Addedon1);
		actions.build().perform();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='dateAdded']/ul/li/input")).click();
		
		Thread.sleep(4500);
		
		System.out.println("Filter successfully added for Added ON filter");
		
		
		//Apply/Clear - Blue Highlight Imports from All View
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[4]/a")).click();
		
		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/div/div/div[1]/input")).click();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='importFiltersIDCandidatePg']/ul/li[1]/div[1]/input")).click();
		
		
		Thread.sleep(4500);
		WebElement Importapply1 = Browser.getInstance().findElement(By.xpath("//*[@id='importFiltersIDCandidatePg']/div[2]/input"));
		Importapply1.isEnabled();
		Importapply1.click();
	    Thread.sleep(4500);
		
	    WebElement count1 = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[5]/div[1]/candidate-listingall/div[1]/h3")); 
		String records2 = count1.getText();
		
		System.out.println("Import filter record count : "+ records2);  
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[4]/a")).click();
	
		System.out.println("Successfully applying/clearing Top-Import filter");
	
	 	//Selecting "My Actve" from 2nd dropdown
	    
	    Thread.sleep(4500);
	    Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/img")).click();
	    Thread.sleep(2500);
	    Browser.getInstance().findElement(By.xpath("//*[@id='candidateTypeOptionsId']/li[3]/a")).click();
	    
	    Thread.sleep(4500);
		WebElement namefield1 = Browser.getInstance().findElement(By.className("search-candidate-name"));
		namefield1.isEnabled();
		Thread.sleep(1500);
		
		namefield1.clear();
		Thread.sleep(500);
		namefield1.sendKeys("Vasanth");
		namefield1.sendKeys(Keys.ENTER);
		
		//Clicking on the Resume filter to check resume functionality
		
		Thread.sleep(4500);
		
		WebElement horizonta2 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[17]"));
		    
		((JavascriptExecutor) Browser.getInstance()).executeScript("arguments[0].scrollIntoView();",horizonta2 );
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[17]/span/i")).click();
		
		Thread.sleep(6500);
		Browser.getInstance().findElement(By.className("resumeclose")).click();
		
		System.out.println("Successfully opened/closed resume-deid modal in Mine View");
		
		//Removing some columns and enabling only Added, source and source tool
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
		
		Thread.sleep(4500);
		
		WebElement columnSelector = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img"));
		actions.moveToElement(columnSelector);
		actions.build().perform();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img")).click();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[4]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[3]/div/input")).click();
		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[6]/div/input")).click();

		
		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[7]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[8]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[9]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[10]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[11]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[12]/div/input")).click();

		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[14]/div/input")).click();
		Thread.sleep(500);
		Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[15]/div/input")).click();
		
		//Apply Button
		
		Browser.getInstance().findElement(By.xpath("//*[@id='Addmultiselectjob1']/input")).click();
		
		Thread.sleep(4500);
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues4 ={"Toggling on/off and applying filters on Blue Highlight Import filter","Pass"};
		reportObj.writeReport(reportValues4);
		String[] reportValues5 ={"Selecting My Active - 2nd dropdown from All View to navigate to Mine view","Pass"};
		reportObj.writeReport(reportValues5);
		String[] reportValues6 ={"Opening/Closing Resume-De-id modal from Mine view","Pass"};
		reportObj.writeReport(reportValues6);
		
		log.info("Successfully Tested functionalities on  Enrich Candidate API with Conversational Info card");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			//Browser.getInstance().navigate().refresh();
			Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues4 ={"Toggling on/off and applying filters on Blue Highlight Import filter","Fail"};
			reportObj.writeReport(reportValues4);
			String[] reportValues5 ={"Selecting My Active - 2nd dropdown from All View to navigate to Mine view","Fail"};
			reportObj.writeReport(reportValues5);
			String[] reportValues6 ={"Opening/Closing Resume-De-id modal from Mine view","Fail"};
			reportObj.writeReport(reportValues6);
			
			log.info("An error occurred while testing functionalities on  Enrich Candidate API with Conversational Info card");
		}
		
		try
		{
		//Applying/Removing Added by filter
		Actions actions = new Actions(Browser.getInstance());	
		
		Thread.sleep(2500);    	  
		
		WebElement AB = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[15]/span"));
		actions.moveToElement(AB);

		WebElement Addedby = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[15]/img"));
		actions.moveToElement(Addedby);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[15]/img")).click();
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='addedByID']/ul/li[5]/div/input")).click();
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='addedByID']/div[2]/input")).click();
		
		System.out.println("Filter applied for Added By column");
		
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[15]/img")).click();
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='addedByID']/div[1]/span[2]")).click();
		
		System.out.println("Filter removed for Added By column");
		
		//Applying/Removing Source filter
		
		Thread.sleep(6500);
		System.out.println("Starting to apply filter for Source column");
		
		//WebElement horizontal11 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img"));
	    
		//((JavascriptExecutor) Browser.getInstance()).executeScript("arguments[0].scrollIntoView();",horizontal11 );
		
		Thread.sleep(6500);    	  
		
		WebElement Source = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[18]/span"));
		actions.moveToElement(Source);

		WebElement Source1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[18]/img"));
		actions.moveToElement(Source1);
		actions.build().perform();
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[18]/img")).click();
		System.out.println("Starting to apply filter for Source column");
		Thread.sleep(4500);
		
		WebElement IP = Browser.getInstance().findElement(By.xpath("//*[@id='sourceListByID']/ul/li[3]/div/input"));
		IP.isEnabled();
		IP.click();
		
		Thread.sleep(4500);
		
		WebElement IP1 = Browser.getInstance().findElement(By.xpath("//*[@id='sourceListByID']/div[2]/input"));
		IP1.isEnabled();
		IP1.click();
		
		System.out.println("Filter applied for Source column");
		
		
		Thread.sleep(3500);    	  
		
		WebElement Source11 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[18]/span"));
		actions.moveToElement(Source11);

		WebElement Source12 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[18]/img"));
		actions.moveToElement(Source12);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[18]/img")).click();
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='sourceListByID']/div[1]/span[2]")).click();
		
		System.out.println("Filter removed for Source column");
		
		Thread.sleep(6500);
		
		//WebElement horizontal2 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img"));
		    
		//((JavascriptExecutor) Browser.getInstance()).executeScript("arguments[0].scrollIntoView();",horizontal2 );
		
		//Applying/Removing Source Tool filter
		
		Thread.sleep(2500);    	  
		WebElement SourceTool = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[19]/span"));
		actions.moveToElement(SourceTool);

		WebElement SourceTool1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[19]/img"));
		actions.moveToElement(SourceTool1);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[19]/img")).click();	
				
		Thread.sleep(4500);
				
		Browser.getInstance().findElement(By.xpath("//*[@id='sourceToolByID']/ul/li[3]/div/input")).click();
				
		Thread.sleep(4500);
				
		WebElement ST = Browser.getInstance().findElement(By.xpath("//*[@id='sourceToolByID']/div[2]/input"));
		ST.isEnabled();
		ST.click();
				
		System.out.println("Filter applied for Source Tool column");
				
		Thread.sleep(2500);    	  
		
		WebElement SourceTool11 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[19]/span"));
		actions.moveToElement(SourceTool11);

		WebElement SourceTool12 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[19]/img"));
		actions.moveToElement(SourceTool12);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[19]/img")).click();	
				
		Thread.sleep(4500);
				
		Browser.getInstance().findElement(By.xpath("//*[@id='sourceToolByID']/div[1]/span[2]")).click();
				
		System.out.println("Filter removed for Source Tool column");
		
		//Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
		
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues7 ={"Successfully enabled/removed Added By column","Pass"};
		reportObj.writeReport(reportValues7);
		String[] reportValues71 ={"Enabling/Disabling filter for Added By column","Pass"};
		reportObj.writeReport(reportValues71);
		String[] reportValues8 ={"Successfully enabled/removed Source column","Pass"};
		reportObj.writeReport(reportValues8);
		String[] reportValues81 ={"Enabling/Disabling filter for Source column","Pass"};
		reportObj.writeReport(reportValues81);
		String[] reportValues9 ={"Successfully enabled/removed Source tool column","Pass"};
		reportObj.writeReport(reportValues9);
		String[] reportValues91 ={"Enabling/Disabling filter for Source tool column","Pass"};
		reportObj.writeReport(reportValues91);
		String[] reportValues10 ={"Successfully enabled Jobs/Tags column","Pass"};
		reportObj.writeReport(reportValues10);
		String[] reportValues11 ={"Enabling/Disabling filter for Added On column","Pass"};
		
		log.info("Successfully Tested functionalities on  Enrich Candidate API with Conversational Info card");
	    
	}
	catch(Exception e)
	{
		e.printStackTrace();
		//Browser.getInstance().navigate().refresh();
		Browser.getInstance().findElement(By.className("search-candidate-name")).clear();
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues7 ={"Successfully enabled/removed Added By column","Fail"};
		reportObj.writeReport(reportValues7);
		String[] reportValues71 ={"Enabling/Disabling filter for Added By column","Fail"};
		reportObj.writeReport(reportValues71);
		String[] reportValues8 ={"Successfully enabled/removed Source column","Fail"};
		reportObj.writeReport(reportValues8);
		String[] reportValues81 ={"Enabling/Disabling filter for Source column","Fail"};
		reportObj.writeReport(reportValues81);
		String[] reportValues9 ={"Successfully enabled/removed Source tool column","Fail"};
		reportObj.writeReport(reportValues9);
		String[] reportValues91 ={"Enabling/Disabling filter for Source tool column","Fail"};
		reportObj.writeReport(reportValues91);
		String[] reportValues10 ={"Successfully enabled Jobs/Tags column","Fail"};
		reportObj.writeReport(reportValues10);
		String[] reportValues11 ={"Enabling/Disabling filter for Added On column","Fail"};
		
		log.info("An error occurred while testing functionalities on  Enrich Candidate API with Conversational Info card");
	}
	
	//Applying filter for stars
	
	try
	{
		System.out.println("Performing filter operations for star rating and locations column starts starts");
		//One Star
		Thread.sleep(4500);
		
		Actions actions = new Actions(Browser.getInstance());
		
		Thread.sleep(4500);    	  
		
		WebElement Star = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/span"));
		actions.moveToElement(Star);

		WebElement Star1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
		actions.moveToElement(Star1);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
					
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//thead[@id = 'candidateTableHead']//th[7]//select")).click();
		
		Thread.sleep(4500);
        Select dropdown =new Select(Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//select")));
    	dropdown.selectByValue("lt");
    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[1]/i")).click();
    	
    	Thread.sleep(1500);
    	
    	Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//div/ul/li/input")).click();
    	
    	System.out.println("Lesser than symbol with One star");    	
    	
    	//Two Star
    	Thread.sleep(4500);    			
   			
    	WebElement Addedon1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
    	actions.moveToElement(Addedon1);
    	actions.build().perform();
    			
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
    						
    	Thread.sleep(4500);
    			
    	Browser.getInstance().findElement(By.xpath("//thead[@id = 'candidateTableHead']//th[7]//select")).click();
    			
    	Thread.sleep(4500);
    	Select dropdown1 =new Select(Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//select")));
    	dropdown1.selectByValue("gt");
    	    	
    	Thread.sleep(500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[1]/i")).click();
    	    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[2]/i")).click();
    	
    	Thread.sleep(1500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//div/ul/li/input")).click();
    	    	
    	System.out.println("Greater than symbol with Two star");       	
    	
    	//Three Star
    	Thread.sleep(4500);    			
   			
    	WebElement Addedon2 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
    	actions.moveToElement(Addedon2);
    	actions.build().perform();
    			
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
    						
    	Thread.sleep(4500);
    			
    	Browser.getInstance().findElement(By.xpath("//thead[@id = 'candidateTableHead']//th[7]//select")).click();
    			
    	Thread.sleep(4500);
    	Select dropdown2 =new Select(Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//select")));
    	dropdown2.selectByValue("eq");
    	    	
    	Thread.sleep(500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[1]/i")).click();
    	    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[2]/i")).click();
    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[3]/i")).click();
    	
    	Thread.sleep(1500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//div/ul/li/input")).click();
    	    	
    	System.out.println("Equal to symbol with Three star");  
    	
    	//Three Star
    	Thread.sleep(4500);    			
   			
    	WebElement Addedon3 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
    	actions.moveToElement(Addedon3);
    	actions.build().perform();
    			
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
    						
    	Thread.sleep(4500);
    			
    	Browser.getInstance().findElement(By.xpath("//thead[@id = 'candidateTableHead']//th[7]//select")).click();
    			
    	Thread.sleep(4500);
    	Select dropdown3 =new Select(Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//select")));
    	dropdown3.selectByValue("ne");
    	    	
    	Thread.sleep(500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[1]/i")).click();
    	    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[2]/i")).click();
    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[3]/i")).click();
    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'candidatefilterListDate')]/span[4]/i")).click();
    
    	Thread.sleep(1500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//thead[@id ='candidateTableHead']//th[7]//div/ul/li/input")).click();
    	    	
    	System.out.println("Not Equal to symbol with Four star");     
    	
    	//Clear filter
    	
    	Thread.sleep(4500);    			
			
    	WebElement Addedon4 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img"));
    	actions.moveToElement(Addedon4);
    	actions.build().perform();
    			
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[7]/img")).click();
    	
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='starRating']/div/span[2]")).click();
    	
    	System.out.println("Star Rating filter successfully cleared");
    	
    	//Text Location filter
    	
    	Thread.sleep(5500);
    	
    	WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img"));
		actions.moveToElement(subMenu);
		actions.build().perform();
		
		Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[22]/div/a/img")).click();
			
    	
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='additionalHeaderOptionsDivID']/ul/li[14]/div/input")).click();
    	
    	Thread.sleep(4500);
		Browser.getInstance().findElement(By.xpath("//*[@id='Addmultiselectjob1']/input")).click();
		
		//Location Filter
    	
		Thread.sleep(2500);    	  
		
		WebElement Loc = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[16]/span"));
		actions.moveToElement(Loc);

		WebElement Loc1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[16]/img"));
		actions.moveToElement(Loc1);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[16]/img")).click();    	
    	
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.xpath("//div[contains(@id,'locationFilterID')]/ul/li//input[1]")).sendKeys("Chennai");
    	
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.xpath("//div[contains(@id,'locationFilterID')]/ul/li//input[2]")).click();
    	
    	System.out.println("Location filtered applied successfully");
    	
    	Thread.sleep(4500);	
    	WebElement Location1 = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[16]/img"));
    	actions.moveToElement(Location1);
    	actions.build().perform();
    			
    	Thread.sleep(4500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[16]/img")).click();
    	
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='locationFilterID']/div/a")).click();
    	
    	System.out.println("Location filter cleared successfully");
    	
    	ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues ={"Lesser than symbol with One star","Pass"};
		reportObj.writeReport(reportValues);
		String[] reportValues1 ={"Greater than symbol with Two star","Pass"};
		reportObj.writeReport(reportValues1);
		String[] reportValues2 ={"Equal to symbol with Three star","Pass"};
		reportObj.writeReport(reportValues2);
		String[] reportValues3 ={"Not Equal to symbol with Four star","Pass"};
		reportObj.writeReport(reportValues3);
		String[] reportValues4 ={"Successfully enabled/disabled star rating filter","Pass"};
		reportObj.writeReport(reportValues4);
		String[] reportValues5 ={"Successfully enabled/disabled Location filter","Pass"};
		reportObj.writeReport(reportValues5);		
		
		log.info("Successfully testing the functionality of the star rating");
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
		Browser.getInstance().navigate().refresh();
		ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues ={"Lesser than symbol with One star","Fail"};
		reportObj.writeReport(reportValues);
		String[] reportValues1 ={"Greater than symbol with Two star","Fail"};
		reportObj.writeReport(reportValues1);
		String[] reportValues2 ={"Equal to symbol with Three star","Fail"};
		reportObj.writeReport(reportValues2);
		String[] reportValues3 ={"Not Equal to symbol with Four star","Fail"};
		reportObj.writeReport(reportValues3);
		String[] reportValues4 ={"Successfully enabled/disabled star rating filter","Fail"};
		reportObj.writeReport(reportValues4);
		
		log.info("An error occurred while testing the functionality of the star rating");
	}
}

}

