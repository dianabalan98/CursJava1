package Tema10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManageStock {

	private List<String> veggieList = new ArrayList<>();
	private ProcessVeggiesFile processFile = new ProcessVeggiesFile();
	
	public ManageStock() throws IOException {

		getVeggiesFromFile();
	}
	
	void getVeggiesFromFile() throws IOException {

		// get properties as string
		String veggiesString = processFile.readFromFile().toString();
		
		// remove curly brackets (first and last character from string)
		veggiesString = veggiesString.replaceAll("^.|.$", "");
		
		// keep only the keys and convert them to array list
		String[] veggiesArray = veggiesString.split("=[0-9]+,?");
		for(String veggie : veggiesArray){
			this.veggieList.add(veggie.trim());
		}
	}
	
	 boolean checkIfVeggieInStock(String veggie) {
		
		if (this.veggieList.contains(veggie)) return true;
		else return false;
	}
	
	public String getVeggieCalorie(String veggie) throws IOException {
		
		return this.processFile.getVeggieCalorie(veggie);
	}
}
