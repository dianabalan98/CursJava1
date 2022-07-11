package Curs10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {

	/*
	 * Write a new text file
	 */
	public void writeFile() {
		
		try {
			FileWriter myFileWriter = new FileWriter("file.txt");
			myFileWriter.write("Textul meu in fisier!\n");
			myFileWriter.close();
			System.out.println("Am adaugat cu succes text in fisier!");
			
			
		} catch (IOException e) {
			System.out.println("Nu am gasit fisierul.");
			e.printStackTrace();
		}
	}
	
	/*
	 * Append to file
	 */
	public void appendTextToFile(String text) { 
		
		try {
			FileWriter myFileWriter = new FileWriter("file.txt", true);
			myFileWriter.write(text);			
			myFileWriter.close();
				
		} catch (IOException e) {
			System.out.println("Nu am gasit fisierul.");
			e.printStackTrace();
		}
	}
	
	/*
	 * Read text from file
	 */
	public void readFile() {
		
		File objFile = new File("file.txt");
		try {
			Scanner fileReader = new Scanner(objFile);
			while(fileReader.hasNext()) {
				String text = fileReader.nextLine();
				System.out.println(text);
			}
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Nu am gasit fisierul.");
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Delete file
	 */
	public void deleteFile() {
		File myFile = new File("file.txt");
		System.out.println(myFile.getAbsolutePath());
		myFile.delete();
	}
}
