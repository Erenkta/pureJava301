package pureJava301.Java8News.Optional;

import java.io.Serializable;

public class Motor implements Serializable{
	private int hacim;
	
	public Motor() {
		
	}
	public Motor(int hacim) {
		this.hacim = hacim;
	}
	public int getHacim() {
		return hacim;
	}
	public void setHacim(int hacim) {
		this.hacim = hacim;
	}
	
}
