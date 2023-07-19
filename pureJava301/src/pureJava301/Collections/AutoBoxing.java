package pureJava301.Collections;

import java.util.ArrayList;

public class AutoBoxing {
	public static int passInteger(Integer x) {
		return x.intValue();
	}

	public static void main(String[] args) {
		/*
		 * Java'da koleksiyonlara ilkel tipler eklemek yasaklanmıştır
		 * Eklenecek eleman wrap edilmelidir ( bir nesne tipinde sarılmalıdır)
		 * AutoBoxing -> ihtiyac olunca ilkel tipleri otomatik olarak nesne tipiyle sarılmasıdır
		 * Manuel olarak dönüştürmek de mümkün
		 */
		
		
		int i = 10;
		passInteger(i); // i normalde bir primitive type olan int'dir fakat Java otomatik olarak INTEGER'a dönüştürdü
		
		Double d = 10.0;
		double x = d; //Referans type olan Double'ı otomatik olarak autoboxing yaptı ve double'a dönüştürdü
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		int z = 20;
		arrayList.add(z);  //Autoboxing int -> Integer
		int y = arrayList.get(0); // Auto unboxing Integer -> int
		
	}

}
