package Curs11;

public class TwoDimensionsArray {

	public static void main(String[] args) {
		
		int[] array1 = new int[2];
		int[][] array2 = {{1,2}, {3,4} };

		/*Matrice
		 * 			column0		column1
		 * 
		 * row0			1			2
		 * 
		 * row1			3			4
		 */
		
		System.out.println(array2[0][1]);
		
		for(int i=0; i<2; i++) {
			
			for(int j=0; j<2; j++) {
				System.out.print(array2[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		/*							col0	col1	col2
		 * 
		 * textArray -->	row0	alb		cana	mare
		 * 				
		 * 					row1	rosu	pahar	mic
		 */
		
		String[][] textArray = new String[2][3];
		textArray[0][0] = "alb";
		textArray[0][1] = "rosu";
		textArray[0][2] = "cana";
		textArray[1][0] = "pahar";
		textArray[1][1] = "mare";
		textArray[1][2] = "mic";
		
		// row
		System.out.println("ROW: " + textArray.length);
		
		// columns
		System.out.println("COL: " + textArray[0].length);
		
		for(int i=0; i<textArray.length; i++) {
			
			for(int j=0; j<textArray[i].length; j++) {
				System.out.print(textArray[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
