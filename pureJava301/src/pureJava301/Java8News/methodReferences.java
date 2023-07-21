package pureJava301.Java8News;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class methodReferences {
	public static void main(String[] args) {
		/*
		 * Lambda ifadeleri ile ilişkili önemli bir özelliktir
		 * bir methodun çalıştırılmadan  bakılması için yol sağlar
		 * method referansı işleme sokulduğu zaman fonksiyonel arayüzün bir instance'ını yaratır bu sayede durum kod içinde kullanılabilir
		 * 1-> Statik methoda referans 2->Instance methoda referans 3->Yapıcıya referans
		 *  :: İşareti ayıraçtır
		 */
		ArrayList<Integer> integers = new ArrayList();
		integers.add(2);
		integers.add(4);
		integers.add(6);
		integers.add(7);
		
		integers.forEach((i) -> System.out.println(i)); //Böyle kullanmak yerine method referansını kullanalım
		System.out.println("- - - - - - - - - -");
		integers.forEach(System.out::println); //Statik methoda referans ettik
		
		//2-> Belirli bir nesne üzerindeki instance metoda nesne referansının geçirilmesi sağlanabilir
		
		ArrayList<Bisiklet> bisikletler = new ArrayList();
		
		bisikletler.add(new Bisiklet("Salcano",14));
		bisikletler.add(new Bisiklet("Umit",11));
		bisikletler.add(new Bisiklet("X marka",22));
		bisikletler.add(new Bisiklet("Y marka",17));
		
		 // Collections.sort(bisikletler , (o1,o2) -> o1.getVites() - o2.getVites()); //Bu 1.yöntem Lambda Expressions ile
		Collections.sort(bisikletler,new BisikletComparator()); 
		bisikletler.forEach(System.out::println); 
		//Instance referance kullanalım
		BisikletComparator bisikletComparator = new BisikletComparator();
		Collections.sort(bisikletler,bisikletComparator::compare);  //Bu da Instance'a referans
		System.out.println("- - - - - - - - - -");
		
		//3->Yapıcıya referans
		ArrayList<String> markalar = new ArrayList();
		markalar.add("X Marka");
		markalar.add("Y Marka");
		markalar.add("Z Marka");
		
//		markalar.stream().map(new Function<String,Bisiklet>(){
//
//			@Override
//			public Bisiklet apply(String t) {
//				// TODO Auto-generated method stub
//				return new Bisiklet(t);
//			}
//			
//		}).collect(Collectors.toList());
//		
		//Yapıcıya referans ile 
		List<Bisiklet> newBisikletler = markalar.stream().map(Bisiklet::new).collect(Collectors.toList());
		newBisikletler.forEach(System.out::println);
	}
}
