package Curs10;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		
		TextFileProcessor textFile = new TextFileProcessor();
		textFile.writeFile();
		textFile.readFile();
		System.out.println("Delimitare -----------");
		textFile.appendTextToFile("Linie noua\n");
		textFile.appendTextToFile("Alta linie\n");
		textFile.readFile();
		textFile.deleteFile();

	}

}
