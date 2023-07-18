package pureJava301.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		
		/*
		 * List bir interface'dir 
		 * Unique olmayan ve eklenme sırasına göre koyulan elemanlar içerir
		 * Generic bir yapıdadır.
		 * Null eleman kabul edilmez
		 * ArrayList -> Daha çok çağırma daha az silme
		 * LinkedList -> Daha çok silme daha az çağırma -> Artan sırayla kayıt edilir
		 */
		
		//						LINKED LIST
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(1,20); //1.index'e 20 ekle
		integers.add(0,0); //0.index'e 0 ekle
		integers.addFirst(30); //0.index'e 30 ekle
		integers.addLast(100); //sonuncu index'e 100 ekle
		
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Son eleman = "
		+integers.get(integers.size()-1)
		+" Index No : "+integers.indexOf(integers.get(integers.size()-1)));
		
		integers.remove(); //parametre göndermezsen baştaki elemanı kaldırır
		integers.remove(5);
		//Custom sınıf ile oluşturma
		
		LinkedList<Ogrenci> ogrenciler = new LinkedList<Ogrenci>();
		ogrenciler.add(new Ogrenci(1,"Ali"));
		ogrenciler.add(new Ogrenci(2,"Veli"));
		ogrenciler.add(new Ogrenci(3,"Mehmet"));
		ogrenciler.add(new Ogrenci(1,"Ali"));
		ogrenciler.add(new Ogrenci(1,"Aslı"));
		
		Iterator<Ogrenci> ogrenciIterator = ogrenciler.iterator();
		while(ogrenciIterator.hasNext()) {
			System.out.println(ogrenciIterator.next());
		}
		//						ARRAY LIST
		ArrayList<String> arraylist = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String line = null;
		while( !(line = scanner.nextLine()).equalsIgnoreCase("exit") ) {
			arraylist.add(line);
		}
		
		Iterator<String> stringIterator = arraylist.iterator();
		
		while(stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}
		
		//Custom sınıf ile ArrayList
		
		ArrayList<Ogrenci> ogrenciArray = new ArrayList<Ogrenci>();
		
		ogrenciArray.add(new Ogrenci(001,"Ali"));
		ogrenciArray.add(new Ogrenci(022,"Tugkan"));
		ogrenciArray.add(new Ogrenci(321,"Zebra"));
				
	}

}
