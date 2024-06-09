import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LescturaJson {

	static Scanner e = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		
		int opcio;
		
		System.out.println("1.- Escriptura");

		System.out.println("2.- Lectura");
		
		opcio=e.nextInt();
		
		switch(opcio) {
		
		case 1: escriureDades();break;
		case 2: llegirDades(); break;
		
		}
		
	}
	public static void escriureDades() {
		JSONObject obj = new JSONObject();
		
		obj.put("name", "Pankaj Kumar");
		obj.put("age", new Integer(32));

		JSONArray cities = new JSONArray();
		cities.add("New York");
		cities.add("Bangalore");
		cities.add("San Francisco");

		obj.put("cities", cities);

		try {

			FileWriter file = new FileWriter("data.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.print(obj.toJSONString());
	}
	
	public static void llegirDades() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		Reader reader = new FileReader("data.json");

		Object jsonObj = parser.parse(reader);

		JSONObject jsonObject = (JSONObject) jsonObj;

		String name = (String) jsonObject.get("name");
		System.out.println("Name = " + name);

		long age = (Long) jsonObject.get("age");
		System.out.println("Age = " + age);

		JSONArray cities = (JSONArray) jsonObject.get("cities");
		
		
		
		for (int i=0;i<cities.size(); i++) {
			String ciutat = (String) cities.get(i);
			System.out.println(ciutat);
		}
		
		@SuppressWarnings("unchecked")
		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			System.out.println("City = " + it.next());
		}
		reader.close();
	}
	
}
