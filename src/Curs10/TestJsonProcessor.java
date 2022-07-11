package Curs10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.parser.ParseException;

public class TestJsonProcessor {

	public static void main(String[] args) throws IOException, ParseException {
		
		JsonProcessor obj = new JsonProcessor();
		obj.writeJson();
		System.out.println("------------");
		obj.readJson("name");
		
		// in caz ca vrem sa luam fisierul json ca si string
		/*String file = "test.json";
		System.out.println(readJsonAsString(file));*/

	}
	
	public static String readJsonAsString(String file) throws IOException {
		return new String(Files.readAllBytes(Paths.get(file)));
	}

}
