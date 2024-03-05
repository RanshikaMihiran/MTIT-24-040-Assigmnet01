package mathsregisterpublisher;

import java.util.List;
import java.util.ArrayList;

public class MathsPublisherImpl implements MathsPublisher {

	
	public List<Maths> Mathss = new ArrayList<Maths>();
	
	@Override
	public String addMaths(String maths_ID, String maths_name, String maths_duration, String maths_grade,
			String maths_price) {
		Maths Maths = new Maths(maths_ID, maths_name, maths_duration, maths_grade, maths_price);
		Mathss.add(Maths);
		return "New : " + Maths.getMaths_name() + " with " + Maths.getMaths_duration() +" " + "duration" + "  " + "entered successfully!";
	     
	}

	@Override
	public void deleteMaths(String maths_ID) {
		  for(Maths Maths : Mathss) {
		    	if(Maths.getMaths_ID() .equalsIgnoreCase(maths_ID)) {
		    		int id =Mathss.indexOf(Maths);
		    		Mathss.remove(id);
		    		System.out.println(" Maths Record deleted Successfully!");
		    		return ;
		    	}
		    }
			
		
	}

	@Override
	public List<Maths> getAllMaths() {
		
		return Mathss;
	}

}
