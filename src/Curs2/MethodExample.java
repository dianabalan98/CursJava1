package Curs2;

public class MethodExample {
	
	/**
	 * poti calcula mai multe camere
	 * calcul arie
	 * calcul nr total mp
	 */
	private int nrTotal;
	
	public void calculateArea(int length, int width) { // util pt refolosire
		nrTotal = length * width;
	}
	
	public int calculateArea2(int length, int width) {
		return length * width;
	}
	
	public static int calculateTotal (int area1, int area2) {
		return area1 + area2;
	}
	
	public static int calculateTotal2 (int...rooms) {  //argument variabil -> le pune intr-o lista de tip int
		int result = 0;
		
		//foreach item in my list
		for(int room : rooms) {
			result += room;
		}
		
		return result;
	}


	public static void main(String[] args) {
		
		// Room1 - scenariu hardcoded ne-refolosibil
		int length = 3;
		int width = 4;
		
		int room1area = length * width;
		System.out.println(room1area);
		
		// ------------------------------------
		
		MethodExample sufragerie = new MethodExample();
		MethodExample bucatarie = new MethodExample();
		MethodExample hol = new MethodExample();
		
		System.out.println(sufragerie.calculateArea2(4, 4));
		//System.out.println(sufragerie.calculateArea(4, 4));  -> cannot print this -> no return type
		System.out.println(bucatarie.calculateArea2(2, 2));
		System.out.println(calculateTotal(sufragerie.calculateArea2(4, 4), bucatarie.calculateArea2(2, 2)));
		
		// ------------------------------------
		sufragerie.calculateArea(4, 4);
		bucatarie.calculateArea(2, 2);
		hol.calculateArea(2, 3);
		System.out.println(calculateTotal(sufragerie.nrTotal, bucatarie.nrTotal)); 
		
		int calcTotal = calculateTotal2(sufragerie.nrTotal, bucatarie.nrTotal, hol.nrTotal);
		System.out.println(calcTotal);

	}

}
