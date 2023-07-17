package pureJava301.Collections.Set;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet; 

public class NavigableSets {
	public static void main(String[] args) {
		/*
		 * SortedSet'ten kalıtım almıştır
		 * generic bir arayüzdur
		 * en yakın değer yuvarlanarak bulunabilir
		 */
		
		NavigableSet<Integer> navigableSet = new TreeSet();
		navigableSet.add(5);
		navigableSet.add(2);
		navigableSet.add(3);
		navigableSet.add(4);
		navigableSet.add(4);
		navigableSet.add(10);
		navigableSet.add(15);
		navigableSet.add(19);
		System.out.println("Size = "+navigableSet.size());
		
		Iterator<Integer> iterator = navigableSet.iterator();
		while(iterator.hasNext()) {
			System.out.println((int) iterator.next() );
		}
		System.out.println("13'e en yakin en buyuk sayi : "+ navigableSet.ceiling(13)); //Ceiling üste yuvarlamak
		System.out.println("13'e en yakin en kucuk sayi : "+ navigableSet.floor(13)); //Ceiling alta yuvarlamak
		System.out.println("13'e en yakin en kucuk sayi : "+ navigableSet.lower(10)); //Düşük en büyük değer
		System.out.println("13'e en yakin en kucuk sayi : "+ navigableSet.higher(10)); // büyük en küçük değer
		
		//HeadSet ile ... ya kadar olanları getirir
	}
}
