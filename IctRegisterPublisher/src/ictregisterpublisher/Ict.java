package ictregisterpublisher;

public class Ict {
	
	private String Ict_ID;
	private String Ict_name;
	private String Ict_duration;
	private String Ict_Grade;
	private String Ict_price;
	
	
	public Ict(String ict_ID, String ict_name, String ict_duration, String ict_Grade, String ict_price) {
		super();
		this.Ict_ID = ict_ID;
		this.Ict_name = ict_name;
		this.Ict_duration = ict_duration;
		this.Ict_Grade = ict_Grade;
		this.Ict_price = ict_price;
	}
	
	
	//getters and setters

	public String getIct_ID() {
		return Ict_ID;
	}


	public void setIct_ID(String ict_ID) {
		Ict_ID = ict_ID;
	}


	public String getIct_name() {
		return Ict_name;
	}


	public void setIct_name(String ict_name) {
		Ict_name = ict_name;
	}


	public String getIct_duration() {
		return Ict_duration;
	}


	public void setIct_duration(String ict_duration) {
		Ict_duration = ict_duration;
	}


	public String getIct_Grade() {
		return Ict_Grade;
	}


	public void setIct_Grade(String ict_Grade) {
		Ict_Grade = ict_Grade;
	}


	public String getIct_price() {
		return Ict_price;
	}


	public void setIct_price(String ict_price) {
		Ict_price = ict_price;
	}
	

	
	
	
	
	
}
