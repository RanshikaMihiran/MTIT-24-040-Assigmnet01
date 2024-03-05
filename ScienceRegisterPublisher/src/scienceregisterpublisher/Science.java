package scienceregisterpublisher;

public class Science {
	
	
	private String science_ID;
	private String science_name;
	private String science_duration;
	private String science_grade;
	private String science_price;
	
	
	public Science(String science_ID, String science_name, String science_duration, String science_grade,
			String science_price) {
		super();
		this.science_ID = science_ID;
		this.science_name = science_name;
		this.science_duration = science_duration;
		this.science_grade = science_grade;
		this.science_price = science_price;
	}
	
	

	//getters and setters


	public String getScience_ID() {
		return science_ID;
	}


	public void setScience_ID(String science_ID) {
		this.science_ID = science_ID;
	}


	public String getScience_name() {
		return science_name;
	}


	public void setScience_name(String science_name) {
		this.science_name = science_name;
	}


	public String getScience_duration() {
		return science_duration;
	}


	public void setScience_duration(String science_duration) {
		this.science_duration = science_duration;
	}


	public String getScience_grade() {
		return science_grade;
	}


	public void setScience_grade(String science_grade) {
		this.science_grade = science_grade;
	}


	public String getScience_price() {
		return science_price;
	}


	public void setScience_price(String science_price) {
		this.science_price = science_price;
	}
	
	
	
	
	
	

}
