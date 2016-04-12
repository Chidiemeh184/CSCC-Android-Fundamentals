//==========================================================
//NAME: CHIDI EMEH
//COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//FILENAME: Main.java
//DATE:	4/12/2016
//DESCRIPTION: Exercise 10
//Demonstrates implementation of iterable interface
//==========================================================

package com.chidiemeh.week11;

/**
 * @author Chidi Emeh
 *  
 *
 */

public class Main {

/**
 * @param args Main method to test the class
 */
public static void main(String[] args) {
	Contact person1 = new Contact("Bob", "Bob123@gmail.com");
	Contact person2 = new Contact("Sue", "Sue123@gmail.com");
	Contact person3 = new Contact("John", "Johnny23@gmail.com");
	Contact person4 = new Contact("Jen", "Jennyfar125@gmail.com");
	
	
	Contacts<Contact> myContacts = new Contacts<Contact>();
	
	myContacts.addContact(person1);
	myContacts.addContact(person2);
	myContacts.addContact(person3);
	myContacts.addContact(person4);
	
	
	for(Contact item : myContacts){
		System.out.println(item);
	}

}

}

