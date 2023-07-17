package pureJava301.Serialization;

import java.io.Serializable;

public class Motor implements Serializable{
	private int hacim;

	public int getHacim() {
		return hacim;
	}

	public void setHacim(int hacim) {
		this.hacim = hacim;
	}
	public String toString() {
		return "Hacim : "+hacim;
	}
}
