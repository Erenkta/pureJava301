package pureJava301.Java8News.DateandTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Java time paketleri 
		 * java.time ,chrono , format ,temporal , zone
		 * LocalDate , LocalTime ve LocalDateTime sınıflar
		 */
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate ); //Yıl ay ve gün
		System.out.println(localDate.plus(1,ChronoUnit.DAYS) ); //Verdiğimiz güne 1 gün ekleyip geri döndürdü
		System.out.println(localDate.plusDays(2) ); //Verdiğimiz güne 2 gün ekleyip geri döndürdü
		System.out.println(localDate.minus(1,ChronoUnit.MONTHS)  + "\n"); // 1 ay öncesini bastırdı
		
		System.out.println(LocalDate.of(1990, 6, 22)  + "\n");
		
		System.out.println(LocalDate.parse("2020-01-17")  + "\n"); //String to LocalDate
		System.out.println(LocalDate.parse("2020-11-22").getDayOfWeek()); //Tarihin hangi güne denk geldiği
		System.out.println(LocalDate.parse("2020-11-22").getDayOfYear() + "\n"); //Tarihin hangi güne denk geldiği ( Sayı)
		
		LocalDate birinciTarih =  LocalDate.parse("2020-12-05");
		LocalDate ikinciTarih =  LocalDate.parse("2021-06-12");
		System.out.println(birinciTarih.isBefore(ikinciTarih)); //isBefore , isAfter
		
		//Yas hesaplama console app
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dogum Yilinizi Giriniz (Yil - Ay - Gun) : ");
		LocalDate dogumYili = LocalDate.parse(scanner.nextLine());
		
		System.out.println("Yasiniz : " + (LocalDate.now().getYear() - dogumYili.getYear()));
		


	}

}
