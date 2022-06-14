package Curs9;

public interface Angajat {
	
	//public static final String nume = "";
	
	void setName(String name);
	String getName();
	
	void setEmail(String email);
	String getEmail();
	
	default String getDepartment() {
		return "QA";
	}

}
