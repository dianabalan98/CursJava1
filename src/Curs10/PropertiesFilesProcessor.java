package Curs10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFilesProcessor {

	public void writePropertiesFile() throws IOException {
		
		try {
			OutputStream os = new FileOutputStream("test.properties");
			Properties prop = new Properties();
			// definim continutul fisierului
			prop.setProperty("user", "testUser");
			prop.setProperty("pass", "admin123");
			prop.setProperty("email", "test@user.com");
			
			// salvam
			prop.store(os, "Am salvat fisierul properties");
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public void readPropertiesFile(String key) throws IOException {
		
		try {
			InputStream is = new FileInputStream("test.properties");
			Properties prop = new Properties();
			prop.load(is);
			String value = prop.getProperty(key);
			System.out.println(value);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
