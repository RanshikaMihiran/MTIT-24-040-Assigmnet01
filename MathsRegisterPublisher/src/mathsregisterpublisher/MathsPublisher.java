package mathsregisterpublisher;

import java.util.List;

public interface MathsPublisher {
	
	public String addMaths(String maths_ID, String maths_name, String maths_duration, String maths_grade, String maths_price);
	public void deleteMaths(String maths_ID);
	public List<Maths> getAllMaths();

}
