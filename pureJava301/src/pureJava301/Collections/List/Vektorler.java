package pureJava301.Collections.List;

import java.util.Vector;

public class Vektorler {
	public static void main(String[] args) {
		/*
		 * boyut -> içindeki eleman
		 * kapasite -> maksimum boyut
		 */
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		for(int i : vector) {
			System.out.println(i);
		}
		System.out.println("Default  kapasite : "+vector.capacity()); //default 10 dur
		System.out.println(vector.contains(10));

	}
}
