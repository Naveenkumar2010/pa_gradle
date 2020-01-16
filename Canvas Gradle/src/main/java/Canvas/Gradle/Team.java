package Canvas.Gradle;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Team {
	
	static Logger log = Logger.getLogger(Amplify.class.getName());
	   
    public void TeamFeature() throws IOException, InterruptedException   
        
{

   try {
	
	    //Selecting Team from Candidates page dropdown
	    Thread.sleep(6500);	
	    Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[2]/ul/li[2]")).click();
	    Thread.sleep(4500);
	    
	    
	    //Selecting Team value from dropdown	    
	    WebElement TN = Browser.getInstance().findElement(By.xpath("//*[@id='mineCandidateID']/li[2]/span/a"));
	    String name = TN.getText();
	    TN.click();
	    
	    
	    System.out.println("Team Name : " + name);
	    
	    Thread.sleep(4500);
	    
	    //List of Team Members:   
	   
	    List<WebElement> listElement = Browser.getInstance().findElements(By.xpath("//*[@id='wrap']/div[1]/div[2]/div[5]/div[1]/candidate-listingall/div[1]/table/tbody/tr[contains(@class,'reducePaddingClass')]/td[contains(@class,'wrap')][3]/span"));
	    for(int i=0;i<listElement.size();i++) {
	    String elementText = listElement.get(i).getText(); 
	    System.out.println("Team Members Name :  " +elementText + '\n'); 
	   }
	    Thread.sleep(4000);
	    
	    //Navigating to Candiate Page by clicking row
	    Browser.getInstance().findElement(By.id("chatAnchor")).click();
	    
	    Thread.sleep(5500);
	    
	    Browser.getInstance().findElement(By.xpath("//*[@id='chatLeftnavInboxDetails']/li[2]/span[2]/span[1]")).click();
	    
	    System.out.println("Navigating to Chat page - with Team Name selected on the left nav.");
	    
	    Thread.sleep(4500);
	    
	    Browser.getInstance().findElement(By.xpath("//*[@id='leftsidecandidatebar']/li[2]/a")).click();
	    
	    Thread.sleep(4500);
	    
	    //Select Mine Again
	   // Browser.getInstance().findElement(By.xpath("//*[@id='chatLeftnavInboxDetails']/li[1]/span[2]/span[1]")).click();
	    
	    //Hovering on Mouse information
	    
	    Thread.sleep(1000);
	    
	    Actions actions = new Actions(Browser.getInstance());
		WebElement profile = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/li[6]/a"));
		actions.moveToElement(profile);
		actions.build().perform();
		
		WebElement Team = Browser.getInstance().findElement(By.xpath("//*[@id='wrap']/div[1]/div[1]/div[7]/div[39]/ul/div[2]/div[1]/ul/li[2]/a/span[3]"));
		actions.moveToElement(Team);
		actions.build().perform();
	    
		Thread.sleep(1000);
		
		WebElement TeamName = Browser.getInstance().findElement(By.xpath("//*[@id='chatLeftnavInboxDetails']/li[2]/span[2]/span[1]"));
		String Name = TeamName.getText();
		
		System.out.println("Team Name : " + Name);
		
		WebElement TeamNumber = Browser.getInstance().findElement(By.xpath("//*[@id='chatLeftnavInboxDetails']/li[2]/span[2]/span[2]"));
		String Number = TeamNumber.getText();
		
		
		System.out.println("Team Number : " + Number);
		
		System.out.println("Team Details printed successfully");
		
		//Navigating to Mine View by clicking Start chat option
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.className("teamChatDropDown")).click();
		
		Thread.sleep(4500);
		
		WebElement TeamName1 = Browser.getInstance().findElement(By.className("navChatCandidteName"));
				
		String TN1 = TeamName1.getText();
		System.out.println("Team Member Name " + TN1);
		
	
		Thread.sleep(4500);
		
		WebElement TeamView = Browser.getInstance().findElement(By.className("navChatCandidateView"));
		
		String TV = TeamView.getText();
		System.out.println("Team View " + TV);
		
		TeamView.click();
		
		System.out.println("Successfully navigated to Mine View");
		
		Thread.sleep(4500);
	    ReportGenerator reportObj = new ReportGenerator();
		String[] reportValues = {"Successfully selected Team from Mine Dropdown","Pass"};
		reportObj.writeReport(reportValues);
		String[] reportValues11 = {"Successfully printing Team Name & Team Members Name by hovering Profile Menu","Pass"};
		reportObj.writeReport(reportValues11);
		String[] reportValues1 = {"Navigated to Chat page and selecting Team Name on the left nav","Pass"};
		reportObj.writeReport(reportValues1);
		String[] reportValues2 = {"Navigating to Mine View by clicking Team helper dropdown","Pass"};
		reportObj.writeReport(reportValues2);
		log.info("Sucessfully tested some functionalities for Team Feature");
	    
       } 
       catch (Exception e) 
       {
	    e.printStackTrace();
		ReportGenerator reportObj = new ReportGenerator();
	    String[] reportValues = {"Successfully selected Team from Mine Dropdown","Fail"};
		reportObj.writeReport(reportValues);
		String[] reportValues11 = {"Successfully printing Team Name & Team Members Name by hovering Profile Menu","Fail"};
		reportObj.writeReport(reportValues11);
		String[] reportValues1 = {"Navigated to Chat page and selecting Team Name on the left nav","Fail"};
		reportObj.writeReport(reportValues1);
		String[] reportValues2 = {"Navigating to Mine View by clicking Team helper dropdown","Fail"};
		reportObj.writeReport(reportValues2);
		log.info("An error occurred while testing Team Feature functionalities");
	     
	         
       }
	
    //Archiving/Restarting  Team chat 
   
      try
      {
    	  
    	//Archiving chat
    	  

		Thread.sleep(5500);
		    
		Browser.getInstance().findElement(By.xpath("//li[contains(@id,'candidate')]/a[contains(@id,'candidateAnchor')]")).click();
    	
    	Thread.sleep(4000);
		WebElement TeamMine = Browser.getInstance().findElement(By.className("search-candidate-name"));
		TeamMine.isEnabled();
		TeamMine.sendKeys("Janine");
		TeamMine.sendKeys(Keys.ENTER);
		
		Thread.sleep(6500);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='candidateTablebody']/tr[3]/td[23]/div/a/span")).click();
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatsubmenu')]//div[contains(@class,'archieveClass')]")).click();
    	
		Thread.sleep(4000);
		
		Browser.getInstance().findElement(By.xpath("//*[@id='archiveAllCandi_confirm']/div/div[2]/button")).click();
		
        System.out.println("Team chat archived - Candidate level");
        
        //Navigating to Archived view
        
        Thread.sleep(4000);
        
        Browser.getInstance().findElement(By.className("dropdownPosDup")).click();
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.xpath("//*[@id='candidateTypeOptionsId']/li[4]/a")).click();
        
        Thread.sleep(3000);
		
		Browser.getInstance().findElement(By.xpath("//a[contains(@class,'startoverflow1')]/span")).click();
		
		
		Thread.sleep(4500);
		
		Browser.getInstance().findElement(By.xpath("//div[contains(@class,'chatsubmenu')]//div[contains(@class,'archieveClass')]")).click();
        
        System.out.println("Team Chat Restarted Sucessfully");
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/img")).click();
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.xpath("//*[@id='candidateTypeOptionsId']/li[3]/a")).click();
        
        //Global level Archive
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.id("OverAllCheck")).click();
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.xpath("//div[contains(@class,'startoverflow')]//a/span")).click();
        
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.id("restartArchiveId")).click();
        
        Thread.sleep(4500);
        Browser.getInstance().findElement(By.xpath("//*[@id='toggle_confirmation_modal']/div/div[2]/input")).click();
        
        System.out.println("Team Chat - Global Archived");
                
        Thread.sleep(12000);
        
        Browser.getInstance().findElement(By.xpath("//*[@id='candidateTableHead']/tr/th[2]/div/img")).click();
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.xpath("//ol[contains(@class,'bulkOptions')]//li[4]/a")).click();
        
        //Global level Restart
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.id("OverAllCheck")).click();
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.xpath("//div[contains(@class,'startoverflow')]//a/span")).click();
        
        
        Thread.sleep(4500);
        
        Browser.getInstance().findElement(By.id("restartArchiveId")).click();
        
        Thread.sleep(4500);
        Browser.getInstance().findElement(By.id("toggleConfirmsubmit")).click();        
                             
        System.out.println("Team Chat - Global Restarted");
        
        Browser.getInstance().navigate().refresh();
    	   	  
    	ReportGenerator reportObj = new ReportGenerator();
  		String[] reportValues = {"Team Chat Archved/Restarted - Candidate Individual Record","Pass"};
  		reportObj.writeReport(reportValues);
  		String[] reportValues11 = {"Team Chat Archved/Restarted - Using Global Overflow","Pass"};
  		reportObj.writeReport(reportValues11);
  		
  		log.info("Sucessfully tested archived/restart functionalities");
      }
      catch (Exception e) 
      {
	    e.printStackTrace();
	    ReportGenerator reportObj = new ReportGenerator();
  		String[] reportValues = {"Team Chat Archved/Restarted - Candidate Individual Record","Fail"};
  		reportObj.writeReport(reportValues);
  		String[] reportValues11 = {"Team Chat Archved/Restarted - Using Global Overflow","Fail"};
  		reportObj.writeReport(reportValues11);
  		
  		log.info("An error occurred while testing archived/restart functionalities");
	     
	         
      }
   
	
}
}
