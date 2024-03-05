package englishregistersubscriber;

import java.util.List;
import java.util.Scanner;

import englishregisterpublisher.English;
import englishregisterpublisher.EnglishPublisher;

public class EnglishSubscriberImpl implements EnglishSubscriber {
	
	
	String input;
	String English_ID;
    String English_name;
    String English_duration;
    String English_grade;
    String English_price;
	Scanner sc = new Scanner(System.in);

	public static final String ADD ="add";
	public static final String All ="all";
	public static final String DELETE ="delete";

	@Override
	public void getService(EnglishPublisher englishpublisher) {
		
		 System.out.println();
	      System.out.println("=========== English Services ============");
	      System.out.println("            LearnLogic            ");
	      System.out.println();
	      System.out.println("Select the service from below . ");
	      System.out.println();
	      
	      while(true) {
	    	  input = getInput();
	    	  
	    	  if(input.equalsIgnoreCase(ADD)) {
	    		  addRecord( englishpublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(All)) {
	    		  getAllRecords( englishpublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(DELETE)) {
	    		  deleteRecord( englishpublisher);
	    	  }
	    	  else {
	    		  System.out.println("Invalid");
	    	  }
		
		
	}

}
	
	public String getInput() {
		   System.out.println("Add English:                     'Add'");
		   System.out.println("View  All the English:          'All'");
		   System.out.println("Delete a English:                'Delete'");
		   System.out.println();
		   String input =sc.nextLine();
		   return input;
		   
	   }
	
	
	 public void addRecord(EnglishPublisher yogapublisher) {
		   
		   System.out.println();
		   System.out.println("=========== English Services ============");
		   System.out.println("            LearnLogic             ");
		   
		   System.out.println();
		   System.out.println("Enter English ID:");
		   English_ID = sc.nextLine();
		   
		   System.out.println("Enter English Name:");
		   English_name = sc.nextLine();
		   
		   System.out.println("Enter English Duration");
		   English_duration = sc.nextLine();
		   
		   System.out.println("Enter English Grade:");
		   English_grade = sc.nextLine();
		   
		  
		   System.out.println("Enter  Price: ");
		   English_price = sc.nextLine();
		   
		   String temp = yogapublisher.addEnglish(English_ID,English_name, English_duration, English_duration, English_price);
		   System.out.println(temp);
		   System.out.println();
	   }

	 
	 public void getAllRecords(EnglishPublisher englishPublisher) {
		   List<English> english = englishPublisher.getAllEnglish();
		   System.out.println();
		   
		   System.out.println("=========== English Services ============");
		   System.out.println("            LearnLogic             ");
		   System.out.println();
		   System.out.println("=====Displaying all English==== ");
		   System.out.println();
		   
		   System.out.println("ID  \t  Yoga Name");
		   for(English English : english ) {
			   System.out.println();
			   System.out.println(English.getEnglish_ID() +"\t " +" "+ English.getEnglish_name());
			   
			   
			   System.out.println();
		   }
		   
		   System.out.println();
	   }
	 
	  private void deleteRecord(EnglishPublisher englishPublisher) {
			String yog_id;
			

			System.out.println("=========== YEnglish Services ============");
			System.out.println("            LearnLogic             ");
			System.out.println();
			System.out.println("Enter English ID to be deleted: ");
			yog_id = sc.nextLine();
			englishPublisher.deleteEnglish(English_ID);
			System.out.println();
		}
	   
		

	}