package org.danielRoa;

import java.util.ArrayList;
import java.util.List;

public class GeometricalFigureUser {

	public static void main(String[] args) {
		
//		GeometricalFigures gf = new GeometricalFigure("Red");
		
//		GeometricalFigures rect = new Rectangle("red", 1, 2);
		
//		List creation
		
		List<GeometricalFigures> figures = new ArrayList<GeometricalFigures>();
		
//		Variable declarations & addition to the lists
		
		figures.add(new Rectangle("red", 1, 2));
		figures.add(new Circle("blue", 3.213));
		figures.add(new Triangle("Green", 3, 3, 3, 3, 6.34));
		
//								IMPORTANT, THE LAST TWO VALUES ARE FOR BASE AND THE HEIGHT OF THE TRIANGLE.
		
//		Prints the values found in each list variable
		
		for (GeometricalFigures gf : figures) {
			
			System.out.println(gf.getClass().getName());
			System.out.println("Area: "+ gf.area());
			System.out.println("Perimeter: " + gf.perimeter());
			
			System.out.println("\n*------------------------------------------*\n");
			
		}
		
	
	}//fin MAIN
	
}//fin CLASS
