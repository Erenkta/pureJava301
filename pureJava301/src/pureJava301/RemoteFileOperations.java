package pureJava301;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class RemoteFileOperations {

	public static void main(String[] args) {
		/* Uzaktaki bir dosyayı indirmek
		
		URL url = null;
		try {
			url = new URI("http://www.w3.org/TR/2003/REC-PNG-20031110/iso_8859-1.txt").toURL();
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			InputStream inputStream = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			
			FileOutputStream fileOutputStream = new FileOutputStream("getFromURL.txt");	
			char[] buffer = new char[2048];
			StringBuilder builder = new StringBuilder();
			int length = 0;
			while ( (length = inputStreamReader.read(buffer))!= -1 ) {
					//builder.append(Arrays.copyOfRange(buffer, 0, length));
				fileOutputStream.write(new String(Arrays.copyOfRange(buffer, 0, length)).getBytes());
			}
			System.out.println(builder.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir URL Giriniz : ");
		String _URL = scanner.nextLine();
		try {
			URL url = new URI(_URL).toURL();
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			InputStream inputStream = connection.getInputStream();
			FileOutputStream fileOutputStream = new FileOutputStream("getFromURL.txt");
			byte[] buffer = new byte[1024];
			int length = 0;
			while( (length  = inputStream.read(buffer)) != -1 ) {
				fileOutputStream.write(Arrays.copyOfRange(buffer, 0, length));
			}
			fileOutputStream.close();
			inputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
