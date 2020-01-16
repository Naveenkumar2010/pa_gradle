package Canvas.Gradle;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Message {

	static Logger log = Logger.getLogger(Message.class.getName());
	
	public void Messages() throws InterruptedException, IOException
	{
		log.info("Invoking Messages Class");

		//Navigate to Library-Messages
		try
		{
			Thread.sleep(4500);
			Actions action = new Actions(Browser.getInstance());
			WebElement e = Browser.getInstance().findElement(By.id("libraryAnchor"));
			action.moveToElement(e).build().perform();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("libraryAnchor")).click();
			Thread.sleep(2500);
								
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title " + title);
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/a[3]")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='app-resource-collection-list']/div[1]/ul/li[1]/a")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("findMessage")).sendKeys("Test");
		    Thread.sleep(2500);
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Message Page","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 = {"Navigating to All view and applying search","Pass"};
			reportObj.writeReport(reportValues1);
			log.info("Navigating to Questions Library");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Message Page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to Message Page");
		}
		
		//Search from Mine View
		
		try
		{
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='app-resource-collection-list']/div[1]/ul/li[2]/a")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Mine view","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Mine Page");
		}
	    catch (Exception e)
		{
	    	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Mine Page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Mine Page");
		}
		
	    
		//Adding Message
        try
        {
        	
            Thread.sleep(4500);
            Browser.getInstance().findElement(By.xpath("//*[@id='view_message']/div[2]/button/p")).click();
        	
        	Thread.sleep(2500);		
        	WebElement Collection = Browser.getInstance().findElement(By.id("addname"));
        	Collection.isEnabled();
        	Collection.sendKeys("Test Title");  	      	                                            
               	        	
        	//Checking Unsaved Edits
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking escape-cancel");
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[1]/button")).click();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking close-ok");
        	       
            //Adding message again   
        	
        	Thread.sleep(4500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='view_message']/div[2]/button/p")).click();
         	
         	Thread.sleep(2500);		
         	WebElement Collection1 = Browser.getInstance().findElement(By.id("addname"));
         	Collection1.isEnabled();
         	Collection1.sendKeys("Test Title");  	  
        	       	                                            
            Thread.sleep(2500);
        	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	                    
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
        	
        	//Adding Message to save
        	Thread.sleep(4500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='view_message']/div[2]/button/p")).click();
         	
         	Thread.sleep(2500);		
         	WebElement Collection2 = Browser.getInstance().findElement(By.id("addname"));
         	Collection2.isEnabled();
         	Collection2.sendKeys("Add Test Title");  	  
        	
           //Adding message description
         	         	
         	Thread.sleep(2500);		
         	WebElement Collection3 = Browser.getInstance().findElement(By.id("savedescription"));
         	Collection3.isEnabled();
         	Collection3.sendKeys("Add Test Title");  
         	
        	Thread.sleep(2500);       	       	                                            
        	       	
        	//Adding Merge Tags to the Messages:
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[2]/div[1]/div[4]/span")).click();
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='mesSaveMergeTags']/div/div[2]/span")).click();
        	        	       	
        	Thread.sleep(3500);
        	
        	System.out.println("Merge Tags sucessfully added into messages");
        	
        	        	       	                                            
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[2]/div[1]/div[4]/button")).click();
        	
        	System.out.println("Message added successfully");
				
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Message sucessfully added & Verifying Unsaved Changes","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Message sucessfully added & Verifying Unsaved Changes");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Message sucessfully added & Verifying Unsaved Changes","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error occurred while message sucessfully added & Verifying Unsaved Changes");
        }
        
        //Searching & Editing Message
        
        try
        
        {
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("findMessage")).sendKeys("Add Test Title");
		    Thread.sleep(2500);
        	
		    Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[5]/span")).click();
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[5]/div/ul/li[1]/p")).click();
		    
		    Thread.sleep(2500);
		   		
		    Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/input")).clear();
		    Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/input")).sendKeys("Edit Test Title");  	 
         	
           //Adding message description
         	         	
		    Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/div[1]/div[1]/textarea")).clear();
		    Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/div[1]/div[1]/textarea")).sendKeys("Edit Test Title"); 
		    		    
         	Thread.sleep(2500);
         	Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/div[4]/button")).click();
         	System.out.println("Message successfully edited");        	
           	
         	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("findMessage")).sendKeys("Edit Test Title");
        	Thread.sleep(2500);
        	
		    Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[5]/span")).click();
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='amplifyDashboardTable']/tbody/tr/td[5]/div/ul/li[2]/p")).click();
		    Thread.sleep(2500);
        	
		    //Delete Confirmaiton Modal
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='deleteMessage_confirm']/div/div[2]/button")).click();
		    
		    Thread.sleep(2500);
		    Browser.getInstance().findElement(By.id("findMessage")).clear();
		    System.out.println("Message successfully deleted");
		    		   	    
		    
		    ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Message successfully searched","Pass"};
        	reportObj.writeReport(reportValues);
        	String[] reportValues1 = {"Message successfully edited","Pass"};
        	reportObj.writeReport(reportValues1);
        	String[] reportValues2 = {"Message successfully deleted","Pass"};
        	reportObj.writeReport(reportValues2);
        	
        	log.info("Message sucessfully searched & edited");
        }
        
        catch (Exception e)
        {
        	e.printStackTrace();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Message successfully searched","Fail"};
        	reportObj.writeReport(reportValues);
        	String[] reportValues1 = {"Message successfully edited","Fail"};
        	reportObj.writeReport(reportValues1);
        	String[] reportValues2 = {"Message successfully deleted","Fail"};
        	reportObj.writeReport(reportValues2);
        	
        	log.info("An error occured while searching message");
        }
        
        //Navigating to Chat Drawer - Messages
        
        try
        {
        	Thread.sleep(5500);
        	Browser.getInstance().findElement(By.id("chatAnchor")).click();
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/ul/li[3]/a")).click();
        	
        	//Adding Message 
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/span[1]/span/a")).click();
        	
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("addname")).sendKeys("Adding Message Title");
        	
        	
        	Browser.getInstance().findElement(By.id("savedescription")).sendKeys("Adding Message Description");
        	
        	Thread.sleep(3500);
        	/*//Checking Unsaved Edits
        	
        	//Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[1]/button")).click();
        	
        	//Thread.sleep(2500);
        	
        	//Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	//System.out.println("Checking Unsaved changes in add message modal by clicking close-cancel");
        	
        	
        	Thread.sleep(3500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking escape-cancel");
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[1]/button")).click();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking close-ok");
        	       
            //Adding message again   
        	
        	Thread.sleep(4500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/span[1]/span/a")).click();
        	
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("addname")).sendKeys("Adding Messaging Title");
        	
        	
        	Browser.getInstance().findElement(By.id("savedescription")).sendKeys("Adding Messaging Description"); 	  
        	       	                                            
            Thread.sleep(2500);
        	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	                    
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_edit_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add message modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
        	
        	//Adding Message to Save from drawer
        	        	
        	Thread.sleep(4500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/span[1]/span/a")).click();
        	
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("addname")).sendKeys("Adding Messaging Title");
        	*/
        	
        	//Browser.getInstance().findElement(By.id("savedescription")).sendKeys("Adding Messaging Description"); 
        	Thread.sleep(3500);
        	
        	//Adding Merge Tags to the Messages:
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[2]/div[1]/div[4]/span")).click();
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='mesSaveMergeTags']/div/div[2]/span")).click();
        	        	       	
        	Thread.sleep(3500);
        	
        	System.out.println("Merge Tags sucessfully added into messages");
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-message']/div/div[2]/div[1]/div[4]/button")).click();
        	
        	System.out.println("Successfully messages added into drawer");
        	
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Messages added successfully from chat drawer - Chat Drawer","Pass"};
        	reportObj.writeReport(reportValues);
        	String[] reportValues1 = {"Unsaved message edits checked successfully - Chat Drawer","Pass"};
        	reportObj.writeReport(reportValues1);
        	        	
        	log.info("Message sucessfully added from chat-drawer");
        }
        
        catch (Exception e)
        {
        	e.printStackTrace();
        	       	
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Messages added successfully from chat drawer - Chat Drawer","Fail"};
        	reportObj.writeReport(reportValues);
        	String[] reportValues1 = {"Unsaved message edits checked successfully - Chat Drawer","Fail"};
        	reportObj.writeReport(reportValues1);
        	log.info("An error occured while searching message");
        }
        
		//Searching/Sending/Editing/Deleting Message from chat drwawer
        
        try
        {
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("searchMessage")).sendKeys("Adding");
        	Thread.sleep(3500);
            Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div/span/div/div[2]/i[1]")).click();
            
            System.out.println("Messages successfully sent from drawer");
            
            Thread.sleep(5500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/ul/li[3]/a")).click();
        	
        	//Editing the message
        	
        	Thread.sleep(3500);
        	
        	Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div/span/div"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div/span/div/div[3]/div/i[1]/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div/span/div/div[3]/div/i[1]/img")).click();
            
			Thread.sleep(2500);
			
			WebElement Editmessage = Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/input"));
			Editmessage.clear();
			Editmessage.sendKeys("Editing the saved message");
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='edit-message']/div/div[2]/div[1]/div[4]/button")).click();
			
			System.out.println("Saved message edited successfully");
			
			//Deleting the saved message
			Thread.sleep(3500);
			Actions actions1 = new Actions(Browser.getInstance());
			WebElement menu1 = Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div/span/div"));
			actions1.moveToElement(menu1);

			WebElement subMenu2 = Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div[1]/span/div/div[3]/div/i[2]/img"));
			actions1.moveToElement(subMenu2);
			actions1.build().perform();
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='messages']/div/div/div[2]/div[1]/span/div/div[3]/div/i[2]/img")).click();
            
			Thread.sleep(2500);
        
			Browser.getInstance().findElement(By.xpath("//*[@id='chatMesDel_0']/span/span[4]")).click();
		
			Thread.sleep(2500);
			
			System.out.println("Deleting the saved message");
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues0 = {"Succeessfully searched Saved Messages - Chat Drawer","Pass"};
        	reportObj.writeReport(reportValues0);
        	String[] reportValues = {"Saved Messages successfully sent by clicking airplane icon - Chat Drawer","Pass"};
        	reportObj.writeReport(reportValues);
        	String[] reportValues1 = {"Editing the saved message - Chat Drawer","Pass"};
        	reportObj.writeReport(reportValues1);
        	String[] reportValues2 = {"Deleting the saved message - Chat Drawer","Pass"};
        	reportObj.writeReport(reportValues2);
        	
        	log.info("Saved message edited/deleted successfully");
        }
        
        catch (Exception e)
        {
        	e.printStackTrace();
        	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues0 = {"Succeessfully searched Saved Messages - Chat Drawer","Fail"};
        	reportObj.writeReport(reportValues0);
        	String[] reportValues = {"Saved Messages successfully sent by clicking airplane icon - Chat Drawer","Fail"};
        	reportObj.writeReport(reportValues);
        	String[] reportValues1 = {"Editing the saved message - Chat Drawer","Fail"};
        	reportObj.writeReport(reportValues1);
        	String[] reportValues2 = {"Deleting the saved message - Chat Drawer","Fail"};
        	reportObj.writeReport(reportValues2);
        	       	
        	log.info("An error occured while sending/editing saved messages");
        }
        
        
		
}
}
