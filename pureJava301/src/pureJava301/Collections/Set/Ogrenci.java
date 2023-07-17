package pureJava301.Collections.Set;

public class Ogrenci implements Comparable<Ogrenci> {
	public int id;
	public String isim;
	@Override
	public int compareTo(Ogrenci o) {
		
		return this.id - o.id; // 1 0 -1 dönüyor //0 dönerse iki nesne eşittir ve eklemez çünkü unique tutar
		//return this.isim.compareTo(o.isim) //isime göre sıralar
	}
	
	public Ogrenci(int id, String isim) {
		this.id = id;
		this.isim = isim;
	}

	@Override
	public String toString() {
		return "Ad : " + isim + " Numara : " + id;
	}
}
