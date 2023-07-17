package pureJava301.Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationLab {

	public static void main(String[] args) throws IOException {
		Araba araba = new Araba();
		Motor motor = new Motor();
		motor.setHacim(2550);
		araba.setMarka("BMW");
		araba.setModel("320i");
		araba.setYil(2009);
		araba.setMotor(motor);
		
		File file = new File("arabaBilgi.txt");
		diskeYaz(file, araba);
		disktenOku(file);

	}
	public static void diskeYaz(File file,Araba araba) throws IOException{
		ObjectOutputStream objectOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(araba);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if ( objectOutputStream != null) {
				objectOutputStream.close();
			}
		}
		
	}
	public static void disktenOku(File file) throws IOException{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
			
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			Araba araba = (Araba) objectInputStream.readObject();
			System.out.println(araba);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
