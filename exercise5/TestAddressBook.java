//===========================================
//  NAME: Chidi Emeh
//  COUGAR ID:   1155430
//	ASSIGNMENT: Exercise 5
//  COURSE: Android programming fundamentals
//  DATE: 3/4/2016
//===========================================


package com.chidiemeh.week5;

public class TestAddressBook {

	public static void main(String[] args) {
		
		ContactInformation employee0001 = new ContactInformation("John", "John@gmal.com");
		ContactInformation employee0002 = new ContactInformation("Bob", "bob@gmal.com");
		ContactInformation employee0003 = new ContactInformation("Sue", "sue@gmal.com");
		
		AddressBook employeeAddressBook = new AddressBook();
		
		employeeAddressBook.addContact(employee0001);
		employeeAddressBook.addContact(employee0002);
		employeeAddressBook.addContact(employee0003);
		
		String foundEmail = employeeAddressBook.getContactEmail("John");
		String foundEmail2 = employeeAddressBook.getContactEmail("Bob");
		String foundEmail3 = employeeAddressBook.getContactEmail("Sue");
		
		System.out.println(foundEmail);
		System.out.println(foundEmail2);
		System.out.println(foundEmail3);

	}

}
