package pureJava301.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		/*
		 * Key-Value çiflerinden oluşur. 
		 * Key eşsiz olmalıdır.
		 * Map içinde iterator ile dolaşamayız
		 * iterator kullanmak içn hashMap.keySet() ile key'leri bir set'e koyarız ve daha sonra iterator ile döneriz
		 * hashMap.get(key) ile de setten hashMap'e ulaşırız
		 * Anahtar'dan değer bulunur
		 */
		
		HashMap<Integer,String> hashMap = new HashMap();
		hashMap.put(34,"Istanbul");
		hashMap.put(35,"Izmir");
		hashMap.put(6,"Ankara");
		System.out.println(hashMap.get(6));
		
		HashMap<Integer,Sehir> sehirler = new HashMap();
		sehirler.put(34, new Sehir("Istanbul",20_000_000)); //bu şekilde ayırabiliriz
		sehirler.put(35, new Sehir("Izmir",6_000_000));
		sehirler.put(6, new Sehir("Ankara",12_000_000));
		
		for(Sehir sehir : sehirler.values()) { // Ya da key'leri set'e koyup iterator ile dön
			System.out.println(sehir);
		}
		
		// MAP farklı bir kullanım
		
		HashMap<String,Double> urunler = new HashMap<String,Double>();
		urunler.put("Bilgisayar", 2000.0);
		urunler.put("Tablet", 1500.0);
		urunler.put("Telefon", 1700.0);
		
		for(Map.Entry<String,Double> unit : urunler.entrySet()) {
			System.out.print(unit.getKey() + " : ");
			System.out.println(unit.getValue() + " TL");
		}
		//güncelleme
		urunler.put("Telefon", 400+urunler.get("Telefon")); //400 tl zam
		System.out.println(urunler.get("Telefon"));
		
		//ya da
		urunler.replace("Telefon",2200.0); //yeni fiyatını 2200 olarak güncelledik
		System.out.println(urunler.get("Telefon"));
	
		//Konudan bağımsız hashcode ve equals override'ları unique'lik belirtmek içindir bu fonksiyonlar ile unique nasıl olunur ayarlayabilirsin
	}
}
