package pureJava301;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class StreamAPI {
	public static void main(String[] args) throws IOException {
		File file = new File("output.dat");
		 dosyaYaz(file);
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			int isFinished;
			while( (isFinished = fileInputStream.read()) != -1) {
				System.out.println( (char) isFinished + " Binary olarak = " + isFinished);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			if( fileInputStream != null) {
				fileInputStream.close();
			}
		}
		
		//Dosya içeriğin binary olarak ekrana bastırmak

	}
	public static void dosyaYaz(File file) throws IOException {
		FileOutputStream fileOutputStream = null;
		Scanner scanner = new Scanner(System.in);
		try {
			fileOutputStream = new FileOutputStream(file);
			String line = null;
			while( !( line = scanner.nextLine()).equalsIgnoreCase( "quit")) {
				fileOutputStream.write(line.getBytes());
				System.lineSeparator();
			}
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			if( fileOutputStream != null) {
				fileOutputStream.close();
			}
			scanner.close();
		}
	}
}
