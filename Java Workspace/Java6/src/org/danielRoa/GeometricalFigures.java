package org.danielRoa;

public abstract class GeometricalFigures {

	private String color;

	public GeometricalFigures(String color) {
		super();
		this.color = color;
	}
	
	public abstract double area();
	public abstract double perimeter();				
	
}
