package pureJava301;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.rmi.server.RemoteStub;
import java.util.Arrays;

public class BytesAndCharacters {
	public static void main(String[] args) throws IOException {
		File file = new File("images.png");
		byte[] buffer = new byte[1024];
		int isFinished;
		
		if(file.exists()) {
			FileInputStream fileInputStream = null;
			try {
				fileInputStream = new FileInputStream(file);
				while( (isFinished = fileInputStream.read(buffer)) != -1 ) { //Bu while'ı unutma
					System.out.println(Arrays.toString(buffer));
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(fileInputStream != null) {
					try {
						fileInputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
		//Byte -> Karakter akışı
		/*
		 * InputStreamReader sınıfı byteları karakterlere çevirmeye yardımcı olur
		 * OutpuStreamWriter sınıfı karakterleri bytelara çevirmeye yardımcı olur
		 */
		File file2 = new File("test.txt");
		karakterToByteYaz(file2);
		
		FileInputStream fileInputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try {
			fileInputStream = new FileInputStream(file2);
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			String line = null;
			while( (line = bufferedReader.readLine()) != null ) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			if(bufferedReader != null) {
				bufferedReader.close();
			}
			if(fileInputStream != null) {
				fileInputStream .close();
			}
			if(inputStreamReader != null) {
				inputStreamReader .close();
			}
		}
		 
		
	}
	public static void karakterToByteYaz(File file2) {

		
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file2);
			OutputStreamWriter outStreamWriter = new OutputStreamWriter(fileOutputStream);
			outStreamWriter.write("Merhaba Dünya"); //Bu sınıf ile karakterleri byte'a çevirdik
			outStreamWriter.close();
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
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
