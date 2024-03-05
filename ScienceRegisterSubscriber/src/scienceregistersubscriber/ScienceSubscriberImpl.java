package scienceregistersubscriber;

import java.util.List;
import java.util.Scanner;

import scienceregisterpublisher.Science;
import scienceregisterpublisher.SciencePublisher;

public class ScienceSubscriberImpl implements ScienceSubscriber {

	String input;
	private String science_ID;
	private String science_name;
	private String science_duration;
	private String science_grade;
	private String science_price;
	Scanner sc = new Scanner(System.in);
	
	public static final String ADD ="add";
	public static final String All ="all";
	public static final String DELETE ="delete";
	
	@Override
	public void getService(SciencePublisher Sciencepublisher) {
		  System.out.println();
	      System.out.println("=========== Science Services ============");
	      System.out.println("            LearnLogic             ");
	      System.out.println();
	      System.out.println("Select the service from below . ");
	      System.out.println();
	      
	      while(true) {
	    	  input = getInput();
	    	  
	    	  if(input.equalsIgnoreCase(ADD)) {
	    		  addRecord( Sciencepublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(All)) {
	    		  getAllRecords( Sciencepublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(DELETE)) {
	    		  deleteRecord( Sciencepublisher);
	    	  }
	    	  else {
	    		  System.out.println("Invalid");
	    	  }
	      }
		
	}
	   
	
		
	
	
	public String getInput() {
		   System.out.println("Add Science:                     'Add'");
		   System.out.println("View  All the Sciences:          'All'");
		   System.out.println("Delete a Science:                'Delete'");
		   System.out.println();
		   String input =sc.nextLine();
		   return input;
		   
	   }
	
	
	public void addRecord(SciencePublisher sciencepublisher) {
		   
		   System.out.println();
		   System.out.println("=========== Scinece Services ============");
		   System.out.println("            LearnLogic              ");
		   
		   System.out.println();
		   System.out.println("Enter Scinece ID:");
		   science_ID = sc.nextLine();
		   
		   System.out.println("Enter Scinece Name:");
		   science_name = sc.nextLine();
		   
		   System.out.println("Enter Scinece Duration");
		   science_duration = sc.nextLine();
		   
		   System.out.println("Enter Scinece Grade:");
		   science_grade = sc.nextLine();
		   
		   
		   System.out.println("Enter Scinece Price: ");
		   science_price = sc.nextLine();
		   
		   String temp = sciencepublisher.addScience(science_ID,science_name, science_duration, science_grade, science_price);
		   System.out.println(temp);
		   System.out.println();
	   }
	
	 public void getAllRecords(SciencePublisher sciencepublisher) {
		   List<Science> sciences = sciencepublisher.getAllSciences();
		   System.out.println();
		   
		   System.out.println("=========== Scinece Services ============");
		   System.out.println("            LearnLogic             ");
		   System.out.println();
		   System.out.println("=====Displaying all Science==== ");
		   System.out.println();
		   
		   System.out.println("ID  \t  Scinece Name");
		   for(Science science : sciences ) {
			   System.out.println();
			   System.out.println(science.getScience_ID() +"\t " +" "+ science.getScience_name());
			   
			   
			   System.out.println();
		   }
		   
		   System.out.println();
	   }
	 
	 private void deleteRecord(SciencePublisher sciencepublisher) {
			String science_ID;
			

			System.out.println("=========== Scinece Services ============");
			System.out.println("            LearnLogic             ");
			System.out.println();
			System.out.println("Enter Scinece ID to be deleted: ");
			science_ID = sc.nextLine();
			sciencepublisher.deleteScience(science_ID);
			System.out.println();
		}


	

}
