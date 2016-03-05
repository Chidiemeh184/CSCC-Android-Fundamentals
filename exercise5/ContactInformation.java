//===========================================
//  NAME: Chidi Emeh
//  COUGAR ID:   1155430
//	ASSIGNMENT: Exercise 5
//  COURSE: Android programming fundamentals
//  DATE: 3/4/2016
//===========================================


package com.chidiemeh.week5;

/**
 * @author Chidi Emeh
 * 
 * This class creates a contact information object
 *
 */
public class ContactInformation {
	
	/**
	 *  The name of the contact
	 */
	private String name;
	/**
	 *  The email of the contact
	 */
	private String email;
	
	/**
	 *  Constructor for the class
	 * @param name
	 * @param email
	 */
	public ContactInformation(String name, String email){
		this.name = name;
		this.email = email;
	}

	/** Returns the name of the contact
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 *  Returns the email of the contact
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

}
