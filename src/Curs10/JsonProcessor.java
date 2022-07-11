package Curs10;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProcessor {

	@SuppressWarnings("unchecked")
	public void writeJson() {
		
		JSONObject obj = new JSONObject();
		obj.put("name", "testUser");
		obj.put("email", "testUser@test.com");
		
		JSONArray list = new JSONArray();
		list.add("Obiect1");
		list.add("Obiect2");
		list.add("Obiect3");
		obj.put("listaObiecte", list);
		
		try {
			FileWriter file = new FileWriter("test.json");
			file.write(obj.toJSONString());
			file.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(obj);
	}
	
	public void readJson(String key) throws IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		try {
			Reader reader = new FileReader("test.json");
			JSONObject jsonObj = (JSONObject) parser.parse(reader);
			System.out.println("Read: " + jsonObj);
			
			String value = (String) jsonObj.get(key);
			System.out.println(value);
			
			JSONArray obj = (JSONArray) jsonObj.get("listaObiecte");
			System.out.println(obj);
			
			@SuppressWarnings("unchecked")
			Iterator<String> iterator = obj.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
}
