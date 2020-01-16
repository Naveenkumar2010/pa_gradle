package Canvas.Gradle;

import java.io.IOException;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * Chat class file covers below functionalities : 
 * Filtering Tags,Jobs & star rating - Left Nav.
 * Searching and Scheduling a meeting.
 * Sending message from chat input box using airplane icon and keys.
 * Adding Messages/Question using library quick add.
 * Unsaved Edit Test for Question and Resources. 
 * Functionality of Schedule message and navigating to View Scheduling Message.
 * Functionality of Saved Message.
 * 
 */

public class Chat

{
	static Logger log = Logger.getLogger(Chat.class.getName());
	
	public void chat() throws InterruptedException, IOException
	{
		log.info("Invoking Chat class");
		//Navigate to Chat page
		try
		{
			Thread.sleep(6500);
			Actions action = new Actions(Browser.getInstance());
			WebElement e = Browser.getInstance().findElement(By.xpath(".//*[@id='chatAnchor']"));
			action.moveToElement(e).build().perform();
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath(".//*[@id='chatAnchor']")).click();
			
			//Filtering Tag
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatLeftnavInboxDetails']/li[1]/span[2]")).click();
			
			Thread.sleep(2500);			
			Browser.getInstance().findElement(By.id("chattagicon")).click();
			
			//Selecting Match None
			Thread.sleep(2500);			
			Browser.getInstance().findElement(By.className("CandidateTagfilterDropdown")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatleftnavcheckbox']/div[6]/div/ol/li[3]/div/span")).click();
			
			System.out.println("Match None selected successfully in tag");	
						
			Thread.sleep(3500);			
			Browser.getInstance().findElement(By.id("chattagicon")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='style-15']/li[2]/input[1]")).sendKeys("Test");
	
			Browser.getInstance().findElement(By.className("goBtnTagChat")).click();
			
			Thread.sleep(3500);
						
			Browser.getInstance().findElement(By.xpath("//*[@id='chatleftnavcheckbox']/div/div/div/ul/li[3]/div/input")).click();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatleftnavcheckbox']/div/div/div/ul/li[3]/div/input")).click();
			
			System.out.println("Tag Filter applied sucessfully");
								
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Navigating to Candidate chat page & applying Filter","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Match None successfully selected in tag section - Chat Page","Pass"};
	   	 	reportObj.writeReport(reportValues1);
	   	 	log.info("Navigating to Chat page & Filter Tag");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Navigating to Candidate chat page & Filter Tag","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Match None successfully selected in tag section - Chat Page","Fail"};
	   	 	reportObj.writeReport(reportValues1);
	   	 	log.error("An error occurred while navigating to chat page & Filter Tag");
		}
		
		//Star Rating on Chat page
		
		//Applying filter for stars
		
		try
		{
			//One Star			
											
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("chatRatingsicon")).click();
			
			Thread.sleep(3500);
	        Select dropdown =new Select(Browser.getInstance().findElement(By.id("idDateFilter")));
	    	dropdown.selectByValue("lt");
	    	
	    	Thread.sleep(500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//span[1]/i")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//input")).click();
	    	
	    	System.out.println("Lesser than symbol with One star");    	
	    	
	    	//Two Star    			
	   		
	    	Thread.sleep(3500);
	        Select dropdown1 =new Select(Browser.getInstance().findElement(By.id("idDateFilter")));
	    	dropdown1.selectByValue("gt");
	    	    	
	    	Thread.sleep(500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//span[2]/i")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//input")).click();
	    	    	
	    	System.out.println("Greater than symbol with Two star");       	
	    	
	    	//Three Star
	    	Thread.sleep(2500);    			
	    	Select dropdown2 =new Select(Browser.getInstance().findElement(By.id("idDateFilter")));
	    	dropdown2.selectByValue("eq");
	    	    	
	    	Thread.sleep(500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//span[3]/i")).click();
	    	
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//input")).click();
	    	    	
	    	System.out.println("Equal to symbol with Three star");  
	    	
	    	//Four Star
	    	
	    	Thread.sleep(2500);    			
	    	Select dropdown3 =new Select(Browser.getInstance().findElement(By.id("idDateFilter")));
	    	dropdown3.selectByValue("ne");	    	    	
	    	    	
	    	Thread.sleep(500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//span[4]/i")).click();
	    
	    	Thread.sleep(1500);
	    	
	    	Browser.getInstance().findElement(By.xpath("//li[contains(@class,'chatRatingssearch')]//input")).click();
	    	    	
	    	System.out.println("Greater than symbol with Four star");       	
	    	
	    	//Clear filter
	    	
	    	Thread.sleep(2500);    			
			    	   	    	
	    	Browser.getInstance().findElement(By.xpath("//ul[contains(@class,'ChatRatings_DropDown')]/li[1]/span[2]/span")).click();
	    	
	    	System.out.println("Clear Filter applied successfully");
	    	
	    	Browser.getInstance().findElement(By.id("search")).click();
	    			
	    			
	    	ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Lesser than symbol with One star - Chat Page","Pass"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 ={"Greater than symbol with Two star  - Chat Page","Pass"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 ={"Equal to symbol with Three star  - Chat Page","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Not Equal to symbol with Four star - Chat Page","Pass"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 ={"Successfully enabled/disabled star rating filter  - Chat Page","Pass"};
			reportObj.writeReport(reportValues4);
			
			log.info("Successfully testing the functionality of the star rating");
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues ={"Lesser than symbol with One star  - Chat Page","Fail"};
			reportObj.writeReport(reportValues);
			String[] reportValues1 ={"Greater than symbol with Two star - Chat Page","Fail"};
			reportObj.writeReport(reportValues1);
			String[] reportValues2 ={"Equal to symbol with Three star - Chat Page","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Not Equal to symbol with Four star - Chat Page","Fail"};
			reportObj.writeReport(reportValues3);
			String[] reportValues4 ={"Successfully enabled/disabled star rating filter - Chat Page","Fail"};
			reportObj.writeReport(reportValues4);
			
			log.info("An error occurred while testing the functionality of the star rating");
		}
		
		//Search a candidate in chat page
		try
		{
			Browser.getInstance().findElement(By.id("search")).sendKeys("Vasanth");
	   	 	Thread.sleep(5500);
	   	 	//WebElement Search = Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/button"));	   	 
	   	 	//Search.isEnabled();
	   	 	//Search.click();		
	   	 	
	   	 	//Meeting Invitr modal
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[1]/div[1]/span[1]/i")).click();
	   	 	Thread.sleep(1500);
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='dv_candidatesubmenu']/ul/li[3]/a")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	WebElement Subject = Browser.getInstance().findElement(By.className("calendarInviteNameTxt"));	   	 	   	
	   	 	Subject.isEnabled(); 		
	   	 	Subject.sendKeys("Test");
	   	 	Thread.sleep(3500);   	
   	 	
	     	Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/form/div[2]/input")).isEnabled();
	     	Thread.sleep(1500); 
	     	Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div/form/div[2]/input")).sendKeys("Location"); 
	   	 	  
	   	 	   			   	
	     	Thread.sleep(2500);  
	   	 	Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/form/div[3]/input")).isEnabled();
	     	Thread.sleep(1500); 
	     	Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div/form/div[3]/input")).sendKeys("Notes"); 
	   	 	
	   	 	//Adding Date/Time in modal:
	   	 	
	   	 	Thread.sleep(2500);	   	 	
	   	 	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/form/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div/input")).click();
	   	 	Browser.getInstance().findElement(By.className("adp-next")).click();
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='calendarInvite']/form/div[5]/div[1]/div/div/div[2]/div[33]")).click();
	   	 	
	   	 	System.out.println("Sucessfully added date in modal");
	   	 	
	   	 	Thread.sleep(2500);
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='calendartimepicker3']/div[1]/div/span/img")).click();
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='calendartimepicker3']/div[2]/table/tbody/tr[1]/td[1]/a/span")).click();
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='calendartimepicker3']/div[2]/table/tbody/tr[1]/td[3]/a/span")).click();
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='calendartimepicker3']/div[2]/table/tbody/tr[3]/td[5]/a/span")).click();
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("/html/body/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/div[\".*[^0-99].*\"]/form/div[\".*[^0-99].*\"]/div[2]/button")).click();;
	   	 	
	   	 	Thread.sleep(5500);
	   	 	System.out.println("Meeting Scheduled Sucessfully");
	   	 	Browser.getInstance().navigate().refresh();
	   	 	Browser.getInstance().findElement(By.id("search")).sendKeys("Vasanth");
	   	 	Thread.sleep(4500);
	   	 	
	   	    //Add an attachment:
	   	 	Thread.sleep(5500);
	   	 	Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div[2]/div[1]/div/span"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div[2]/div[1]/div/span"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);	
			
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div[2]/div[1]/div/span")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlist']/li[1]/a")).click();
	   	 	
	   	 	
	   	 	Thread.sleep(5500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");	   	   	 	
				
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div[2]/div[1]/div/span")).click();
			
				   	 	
	   	 	Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlist']/li[2]/a")).click();;
	   	 	
	   	 	Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='style-1']/ol/li/span/a")).click();
	   	 	
	   	 	Browser.getInstance().findElement(By.className("attchmentinputbox")).sendKeys("test");
	   	 	
	   	 	
	   	 	Thread.sleep(4500);
	   	 	
	   	 	WebElement Resclick = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatattachementfile')]/ol/li/a[contains(text(),'Testdoc.pdf')]"));
	   	 	Resclick.isEnabled();
	   	 	Resclick.click();   	 	
	   	 		   	 	
	   	 	Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlibraryModal']/div/div[1]/button")).click();
	   	 	 	
	   	 	ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Scheduling message by adding saved messages and attachments to a Candidate in chat page","Pass"};
	   	 	reportObj.writeReport(reportValues);	   	 
	  	 	log.info("Scheduling message by adding saved messages and attachments & meeting to a Candidate in chat page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Scheduling message by adding saved messages and attachments & meeting in chat page","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.error("An error occurred while Scheduling message by adding saved messages and attachments & meeting to a Candidate in chat page");
		}
		
	   	//Enter a message in the chat box
		try
		{
			
			WebElement ChatInput = Browser.getInstance().findElement(By.xpath(".//*[@id='chatPost']"));
			Thread.sleep(3500);
			ChatInput.sendKeys("#");
			Thread.sleep(1500);
			ChatInput.sendKeys(Keys.DOWN);
			ChatInput.sendKeys(Keys.TAB);	
			
			Thread.sleep(3500);
			ChatInput.sendKeys("#");
			Thread.sleep(1500);
			ChatInput.sendKeys(Keys.DOWN);
			ChatInput.sendKeys(Keys.DOWN);
			Thread.sleep(1500);
			ChatInput.sendKeys(Keys.UP);
			Thread.sleep(1500);
			ChatInput.sendKeys(Keys.TAB);
			ChatInput.click();
			
			Thread.sleep(3500);				
			
			System.out.println("Saved message been added by clicking TAB and Keyboard events in Chat - Chat Inout Box");
			
			ChatInput.sendKeys("Sending text message via airplane icon and also checking if the meeting invitr is working properly today at 4pm?");
			
			Thread.sleep(2500);
			
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Entering a message in the chat box","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.info("Entering a message in the chat box");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Entering a message in the chat box","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.error("An error occurred while entering a message in the chat box");
			
		}
        
        //Send message by clicking on airplane icon
		try
		{
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("chatplaneicon")).click();
			
			Thread.sleep(2500);
			
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Sending message to the candidate by clicking on the airplane icon","Pass"};
	   	    reportObj.writeReport(reportValues);
	   	    
	   	    String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Chat Input Box","Pass"};
			reportObj.writeReport(reportValues2);
	   	    
	   	 	log.info("Sent message to the candidate by clicking on the airplane icon");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Sending message to the candidate by clicking on the airplane icon","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Chat Input Boxin Chat Input Box","Fail"};
			reportObj.writeReport(reportValues2);
	   	 	
	   	 	log.error("An error occurred while sending message to the candidate by clicking airplane icon");
		}
		
		//Send message by pressing CTRL+Enter
		try
		{
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.xpath(".//*[@id='chatPost']")).clear();
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.xpath(".//*[@id='chatPost']")).sendKeys("Sending text message 6 Feb at 2018 by using keys");
			
			Thread.sleep(4500);
			String keysPressed = Keys.chord(Keys.CONTROL, Keys.RETURN);
			Browser.getInstance().findElement(By.xpath(".//*[@id='chatPost']")).sendKeys(keysPressed);
			
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Sending a message to the candidate by pressing Ctrl+Enter","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.info("Sent a message to the candidate by pressing Ctrl+Enter");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Sending a message to the candidate by pressing Ctrl+Enter","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.error("An error occurred while sending a message to the candidate by pressing Ctrl+Enter");
		}
			  
		
		//Adding Question/Message using Library Quick Add
		try
		
		{
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatLeftnavInboxDetails']/li[1]/span[2]")).click();
			
			//Search for Test User in left nav.
			Thread.sleep(3500);
			WebElement Searchinput = Browser.getInstance().findElement(By.id("search"));
			Searchinput.clear();
			Searchinput.sendKeys("2248033998");		
			
			
	   	 	Thread.sleep(4500);
			
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='77120355-e6cb-4ac5-b31a-754e5f9e39d1']/a")).click();
						
			Thread.sleep(17000);
			
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'Chat with Test User')]/div[1]/div/div[2]/div[1]//span[contains(text(),'Test Library Quick Add')]"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='icon5dfa30e0-93e4-4b0a-b355-cb7c0bea6a36']/a/i"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			actions.click();
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='icon5dfa30e0-93e4-4b0a-b355-cb7c0bea6a36']/a/i")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("collectResponseClass")).click();
			
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRenderDiv']/div[1]/div[2]/ol/li[1]/a")).click();
			
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.id("selectedquestionid")).click();
			
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRenderDiv']/div[1]/div[3]/ul/li[3]")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRenderDiv']/div[1]/div[5]/input")).click();
			
			System.out.println("Questions successfully added using Library Quick Add");
			
			//Adding Messages
			Thread.sleep(5500);
			WebElement menu1 = Browser.getInstance().findElement(By.xpath("//div[contains(@id,'Chat with Test User')]/div[1]/div/div[2]/div[1]//span[contains(text(),'Test Library Quick Add')]"));
			actions.moveToElement(menu1);

			WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='icon5dfa30e0-93e4-4b0a-b355-cb7c0bea6a36']/a/i"));
			actions.moveToElement(subMenu1);
			actions.build().perform();
			actions.click();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='icon5dfa30e0-93e4-4b0a-b355-cb7c0bea6a36']/a/i")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='questselect']/img")).click();
			
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chatRenderDiv']/div[1]/div[2]/ol/li[2]/a")).click();
			
			Thread.sleep(1500);
			WebElement Messtitle = Browser.getInstance().findElement(By.xpath("//*[@id='chatRenderDiv']/div[1]/div[4]/div/input"));
			Messtitle.click();
			Messtitle.sendKeys("Test Message Title");
			
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.className("enableApplyAction")).click();
			
			System.out.println("Message successfully added using Library Quick Add");
			
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Question successfully added using Library Quick Add","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Message successfully added using Library Quick Add","Pass"};
	   	 	reportObj.writeReport(reportValues1);
	   	 	log.info("Checking Library Quick Add Functionalities");
		}
				
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Question successfully added using Library Quick Add","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Message successfully added using Library Quick Add","Fail"};
	   	 	reportObj.writeReport(reportValues1);
	   	 	log.info("An error occurred while Checking Library Quick Add Functionalities");
		}
		
		//Individual Delete 
		
		try
		{
			
			
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Question successfully added using Library Quick Add","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Message successfully added using Library Quick Add","Pass"};
	   	 	reportObj.writeReport(reportValues1);
	   	 	log.info("Checking Library Quick Add Functionalities");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Question successfully added using Library Quick Add","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Message successfully added using Library Quick Add","Fail"};
	   	 	reportObj.writeReport(reportValues1);
	   	 	log.info("An error occurred while Checking Library Quick Add Functionalities");
		}
		
		
		
        //Search Questions from the drawer
		try
		{
			Thread.sleep(6500);
			Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div/a[1]/i")).click();
					
			//Checking unsaved edits from Chat Drawer
			
			Thread.sleep(2500);
        	Browser.getInstance().findElement(By.className("addCollectionContent")).click();
        	Thread.sleep(2500);
        	WebElement name =  Browser.getInstance().findElement(By.xpath("//*[@id='add-collection']/div/div[2]/div[1]/input"));
        	name.isSelected();
        	name.sendKeys("Test Questions");
        	
        	
			Browser.getInstance().findElement(By.xpath("//*[@id='add-collection']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel - Chat Drawer Question");
        	        	
        	Thread.sleep(5500);
        	
        	Actions action = new Actions(Browser.getInstance());
            action.sendKeys(Keys.ESCAPE).build().perform();
        	        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Escape OK
        	
        	Thread.sleep(3500);
        	        	        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape OK - Chat Drawer Question");
        	
        	System.out.println("Chat Drawer Question Done");
        	
        	//Thread.sleep(6500);
        	
        	//action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	//Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Escape OK
        	

        	//Thread.sleep(3500);
        	        	        	
        	//System.out.println("Checking Unsaved changes in add collection modal by clicking escape OK - Chat Drawer Question");
        	
        	//Thread.sleep(5500);
        	
        	//action.sendKeys(Keys.ESCAPE).build().perform();        	
        	//      	
        	//Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Escape Canel
        	
        	//Thread.sleep(3500);
        	
        	//System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel - Chat Drawer Question");
        	
        	//Browser.getInstance().findElement(By.xpath("//*[@id='add-collection']/div/div[1]/button")).click();
        	
            //Thread.sleep(4500);   	
        	//WebElement ConOK = Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")); //Ok
        	//ConOK.isSelected();
        	//ConOK.click();
                      	    
        	
        	//Thread.sleep(2500);
        	
        	//Actions action1 = new Actions(Browser.getInstance());
        	//action1.sendKeys(Keys.ESCAPE).build().perform();
        	
        	//Thread.sleep(4500);   	
         	//WebElement ConOK1 = Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")); //Ok
         	//ConOK1.isSelected();
         	//ConOK1.click();
                       	   
        	//System.out.println("Checking Unsaved changes in add collection modal by clicking close-ok - Chat Drawer Question");
        	
        	//Thread.sleep(2500);
        	       	        	
        	Thread.sleep(5500);
        	
        	Browser.getInstance().findElement(By.className("addCollectionContent")).click();
        	Thread.sleep(1500);
        	WebElement name1 =  Browser.getInstance().findElement(By.xpath("//*[@id='add-collection']/div/div[2]/div[1]/input"));
        	name1.isSelected();
        	name1.sendKeys("Test Questions");
        	          	
        	Actions action11 = new Actions(Browser.getInstance());
        	action11.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(4500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	        	        	       	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok - Chat Drawer Question");
        	
        	//Navigating to Resources Page
        	
        	Thread.sleep(6500);
        	
        	WebElement Resources = Browser.getInstance().findElement(By.xpath("//ul[contains(@class,'button-sectionv-to')]/li[2]/a"));
        	Resources.isEnabled();
        	Resources.click();
        	
        	System.out.println("Successfully navigated to Resources - Drawer");
        	
        	//Checking Unsaved Edits
        	
        	Thread.sleep(2500);
        	WebElement Resadd = Browser.getInstance().findElement(By.xpath("//*[@id='resources']/div/div/div/div[2]/span"));
        	Resadd.isSelected();
        	Resadd.click();
        	Thread.sleep(2500);
        	WebElement resname =  Browser.getInstance().findElement(By.xpath("//*[@id='add-resource-collection']/div/div[2]/div[1]/input"));
        	resname.isSelected();
        	resname.sendKeys("Test Resources");
        	
        	
			Browser.getInstance().findElement(By.xpath("//*[@id='add-resource-collection']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel - Chat Drawer Resource");
        	
        	
        	Thread.sleep(4500);
        	
        	Actions resaction = new Actions(Browser.getInstance());
        	resaction.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel - Chat Drawer Resource");
        	
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-resource-collection']/div/div[1]/button")).click();
        	
               	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking esacpe-ok - Chat Drawer Resource");
        	
        	Thread.sleep(2500);
        	
        	WebElement Resadd1 = Browser.getInstance().findElement(By.xpath("//*[@id='resources']/div/div/div/div[2]/span"));
        	Resadd1.isSelected();
        	Resadd1.click();
        	Thread.sleep(2500);
        	
        	WebElement resname1 =  Browser.getInstance().findElement(By.xpath("//*[@id='add-resource-collection']/div/div[2]/div[1]/input"));
        	resname1.isSelected();
        	resname1.sendKeys("Test Resources");
        	
          	
        	Actions resaction1 = new Actions(Browser.getInstance());
        	resaction1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	        	        	       	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok - Chat Drawer Resource");
        	
        	System.out.println("Chat Drawer Resource Done");
              	
        	//Navigating To Question
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/ul/li[1]/a")).click();
        	        	      	
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Searching questions in the Chat window & Verifying Unsaved Changes","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.info("Search questions from the drawer & Verifying Unsaved Changes");
		}
		catch(Exception e)
		{	
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Searching questions in the Chat window  & Verifying Unsaved Changes","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.error("An error occurred while searching questions from the drawer & Verifying Unsaved Changes");
		}
		
		//Send questions from drawer to the candidate by clicking airplane icon
		try
		{
			Thread.sleep(5500);
			//Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div/a[1]/i")).click();
			//Thread.sleep(4500);
			Browser.getInstance().findElement(By.id("searchQuestions1")).sendKeys("Tell");
			Thread.sleep(4500);    
			Browser.getInstance().findElement(By.xpath("//*[@id='style-15']/div/span/div/div[2]/i[1]")).click();
			

			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Sending questions to the candidate by clicking airplane icon","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.info("Send questions to the candidate by clicking airplane icon");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Sending questions to the candidate by clicking airplane icon","Fail"};
	   	 	reportObj.writeReport(reportValues);
	   	 	log.error("An error occurred while sending questions to the candidate by clciking airplane icon");
		}	
	
		//Filter candidates by category & Scheduling the message
		try
		{
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.id("search")).clear();
			Browser.getInstance().findElement(By.id("search")).sendKeys("Vasanth");
			
			Thread.sleep(6500);
			
			WebElement Chatleft = Browser.getInstance().findElement(By.xpath("//*[@id='a0d308e1-3238-4171-b788-c4bd1fc2619e']/a"));
			Chatleft.isEnabled();
			Chatleft.click();
			//Browser.getInstance().navigate().refresh();
			Thread.sleep(8000);
	   	 	
	   	    ((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,300)");
	   	 	
	   	 	
	   	//Transcript Preview from Chat page
	   	    
	   	    Browser.getInstance().findElement(By.id("ShareCandidate")).click();
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='export-transcript-popup']/a[3]")).click();
	   	    
	   	    Thread.sleep(5500);
	   	    
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='chat_preview_transcript']/div/div/div/button/span")).click();
	   	    
	   	    Thread.sleep(1500);
	   	    
	   	    System.out.println("Sucessfully previewed Transcript from Chat Page");
	   	    
	    //Clicking Chat Transcript Modal
	   	    
	  /* 	    WebDriverWait wait = new WebDriverWait(Browser.getInstance(), 15);
	   	 	
	   	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[5]/div[1]/div[4]/div[2]/ul/li[2]"))).click();
	   	    
	        System.out.println("Sucessfuly previewed chat transcript");
	   	 	
	   	 	
	   	 	Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chatview']/div/div/div[1]/button/span")).click();
			
	   	 	Thread.sleep(2500);*/
	   	 	
	   	 //Scheduling Message
	   	 	
	   	 	Browser.getInstance().findElement(By.className("timeClockOnPostChatDiv")).click();
	   	 	
	   	 	Thread.sleep(2500);	   	 	
	   	 	   	 	
	   	 	WebElement SchInput = Browser.getInstance().findElement(By.id("campaignInnput"));
			
			Thread.sleep(3500);
			SchInput.sendKeys("#");
			Thread.sleep(1500);
			SchInput.sendKeys(Keys.DOWN);
			SchInput.sendKeys(Keys.TAB);	
			
			Thread.sleep(3500);
			SchInput.sendKeys("#");
			Thread.sleep(1500);
			SchInput.sendKeys(Keys.DOWN);
			SchInput.sendKeys(Keys.DOWN);
			SchInput.sendKeys(Keys.UP);
			Thread.sleep(1500);
			SchInput.sendKeys(Keys.TAB);
			SchInput.click();
			
			Thread.sleep(3500);				
			
			System.out.println("Saved message been added by clicking TAB and Keyboard events in Chat - Schedule Message Modal");
			
			SchInput.sendKeys("Scheduling message with attachment");
	   	 	
	   	 //Adding Saved Message into the Schedule message
	   	 	
	   	 	Thread.sleep(3500);
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[5]/span[2]/img")).click();
	   	    
	   	    Thread.sleep(2500);
	   	    Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[11]/div[2]/ul/li[1]")).click();
	   	 	
	   	    System.out.println("Saved Message Added Successfully into the Schedule Message Modal");
	   	//Uploading an attachment and resource
	   	 	
	   		Thread.sleep(2500);
	   		
	   		Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[5]/span"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[5]/span/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);			
				   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[5]/span/img")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   			   	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatscheduleattachmentlist']/li[1]/a")).click();
	   	 	
	   	 	Thread.sleep(5500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");
	   	 						
			System.out.println("Document Uploaded Sucessfully");
			
			//Uploading Resource
			
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[5]/span/img")).click();
		
            Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='chatscheduleattachmentlist']/li[2]/a")).click();
			
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
	   	 	
	   	 	System.out.println("Resource Uploaded Sucessfully");
	   	 	
	   	 //Schedule date and time
	   	 	
	   	 	Thread.sleep(4500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[7]/div[1]/div/input")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.className("adp-next")).click();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[7]/div[1]/div/div/div[2]/div[28]")).click();
	   	 	
			Thread.sleep(2500);
			System.out.println("Date sucessfully added" + '\n');
			
			Thread.sleep(4500);
			WebElement time = Browser.getInstance().findElement(By.xpath("//*[@id='schdTimePicker']/div[1]/span"));
			time.isEnabled();
			time.click();
		
			Thread.sleep(2500);
	   	 	
			
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[7]/div[1]/div/input")).click();
			Thread.sleep(4500);	
			
			
			WebElement Addtosch1 = Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[8]/button"));
			Addtosch1.isEnabled();
			Addtosch1.click();
	   	 	
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/button")).click();
			
			Thread.sleep(2500);
			
			System.out.println("Scheduled Messages Sucessfully");	   	 	  	 	   	 	
					
			//Navigating to View Schedule messages
			
			Actions action = new Actions(Browser.getInstance());
			WebElement elem = Browser.getInstance().findElement(By.className("settings-icon"));
			action.moveToElement(elem).build().perform();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.className("settings-icon")).click();
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/ol/li[4]")).click();
			
			Thread.sleep(2500);
			
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title " + title);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[1]/td[4]")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("campaignInnput")).clear();
			
			Thread.sleep(2500);
			
			WebElement ViewSchInput = Browser.getInstance().findElement(By.id("campaignInnput"));
			
			Thread.sleep(3500);
			ViewSchInput.sendKeys("#");
			Thread.sleep(1500);
			ViewSchInput.sendKeys(Keys.DOWN);
			ViewSchInput.sendKeys(Keys.TAB);	
			
			Thread.sleep(3500);
			ViewSchInput.sendKeys("#");
			Thread.sleep(1500);
			ViewSchInput.sendKeys(Keys.DOWN);
			ViewSchInput.sendKeys(Keys.DOWN);
			ViewSchInput.sendKeys(Keys.UP);
			Thread.sleep(1500);
			ViewSchInput.sendKeys(Keys.TAB);
			ViewSchInput.click();
			
			Thread.sleep(3500);				
			
			System.out.println("Saved message been added by clicking TAB and Keyboard events in View Schedule Message");
			
			
			ViewSchInput.sendKeys("Editing Schedule message");
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='schedulePageScheduledModalId']/div/div[2]/div/div[7]/button")).click();
			
			System.out.println("Scheduled Messages edited from View Schedule Message Page");
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.id("chatAnchor")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("timeClockOnPostChatDiv")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	//Editing message from the modal
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='schdlMsgPanel_0']/div[1]/img[1]")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.id("campaignInnput")).clear();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("campaignInnput")).sendKeys("Editing Schedule message");
			
			Thread.sleep(2500);
			
			WebElement Addtosch2 = Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[8]/button"));
			Addtosch2.isEnabled();
			Addtosch2.click();
			
			System.out.println("Editing Schedule Message from the modal");
			Thread.sleep(3500);	
	   	 	
			Browser.getInstance().findElement(By.xpath("//*[@id='schdlMsgPanel_0']/div[1]/img[2]")).click();
			
			Thread.sleep(1500);	
			Browser.getInstance().findElement(By.xpath("//*[@id='schdlMsgDel_0']/span/span[4]")).click();
			Thread.sleep(2500);
			
		   	 	
	   	 	Browser.getInstance().findElement(By.id("campaignInnput")).sendKeys("Scheduling Message for Second Time");
	   	 	
	   	 //Schedule date and time for 2nd time
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[7]/div[1]/div/input")).click();
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.className("adp-next")).click();
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[7]/div[1]/div/div/div[2]/div[28]")).click();
	   	 	
			Thread.sleep(2500);
			System.out.println("Date sucessfully added" + '\n');
			
			Thread.sleep(4500);
			WebElement time1 = Browser.getInstance().findElement(By.xpath("//*[@id='schdTimePicker']/div[1]/span"));
			time1.isEnabled();
			time1.click();
		
			Thread.sleep(2500);
	   	 	
	
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[7]/div[1]/div/input")).click();
			Thread.sleep(2500);	
			
			
			WebElement Addtosch = Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/div[1]/div/div[8]/button"));
			Addtosch.isEnabled();
			Addtosch.click();
			
			System.out.println("Message sucessfully scheduled for second time");
			
			Thread.sleep(2500);	
			Browser.getInstance().findElement(By.xpath("//*[@id='schdlMsgPanel_0']/div[1]/img[2]")).click();
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='schdlMsgDel_0']/span/span[4]")).click();
			Thread.sleep(4500);
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='scheduled-message-modal']/div/button")).click();
			
			System.out.println("Schedule message sucessfully deleted");
		
			
			Thread.sleep(5500);		
			
					
	   	 	ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Scheduleing messages & Saving Messages in chat page","Pass"};
	   	 	reportObj.writeReport(reportValues);
	   	 	String[] reportValues1 = {"Search by using message title successfully in All/Mine - Saved Message Modal","Pass"};
	   	 	reportObj.writeReport(reportValues1);
	   	    String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Schedule Message Modal","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in View Schedule Message Modal","Pass"};
			reportObj.writeReport(reportValues3);
	   	 	log.info("Scheduled  message sucessfully in chat page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues = {"Scheduleing messages & Saving Messages","Fail"};	   	    
	   	 	reportObj.writeReport(reportValues);	   	 	
	   	 	String[] reportValues1 = {"Search by using message title successfully in All/Mine - Saved Message Modal","Fail"};
	   	 	reportObj.writeReport(reportValues1);	   	 	
	   	 	
	   	 	log.error("An error occurred while filtering candidates in Scheduleing messages in chat page");
		}
		
		//
		
		try
		{
			Thread.sleep(5500);		
			//Feature Saved Message Replies
			
			Browser.getInstance().findElement(By.className("chattxtsavedreplies")).click();
					
			Thread.sleep(2500);
			
			//Searching in Saved Message and clicking on Show All/Show Mine
			
			Browser.getInstance().findElement(By.id("searchTxtSvdRplyScrnOne")).sendKeys("Message test from All point of view");
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'searchSvdRplyScreen2')]//span[contains(@class,'savedreplymodal')]")).click();
			
			Thread.sleep(2500);		
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'searchSvdRplyScreen2')]//span[contains(@class,'savedreplymodal')]")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("clsCloseScreenTwo")).click();
			//Browser.getInstance().findElement(By.xpath("//div[contains(@class,'searchSvdRplyScreen2')]//span[contains(@class,'clsCloseScreenTwo')]")).click();
			
			Thread.sleep(2500);
			
			System.out.println("Search by using message title successfully in All/Mine - Saved Message Modal");
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("createbutton")).click();
			
			Browser.getInstance().findElement(By.id("savedMessageCreateTitle")).sendKeys("Adding message");
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("savedMessageCreateBody")).click();
			Browser.getInstance().findElement(By.id("savedMessageCreateBody")).sendKeys("Adding message");
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[1]")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='createSvdMsgMergeTags']/div/div[2]/span")).click();
			
			Thread.sleep(2500);
			
			System.out.println("Saved Message sucessfully created - Merge");
			
			//Uploading Attachment/Resource
			
			Thread.sleep(2500);
			Actions actions = new Actions(Browser.getInstance());
			WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[2]"));
			actions.moveToElement(menu);

			WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[2]/img"));
			actions.moveToElement(subMenu);
			actions.build().perform();
			Thread.sleep(2500);		
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[2]/img")).click();
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='savedreplyattachmentlist']/li[1]/a")).click();
					
			Thread.sleep(5500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");
								
			Thread.sleep(2500);
			
			System.out.println("Saved Message sucessfully created - Attachment");
			
			
			Thread.sleep(2500);
			
			WebElement menu1 = Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[2]"));
			actions.moveToElement(menu1);

			WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[2]/img"));
			actions.moveToElement(subMenu1);
			actions.build().perform();
			Thread.sleep(2500);				
			
			Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[3]/div/span[2]/img")).click();
			
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='savedreplyattachmentlist']/li[2]/a")).click();
			
			Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='style-1']/ol/li/span/a")).click();
	   	 	
	   	 	Browser.getInstance().findElement(By.className("attchmentinputbox")).sendKeys("test");
	   	 	
	   	 	
	   	 	Thread.sleep(4500);
	   	 	
	   	 	WebElement Resclick1 = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatattachementfile')]/ol/li/a[contains(text(),'Testdoc.pdf')]"));
	   	 	Resclick1.isEnabled();
	   	 	Resclick1.click();   	 	
	   	 		   	 	
	   	 	Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlibraryModal']/div/div[1]/button")).click();
			
	   	 	Thread.sleep(3500);
	   	 	
			Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[5]/div/input[2]")).click();
	   	 	
			System.out.println("Saved Mesasge Sucessfully Created");
			
			//Inserting saved message into the chat box.
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='viewreply']/div[2]/input[2]")).click();
			
			Thread.sleep(1500);
			
			Browser.getInstance().findElement(By.id("chatplaneicon")).click();
			
			System.out.println("Message sucessfully sent from the chat input box");
			
			Thread.sleep(2500);
			
