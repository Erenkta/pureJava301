package pureJava301.Java8News.FunctionalInterfaces;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FunctionalInterfaceLab {
	public static void main(String[] args) {
		ArrayList<Ogrenci> sinif = new ArrayList();
		sinif.add(new Ogrenci(1,"Ali",80));
		sinif.add(new Ogrenci(2,"Seyhan",90));
		sinif.add(new Ogrenci(3,"Mehmet",75));
		sinif.add(new Ogrenci(4,"Bekir",60));
			
		sinif.forEach( (ogr) -> System.out.println(ogr) );
		System.out.println("Sirali Not");
		Collections.sort(sinif,(o1,o2)-> o1.getNotOrtalama() - o2.getNotOrtalama()); // 1 0 -1 dönecek
		sinif.forEach( (ogr) -> System.out.println(ogr) );
		System.out.println("Sirali Isim");
		Collections.sort(sinif , (o1,o2) -> o1.getAd().compareTo(o2.getAd()));
		sinif.forEach( (ogr) -> System.out.println(ogr) );
		
		
		
		Scanner scanner = new Scanner(System.in);
		//Runnable -> async islemler için
		/*
		 * 	Thread kullaniciGirisThread = new Thread(new Runnable() {

			@Override
			public void run() { //Bu farklı bir threadde calisacak
				while(true) {
					String line = scanner.nextLine().toUpperCase();
					System.out.println(line);
				}	
			}
		}); 
		 */

		Thread zamanThread = new Thread( () -> {
			while(true) { //zamanı yazıyor
				System.out.println(new Date());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread kullaniciGirisThread = new Thread(() -> {
			while(true) {
				String line = scanner.nextLine().toUpperCase();
				System.out.println(line);
				if(line.equalsIgnoreCase("Baslat")) {
					zamanThread.start();
				}
			}
		});
		kullaniciGirisThread.start(); //Thread'i baslattık

	}
}
