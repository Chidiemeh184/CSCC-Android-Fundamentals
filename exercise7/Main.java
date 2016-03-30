package com.chidiemeh.week7;

public class Main {

	public static void main(String[] args) {
		Contact person1 = new Contact("Bob", "Bob123@gmail.com");
		Contact person2 = new BusinessContact("Sue", "Sue123@gmail.com", "614-123-1234");
		
		person1.displayDetails();
		System.out.println("");
		person2.displayDetails();

	}

}
