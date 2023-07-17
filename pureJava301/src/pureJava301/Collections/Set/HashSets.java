package pureJava301.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Istanbul");
		hashSet.add("Ankara");
		hashSet.add("Edirne");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println((String) iterator.next());
		}
		System.out.println();
		
		HashSet<Calisan> calisanHash = new HashSet<Calisan>();

		
		calisanHash.add(new Calisan("Ali",1200));
		calisanHash.add(new Calisan("Mehmet",1500));
		calisanHash.add(new Calisan("Tugce",1800));
		calisanHash.add(new Calisan("Tugce",1800)); // İki kere eklenir çünkü hashcode'ları birbirinden farklı
		//Equals ve Hashcode override ederek 2 defa eklenmesini önleyebilirsin
		
		Iterator<Calisan> calisanIter = calisanHash.iterator();
		while(calisanIter.hasNext()) {
			System.out.println((Calisan) calisanIter.next());
		}
		
		
		//LinkHashSet ile sıralı bir liste oluşturabilirsin
		
		//TreeSet ile de Ağaç yapısı olan bir set oluşturabilirsin
	
	}
}
