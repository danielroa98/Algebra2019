package org.danielRoa;

public class Rectangle extends GeometricalFigures{

	private int a;
	private int b;
	
	public Rectangle(String color, int a, int b) {
		super(color);
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(a+b);
	}
	
}
