package Curs4;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		/**
		 * && --> short circuit (verifica prima conditie si daca e false nu mai trece la validarea urm conditii
		 * &  --> verifica toate conditiile
		 * 
		 * a | b --> evalueaza a si dupa aia b dupa face OR
		 * a || b --> evalueaza a si doar dac a e false va evalua si b 
		 */
		
		
		int x = 0; 
		
		if((x!=0) && (1/x > 5)) {
			
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
