package pureJava301.Java8News.Optional;

import java.io.Serializable;
import java.util.Optional;
import java.util.function.Supplier;

public class Araba implements Serializable{
	private String marka;
	private int model;
	private Motor motor;
	
	
	public Araba() {
		super();
	}

	public Araba(String marka, int model, Optional<Motor> motor) {
		super();
		this.marka = marka;
		this.model = model;
		this.motor = motor.orElseThrow(new Supplier<IllegalArgumentException>() {

			@Override
			public IllegalArgumentException get() {
				// TODO Auto-generated method stub
				return new IllegalArgumentException("Motor Null olamaz");
			}
		});
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marka : "+marka + " Model : " + model + " Motor : " + motor ;
	}
	

}
