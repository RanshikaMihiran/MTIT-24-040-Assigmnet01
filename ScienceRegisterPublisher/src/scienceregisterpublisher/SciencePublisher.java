package scienceregisterpublisher;

import java.util.List;

public interface SciencePublisher {
	
	public String addScience(String science_ID, String science_name, String science_duration, String science_grade, String science_price); 
	public void deleteScience(String science_ID);
	public List<Science> getAllSciences();

}
