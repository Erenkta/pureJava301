package pureJava301;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("hello.txt");
		File fileOutput = new File("hello output.txt");
		InputStream inputStream = null;
		OutputStream outpuStream = null;
		try {
			inputStream = new FileInputStream(file);
			outpuStream = new FileOutputStream(fileOutput);
			int c = 0;
			while( (c = inputStream.read()) != -1 ) {
				char ch = (char) c;
				outpuStream.write(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
