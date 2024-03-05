package englishregisterpublisher;

import java.util.ArrayList;
import java.util.List;

public class EnglishPublishImpl implements EnglishPublisher {
	
	public List<English> English = new ArrayList<English>();

	@Override
	public String addEnglish(String English_ID, String English_name, String English_duration, String English_grade,
			String English_price) {
		English english = new English(English_ID, English_name, English_duration, English_grade, English_price);
		English.add(english);
		return "New : " + english.getEnglish_name()  + " with " + english.getEnglish_duration() +" " + "duration" + "  " + "entered successfully!";
	}

	@Override
	public void deleteEnglish(String English_ID) {
		
		 for(English english : English) {
		    	if(english.getEnglish_ID()  .equalsIgnoreCase(English_ID)) {
		    		int id =English.indexOf(english);
		    		English.remove(id);
		    		System.out.println(" English Record deleted Successfully!");
		    		return ;
		    	}
		    }
	}

	@Override
	public List<English> getAllEnglish() {
	
		return English;
	}
	
	

}
