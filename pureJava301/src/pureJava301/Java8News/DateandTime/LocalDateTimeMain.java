package pureJava301.Java8News.DateandTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeMain {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now()); //Hem tarih hem zaman
		
		LocalDateTime zaman = LocalDateTime.of(2020,10,5,14,37);
		System.out.println(zaman);
		System.out.println(zaman.plus(4,ChronoUnit.DAYS));
		LocalDateTime ikinciZaman = LocalDateTime.of(2021, 06,12,15,32);
		
		System.out.println(ChronoUnit.SECONDS.between(zaman, ikinciZaman)); //birinci ve ikinci zaman arasındaki saniye cinsi
	}
}	
