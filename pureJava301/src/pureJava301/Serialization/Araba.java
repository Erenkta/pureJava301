package pureJava301.Serialization;

import java.io.Serializable;

public class Araba implements Serializable {
	private String marka;
	private String model;
	private int yil;
	private Motor motor;
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Marka : " + this.marka + " Model : " + this.model +" Yil : "+ yil;
	}
}
