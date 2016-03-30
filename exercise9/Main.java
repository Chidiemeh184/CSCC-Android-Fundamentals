//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: Main.java
//	DATE:	3/30/2016
//	DESCRIPTION: Exercise 9
//				 This program demonstrates abstract classes
//==========================================================

package com.chidiemeh.week9;


abstract class Contact {
	
	public String name;
	
	public Contact(String name){
		this.name = name;
	}
	
	public abstract void display();
	
}

class Faculty extends Contact{
	private String email;
	
	public Faculty(String name, String email){
	 super(name);
	 this.email = email;
	}

	@Override
	public void display() {
		System.out.println("Emailing Faculty: " + this.name);
		System.out.println("Emailing ...(" + this.email + ")");
		System.out.println("");
	}	
}

class Student extends Contact {
	private String phone;
	
	public Student(String name, String phoneNumber) {
		super(name);
		this.phone = phoneNumber;
	}

	@Override
	public void display() {
		System.out.println("Calling Student: " + this.name);
		System.out.println("Calling ...(" + this.phone + ")");
		System.out.println("");
	}
	
}

public class Main {

	public static void main(String[] args) {
	
		Faculty person1 = new Faculty("Chad", "Chad123@cscc.edu");
		person1.display();
		
		Student person2 = new Student("Bob", "614-123-1234");
		person2.display();

	}

}
