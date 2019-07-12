package first.api;

public class Calculator {

	private double a;
	private double b;
	
	public Calculator() {
		
	}
	
	public Calculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public double add(){
		return b == 0 ? 0 : a+b;
	}
	
	public double sub(){
		return b == 0 ? 0 : a-b;
	}
	
	public double mul(){
		return b == 0 ? 0 : a*b;
	}
	
	public double div(){
		
		return b == 0 ? 0 : a/b;
		
//		return a/b;
	}
	
	
}
