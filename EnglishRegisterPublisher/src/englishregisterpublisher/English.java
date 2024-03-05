package englishregisterpublisher;

public class English {
	
	private String English_ID;
	private String English_name;
	private String English_duration;
	private String English_grade;
	private String English_price;
	
	
	public English(String english_ID, String english_name, String english_duration, String english_grade,
			String english_price) {
		super();
		this.English_ID = english_ID;
		this.English_name = english_name;
		this.English_duration = english_duration;
		this.English_grade = english_grade;
		this.English_price = english_price;
	}

	
	//getters and setters

	public String getEnglish_ID() {
		return English_ID;
	}


	public void setEnglish_ID(String english_ID) {
		English_ID = english_ID;
	}


	public String getEnglish_name() {
		return English_name;
	}


	public void setEnglish_name(String english_name) {
		English_name = english_name;
	}


	public String getEnglish_duration() {
		return English_duration;
	}


	public void setEnglish_duration(String english_duration) {
		English_duration = english_duration;
	}


	public String getEnglish_grade() {
		return English_grade;
	}


	public void setEnglish_grade(String english_grade) {
		English_grade = english_grade;
	}


	public String getEnglish_price() {
		return English_price;
	}


	public void setEnglish_price(String english_price) {
		English_price = english_price;
	}
	
	
	
	
	
	

}
