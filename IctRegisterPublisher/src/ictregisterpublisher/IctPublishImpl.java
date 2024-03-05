package ictregisterpublisher;

import java.util.ArrayList;
import java.util.List;

public class IctPublishImpl implements IctPublisher {
	
	public List<Ict> Icts = new ArrayList<Ict>();

	@Override
	public String addIct(String Ict_ID, String Ict_name, String Ict_duration, String Ict_Grade, String Ict_price) {
		Ict ict = new Ict(Ict_ID, Ict_name, Ict_duration, Ict_Grade, Ict_price);
		Icts.add(ict);
		return "New : " + ict.getIct_name() + " with " + ict.getIct_duration() +" " + "duration" + "  " + "entered successfully!";
	}

	@Override
	public void deleteIct(String Ict_ID) {
		
		 for(Ict Ict : Icts) {
		    	if(Ict.getIct_ID().equalsIgnoreCase(Ict_ID)) {
		    		int id =Icts.indexOf(Ict);
		    		Icts.remove(id);
		    		System.out.println(" Ict Record deleted Successfully!");
		    		return ;
		    	}
		    }
	}

	@Override
	public List<Ict> getAllIcts() {
		// TODO Auto-generated method stub
		return Icts;
	}

}
