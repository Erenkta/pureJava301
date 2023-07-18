package pureJava301.Collections.Map;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaps {
	public static void main(String[] args) {
		/*
		 * SortedMapler girişlerin artan sıra ile saklanmasını sağlar
		 * submap'lerin verimli manipülasyonunu içerir
		 * firstKey -> haritanın ilk anahtarına erişmek
		 * headMap -> verilen anahtardan küçük olanlar print edilir
		 * tailMap -> verilen anahtardan büyük eşit olanlar print edilir
		 */
		SortedMap<String,String> sozluk = new TreeMap();
		sozluk.put("Araba", "Car");
		sozluk.put("Kalem", "Pencil");
		sozluk.put("Ev", "House");
		
		Set<String> keys = sozluk.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key : " + key + " Value : "+sozluk.get(key));
		}
		
	}
}
