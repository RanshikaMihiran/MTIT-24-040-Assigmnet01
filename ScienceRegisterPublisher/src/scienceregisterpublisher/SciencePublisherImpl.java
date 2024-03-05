package scienceregisterpublisher;

import java.util.ArrayList;
import java.util.List;

public class SciencePublisherImpl implements SciencePublisher {

	
	public List<Science> Sciences = new ArrayList<Science>();
	
	@Override
	public String addScience(String science_ID, String science_name, String science_duration, String science_grade,
			String science_price) {
		 Science Science = new Science (science_ID, science_name,science_duration,science_grade,science_price);
		 Sciences.add(Science);
		return null;
	}

	@Override
	public void deleteScience(String science_ID) {
		 
		for(Science Science : Sciences) {
	    	if(Science.getScience_ID().equalsIgnoreCase(science_ID)) {
	    		int id =Sciences.indexOf(Science);
	    		Sciences.remove(id);
	    		System.out.println(" Science Record deleted Successfully!");
	    		return ;
	    	}
	    }
		
	}


	@Override
	public List<Science> getAllSciences() {
		
		return Sciences;
	}

}
