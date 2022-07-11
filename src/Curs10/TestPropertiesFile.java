package Curs10;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		PropertiesFilesProcessor propFile = new PropertiesFilesProcessor();
		propFile.writePropertiesFile();
		propFile.readPropertiesFile("user");
		propFile.readPropertiesFile("email");
		propFile.readPropertiesFile("pass");

	}

}
