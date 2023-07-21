package pureJava301.Java8News.StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ParallelStream {
	/*
	 * parallel() ile paralel stream yapılıp sequential() ile normal akısa çevirebilir
	 * akıştakı elementler sıralı ya da karışık olabilir
	 * unordered ile performansı arttıra biliriz
	 */
		public static void main(String[] args) {
			Arrays.asList("Ankara","Bursa","Istanbul")
			.parallelStream()
			.filter(new Predicate<String>() {

				@Override
				public boolean test(String t) {
					System.out.println("Test : "+Thread.currentThread().getName());
					return true;
				}
			})
			.map(new Function<String, String>() {

				@Override
				public String apply(String t) {
					System.out.println("Apply : "+Thread.currentThread().getName());
					return t.toUpperCase();
				}
			})
			.forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println("Accept : "+Thread.currentThread().getName());
					
				}
				
			});
		}
}
