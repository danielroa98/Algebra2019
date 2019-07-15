package org.danielRoa;

public class Circle extends GeometricalFigures{

	private double r;
	
	public Circle(String color, double r) {
		super(color);
		this.r = r;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(r, 2)*Math.PI;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	
	
}
