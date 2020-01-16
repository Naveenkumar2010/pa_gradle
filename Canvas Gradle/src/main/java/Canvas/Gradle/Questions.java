 package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Questions 
{
	static Logger log = Logger.getLogger(Questions.class.getName());
	
	public void Question() throws InterruptedException, IOException
	{
		log.info("Invoking Questions Class");

		//Navigate to Library-Questions
		try
		{
			Thread.sleep(5500);
			//Actions action = new Actions(Browser.getInstance());
			//WebElement e = Browser.getInstance().findElement(By.id("libraryAnchor"));
			//action.moveToElement(e).build().perform();
			//Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/nav/ul/li[3]/a")).click();
			Thread.sleep(2500);
			
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title " + title);
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Questions Library","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Questions Library");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Questions Library","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to Questions Library");
		}
        
        //Adding Collections in Questions
        try
        {
        	Thread.sleep(6500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[1]/a")).click();
        	Thread.sleep(3500);
        	Browser.getInstance().findElement(By.id("name")).sendKeys("Test Questions");
        	
        	//Checking Unsaved Collection.
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-collection']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel");
        	
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-collection']/div/div[1]/button")).click();
        	
               	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking esacpe-ok");
        	
        	Thread.sleep(4500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[1]/a")).click();
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.id("name")).sendKeys("Test Questions");
        	
          	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok");
        	
        	Thread.sleep(5500);
        	
        	//Adding Collections
        	
        	//Browser.getInstance().findElement(By.className("add-collection-btn")).click();
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[1]/a")).click();
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.id("name")).sendKeys("Test Questions");
        	
        	
        	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'popup-data')]/div[contains(@class,'botm-section')]/button")).click();
            Browser.getInstance().findElement(By.xpath("/html/body/div/div[1]/div/div[1]/a[1]"));
        
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Adding a Collection & Verifying Unsaved Changes to the Questions Library","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Adding a Collection to the Questions Library & Verifying Unsaved Changes");
        }
        catch(Exception e)
        {
        	e.printStackTrace();   
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Adding a Collection to the Questions Library & Verifying Unsaved Changes","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error occurred while adding a Collection to the Questions Library & Verifying Unsaved Changes");
        }
        
        //Editing Collections
        try
        {
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[2]/div")).click();
        	Thread.sleep(2500);        
        	WebElement Edit = Browser.getInstance().findElement(By.id("editname"));
        	Edit.clear();
        	Edit.sendKeys("Test Edit Collection");
        	Thread.sleep(2500);
        	
        	//Checking Unsaved Collection
        	
       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='edit-collection']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking escape-cancel");
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='edit-collection']/div/div[1]/button")).click();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking close-ok");
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//li/a[contains(text(),'Test Questions')]/parent::*//div")).click();
        	Thread.sleep(2500);        
        	WebElement Edit1 = Browser.getInstance().findElement(By.id("editname"));
        	Edit1.clear();
        	Edit1.sendKeys("Test Edit Collection");
        	
        	Thread.sleep(2500);
        	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[2]/div")).click();
        	Thread.sleep(2500);        
        	WebElement Edit2 = Browser.getInstance().findElement(By.id("editname"));
        	Edit2.clear();
        	Edit2.sendKeys("Test Edit Collection");
        	
        	Thread.sleep(500);
        	      	       	       	
            Browser.getInstance().findElement(By.xpath("//*[@id='edit-collection']/div/div[2]/div[2]/button")).click();
        	
        	
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Editing a collection in the Questions Library & Verifying Unsaved Changes","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Editing a collection in the Questions Library & Verifying Unsaved Changes");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Editing a collection in the Questions Library & Verifying Unsaved Changes","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error ocurred while editing a collection in the Questions Library & Verifying Unsaved Changes");
        }
        
        //Adding Questions
        try
        {
        	Thread.sleep(4500);
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[2]/a")).click();
        	Thread.sleep(2500);		
        	WebElement Collection = Browser.getInstance().findElement(By.className("Title"));
        	Collection.isEnabled();
        	Thread.sleep(2500);
        	String descriptionText = Collection.getText();
        	System.out.println(descriptionText + '\n');
		
        	if(descriptionText.contentEquals("No questions yet!"))
        	{
        		Thread.sleep(2500);
        		Browser.getInstance().findElement(By.xpath("//*[@id='no-question']/div/p/a")).click();
        	}
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.id("body")).sendKeys("Question to Test");       	       	                                            
               	
        	
        	//Checking Unsaved Edits
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-question']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add question modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add question modal by clicking escape-cancel");
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-question']/div/div[1]/button")).click();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add question modal by clicking close-ok");
        	
        	Thread.sleep(4500);
        	
        	WebElement Collection1 = Browser.getInstance().findElement(By.className("Title"));
        	Collection1.isEnabled();
        	Thread.sleep(2500);
        	String descriptionText1 = Collection1.getText();
        	System.out.println(descriptionText1 + '\n');
		
        	if(descriptionText.contentEquals("No questions yet!"))
        	{
        		Thread.sleep(2500);
        		Browser.getInstance().findElement(By.xpath("//*[@id='no-question']/div/p/a")).click();
        	}
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.id("body")).sendKeys("Question to Test");
        	       	                                            
            Thread.sleep(2500);
        	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	                    
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add question modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
        	
        	//Adding Question
        	
        	WebElement Collection2 = Browser.getInstance().findElement(By.className("Title"));
        	Collection2.isEnabled();
        	Thread.sleep(2500);
        	
        	String descriptionText2 = Collection2.getText();
        	System.out.println(descriptionText2 + '\n');
		
        	Thread.sleep(3500);
        	if(descriptionText.contentEquals("No questions yet!"))
        	{
        		Browser.getInstance().findElement(By.xpath("//*[@id='no-question']/div/p/a")).click();
        	}
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.id("body")).sendKeys("Question to Test");
        	
        	Thread.sleep(3500);
        	       	                                            
        	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'popup-data')]/div[contains(@class,'botm-section')]/button[contains(@class,'saveButn')]")).click();
        	
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.className("share-can-btn")).click();
        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.id("body")).sendKeys("Question to test adding by clicking Add Question button");
        	
        	//Adding Merge Tags to the Questions:
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-question']/div/div[2]/div[2]/span")).click();
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='quesMsgMergeTags']/div/div[2]/span")).click();
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-question']/div/div[2]/div[2]/span")).click();
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='quesMsgMergeTags']/div/div[8]/span")).click();
        	
        	Thread.sleep(3500);
        	
        	System.out.println("Merge Tags sucessfully added into questions");
        	
        	//Browser.getInstance().findElement(By.xpath("//*[@id='add-question']/div/div[2]/div[2]/button[2]")).click();
        	       	                                            
        	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'popup-data')]/div[contains(@class,'botm-section')]/button[contains(@class,'saveButn')]")).click();
				
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Adding a question to the collection & Verifying Unsaved Changes","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Adding a question to the collection & Verifying Unsaved Changes");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Adding a question to the collection & Verifying Unsaved Changes","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error occurred while adding a question to the collection & Verifying Unsaved Changes");
        }
		
	    //Editing a Question
        try
        {
        	Thread.sleep(2500);	
        	//Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/ul[2]/li[contains(text(),'Question to Test')]")).click();
        	Browser.getInstance().findElement(By.xpath("//*[@id='view_collection']/div/ul[2]/li[2]")).click();
        	Thread.sleep(2500); 
        	WebElement QuesEdit = Browser.getInstance().findElement(By.id("editbody"));
        	QuesEdit.clear();		
        	QuesEdit.sendKeys("Editing Question to Test");
        	
        	//Checking Unsaved Changes
        	        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='edit-question']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in edit question modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add question modal by clicking escape-cancel");
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='edit-question']/div/div[1]/button")).click();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in edit question modal by clicking close-ok");
        	
        	Thread.sleep(2500);
        	
        	WebElement Collection1 = Browser.getInstance().findElement(By.className("Title"));
        	Collection1.isEnabled();
        	Thread.sleep(2500);
        	String descriptionText1 = Collection1.getText();
        	System.out.println(descriptionText1 + '\n');
		
        	Browser.getInstance().findElement(By.xpath("//*[@id='view_collection']/div/ul[2]/li[2]")).click();
        	Thread.sleep(2500); 
        	WebElement QuesEdit1 = Browser.getInstance().findElement(By.id("editbody"));
        	QuesEdit1.clear();		
        	QuesEdit1.sendKeys("Editing Question to Test");
        	
            Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in edit question modal by clicking escape-ok");        	
           	             	             	
        	Thread.sleep(3500);
        	
        	//Editng Question
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='view_collection']/div/ul[2]/li[2]")).click();
        	Thread.sleep(2500); 
        	WebElement QuesEdit2 = Browser.getInstance().findElement(By.id("editbody"));
        	QuesEdit2.clear();		
        	QuesEdit2.sendKeys("Editing Question to Test");
        	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'edit-resource-input')]/div[contains(@class,'botm-section')]/button")).click();
        	
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Editing a question in the collection & Verifying Unsaved Changes","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Editing a question in the collection & Verifying Unsaved Changes");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Editing a question in the collection & Verifying Unsaved Changes","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error occurred while Editing a question in the collection & Verifying Unsaved Changes");
        }
        
        //Deleting a Question
        try
        {
        	      	
        	Thread.sleep(4500);
        	
        	WebElement radiobutton = Browser.getInstance().findElement(By.id("checkBoxJob"));
		    radiobutton.isSelected();
		    radiobutton.click();
		    
		    Thread.sleep(2500);
			
		    Browser.getInstance().findElement(By.xpath("//*[@id='sub-menu']/a/span")).click();
		    
		    Thread.sleep(2500);
		    Browser.getInstance().findElement(By.cssSelector(".add-comment-can.hand-cursor")).click();
			
		    Thread.sleep(1500);
		    
		    Browser.getInstance().findElement(By.xpath("//*[@id='deleteQuestionBulk_confirm']/div/div[2]/button")).click();
		        
        	
        
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Deleting a question from the collection using Bulk Operation","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Deleting a question from the collection using bulk operation");

        	Thread.sleep(2500);
        	Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/ul/li[1]/a")).click();        	
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Deleting a question from the collection using bulk operation","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error occurred while deleting a question from the collection using bulk operation");
        }
        
        //Deleting Collections
        try
        {
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[2]/div")).click();        
        	Thread.sleep(2500);        
        	Browser.getInstance().findElement(By.className("delete-collection")).click();
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='deleteQuestionCollection_confirm']/div/div[2]/button")).click();	    
	    
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Deleting a collection from the Questions Library","Pass"};
        	reportObj.writeReport(reportValues);
        	log.info("Deleting a collection from the Questions Library");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	Browser.getInstance().navigate().refresh();
        	ReportGenerator reportObj = new ReportGenerator();
        	String[] reportValues = {"Deleting a collection from the Questions Library","Fail"};
        	reportObj.writeReport(reportValues);
        	log.error("An error occurred while deleting a collection from the Questions Library");
        }
       
        
	}
}

