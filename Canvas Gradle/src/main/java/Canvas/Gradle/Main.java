package Canvas.Gradle;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.log4j.Logger;

public class Main 
{
	//static Logger log = Logger.getLogger(Main.class.getName());
	
   
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	
	{
		//Login.info("Execution started");
		
		ReportGenerator reportObj = new ReportGenerator();
		reportObj.createReport();
		
		//For Login
		  Login log=new Login();
		  log.login();
		  
	/*	//For Canvasbot
		  Amplify inout = new Amplify();
		  inout.Bot();
	 	 
		//For Keyword Bot
		  Keyword out = new Keyword();
		  out.outbound();
		  
		//For WebBot
		  WebBot WB = new WebBot();		  
		  WB.wedBot();
		
		//New CandidatesPage
		  Candidates_V1 search1 = new Candidates_V1();
		  search1.searchfield1();
		  
		//Candidates V2
		 Candidates_V2 candidate2 = new Candidates_V2();
		 candidate2.candidate2();
		  
		//For Team Feature
		  Team TF = new Team();
		  TF.TeamFeature();
		 								
	    //For ChatClass		
		  Chat Chatfunctionality = new Chat();
		  Chatfunctionality.chat();
	    		
		//Message History
		  RightNav_Features historyfunction = new RightNav_Features();
		  historyfunction.History();
		 		  		  	
		//Question Page
		  Questions Ques = new Questions();
		  Ques.Question();
			
		//Resources Page
	      Resources Res = new Resources();
	      Res.resources();
	      
	   //Message Pagec
		  Message AddMessage = new Message();
		  AddMessage.Messages();
		
	    //Job Page
	      ManageJob JobDetails = new ManageJob();
	      JobDetails.JobPage();

	    //Tags Page
	      Tags TagDetails = new Tags();
	      TagDetails.TagsPage();
	    
	    //Imports Page
	      Imports imp = new Imports();
	      imp.ImportsPage();
		
		//Preference Page		
		  Preference OOO = new Preference();
	      OOO.PreferencePage();
	      
	    //Analytics Page
	      Analytics Team = new Analytics();
	      Team.team();
										
	    //Coach Mode
	      CoachMode coach = new CoachMode();
	      coach.coachMode();      
	    		
		//For Logout		
	      Logout logoutfunctions = new Logout();
	      logoutfunctions.logout();
	    
	    Main.log.info("Execution completed");*/
	 }
}
