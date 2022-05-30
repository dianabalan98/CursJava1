package Tema6;

public class Ex3 {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		
		for (int count1 = 0; count1 < myStringArray.length-1; count1++)
        {
            for (int count2 = count1 + 1; count2 < myStringArray.length; count2++)
            {
                if( (myStringArray[count1].equals(myStringArray[count2])) && (count1 != count2) )
                {
                    System.out.println("Nume duplicat : "+ myStringArray[count2]);
                }
            }
        }

	}

}
