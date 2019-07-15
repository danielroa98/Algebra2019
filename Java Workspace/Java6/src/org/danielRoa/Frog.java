package org.danielRoa;

public class Frog {

	private int nrLegs;
	private String color;
	
	public Frog(int nrLegs, String color) {
		//super(); 
		this.nrLegs = nrLegs;
		this.color = color;
	}
	
	@Override
	public String toString() {
		
		return color + ", "+ nrLegs;
	}
	
	@Override
	public boolean equals(Object obj) {
		
//		Ternary version of the return code
		
		return obj instanceof Frog
				?
						this.color.equals(((Frog)obj).color)
						&& this.nrLegs == ((Frog)obj).nrLegs
					:
						false;
		
	
//		IF version of the return code
				
//		if (obj instanceof Frog) {
//		
//			Frog other = (Frog)obj;
//			return this.color.equals(other.color) && this.nrLegs == other.nrLegs;
//			
//		}
//		
//		return false;
	
		
	}
}
