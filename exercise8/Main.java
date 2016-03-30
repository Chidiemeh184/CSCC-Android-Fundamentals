//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: Main.java
//	DATE:	3/30/2016
//	DESCRIPTION: Exercise 8
//  Demonstrates upcasting and late binding
//==========================================================

package com.chidiemeh.week7;

public class Main {

	public static void main(String[] args) {
		Contact person1 = new Contact("Bob", "Bob123@gmail.com");
		Contact person2 = new BusinessContact("Sue", "Sue123@gmail.com", "614-123-1234");
		Contact person3 = new Contact("John", "Johnny23@gmail.com");
		Contact person4 = new BusinessContact("Jen", "Jennyfar125@gmail.com", "614-124-1244");
		
		Contacts myContacts = new Contacts();
		
		myContacts.addToContacts(person1);
		myContacts.addToContacts(person2);
		myContacts.addToContacts(person3);
		myContacts.addToContacts(person4);
		
		myContacts.displayAll();

	}

}
