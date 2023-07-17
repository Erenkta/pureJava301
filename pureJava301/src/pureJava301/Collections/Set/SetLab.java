package pureJava301.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetLab {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sıralanacak sayilari giriniz (Cikmak icin -1) : " );
		boolean devam = true;
		int sayi;
		LinkedHashSet<Integer> sayilar = new LinkedHashSet<Integer>();
		while(devam) {
			sayi = scanner.nextInt();
			if(sayi == -1) {
				devam = false;
				break;
			}
			else {
				sayilar.add(sayi);
			}
		}
		
		System.out.println(" 			SAYILAR 			");
		for(int i : sayilar) {
			System.out.print(i +" , ");
		}	
		//Ya da iterator ile hallet 
	}
}
