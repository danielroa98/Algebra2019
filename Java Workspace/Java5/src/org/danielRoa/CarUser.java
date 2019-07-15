package org.danielRoa;

import java.util.ArrayList;
import java.util.List;

public class CarUser {
	public static void main(String[] args) {
		
		Car car = new Car(123, 8.5, "Mclaren");
		
		car.start();
		car.stop();
		System.out.println("*-------------------------------------------------*");
		
		SportsCar sportsCar = new SportsCar(321, 3.5, "Ferrari", true);

		sportsCar.start();
		sportsCar.drift();
		sportsCar.stop();
		System.out.println("*-------------------------------------------------*");

		
		//implicit upcasting
		Car car2 = sportsCar;
		car2.start();
		car2.stop();
		
		//explicit downcasting
		if (car2 instanceof SportsCar) {
			((SportsCar)car2).drift();	
		}
		
		System.out.println("*-------------------------------------------------*");
	
		List<Car> cars = new ArrayList<>();
		
		cars.add(car);
		cars.add(sportsCar);
		cars.add(car2);
		
		for (Car c : cars) {
			printDetails(c);
		
		}	
		
	}

	private static void printDetails(Car c) {
		// TODO Auto-generated method stub
		System.out.println(c.getType());
		System.out.println(c.getNumber());
		System.out.println(c.getAcceleration());
		
		if (c instanceof SportsCar) {
			System.out.println(((SportsCar)c).isRoofWindow());
		}
		
		System.out.println("*-------------------------------------------------*");
	}
	
}
