package pureJava301.Collections.List;

import java.io.Serializable;

public class Ogrenci implements Serializable {
	private int id;
	private String ad;
	
	
	public Ogrenci() {
		super();
	}
	public Ogrenci(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	@Override
	public int hashCode() {
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		Ogrenci ogrenci = (Ogrenci) obj;
		return ogrenci.id == this.id;
	}
	@Override
	public String toString() {
		return "Ad : " + ad + " Numara : " + id;
	}
	
}
