package Curs1;

public class Tester {
	/**
	 * comentariu pe mai multe linii
	 * etc
	 * etc
	 */
	//Variables
	
	public String name;
	public int ratePerHour;  //int = primitive, Integer = wrapper class (has more flexibility but less optimized as int for performance)
	public int age;
	
	//Constructors
	public Tester() {}
	public Tester(String pName) {
		name = pName;  //puteam folosi si this.name = name (name in loc de pName)
	}
	
	//Methods
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}
