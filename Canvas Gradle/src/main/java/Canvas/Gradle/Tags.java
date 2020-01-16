package Canvas.Gradle;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tags {

static Logger log = Logger.getLogger(Tags.class.getName());
	
	public void TagsPage()  throws InterruptedException, IOException 
	{
		log.info("Invoking ManageTag class");
		//Navigating to Tag-Page
		try
		{
			Thread.sleep(3500);
			Actions action = new Actions(Browser.getInstance());
			WebElement elem = Browser.getInstance().findElement(By.className("settings-icon"));
			action.moveToElement(elem).build().perform();
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.className("settings-icon")).click();
			Thread.sleep(5500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/ol/li[2]/a")).click();
			Thread.sleep(2500);
			String title = Browser.getInstance().getTitle();
			System.out.println("Browser Title " + title);
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Tags page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to tag page");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Tag page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to tag page");
		}
		
		//Navigating to All-Candiates page by clicking tag count.
		
		try
		{
			//Navigating to Mine View
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/ul/li[2]")).click();
			
			Thread.sleep(3500);
			WebElement tagcount = Browser.getInstance().findElement(By.xpath("//*[@id='tag-content']/div[2]/div/ul[2]/li[4]/a"));
			tagcount.isSelected();
			String count = tagcount.getText();
			System.out.println("tag Count : " + count + '\n');
			tagcount.click();

			Thread.sleep(4500);
								
			Actions action1 = new Actions(Browser.getInstance());
			WebElement elem1 = Browser.getInstance().findElement(By.className("settings-icon"));
			action1.moveToElement(elem1).build().perform();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.className("settings-icon")).click();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/ol/li[2]/a")).click();
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Candidates Page by clicking tag count page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Candidates Page by clicking tag count page");
		    
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Candidates Page by clicking tag count page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to Candidates Page by clicking tag count page");
		}
				
	//Adding tag
		try
		{
			
			Thread.sleep(2500);														
			
			Browser.getInstance().findElement(By.xpath("//*[@id='tag-content']/div[1]/button")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("newTag_name")).sendKeys("TestTagName");
			
			//Checking Unsaved Collection.
	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-tag']/div/div[1]/button")).click();
        	        	        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel");
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel");
        	
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-tag']/div/div[1]/button")).click();
        	
               	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking cancel-ok");
        	
        	Thread.sleep(2500);
        	
   
        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/div[3]/div[1]/button")).click();
        	
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("newTag_name")).sendKeys("TestTagName");
        	
          	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	           
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
        	     
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding a Tag & Unsaved Edits in Mine View","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Checking Unsaved Edits");
		}
		catch(Exception e)
		{
			e.printStackTrace();	
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding a Tag & Unsaved Edits in Mine View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while adding a tag & Unsaved Edits");
		}
	    
		//Adding Tag
		
		try {
			
			Thread.sleep(4500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/div[3]/div[1]/button")).click();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("newTag_name")).sendKeys("TestTagName");
			
			Thread.sleep(3500);
			
			WebElement SavingTag = Browser.getInstance().findElement(By.xpath("//*[@id='add-tag']/div/div[2]/div[2]/button[2]"));
			SavingTag.isSelected();
			SavingTag.click();
			
			Thread.sleep(2500);
			
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding a Tag in Mine View","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Tags Added Sucessfully");
			
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();	
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding a Tag in Mine View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while adding a tag");
		}
		
		
	    //Search tag
		try
		{
			Thread.sleep(5500);
			Browser.getInstance().findElement(By.id("findTags")).clear();
			Browser.getInstance().findElement(By.id("findTags")).sendKeys("TestTagName");
			Thread.sleep(2500);
			WebElement e = Browser.getInstance().findElement(By.xpath("//*[@id='tag-content']/div[2]/div/ul[2]/li[1]"));
			String value = e.getText();
	  	    System.out.println(value);
			if (value.equals("TestTagName"))                          
			{
				ReportGenerator reportObj = new ReportGenerator();
				String[] reportValues = {"Searching a Tag in Mine View","Pass"};
				reportObj.writeReport(reportValues);
				log.info("Searching a tag");
				
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();	
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Searching a tag in Mine View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while searching a tag");
		}
	    		         
	    //Editing tag
		try
		{			
			//Navigating to All View
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/ul/li[1]")).click();
			
			Thread.sleep(3500);		
			
			Browser.getInstance().findElement(By.id("findTags")).clear();
			Browser.getInstance().findElement(By.id("findTags")).sendKeys("TestTagName");
			
			Thread.sleep(5500);	
						
			Browser.getInstance().findElement(By.xpath("//*[@id='tag-content']/div[2]/div/ul[2]/li[1]")).click();
			
			WebElement tag = Browser.getInstance().findElement(By.id("editTag_name"));
			tag.clear();
			tag.sendKeys("Editing Tag Name");
			
			//Checking Unsaved Collection
        		       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='edit-tag']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking close-cancel");
        	        	       	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	              	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking escape-cancel");
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='edit-tag']/div/div[1]/button")).click();
        	        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking close-ok");
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/div[3]/div[2]/div/ul[2]/li[1]")).click();
						
			WebElement tag1 = Browser.getInstance().findElement(By.id("editTag_name"));
			tag1.clear();
			tag1.sendKeys("Editing Tag Name");
        	
        	Thread.sleep(2500);
        	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();        	
                 	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in edit collection modal by clicking escape-ok");     	      
        	
        	Thread.sleep(2500);
	  		
				
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Editing a tag & Unsaved Edits in All View","Pass"};
			log.info("Editing a tag & Unsaved Edits");
			reportObj.writeReport(reportValues);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			Browser.getInstance().findElement(By.id("findTags")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Editing a tag & Unsaved Edits in All View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while editing a tag & Unsaved Edits");
		}
		
		
	//Editing the Tag	
		try 
		{
			Thread.sleep(2500);
			
			Browser.getInstance().findElement(By.id("findTags")).clear();
			Browser.getInstance().findElement(By.id("findTags")).sendKeys("TestTagName");
			
			
			Thread.sleep(5500);
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/div[3]/div[2]/div/ul[2]/li[1]")).click();
			
			//*[@id='tag-content']/div[2]/div/ul[2]/li[1]
			
			WebElement tag2 = Browser.getInstance().findElement(By.id("editTag_name"));
			tag2.clear();
			tag2.sendKeys("Editing Tag Name");
			
			Thread.sleep(3500);
						
			WebElement Savetag = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/div[5]/div/div[2]/div[2]/button"));
			Savetag.isSelected();
			Savetag.click();
			
			Thread.sleep(5500);			
			
			Browser.getInstance().findElement(By.id("findTags")).clear();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Tags Edited Sucessfully in All View","Pass"};
			log.info("Tags Edited Sucessfully");
			reportObj.writeReport(reportValues);
		}
		catch (Exception e) {
			
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			Browser.getInstance().findElement(By.id("findTags")).clear();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Tags Edited Sucessfully in All View","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while editing a tag");
		}
		
	    //Deleting tag
		try
		{
			//Navigating to Mine View
			
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[1]/ul/li[2]")).click();
			
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("findTags")).sendKeys("Editing Tag Name");
			Thread.sleep(7000);
			Browser.getInstance().findElement(By.xpath("//*[@id='tag-content']/div[2]/div/ul[2]/li[5]/div/img")).click();
			Thread.sleep(4500);
			//Browser.getInstance().findElement(By.className("YES")).click();	
			
			Browser.getInstance().findElement(By.xpath("//*[@id='tag-content']/div[2]/div/ul[2]/li[5]/div/div/span/span[4]")).click();
			
			Browser.getInstance().findElement(By.id("findTags")).clear();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a tag in Mine View","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Deleting a tag");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a tag","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while deleting a tag");
		}
	}


	
}
