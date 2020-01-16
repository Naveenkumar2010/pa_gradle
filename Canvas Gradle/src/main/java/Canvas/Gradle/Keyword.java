package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Keyword {
	static Logger log = Logger.getLogger(Amplify.class.getName());
	   
    public void outbound() throws IOException, InterruptedException   
    
{
    //Navigating to Keyword bot - Canvasbot	
    	
    try
    {
    	Thread.sleep(8000);
        Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[6]/a")).click();
    	
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='mainPg']/div[2]/div[5]/button")).click();
    	
    	System.out.println("Successfully navigated to Keyword Dashboard page");
    	
    	ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Navigating to Canvasbot Page - Keyword Bot","Pass"};
		reportObj.writeReport(reportValues);
		log.info("Navigating to Canvasbot Page");
    	
  	}
    catch (Exception e)
    {
    	e.printStackTrace();
    	ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Navigating to Canvasbot Page - Keyword Bot","Fail"};
		reportObj.writeReport(reportValues);
		log.info("An error occurred while navigating to Canvasbot Page");
    }
    
    //Applying filter and navigate to Details and builder page
    
    try
    {
    	Thread.sleep(4500);
    	
    	//Assigning job from portrait page:
    	((JavascriptExecutor) Browser.getInstance()).executeScript("scroll(0,400)");
		    	    	
    	Thread.sleep(3500);
    	    	    	
    	Actions actions = new Actions(Browser.getInstance());    
		
		WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[2]/span"));
		actions.moveToElement(menu);

		WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[2]/img"));
		actions.moveToElement(subMenu);
		actions.build().perform();
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[2]/img")).click();
		
		
    	Thread.sleep(2500);
    	Browser.getInstance().findElement(By.xpath("//*[@id='creatorFiltersID']/ul/li[9]/div/input")).click();
    	
    	Thread.sleep(2500);
        Browser.getInstance().findElement(By.xpath("//*[@id='creatorFiltersID']/div[2]/input")).click();
        
        System.out.println("Filter applied successfully");
        
        ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues1 = {"Navigating to Keyword Dashboard Page","Pass"};
		reportObj.writeReport(reportValues1);
		
		String[] reportValues11 = {"Filter applied successfully for CreatedBy column","Pass"};
		reportObj.writeReport(reportValues11);
		
		log.info("Navigating to Keyword Dashboard and appling filter");
    }
    catch (Exception e)
    {
    	e.printStackTrace();
    	ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues1 = {"Navigating to Keyword Dashboard Page","Fail"};
		reportObj.writeReport(reportValues1);
		
		String[] reportValues11 = {"Filter applied successfully for CreatedBy column","Fail"};
		reportObj.writeReport(reportValues11);
		
		log.info("An error occurred while navigating to Keyword Dashboard and appling filter");
    }
    
    //Navigating to builder page & Adding slots
    
    try
    {
    	Thread.sleep(4500);
    	WebElement Campname = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/tbody/tr/td[1]/a"));
    	String name = Campname.getText();
    	Campname.click();
    	
    	System.out.println("Bot Name : " + name) ;
    	
    	Thread.sleep(5500);
    	
    	Browser.getInstance().findElement(By.id("id_addNewShowBuilder")).click();
    	
    	//Adding Slots
    	
    	Thread.sleep(5500);
    	
    	Browser.getInstance().findElement(By.className("tableCampAddSlot")).click();
    	
    	WebElement Slotname = Browser.getInstance().findElement(By.id("inputBoxClassCampID0"));
    	Slotname.sendKeys("Add Slot by using selenium for File Data Type");
    	
    	
    	//Adding Merge tags into the slots
    	
    	Thread.sleep(3500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[1]/div[2]/div/div[2]/span")).click();
    	
    	WebElement Slotname1 = Browser.getInstance().findElement(By.id("inputBoxClassCampID0"));
    	Slotname1.click();
    	Slotname1.sendKeys(Keys.CONTROL+ "v");
    	
    	System.out.println("Merge Tags added successfully");    	
    	
    	System.out.println("Slot name successfully added");
    	
    	Thread.sleep(3500);
        Select dropdown =new Select(Browser.getInstance().findElement(By.className("customDropdownCamp")));
    	dropdown.selectByVisibleText("TEXT");
    	
    	System.out.println("Text Data type successfully selected");
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='spanValidationParent']/img[2]")).click();
    	
    	Thread.sleep(1500);
    	Browser.getInstance().findElement(By.id("idBranchName")).sendKeys("Text Description");
    	
    	    	
    	Thread.sleep(1500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='equal']/span/input")).sendKeys("Testing VM");
    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.className("Add-rule")).click();
    	
    	Select dropdown2 =new Select(Browser.getInstance().findElement(By.className("classCampOerator")));
     	dropdown2.selectByVisibleText("AND");
     	
     	Thread.sleep(1500);
        Select dropdown3 =new Select(Browser.getInstance().findElement(By.xpath("//*[@id='rulecontainer']/div[2]/span[2]/select")));
    	dropdown3.selectByVisibleText("Is Anything");   	    	    	
    	
    	Thread.sleep(500);
    	    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='myModal']/div/div/div[4]/button")).click();
    	    	
    	System.out.println("Validation modal successfully added for TEXT Data type");
    	
    	//Validation modal for file
    	    	
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.className("tableCampAddSlot")).click();
    	
    	WebElement Slotname11 = Browser.getInstance().findElement(By.id("inputBoxClassCampID1"));
    	Slotname11.sendKeys("Add Slot by using selenium for File Data Type");
    	
    	System.out.println("Slot name successfully added");
    	
    	Thread.sleep(3500);
        Select dropdown11 =new Select(Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[3]/select")));
    	dropdown11.selectByVisibleText("FILE");
    	
    	System.out.println("File Data type successfully selected");
    	
    	Thread.sleep(4500);    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/div[2]/div[4]/div/span[2]/img[2]")).click();
    	
    	Thread.sleep(2500);
    	Browser.getInstance().findElement(By.id("idBranchName")).sendKeys("File Description");
    	
    	Thread.sleep(2500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='myModal']/div/div/div[4]/button")).click();
    	
    	System.out.println("Validation modal successfully added for File Data type");  
    	
    	//Adding slots by clicking Library section
    	
    	Thread.sleep(2500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[1]/div[1]/div[1]/ul/li[2]")).click();
    	
    	Thread.sleep(500);
    	
    	Browser.getInstance().findElement(By.id("search")).sendKeys("Tell me");
    	
    	Thread.sleep(2500);
    
    	Browser.getInstance().findElement(By.xpath("//*[@id='dragtarget']/div[1]")).click();
    	
    	System.out.println("Slots added using Library Section - Questions");
    	
    	//Adding webhook data type - Adding URL, Test Webhook modal and Webhook history
    	
    	Thread.sleep(3500);
        Select dropdown4 =new Select(Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[3]/td/table/tbody/tr/td/div[2]/div[3]/select")));
    	dropdown4.selectByVisibleText("WEBHOOK");
    	
    	//Adding URL
    	
    	Thread.sleep(2500);
    	
    	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'validationrule')]/input")).sendKeys("https://dev1.mycanvas.io/");
    	
    	System.out.println("URL sucessfully added into the Webhook box");
    	
    	Thread.sleep(2500);
    	
    	Browser.getInstance().findElement(By.className("validationHover")).click(); //It will get saved
    	
    	Thread.sleep(2500);
    	
    	Browser.getInstance().findElement(By.className("validationHover")).click();
    	
    	Thread.sleep(2500);
    	
    	Browser.getInstance().findElement(By.className("testWebhookButton")).click();
    	
    	Thread.sleep(6500);
    	
    	System.out.println("Webhook Modal Tested");
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='webhookTest']/div/div[1]/button")).click();
    	
    	//Opening Webhook History Modal
    	
    	Thread.sleep(3500);
    	
    	Actions actions = new Actions(Browser.getInstance());
		WebElement menu = Browser.getInstance().findElement(By.className("messageAshHover"));
		actions.moveToElement(menu);

		WebElement subMenu = Browser.getInstance().findElement(By.className("messageAshHover"));
		actions.moveToElement(subMenu);
		actions.build().perform();
		Thread.sleep(2500);
		
    	Browser.getInstance().findElement(By.className("messageAshHover")).click();
    	
    	Thread.sleep(4500);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='webhookHistory']/div/div[1]/button")).click();
    	
    	System.out.println("Webhook History opened/closed sucessfully"); 	   	   	
    	   	    	    	
    	ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues1 = {"Navigating to Keyword Builder Page","Pass"};
		reportObj.writeReport(reportValues1);
		String[] reportValues11 = {"Slots added successfully","Pass"};
		reportObj.writeReport(reportValues11);
		String[] reportValues2 = {"Slots added for TEXT Data Type with operator","Pass"};
		reportObj.writeReport(reportValues2);
		String[] reportValues3 = {"Slots added FILE Data type","Pass"};
		reportObj.writeReport(reportValues3);	
		String[] reportValues12 = {"Validation Modal successfully added","Pass"};
		reportObj.writeReport(reportValues12);
		String[] reportValues4 = {"Merge Tags added successfully","Pass"};
		reportObj.writeReport(reportValues4);
		String[] reportValues5 = {"Slot added successfully from Library - Question Section","Pass"};
		reportObj.writeReport(reportValues5);
		String[] reportValues6 = {"Search successfull from Library Section","Pass"};
		reportObj.writeReport(reportValues6);
		String[] reportValues7 = {"Webhook Slot successfully added","Pass"};
		reportObj.writeReport(reportValues7);
		String[] reportValues8 = {"Webhook modal successfully enabled/disabled.","Pass"};
		reportObj.writeReport(reportValues8);
		String[] reportValues9 = {"Webhook history modal opened/closed successfully","Pass"};
		reportObj.writeReport(reportValues9);
		log.info("Slots/validating modal added successfully");
									
    }   
    
    catch (Exception e)
    {
    	e.printStackTrace();
    	ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues1 = {"Navigting to Keyword Builder Page","Fail"};
		reportObj.writeReport(reportValues1);
		String[] reportValues11 = {"Slots added successfully","Fail"};
		reportObj.writeReport(reportValues11);
    	String[] reportValues12 = {"Validation Modal successfully added","Fail"};
		reportObj.writeReport(reportValues12);
		String[] reportValues2 = {"Slots added for TEXT Data Type with operator","Fail"};
		reportObj.writeReport(reportValues2);
		String[] reportValues3 = {"Slots added FILE Data type","Fail"};
		reportObj.writeReport(reportValues3);	
		String[] reportValues4 = {"Merge Tags added successfully","Fail"};
		reportObj.writeReport(reportValues4);
		String[] reportValues5 = {"Slot added successfully from Library - Question Section","Fail"};
		reportObj.writeReport(reportValues5);
		String[] reportValues6 = {"Search successfull from Library Section","Fail"};
		reportObj.writeReport(reportValues6);
		String[] reportValues7 = {"Webhook Slot successfully added","Fail"};
		reportObj.writeReport(reportValues7);
		String[] reportValues8 = {"Webhook modal successfully enabled/disabled.","Fail"};
		reportObj.writeReport(reportValues8);
		String[] reportValues9 = {"Webhook history modal opened/closed successfully","Fail"};
		reportObj.writeReport(reportValues9);
		log.info("An error occurred while adding Slots/validating modal added successfully ");
    }
    
    //Adding actions into the slots
    
    try
    {
       Thread.sleep(4500);
       
       Browser.getInstance().findElement(By.className("clsValidationBranchImage")).click();
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.id("selectActionId")).click();
       
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div[4]/div/ol[1]/li[1]/a")).click();
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.id("selectConfigActionId")).click();
       Browser.getInstance().findElement(By.xpath("//*[@id='80083571-2fa7-40f4-bfee-61aac752e193']")).click();
       
       Thread.sleep(1500);
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div[4]/div/div[3]")).click();
    	
       Thread.sleep(1500);
     
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div[4]/div/div[6]/input")).click();
    
       System.out.println("Actions successfully added into the slot,");
       
       //Adding Action Import and Chat
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.className("clsValidationBranchImage")).click();
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.id("selectActionId")).click();
       
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[4]/div/ol[1]/li[4]/a")).click();
       
       Thread.sleep(1500);
       
       //Configure Action

       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr/td/div/div/div[4]/div/div[4]/div")).click();
       Thread.sleep(1500);
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[4]/div/ol[3]/li[3]/div")).click();
       Thread.sleep(1500);
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[4]/div/div[5]/input")).sendKeys("Test Optional Message");

       Thread.sleep(2500);
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[4]/div/div[6]/input")).click();
       System.out.println("Actions - Importand Chat added successfully");
       
       //Adding Second Actions
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.className("clsValidationBranchImage")).click();
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.id("selectActionId")).click();
       
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[4]/div/ol[1]/li[3]/a")).click();
       
       Thread.sleep(1500);
       
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/div/div/div[4]/div/div[4]/input")).click();
       
       System.out.println("Second Action added successfully");
       
       Thread.sleep(3500);
       
       //Editing the actions
       
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[4]/img")).click();
       
       Thread.sleep(3500);
       
       //Select Action
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[4]/div/div[2]/input")).click();
       
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[4]/div/ol[2]/li[7]/a")).click();
       
       Thread.sleep(2500);
       
       //Configure action
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[4]/div/div[4]")).click();
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[4]/div/ol[3]/li[2]/a")).click();
                  	
       Thread.sleep(1500);
     
       Browser.getInstance().findElement(By.xpath("//*[@id='main']/div[2]/div[1]/div[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div/div/div[4]/div/div[6]/input")).click();
    
       System.out.println("Actions edited successfully");    
       
       //Enabling the Response
       
       Thread.sleep(2500);
       
       Browser.getInstance().findElement(By.className("validationImgClass")).click();
       
       System.out.println("Response Enabled Successfully");
       
       Thread.sleep(3500);
       
       Browser.getInstance().findElement(By.className("rulemodal")).click();
       
       Thread.sleep(3500);
       
       Browser.getInstance().findElement(By.xpath("//span[contains(@class,'fontAwesomeClose')]/button")).click();
       
       Thread.sleep(3500);
       
       Browser.getInstance().findElement(By.xpath("//span[contains(@class,'fontAwesomeClose')]/button")).click();	
       
       System.out.println("Deleting all the slots");            
       
       ReportGenerator reportObj = new ReportGenerator();
       String[] reportValues1 = {"Action added successfully","Pass"};
       reportObj.writeReport(reportValues1);
       String[] reportValues11 = {"Second Action added successfully","Pass"};
       reportObj.writeReport(reportValues11);
       String[] reportValues12 = {"Action edited successfully","Pass"};         
       reportObj.writeReport(reportValues12);
       String[] reportValues112 = {"Response Enabled successfully","Pass"};         
       reportObj.writeReport(reportValues112);
       String[] reportValues2 = {"Action - Import and chat with optional message added successfully - Builder Page","Pass"};         
       reportObj.writeReport(reportValues2);
       log.info("Actions added/edited successfully");
       
    }
    catch (Exception e)
    {
    	e.printStackTrace();
    	ReportGenerator reportObj = new ReportGenerator();
        String[] reportValues1 = {"Action added successfully","Fail"};
        reportObj.writeReport(reportValues1);
        String[] reportValues11 = {"Second Action added successfully","Fail"};
        reportObj.writeReport(reportValues11);
        String[] reportValues12 = {"Action edited successfully","Fail"};         
        reportObj.writeReport(reportValues12);
        String[] reportValues112 = {"Response Enabled successfully","Fail"};         
        reportObj.writeReport(reportValues112);
        String[] reportValues2 = {"Action - Import and chat with optional message added successfully - Builder Page","Fail"};         
        reportObj.writeReport(reportValues2);
        log.info("An error occurred while editing actions");
    }
    
    //Navigating to Prospects to check message bubble feature
    
    try
    {
    	
    	Thread.sleep(8000);
    	
    	Browser.getInstance().findElement(By.xpath("//*[@id='CampBuildFixed']/div[1]/a[1]")).click();
    	
    	Thread.sleep(2500);
    	Actions actions = new Actions(Browser.getInstance());    
    	
    	//Clearing filter for CreatedBy column
    	
    	Thread.sleep(2500);
    	
    	WebElement menu = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[2]/span"));
		actions.moveToElement(menu);

		WebElement subMenu = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[2]/img"));
		actions.moveToElement(subMenu);
		actions.build().perform();
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[2]/img")).click();
    	 
		Thread.sleep(2500);
		
		Browser.getInstance().findElement(By.className("clearFilterClass")).click();
		
		Thread.sleep(4500);
		
		WebElement menu1 = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[1]/span"));
		actions.moveToElement(menu1);

		WebElement subMenu1 = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[1]/img"));
		actions.moveToElement(subMenu1);
		actions.build().perform();
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/thead/tr/th[1]/img")).click();
		
		//Applying Filter for Name column
		
		WebElement Filter = Browser.getInstance().findElement(By.xpath("//ul[contains(@id,'campaignNameFilters')]/li/input[1]"));
		Filter.sendKeys("Jeff's Test");
       	
    	Thread.sleep(3500);
    	Browser.getInstance().findElement(By.xpath("//ul[contains(@id,'campaignNameFilters')]/li/input[2]")).click();
    	    	      
        System.out.println("Filter applied successfully for Name Column");
    	    	
    	Thread.sleep(3500);    	  	
    	    	
    	WebElement Prospectslink = Browser.getInstance().findElement(By.xpath("//*[@id='allCampaignTable']/tbody/tr/td[5]/a"));
    	String count = Prospectslink.getText();
    	Prospectslink.click();
    	System.out.println("Prospects Link : " + count);
    	
    	Thread.sleep(3500);
    	
    	//searching in prospects page
    	
    	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'prospectSearchFocus')]//input[contains(@class,'amplifyInputFilterStyle')]")).sendKeys("Test");
    	
    	Thread.sleep(2500);
    	
    	WebElement invaliddata = Browser.getInstance().findElement(By.className("noRecordsStyle"));
    	
    	String nrc = invaliddata.getText();
    	
    	System.out.println(nrc);
    	
    	Thread.sleep(1500);
    	
    	Browser.getInstance().findElement(By.className("prospectSearchClose")).click();

    	//Searching valid records
    	
    	Thread.sleep(3500);	
    	
    	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'prospectSearchFocus')]//input[contains(@class,'amplifyInputFilterStyle')]")).sendKeys("Bob");
    	
    	Thread.sleep(4500);
    	
    	WebElement validdata = Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[3]/div/div/span"));
    	
    	String rc = validdata.getText();
    	
    	System.out.println(rc);
    	    	
    	Thread.sleep(4500);
    	
    	//Actions actions = new Actions(Browser.getInstance());
		WebElement menu11 = Browser.getInstance().findElement(By.className("hideProspectTranscript"));
		actions.moveToElement(menu11);

		WebElement subMenu11 = Browser.getInstance().findElement(By.className("hideProspectTranscript"));
		actions.moveToElement(subMenu11);
		actions.build().perform();
		Thread.sleep(2500);
				    	
    	Browser.getInstance().findElement(By.className("hideProspectTranscript")).click();
    	
    	Thread.sleep(3500);
    	
    	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'transcriptModalSytle')]/span[1]")).click();
    	
    	System.out.println("Import Transcript successfully opened/closed");
    	
    	 ReportGenerator reportObj = new ReportGenerator();
         String[] reportValues1 = {"Import Transcript modal successfully enabled/disabled","Pass"};
         reportObj.writeReport(reportValues1);
         
         String[] reportValues2 = {"Searching prospects with valid/invalid record","Pass"};
         reportObj.writeReport(reportValues2);
         
         String[] reportValues3 = {"Filter applied successfully for Keyword-Name column","Pass"};
         reportObj.writeReport(reportValues3);
         
         log.info("Import Transcript modal/search  successfully enabled/disabled");    	   
    	
    }
    catch (Exception e)
    {
    	e.printStackTrace();
    	ReportGenerator reportObj = new ReportGenerator();
        String[] reportValues1 = {"Import Transcript modal successfully enabled/disabled","Fail"};
        reportObj.writeReport(reportValues1);
        String[] reportValues2 = {"Searching prospects with valid/invalid record","Fail"};
        reportObj.writeReport(reportValues2);
        String[] reportValues3 = {"Filter applied successfully for Keyword-Name column","Fail"};
        reportObj.writeReport(reportValues3);
        log.info("An error occurred while importing/searching Transcript modal");
    }
    
}
   
}    