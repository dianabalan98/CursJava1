package Curs9;

public class Exception4 {

	public static void main(String[] args) {
		
		try {
			String nume = null;
			System.out.println(nume.length());
		} catch(NullPointerException e) {
			System.out.println("Null pointer occured!");
		} finally {
			System.out.println("Se executa si pe succes si pe fail!");
		}
		
		System.out.println("Outside try-catch");

	}

}
