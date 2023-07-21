package pureJava301.Java8News.StreamAPI;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	private int id;
	private String ad;
	private int yas;
	public Ogrenci() {
		super();
	}
	public Ogrenci(int id, String ad, int yas) {
		super();
		this.id = id;
		this.ad = ad;
		this.yas = yas;
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
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ad : "+ad+" Yas : "+yas+" Id : "+id;
	}
}
