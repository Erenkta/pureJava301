package pureJava301.Collections.Set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set {
	public static void main(String[] args) {
		
		/* 				Set 
		 * Bir interface'dir
		 * HashSet nesneleri bir sıra olmaksızın tutar ve unique'dir
		 * Set arayüzünde bir get methodu yoktur. Bir iterator ile elemanları dönmemiz gerekir
		 * SortedSet -> generic bir arayüzdür ve artan sırayla düzenler , last() ve first() vardır
		 */
		SortedSet<Integer> sortedSet = new TreeSet(); //Burada Integer yazdık generic kullanım demektir
		sortedSet.add(5);
		sortedSet.add(2);
		sortedSet.add(3);
		sortedSet.add(4);
		
		
		//Dolaşmak için bir iterator nesnesi oluşturmalıyız
		
		Iterator<Integer> iterator = sortedSet.iterator();
		while(iterator.hasNext()) { //yani bir sonraki eleman olduğu sürece
			int next = iterator.next();  //Integer de olur int de
			System.out.println(next);
			
		}
		//Sorted set içinde tutulacak nesnelere comperable'ı implemente etmelidir
		//Custom bir nesne tutmak için
		
		SortedSet<Ogrenci> ogrenciSortedSet = new TreeSet();
		Ogrenci ogr = new Ogrenci(1,"Ogr1");
		Ogrenci ogr2 = new Ogrenci(2,"Ogr2");
		Ogrenci ogr3 = new Ogrenci(3,"Ogr3");
		Ogrenci ogr4 = new Ogrenci(4,"Ogr4");
		ogrenciSortedSet.add(ogr);
		ogrenciSortedSet.add(ogr2);
		ogrenciSortedSet.add(ogr3);
		ogrenciSortedSet.add(ogr4);
		
		Iterator<Ogrenci> ogrenciIterator = ogrenciSortedSet.iterator();
		while(ogrenciIterator.hasNext()) {
			System.out.println((Ogrenci) ogrenciIterator.next());
		}
	}
}
