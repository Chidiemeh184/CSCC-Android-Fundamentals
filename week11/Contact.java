//==========================================================
//NAME: CHIDI EMEH
//COURSE: CSCI 2449 (ANDROID PROGRAMMING FUNDAMENTALS)
//FILENAME: Contact.java
//DATE:	4/12/2016
//DESCRIPTION: Exercise 10
//==========================================================


package com.chidiemeh.week11;

/**
 * @author Chidi Emeh
 *
 */

public class Contact {
	/**
	 * The name of contact (String)
	 */
	public String name;
	/**
	 *  The email address of contact (String)
	 */
	public String email;

	Contact(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * Displays name and email address
	 */
	public void displayDetails() {
		System.out.println("Name: "+ this.name);
		System.out.println("Email: "+ this.email);
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + "]";
	}
	
	
}

