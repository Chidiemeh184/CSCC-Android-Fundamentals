package com.chidiemeh.week4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class DemoTreeSet {

	public static void main(String[] args) {
		Set<Integer> numbers = new TreeSet<>();
		
		numbers.add(110);
		numbers.add(-500);
		numbers.add(30);
		numbers.add(-500);
		
		for(Integer number: numbers){
			System.out.println(number);
		}
		
		System.out.println("===========================");
		
		Set<Integer> numbers1 = new HashSet<>();
		
		numbers1.add(110);
		numbers1.add(-500);
		numbers1.add(30);
		numbers1.add(-500);
		
		for(Integer number: numbers){
			System.out.println(number);
		}

	}

}
