package pureJava301.Serialization;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Serialization {
	public static void main(String[] args) throws IOException {
			
		/*
		 * Bir nesneyi serileştirmek için :
		 * ->Sınıf public olmalı
		 * ->Sınıf Serializable interface'ini implemente etmeli
		 * ->Constructorda argüman olmamalı (parametreli constructor olsa bile bir tane parametresiz oluştur)
		 * ->Sınıfın tüm fieldları serileştirilebilmeli (Wrapper Class  kullanılmalı)
		 */
		Ogrenci ogr = new Ogrenci();
		ogr.setIsim("Ahmet");
		ogr.setNumara(12);
		
		//File file = new File("ogrenciBilgi.txt");
		//diskeYaz(file,ogr);
		//disktenOku(file);
		

		
		
	}
	public static void diskeYaz(File file,Ogrenci ogr) throws IOException{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(ogr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if ( objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
	}
	public static void disktenOku(File file) throws IOException{
		ObjectInputStream objectInputStream = null;
		FileInputStream fileinputStream = null;
		try {
			fileinputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileinputStream);
			Ogrenci ogrenci = (Ogrenci) objectInputStream.readObject();
			System.out.println(ogrenci);
		} catch (IOException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if ( objectInputStream != null) {
				objectInputStream.close();
			}
		}
	}
}
