package mathsregistersubscriber;

import java.util.List;
import java.util.Scanner;

import mathsregisterpublisher.Maths;
import mathsregisterpublisher.MathsPublisher;

public class MathsSubscriberImpl implements MathsSubscriber{
	
	String input;
	private String maths_ID;
	private String maths_name;
	private String maths_duration;
	private String maths_grade;
	private String maths_price;
	Scanner sc = new Scanner(System.in);
	
	public static final String ADD ="add";
	public static final String All ="all";
	public static final String DELETE ="delete";

	@Override
	public void getService(MathsPublisher mathspublisher) {
		
		 System.out.println();
	      System.out.println("=========== Maths Services ============");
	      System.out.println("            LearnLogic             ");
	      System.out.println();
	      System.out.println("Select the service from below . ");
	      System.out.println();
	      
	      while(true) {
	    	  input = getInput();
	    	  
	    	  if(input.equalsIgnoreCase(ADD)) {
	    		  addRecord( mathspublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(All)) {
	    		  getAllRecords( mathspublisher);
	    	  }
	    	  else if (input.equalsIgnoreCase(DELETE)) {
	    		  deleteRecord( mathspublisher);
	    	  }
	    	  else {
	    		  System.out.println("Invalid");
	    	  }
	}

}
	public String getInput() {
		   System.out.println("Add Maths:                     'Add'");
		   System.out.println("View  All the Maths:          'All'");
		   System.out.println("Delete a Maths:                'Delete'");
		   System.out.println();
		   String input =sc.nextLine();
		   return input;
		   
	   }
	
	
	 public void addRecord(MathsPublisher mathspublisher) {
		   
		   System.out.println();
		   System.out.println("=========== Maths Services ============");
		   System.out.println("            LearnLogic            ");
		   
		   System.out.println();
		   System.out.println("Enter Maths ID:");
		   maths_ID = sc.nextLine();
		   
		   System.out.println("Enter Maths Name:");
		   maths_name = sc.nextLine();
		   
		   System.out.println("Enter Maths Duration");
		   maths_duration = sc.nextLine();
		   
		   System.out.println("Enter Maths Grade:");
		   maths_grade = sc.nextLine();
		   
		
		   System.out.println("Enter Maths Price: ");
		   maths_price = sc.nextLine();
		   
		   String temp = mathspublisher.addMaths(maths_ID, maths_name, maths_duration, maths_grade, maths_price);
		   System.out.println(temp);
		   System.out.println();
	   }
	 
	 public void getAllRecords(MathsPublisher mathspublisher) {
		   List<Maths> Mathss = mathspublisher.getAllMaths();
		   System.out.println();
		   
		   System.out.println("=========== Maths Services ============");
		   System.out.println("           LearnLogic             ");
		   System.out.println();
		   System.out.println("=====Displaying all LearnLogic==== ");
		   System.out.println();
		   
		   System.out.println("ID  \t  Maths Name");
		   for(Maths maths : Mathss ) {
			   System.out.println();
			   System.out.println(maths.getMaths_ID() +"\t " +" "+ maths.getMaths_name());
			   
			   
			   System.out.println();
		   }
		   
		   System.out.println();
	   }
	 
	 
	 private void deleteRecord(MathsPublisher mathspublisher) {
			String maths_ID;
			

			System.out.println("=========== Maths Services ============");
			System.out.println("            LearnLogic             ");
			System.out.println();
			System.out.println("Enter LearnLogic ID to be deleted: ");
			maths_ID = sc.nextLine();
			mathspublisher.deleteMaths(maths_ID);
			System.out.println();
		}
	
}
