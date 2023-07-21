package pureJava301.Java8News.StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {
		IntStream range = IntStream.range(1, 10); //Aynı şekilde Long ve DoubleStream de bulunmakta
		range.forEach(System.out::println); 
		Arrays.stream(new int[] {1,5,4,6,3,7})
		.map((x) -> x*2)
		.average() //aritmetik ort aldı
		.ifPresent(System.out::println);
		System.out.println("--- --- --- ---- ---- ---- ");
		int sum = IntStream.range(1, 101)
		.sum();
		System.out.println(sum);
		System.out.println("--- --- --- ---- ---- ---- ");
		Stream.of("1","2","3","4")
		.mapToInt(Integer::parseInt) //Static reference // Wrapper to any primitive
		.max()
		.ifPresent(System.out::println);
		System.out.println("--- --- --- ---- ---- ---- ");
		IntStream.range(1, 10)
		.mapToObj((i) -> i + "a") // primitive to any Wrapper
		.forEach(System.out::println);
		System.out.println("--- --- --- ---- ---- ---- ");
		Stream.of(1.1,2.2,3.3,4.4) //primitive to primitive
		.mapToInt(Double::intValue)
		.max()
		.ifPresent(System.out::println);
		//Intermediate'lerin çalışması için mutlaka kendisinden sonra bir terminal gelmelidir
	}

}
