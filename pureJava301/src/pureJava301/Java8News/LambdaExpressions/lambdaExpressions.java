package pureJava301.Java8News.LambdaExpressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import pureJava301.Java8News.LambdaExpressions.Kisi.Cinsiyet;

public class lambdaExpressions {
	
	public static void kisiFiltre(List<Kisi> kisiler, KisiFiltrele kisiFiltrele) {
		for(Kisi kisi : kisiler) {
			if(kisiFiltrele.filtrele(kisi)) {
				System.out.println(kisi);
			}
		}
		
	}
	public static void main(String[] args) {
		/*
		 * dilin ifade gücünü arttırdı
		 * API kütüphaneleri yeni yetenekler kazandı
		 *  Lambda Expression -> Temelde anonim bir metottur. 
		 *  ->Kendini icra etmek yerine fonksiyonel arayüz'ün metodunu implemente etmek için kullanılırlar
		 *  ->Genel yapıları anonim class'lar gibidir ve closures şeklinde atfedilir
		 *  
		 *  Functional Interface -> İçerisinde yalnızca 1 tane soyut method bulunduran arayüze verilen isimdir
		 *  ->SAM olarak da bilinir
		 * 
		 * 
		 * Lambdanın yapısı -> () -> {} 
		 * (n) -> n*125 ya da (n) -> {...}
		 * 
		 * Fonksiyonel Arayüz -> interface Sayı(){ double sayıyıAl()}
		 * 
		 * Sayi benimSayim;
		 * benimSayim = () -> 150;
		 * benimSayim.sayiyiAl() -> 150 sayısının konsola yazılmasını sağladı
		 * 
		 */
		//Ornek
		SayiOlustur sayi;
		sayi = () -> 150.0; //Lambda ile ifade ettik
		System.out.println(sayi.olustur()); //Fonskiyonel arayüz'ü kullandık
		
		Merhaba merhaba;
		merhaba = (message) -> "Selam " + message  ; //Bir bakıma fonksiyonu burada tanimliyoruz
		System.out.println(merhaba.selam("Field ile yapildi"));
		
		Topla toplama;
		toplama = (x,y) -> x+y;
		System.out.println(toplama.topla(12, 5));
		
		
		Kisi kisi1 = new Kisi("Ali",LocalDate.parse("1993-12-01"),"ali@gmail.com",Cinsiyet.ERKEK);
		Kisi kisi2 = new Kisi("Aliye",LocalDate.parse("2002-04-26"),"aliye@gmail.com",Cinsiyet.KADIN);
		Kisi kisi3 = new Kisi("Fatma",LocalDate.parse("1999-08-13"),"fatma@gmail.com",Cinsiyet.KADIN);
		Kisi kisi4 = new Kisi("Eren",LocalDate.parse("1956-07-25"),"eren@gmail.com",Cinsiyet.ERKEK);
		ArrayList<Kisi> kisiler = new ArrayList();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);
		kisiler.add(kisi4);
		
		/* Anonim class ile
		kisiFiltre(kisiler, new KisiFiltrele() { 

			@Override
			public boolean filtrele(Kisi kisi) {
				// TODO Auto-generated method stub
				return kisi.getCinsiyet() == Cinsiyet.KADIN;
			}
		});
		*/ 
		kisiFiltre(kisiler, (k) -> k.getCinsiyet() == Cinsiyet.ERKEK);  //Bu da lambda ile yapımı
	}

}
