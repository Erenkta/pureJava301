package pureJava301.Collections.Map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MapLab {
	public static void main(String[] args) throws IOException {
		File file = new File("sozluk.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		HashMap<String,String> sozluk = new HashMap();
		while ( ( line = bufferedReader.readLine()) != null) {
		//	System.out.println(line);
			String[] keyValues = line.split(":");
			sozluk.put(keyValues[0], keyValues[1]);
		}
		
		for(Map.Entry<String, String> units : sozluk.entrySet()) {
			System.out.println("Key : " + units.getKey() + " Values : "+units.getValue());
		}
	}
	FileWriter
}
