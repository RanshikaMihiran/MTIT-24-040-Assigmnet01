package ictregistersubscriber;

import java.util.Scanner;

import ictregisterpublisher.IctPublisher;

public class IctSubscriberImpl implements IctSubscriber {
	
	String input;
	String Ict_ID;
    String Ict_name;
    String Ict_duration;
    String Ict_Grade;
	String Ict_price;
	Scanner sc = new Scanner(System.in);

	public static final String ADD ="add";
	public static final String All ="all";
	public static final String DELETE ="delete";

	@Override
	public void getService(IctPublisher ictpublisher) {
		  System.out.println();
	      System.out.println("=========== Ict Services ============");
	      System.out.println("            LearnLogic             ");
	      System.out.println();
	      System.out.println("Select the service from below . ");
	      System.out.println();
	      
	      while(true) {
	    	  input = getInput();
	    	  
	    	  if(input.equalsIgnoreCase(ADD)) {
	    		  addRecord( ictpublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(All)) {
	    		  getAllRecords( ictpublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(DELETE)) {
	    		  deleteRecord( ictpublisher);
	    	  }
	    	  else {
	    		  System.out.println("Invalid");
	    	  }
		
	}

	}
	
	
	
	public String getInput() {
		   System.out.println("Add Ict:                     'Add'");
		   System.out.println("View  All the Ict:          'All'");
		   System.out.println("Delete a Ict:                'Delete'");
		   System.out.println();
		   String input =sc.nextLine();
		   return input;
		   
	   }
	
	
	private void deleteRecord(IctPublisher ictpublisher) {
		
		String yog_id;
		

		System.out.println("=========== Yoga Services ============");
		System.out.println("            Gym Fitness 032             ");
		System.out.println();
		System.out.println("Enter Yoga ID to be deleted: ");
		yog_id = sc.nextLine();
		ictpublisher.deleteIct(Ict_ID);
		System.out.println();
		
		
	}

	private void getAllRecords(IctPublisher ictpublisher) {
		// TODO Auto-generated method stub
		
	}

	
	public void addRecord(IctPublisher ictPublisher) {
		   
		   System.out.println();
		   System.out.println("=========== ICT Services ============");
		   System.out.println("            LearnLogic             ");
		   
		   System.out.println();
		   System.out.println("Enter Ict ID:");
		   Ict_ID = sc.nextLine();
		   
		   System.out.println("Enter Ict Name:");
		   Ict_name = sc.nextLine();
		   
		   System.out.println("Enter Ict Duration");
		   Ict_duration = sc.nextLine();
		   
		   System.out.println("Enter Ict Level:");
		   Ict_Grade = sc.nextLine();
		   
		   
		   System.out.println("Enter Ict Price: ");
		   Ict_price = sc.nextLine();
		   
		   String temp = ictPublisher.addIct(Ict_ID,Ict_name, Ict_duration, Ict_Grade, Ict_price);
		   System.out.println(temp);
		   System.out.println();
	   }
	   
	
}
