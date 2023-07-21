package pureJava301.Java8News.Optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		/*
		 * Bir değerin var olup olmadığının kontrolu Optional ile bulunur
		 * Optional Nullable olarak düşünebilirsin
		 * Temel amacı nullPointException'un önüne geçmektir
		 * 
		 */
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent()); //false
		String deger = "merhaba";
		Optional<String> degerVarMi = Optional.of(deger);
		System.out.println(degerVarMi.isPresent()); // true
		
		String s = null;
		//Optional<String> optional2 = Optional.of(s); // Hata verir ama illa ki null koymak istersek Optional.ofNullable(s) diyip koyabiliriz
		
		Optional<String> optional3 = Optional.ofNullable(s);
		optional3.ifPresent((x) -> System.out.println( x.length())); //Null ise bir şey dönmez hata da vermez
		
		String bosIsim = null;
		String isim = Optional.ofNullable(bosIsim).orElse("Ahmet");
		System.out.println(isim);
		
		String string = Optional.ofNullable(bosIsim).orElse(test()); //test methodu her türlü calisir
		String string2 = Optional.ofNullable(bosIsim).orElseGet(() ->test()); //değer eğer null ise calisir
		System.out.println(string);
		System.out.println(string2);
		
		//Motor motor = null;//hata verir
		Motor motor = new Motor(1600);
		Araba araba = new Araba("X marka",1990,Optional.ofNullable(motor));
		System.out.println(araba);
		
	}
	public static String test() {
		System.out.println("Test Calisti");
		return "Test";
	}
}
