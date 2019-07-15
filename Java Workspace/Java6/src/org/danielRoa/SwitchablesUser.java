package org.danielRoa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SwitchablesUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Switchable> list = new LinkedList<>();
		
		list.add(new Spouse());
		list.add(new Light());
		list.add(new Television());
		
		for (Switchable sw : list) {
		
			sw.switchOn();
			sw.switchOff();
			
			System.out.println("\n*------------------------------------------*\n");
		}
	}

}
