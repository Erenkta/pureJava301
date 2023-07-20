package pureJava301.Java8News.FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		/*
		 * içerisinde sadece 1 adet soyut metot bulundurur
		 * Lamda ifadelerinin hedef tipini tanımlar (Lambda ifadeler sadece hedef tipi belliyse kullanılabilir)
		 * En çok kulalnılan ara yüzler (Hazır olarak)-> Unary,Binary operatorler , Consumer, Supplier, Funtion, Predicate ,Comparator
		 */
		
		Matematik matTopla = (a,b)-> System.out.println("Sonuc : "+(a+b)); 
		matTopla.islem(10,20);
		
		Matematik matCikar = (a,b)->System.out.println("Sonuc : "+(a-b));
		matCikar.islem(20, 60);
		
		ArrayList<String> sehirler = new ArrayList();
		sehirler.add("Istanbul");
		sehirler.add("Ankara");
		sehirler.add("Bursa");
		sehirler.add("Balikesir");
		sehirler.add("Cankiri");
		sehirler.add("Agri");
		sehirler.add("Mus");
		sehirler.add("Sivas");
		
		//Consumer
		sehirler.forEach( (str) -> System.out.println(str) ); 
		System.out.println("---- ---- ---- ---- ---- ----- ---- ---- ----- ---- ----- ---- ---- ---");
		
		//Predicate
		Predicate<String> predicate = (t)-> t.length() > 6 ; //True false değer döner
		for(String sehir : sehirler) {
			if(predicate.test(sehir)) {
				System.out.println(sehir);
			}
		}
		System.out.println("---- ---- ---- ---- ---- ----- ---- ---- ----- ---- ----- ---- ---- ---");
		//Supplier
		Supplier<List<Urun>> supplier = () -> {
			List<Urun> list = new ArrayList<>();
			list.add(new Urun(1,"Laptop",5000));
			list.add(new Urun(2,"Telefon",4000));
			list.add(new Urun(3,"Klavye",2000));
			list.add(new Urun(4,"Tablet",3000));
			return list;
		};
		supplier.get().forEach( (urun) -> System.out.println(urun) );
		
	}

}
