package pureJava301;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("hello.txt");
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
			int c = 0;
			while( (c = inputStream.read()) != -1 ) {
				System.out.print( (char) c );
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

}
