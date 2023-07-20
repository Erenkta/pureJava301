package pureJava301.Java8News.DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateLab {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tarih : ");
		LocalDate tarih = LocalDate.parse(scanner.nextLine());
		System.out.print("Zaman giriniz : ");
		LocalTime zaman = LocalTime.parse(scanner.nextLine());
		
		LocalDateTime kullaniciZaman = LocalDateTime.of(tarih, zaman);
		System.out.println("Girilen tarih ve saat : "+kullaniciZaman);
		
		System.out.println("İslem Seciniz (0 Ekle) (1 Cikar) : ");
		int secim = scanner.nextInt();
		
		if(secim == 0 || secim == 1) {
			ChronoUnit[] chronoUnits = ChronoUnit.values();
			for(int i = 0 ; i< chronoUnits.length;i++) {
				System.out.print(chronoUnits[i] + "( "+ i + ")");
				ChronoUnit birim = chronoUnits[scanner.nextInt()];
				System.out.println("Deger");
				int deger = scanner.nextInt();
				if(secim == 0) {
					System.out.println(kullaniciZaman.plus(deger,birim));
				}
				else {
					System.out.println(kullaniciZaman.minus(deger,birim));
				}
			}
		}
		else {
			System.out.println("Hata ");
		}
	}
}
