package org.danielRoa;

public class Car {

	private int number;
	private double acceleration;
	private String type;
	
	public Car(int number, double acceleration, String type) {
		super();
		this.number = number;
		this.acceleration = acceleration;
		this.type = type;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void start() {
		System.out.println("Car driving");
	}
	
	public void stop() {
		System.out.println("Car stopping");
	}
	
}
