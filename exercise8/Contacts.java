//==========================================================
//	NAME: CHIDI EMEH
//	COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//	FILENAME: Contacts.java
//	DATE:	3/30/2016
//	DESCRIPTION: Exercise 8
//
//==========================================================

package com.chidiemeh.week7;

import java.util.ArrayList;

public class Contacts{
	private ArrayList<Contact> storage; 
	
	
	public Contacts() {
		storage = new ArrayList<Contact>();
	}
	
	public void addToContacts(Contact contact){
		storage.add(contact);
	}
	
	public void displayAll(){
		for (Contact person: storage){
			System.out.println(" ");
			person.displayDetails();
		}
	}
}
