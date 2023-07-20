package pureJava301.Java8News.DateandTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeMain {
	public static void main(String[] args) {
		System.out.println(LocalTime.now()); //Şu anki zamanı verir
		System.out.println(LocalTime.parse("21:39")); //String to Time
		
		LocalTime zaman = LocalTime.of(12, 30);
		System.out.println(zaman);
		
		LocalTime plus = LocalTime.parse("14:23").plus(1, ChronoUnit.HOURS) ; //1 saat eklendi
		System.out.println(plus);
		System.out.println("Saat : " + plus.getHour() + " Dakika : "+ plus.getMinute());
		
		System.out.println(zaman.isAfter(plus)); //isAfter - isBefore
	}
}
