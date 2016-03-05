//===========================================
//  NAME: Chidi Emeh
//  COUGAR ID:   1155430
//	ASSIGNMENT: Exercise 5
//  COURSE: Android programming fundamentals
//  DATE: 3/4/2016
//===========================================

package com.chidiemeh.week5;

import java.util.LinkedHashMap;

/**
 * This class creates an Address Book Object
 * 
 * @author Chidi Emeh
 *
 */
public class AddressBook {

	/**
	 *  The main directory for the address book class, a Linked Hash Map
	 */
	private LinkedHashMap<String, String> mainDirectory = new LinkedHashMap<String, String>();
	
	
	/**
	 * Adds a ContactInformation Object to the Linked Hash Map
	 * @param person
	 */
	public void addContact(ContactInformation person){
		String personName = person.getName();
		String personEmail = person.getEmail();
		
		mainDirectory.put(personName, personEmail);
	}
	
	
	/**
	 * Gets the value of a given key in the mainDirectory
	 *
	 * @param String person 
	 * @return String personEmail
	 */
	public String getContactEmail(String person){
		String personEmail = " ";
		
		personEmail = mainDirectory.get(person);
		
		return personEmail;
	}

}
