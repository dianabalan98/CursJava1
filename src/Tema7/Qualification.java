package Tema7;

public class Qualification extends Teacher {

	public Qualification(String course, int experienceYears, String schedule) {
		super(course, experienceYears, schedule);
	}
	
	public void verify() {
		if(this.ExperienceYears > 3 && this.Course.equals("Java") && this.Schedule.equals("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}
}
