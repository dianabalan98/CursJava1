package Tema10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProcessVeggiesFile {

	// search veggie in properties file and return its value if found
	String getVeggieCalorie(String veggieName) throws IOException {
		
		Properties prop = readFromFile();
		String value = prop.getProperty(veggieName);
		return value;
	}
	
	Properties readFromFile() throws IOException {
		
		InputStream is = new FileInputStream("veggie.properties");
		Properties prop = new Properties();
		prop.load(is);
		return prop;
	}
}
