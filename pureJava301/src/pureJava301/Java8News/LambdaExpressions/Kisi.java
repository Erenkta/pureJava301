package pureJava301.Java8News.LambdaExpressions;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {
	public enum Cinsiyet{KADIN,ERKEK};
	private String isim;
	private LocalDate dogumTarihi;
	private String email;
	private Cinsiyet cinsiyet;
	
	
	
	
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	public Kisi() {
		super();
	}
	public Kisi(String isim, LocalDate dogumTarihi, String email,Cinsiyet cinsiyet) {
		super();
		this.isim = isim;
		this.dogumTarihi = dogumTarihi;
		this.email = email;
		this.cinsiyet = cinsiyet;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Isim : " + isim + " Dogum Tarihi : " + dogumTarihi + " Email : "+ email;
	}

	
}
