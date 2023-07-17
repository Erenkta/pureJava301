package pureJava301;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {

	public static void main(String[] args) {
		/*
		 * Javada 2 tip stream sınıfı bulunur
		 * Karakter Stream -> Yüksek seviyeli karakter tabanlı soyut sınıflar
		 * -->Reader and Writer --> Karakter için
		 * Byte Stream -> Düşük seviye byte tabanlı soyut sınıflar
		 * -->InputStream and OutputStream --> Byte için
		 * 
		 * Streamleri kullandıktan sonra final içinde kapatmayı unutma
		 * 
		 * StreamBuffer kullanmak her zaman daha performanslıdır.Ama yer ayırmamız lazım
		 */

		File file = new File("hello.txt"); //ilk olarak kaynağımızı belirtiyoruz
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file); //FileNotFound fırlatabilir
			fileOutputStream.write("Merhaba".getBytes()); //IOException fırlatabilir
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
	}

}
