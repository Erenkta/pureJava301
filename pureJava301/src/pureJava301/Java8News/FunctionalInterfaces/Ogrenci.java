package pureJava301.Java8News.FunctionalInterfaces;

public class Ogrenci {
	private int numara;
	private String ad;
	private int notOrtalama;
	
	
	public Ogrenci() {
		
	}
	


	public Ogrenci(int numara, String ad, int notOrtalama) {
		super();
		this.numara = numara;
		this.ad = ad;
		this.notOrtalama = notOrtalama;
	}



	public int getNumara() {
		return numara;
	}


	public void setNumara(int numara) {
		this.numara = numara;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public int getNotOrtalama() {
		return notOrtalama;
	}


	public void setNotOrtalama(int notOrtalama) {
		this.notOrtalama = notOrtalama;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.numara;
	}
	@Override
	public boolean equals(Object obj) {
		Ogrenci ogr = (Ogrenci) obj;
		return this.numara == ogr.getNumara();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Isim : " + ad + " Numara : "+numara + " Not Ort : "+notOrtalama; 
	}
}
