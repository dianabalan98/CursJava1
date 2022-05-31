package Curs7;

public class Encryptor {

	public void encrypt(String text) {
		
		String textEncrypted = "";
		char letter = ' ';
		int letterInt = 0;
		System.out.println("String initial: " + text);
		
		
		for(int i=0; i<text.length(); i++) {
			letterInt = text.charAt(i) + 1;
			letter = (char)letterInt;
			textEncrypted = textEncrypted + String.valueOf(letter);
		}
		
		System.out.println("Text criptat: " + textEncrypted);
	}
	
	public static void main(String[] args) {
		
		Encryptor enc = new Encryptor();
		enc.encrypt("cafelutza");
	}

}
