package org.danielRoa;

public class Triangle extends GeometricalFigures{
	
//	Lenghts
	
	private double a;
	private double b;
	private double c;
	
//	Base and height
	
	private double h;
	private double ba;
	
	public Triangle(String color, double a, double b, double c, double ba, double h) {
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
		
		this.ba = ba;
		this.h = h;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (ba*h)/2;
	}
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}
	
	
	
}
