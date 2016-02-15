package com.chidiemeh.week4;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		int number = 10;
		char letter = 'A';
		
		Integer wrappedInt = new Integer(number);
		Character wrappedChar = new Character(letter);
		
		System.out.println(Integer.MAX_VALUE);
		Integer newInt = Integer.parseInt("12");
		
		
		
		List<String> cities = new LinkedList<String>();
		cities.add("Los Angeles");
		cities.add("San Francisco");
		cities.add("San Diego");
		
		System.out.println("San Diego in list: " + cities.contains("San Diego"));
		System.out.println("Size: " + cities.size());
		
		cities.add(1, "Tokyo");
		cities.remove(2);
		
		for (String element: cities){
			System.out.println(element);
		}
	}

}