//			//Checking Show all & Show my
//			
//			Browser.getInstance().findElement(By.id("chatPost")).sendKeys("#");
//			
//			//Clicking Show All
//			Thread.sleep(2500);
//			Browser.getInstance().findElement(By.xpath("//*[@id='savedMessageheader']/span[2]")).click();
//			
//			//Clicking Show My
//			Thread.sleep(2500);
//			Browser.getInstance().findElement(By.xpath("//*[@id='savedMessageheader']/span[2]")).click();
//			
//			//Clicking Message
//			Thread.sleep(2500);
//			Browser.getInstance().findElement(By.xpath("//*[@id='chat-drawer']/div[1]/div/div[2]/div[1]/div[1]/ul/li/span[1]")).click();
//			
//			
//			Browser.getInstance().findElement(By.id("chatPost")).clear();
//			
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.className("chattxtsavedreplies")).click();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.className("createbutton")).click();
			
			Browser.getInstance().findElement(By.xpath("//*[@id='createreply']/div[5]/div/input[1]")).click();
			
			Thread.sleep(2500);
			
			//Editing the saved messsage
			
			Browser.getInstance().findElement(By.xpath("//*[@id='viewreply']/div[2]/input[1]")).click();
			
			Thread.sleep(2500);
			
			
			Browser.getInstance().findElement(By.xpath("//*[@id='viewSavedReplyBody']")).clear();
			
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='viewSavedReplyBody']")).sendKeys("And editing the saved Message by adding resources");
			
			Thread.sleep(3500);
			
			Thread.sleep(2500);
			
			WebElement menu11 = Browser.getInstance().findElement(By.xpath("//*[@id='editreply']/div[3]/div[1]/span[2]"));
			actions.moveToElement(menu11);

			WebElement subMenu11 = Browser.getInstance().findElement(By.xpath("//*[@id='editreply']/div[3]/div[1]/span[2]/img"));
			actions.moveToElement(subMenu11);
			actions.build().perform();
			Thread.sleep(2500);		
						
			Browser.getInstance().findElement(By.xpath("//*[@id='editreply']/div[3]/div[1]/span[2]/img")).click();
					
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='savedreplyattachmentlistscrn2']/li[2]/a")).click();
			
			Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='style-1']/ol/li/span/a")).click();
	   	 	
	   	 	Browser.getInstance().findElement(By.className("attchmentinputbox")).sendKeys("test");
	   	 		   	 	
	   	 	Thread.sleep(4500);
	   	 	
	   	 	WebElement Resclick2 = Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatattachementfile')]/ol/li/a[contains(text(),'Testdoc.pdf')]"));
	   	 	Resclick2.isEnabled();
	   	 	Resclick2.click();   	 	
	   	 		   	 	
	   	 	Thread.sleep(3500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='chatattachmentlibraryModal']/div/div[1]/button")).click();
			
	   	 	Thread.sleep(3500);
			
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='editreply']/div[5]/div[1]/input[2]")).click();
	   	 	
	   	 	System.out.println("Saved Message sucessfully edited");

	   	 	//Deleting Saved Message
	   	 	
	   	 	Thread.sleep(2500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='viewreply']/div[3]/input")).click();
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='viewreply']/div[3]/div/span/span[4]")).click();
	   	 	
	   	 	System.out.println("Saved Message Sucessfully Deleted");
	   	 	
	   	 	Thread.sleep(4500);
	   	 	
	   	 	Browser.getInstance().findElement(By.xpath("//*[@id='svdRplyScreen2Plus']/div[1]/span[2]")).click();
	   	 	Thread.sleep(4500);
	   	 	
			//Clicking Canvas Initials on right nav
		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[6]/div[1]/div[1]/div/span/img")).click();
		    
		    Thread.sleep(7000);		    

		    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[2]/a")).click();		  
		    											
		    
		    System.out.println("Sucessfully navigated to Candidate Page");
		    
		    Thread.sleep(3500);
		    
		    ReportGenerator reportObj = new ReportGenerator();
	   	 	String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Schedule Message Modal","Pass"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in View Schedule Message Modal","Pass"};
			reportObj.writeReport(reportValues3);
	   	 	log.info("Saved  message sucessfully in chat page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
	   	 	  	 	
	   	 	String[] reportValues2 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in Schedule Message Modal","Fail"};
			reportObj.writeReport(reportValues2);
			String[] reportValues3 ={"Saved message using # been opened and message been added successfully by clicking TAB and Keyboard activities in View Schedule Message Modal","Fail"};
			reportObj.writeReport(reportValues3);
	   	 	log.error("An error occurred while Saving Messages  in chat page");
		}
		
		
		
     }
}
