package pureJava301;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileAndPath {

	public static void main(String[] args) {
		File file = new File("hello.txt");
		System.out.println(file.exists()); // var mı yok mu
		System.out.println("Okuma = " + file.canRead() + " Yazma = "+file.canWrite()); //okuma yazma
		System.out.println(file.isDirectory()); //Dosya mı değil mi
		System.out.println(file.getAbsolutePath()); //Tam konum verir
		System.out.println(file.getParent()); //Parent dosyası var mı
		System.out.println(file.length()); //Dosyadaki harf sayısı
		System.out.println(new Date(file.lastModified())); //Dosyada son işlemin yapılma tarihi
		
		File file2 = new File("C:\\Users\\itsme\\OneDrive\\Belgeler\\GitHub\\pureJava301\\pureJava301\\ornek.txt");
		if( !(file2.exists()) ) { //Eğer böyle bir dosya yoksa oluşturduk
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(file2.exists()){
			boolean isDeleted;
			isDeleted = file2.delete();
			if(isDeleted) {
				System.out.println("Dosya silindi");
			}
			else {
				System.out.println("Dosya bulunamadı");
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dosya yolu : ");
		String path = scanner.nextLine();
		
		File givenPathFile = new File(path);
		for(String icerik : givenPathFile.list()) { //Verilen dosyanın içindekileri bastırdı
			System.out.println(icerik);
		}
		
		//System.lineseperator() yazdığımız boşlukları algılar
		
		
		
		
		

	}

}
