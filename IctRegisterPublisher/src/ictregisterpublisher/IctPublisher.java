package ictregisterpublisher;

import java.util.List;

public interface IctPublisher {
	
	public String addIct(String Ict_ID,String Ict_name,String Ict_duration,String Ict_Grade,String Ict_price);
	public void deleteIct(String Ict_ID);
	public List<Ict> getAllIcts();

}
