package pureJava301.Java8News;

import java.io.Serializable;

public class Bisiklet implements Serializable{
	private String marka;
	private int vites;
	private String deneme;
	
	public Bisiklet() {
		
	}
	public Bisiklet(String marka) {
		this.marka = marka;
	}
	
	public Bisiklet(String marka, int vites) {
		super();
		this.marka = marka;
		this.vites = vites;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getVites() {
		return vites;
	}

	public void setVites(int vites) {
		this.vites = vites;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marka : " + marka + " Vites : " + vites ;
	}
	
}
