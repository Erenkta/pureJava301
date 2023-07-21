package pureJava301.Java8News.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		/*
		 * Lambda ifadeler ile beraber kullanılmak üzere tasarlanmıştır
		 * Arama filtreleme ve haritalama işlemlerini yapar
		 * 
		 * Stream'ler veri için bir kanaldır. Bir dizi nesneyi temsil etmektedir
		 * Koleksiyon-dizi gibi bir veri kaynağında işlem yapar
		 * Stream'ler veriyi depolamaz. Filtreleme sıralama gibi işlemleri yaparak veriyi taşır
		 * Stream Interface'lerde akışlar ---> 1- intermediate (aracı) ve 2- terminal (son) olarak iki farklı şekilde tanımlanmıştır
		 * Terminal işlemler akışı bitirir
		 * İntermediate işlemler başka bir akış üretir ve tembel davranış içindedirler
		 * -> Tembel davranış Stream API'nin daha verimli çalışmasını sağlar
		 * Intermediate işlemler 1-> Durumu olan (stateful) 2-> Durumu olmayan (stateless) şekildedirler
		 * stateful -> bir elementin işleme sokulması başka bir elemente bağlıdır 
		 * stateless -> diğer elementlerden bağımsız şekilde işleme sokulur
		 * 
		 */
		ArrayList<String> arrays = new ArrayList();
		arrays.add("Ahmet");
		arrays.add("Balıkesir");
		arrays.add("Tuz");
		arrays.add("Samsunspor");
		arrays.add("Klavye");
		Stream<String> stream = arrays.stream(); //arrays'ın streamini bize verdi
		Stream<String> stream2 = stream.filter((str) -> str.length() > 7); //Bu da geriye bir Stream dönüyor -> Intermediate
		Stream<String> stream3 = stream2.map(new Function<String,String>() { //Bu da geriye bir Stream dönüyor -> Intermediate
			public String apply(String t) {return t.toUpperCase();};
		});
		Stream<String> stream4 = stream3.sorted((t1,t2) -> t1.compareTo(t2));  //Bu da geriye bir Stream dönüyor -> Intermediate
		
		stream4.forEach(System.out::println);
		System.out.println("--- --- --- --- --- ---");
		//Böyle yapmak yerine peşpeşe kullanabiliriz
		arrays.stream()
		.filter((s) -> s.contains("e"))
		.map(new Function<String,String>(){public String apply(String t) {return t.toUpperCase();}})
		.sorted((t1,t2) -> t1.length()-t2.length())
		.forEach(System.out::println);
		System.out.println("--- --- --- --- --- ---");
		int[] numbers = {3,7,9,2,8,4,1,6};
		Arrays.stream(numbers) //ya da Stream.of(numbers);
		.filter((x)->x>4)
		.map((x)->x*2)
		.sorted()
		.forEach(System.out::println);
		System.out.println("--- --- --- --- --- ---");
	
		
		
	}

}
