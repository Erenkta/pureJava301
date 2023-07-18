package pureJava301.Collections.Map;

public class Sehir {
	private String isim;
	private long nufus;
	
	public Sehir() {
		
	}

	public Sehir(String isim, long nufus) {
		super();
		this.isim = isim;
		this.nufus = nufus;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public long getNufus() {
		return nufus;
	}

	public void setNufus(long nufus) {
		this.nufus = nufus;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return isim.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Sehir sehir = (Sehir) obj;
		return sehir.isim.equals(this.isim);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Isim : " + isim + " Nufus : " + nufus;
	}
	

}
