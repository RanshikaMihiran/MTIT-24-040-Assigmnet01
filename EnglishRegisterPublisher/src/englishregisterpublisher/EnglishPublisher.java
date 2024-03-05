package englishregisterpublisher;
import java.util.List;


public interface EnglishPublisher {
	
	
	public String addEnglish(String English_ID, String English_name, String English_duration, String English_grade, String English_price);
	public void deleteEnglish(String English_ID);
	public List<English> getAllEnglish();
}