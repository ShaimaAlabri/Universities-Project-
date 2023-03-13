package Project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;


public class Main {
	public static void main(String[] args) {
		try {
			 BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\UniversitiesProject\\Universities.txt"));
			 StringBuilder jsonString = new StringBuilder();
			 String line;
			 while ((line = reader.readLine()) != null) {
			 jsonString.append(line);
			 }
			 reader.close();
			 JSONArray universities = new JSONArray(jsonString.toString());
			 for (int i = 0; i < universities.length(); i++) {
			 JSONObject university = universities.getJSONObject(i);
			 String name = university.getString("name");
			 String country = university.getString("country");
			 System.out.println(name + " - " + country);
			 }
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}

