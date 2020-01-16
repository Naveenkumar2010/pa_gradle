package Canvas.Gradle;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Resources 
{
	static Logger log = Logger.getLogger(Resources.class.getName());
	
	public void resources() throws InterruptedException, AWTException, IOException
	{
		log.info("Invoking Resources class");
		
		//Navigating to Resources Page
		try
		{
			Thread.sleep(2500);
			Actions action = new Actions(Browser.getInstance());
			WebElement e = Browser.getInstance().findElement(By.id("libraryAnchor"));
			action.moveToElement(e).build().perform();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.id("libraryAnchor")).click();
			Thread.sleep(3500);
			WebElement e1 = Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/a[2]"));
			action.moveToElement(e1).build().perform();
			Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/a[2]")).click();			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Resources Library page","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Navigating to Resources Library page");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Navigating to Resources Library page","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while navigating to Resources Library page");
		}
		
		//Adding Collection in Resources Library Page
		try		
		{
			Thread.sleep(2500);														
			Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[1]/a")).click();
			Thread.sleep(1500);		
			Browser.getInstance().findElement(By.id("resourcename")).sendKeys("Test Collection");
			Thread.sleep(1500);		
			
			//Unsaved Changes
			Browser.getInstance().findElement(By.xpath("//*[@id='add-resource-collection']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	      	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape cancel");
        	
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='add-resource-collection']/div/div[1]/button")).click();
        	
               	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking esacpe-ok");
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//div[contains(@class,'search-filter-panel')]/a")).click();
			Thread.sleep(1500);		
			Browser.getInstance().findElement(By.id("resourcename")).sendKeys("Test Collection");
        	
          	
        	Actions action1 = new Actions(Browser.getInstance());
        	action1.sendKeys(Keys.ESCAPE).build().perform();
        	
            Thread.sleep(3500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[2]/input")).click(); //Ok
        	
        	System.out.println("Checking Unsaved changes in add collection modal by clicking escape-ok");
        	
        	Thread.sleep(2500);
			
        	//Adding collection
        	
        													
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'search-filter-panel')]/a")).click();
			Thread.sleep(1500);		
			Browser.getInstance().findElement(By.id("resourcename")).sendKeys("Test Collection");
        	
			
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'popup-data')]/div[contains(@class,'botm-section')]/button")).click();
		
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding collection to the Resources Library & Verifying Unsaved Changes","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Adding collection to the resources library");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding collection to the Resources Library","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while adding collection to the resources library");
			
		}
			
		//Adding Resources to the collection
		try
		{
			Thread.sleep(5500);					
			WebElement Res = Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[2]/a"));
			Res.isEnabled();
			Res.click();
			Thread.sleep(2500);
			
			WebElement Resource = Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/div/h3"));
			Resource.isEnabled();
			Thread.sleep(2500);
			String Resourcetext = Resource.getText();
			if(Resourcetext.contentEquals("No resources yet!"))
			{				                                            
				Browser.getInstance().findElement(By.xpath("//*[@id='no-resource']/div/p/a")).click();				
			}		
			else
			{
				Browser.getInstance().findElement(By.className("share-can-btn")).click();
			}	
			Thread.sleep(2500);
			
		
			Actions action = new Actions(Browser.getInstance());
			action.sendKeys(Keys.PAGE_DOWN).perform();
			
			Thread.sleep(2500);
			
			
			Browser.getInstance().findElement(By.id("addFile")).click();
			
			Thread.sleep(4500);
			Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");		
					
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding resource to the collection","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Adding resource to the collection");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding resource to the collection","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while adding resource to the collection");
		}
		 
		
		//Edit and save Resources in a collection
		try
		{
			Thread.sleep(8000);
			
			////Checking Unsaved Editing
			
			Browser.getInstance().findElement(By.xpath("//*[@id='add-resource']/div/div[1]/button")).click();
        	
        	Thread.sleep(2500);
        	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); // Cancel
        	
        	System.out.println("Checking Unsaved changes in edit resource modal by clicking close-cancel");
        	
        	
        	Thread.sleep(2500);
        	
        	Actions action = new Actions(Browser.getInstance());
        	action.sendKeys(Keys.ESCAPE).build().perform();
        	
        	       	
        	Browser.getInstance().findElement(By.xpath("//*[@id='unsaved_confirmation_modal']/div/div[1]/input")).click(); //Escape Canel
        	
        	Thread.sleep(2500);
        	
        	System.out.println("Checking Unsaved changes in edit resource modal by clicking escape-cancel");		
						
			//Thread.sleep(2500);														
			//Browser.getInstance().findElement(By.xpath("//*[@id='editdescription']")).click();
			//Thread.sleep(3500);
			//Browser.getInstance().findElement(By.xpath("//*[@id='description']/textarea")).sendKeys("Editing description of the resource");
			
			//Adding Merge Tags to the Resouce
        	Thread.sleep(4500);
								
			Browser.getInstance().findElement(By.xpath("//*[@id='add-resource']/div/div[2]/div[4]/span")).click();
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='resMsgMergeTags']/div/div[2]/span")).click();
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='add-resource']/div/div[2]/div[4]/span")).click();
			Thread.sleep(1500);
			Browser.getInstance().findElement(By.xpath("//*[@id='resMsgMergeTags']/div/div[5]/span")).click();
			Thread.sleep(2500);
			System.out.println("Merge Tags sucessfully added into the Resource");
			
			Thread.sleep(4500);			
			//Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[4]/div/div[2]/div[2]/div[2]/button")).click();
			
			WebElement Save = Browser.getInstance().findElement(By.xpath("//*[@id='add-resource']/div/div[2]/div[4]/button[2]"));
			Thread.sleep(4500);
			Save.isEnabled();			
			Save.click();	
						
			//Open Resource view in modal:
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='view_collection']/div/ul[2]/li[7]/a/img")).click();
			
			Thread.sleep(4500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='previewDocModal']/span")).click();
			
			System.out.println("Sucessfully previewed the resource via modal");
			
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Editing resources in a collection & Verifying Unsaved Changes","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Editing resources in a collection & Verifying Unsaved Changes");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Editing resources in a collection & Verifying Unsaved Changes","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while editing resources in a collection & Verifying Unsaved Changes");
		}
		
		//Delete Resource
		try
		{
			Thread.sleep(2500);														
			Browser.getInstance().findElement(By.xpath("//*[@id='view_collection']/div/ul[2]/li[8]/a/span")).click();
			Thread.sleep(3500);							
			Browser.getInstance().findElement(By.xpath("//*[@id='view_collection']/div/ul[2]/li[8]/div/div/a")).click();
			//Browser.getInstance().findElement(By.className("delete-collection")).click();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//*[@id='deleteResource_confirm']/div/div[2]/button")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a resource from a collection","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Deleting a resource from a collection");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a resource from a collection","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while deleting a resource from a collection");
		}
			    
		//Delete Resource Collection
		try
		{
			Thread.sleep(5500);				
			Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[1]/a")).click();
			Thread.sleep(2500);
			Browser.getInstance().findElement(By.xpath("//li/a[contains(text(),'Test Collection')]/parent::*//div")).click();
			Thread.sleep(3500);
			Browser.getInstance().findElement(By.className("delete-collection")).click();
			Thread.sleep(3500);
			
			Browser.getInstance().findElement(By.xpath("//*[@id='deleteResourceCollection_confirm']/div/div[2]/button")).click();
			
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a collection from Resources Library","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Deleting a collection from resources library");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Deleting a collection from Resources Library","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while deleting a collection from resources library");
		}
		
		//Adding Collection in Resources Library Page to Bulk Delete :
		try		
		{
			Thread.sleep(3500);														
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'search-filter-panel')]/a")).click();
			Thread.sleep(1500);		
			Browser.getInstance().findElement(By.id("resourcename")).sendKeys("Bulk Delete Collection");
			Thread.sleep(1500);		
			Browser.getInstance().findElement(By.xpath("//div[contains(@class,'popup-data')]/div[contains(@class,'botm-section')]/button")).click();
		
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding collection to the Resources Library","Pass"};
			reportObj.writeReport(reportValues);
			log.info("Adding collection to the resources library");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Browser.getInstance().navigate().refresh();
			ReportGenerator reportObj = new ReportGenerator();
			String[] reportValues = {"Adding collection to the Resources Library","Fail"};
			reportObj.writeReport(reportValues);
			log.error("An error occurred while adding collection to the resources library");
			
		}
		
		
		//Adding Resources to the collection
	  try
	   {
					Thread.sleep(5500);					
					WebElement Res = Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[1]/a"));
					Res.isEnabled();
					Res.click();
					Thread.sleep(2500);
				
					WebElement Resource = Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/div/h3"));
					                                                                
					Resource.isEnabled();
					Thread.sleep(2500);
					String Resourcetext = Resource.getText();
					if(Resourcetext.contentEquals("No resources yet!"))
					{				                                            
						Browser.getInstance().findElement(By.xpath("//*[@id='no-resource']/div/p/a")).click();				
					}		
					else
					{
						Browser.getInstance().findElement(By.className("share-can-btn")).click();
					}	
					Thread.sleep(2500);
					
					Browser.getInstance().findElement(By.id("addFile")).click();
					
					Thread.sleep(4500);
					Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");
														
					Thread.sleep(4500);
										
					Browser.getInstance().findElement(By.cssSelector(".button-blue.ng-binding")).click();
					
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Adding resource to the collection for Bulk operation","Pass"};
					reportObj.writeReport(reportValues);
					log.info("Adding resource to the collection for Bulk operation");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Browser.getInstance().navigate().refresh();
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Adding resource to the collection for Bulk operation","Fail"};
					reportObj.writeReport(reportValues);
					log.error("An error occurred while adding resource to the collection");
				}
		//Saving another file : 
				
				try
				{
					Thread.sleep(5500);	
					
			     	Browser.getInstance().findElement(By.id("addFile")).click();
			     	
			     	Thread.sleep(4500);
					Runtime.getRuntime().exec("D:\\AngularAutomation\\FileUpload\\ResourceUpload.exe");
			     										
					Thread.sleep(2500);
									
					Browser.getInstance().findElement(By.xpath("//*[@id='add-resource']/div/div[2]/div[4]/button[2]")).click();
					
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Adding resource to the collection for Bulk operation","Pass"};
					reportObj.writeReport(reportValues);
					log.info("Adding resource to the collection for Bulk operation");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Browser.getInstance().navigate().refresh();
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Adding resource to the collection","Fail"};
					reportObj.writeReport(reportValues);
					log.error("An error occurred while adding resource to the collection for Bulk operation");
				}
				
				
				
				//Bulk Delete
				
				try{
		            Thread.sleep(1500);
				    WebElement radiobutton = Browser.getInstance().findElement(By.id("checkBoxJob"));
				    radiobutton.isSelected();
				    radiobutton.click();
				
				    Thread.sleep(1500);
				
				    Browser.getInstance().findElement(By.xpath("//*[@id='sub-menu']/a/span")).click();
				
				    Browser.getInstance().findElement(By.cssSelector(".add-comment-can.hand-cursor")).click();				
				    Thread.sleep(2500);
				
				    Browser.getInstance().findElement(By.xpath("//*[@id='deleteResourceBulk_confirm']/div/div[2]/button")).click();			
				 
				    ReportGenerator reportObj = new ReportGenerator();
				    String[] reportValues = {"Bulk Deleting resource to the collection","Pass"};
				    reportObj.writeReport(reportValues);
				    log.info("Bulk Deleting resource to the collection");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Browser.getInstance().navigate().refresh();
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Bulk Deleting resource to the collection","Fail"};
					reportObj.writeReport(reportValues);
					log.error("An error occurred while Bulk Deleting  resource to the collection for Bulk operation");
					
				}
				
				//Deleting Collection 
				
				try
				{
					Thread.sleep(5500);				
					Browser.getInstance().findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/ul/li[1]/a")).click();
					Thread.sleep(2500);
					Browser.getInstance().findElement(By.xpath("//*[@id='collection-content']/div/div[2]/ul/li[1]/div")).click();
					Thread.sleep(3500);
					Browser.getInstance().findElement(By.className("delete-collection")).click();
					Thread.sleep(3500);
					Browser.getInstance().findElement(By.xpath("//*[@id='deleteResourceCollection_confirm']/div/div[2]/button")).click();
					
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Deleting a collection from Resources Library","Pass"};
					reportObj.writeReport(reportValues);
					log.info("Deleting a collection from resources library");
				}
				catch(Exception e)
				{
					e.printStackTrace();
					Browser.getInstance().navigate().refresh();
					ReportGenerator reportObj = new ReportGenerator();
					String[] reportValues = {"Deleting a collection from Resources Library","Fail"};
					reportObj.writeReport(reportValues);
					log.error("An error occurred while deleting a collection from resources library");
				}
				
				
	}
	
}
