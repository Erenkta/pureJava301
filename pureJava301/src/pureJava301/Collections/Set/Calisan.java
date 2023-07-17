package pureJava301.Collections.Set;

public class Calisan {
	private String isim;
	private int maas;

	public Calisan(String isim, int maas) {
		super();
		this.isim = isim;
		this.maas = maas;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	
	@Override
	public String toString() {
		return "Calisan : " + isim + " Maas : " + maas;
	}
	
}
