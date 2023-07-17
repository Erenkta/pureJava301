package pureJava301;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class BufferedReaderAndWriter {
	public static void main(String[] args) throws IOException {
		File file = new File("buffer.txt");
		fileWrite(file);

	}

	public static void fileRead(File file) throws IOException {
		BufferedReader bufferedReader = null;
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
	}

	public static void fileWrite(File file) throws IOException {
		FileWriter fileWriter= null;
		BufferedWriter bufferedWriter = null;
		try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			Scanner scanner = new Scanner(System.in);
			String line = null;
			while (!((line = scanner.nextLine()).equalsIgnoreCase("quit"))) {
				bufferedWriter.write(line.toCharArray()); //Bellekte tutuluyor close methodu çağrılınca ya da yeri dolunca diske yazılacak
				//bufferedWriter.flush(); ile istediğimiz zaman yazdırırız
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
}
